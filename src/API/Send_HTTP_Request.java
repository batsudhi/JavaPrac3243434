package API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class Send_HTTP_Request {

	static String url;
	static HttpURLConnection con;
	static HttpGet get;
	//HttpResponse reponseGet;
	static int responseStatusCode;
	//HttpEntity entity;
	static String responseString;
	static String result;
	static String token;
	static String message;
	static long retrievalTimeInSec = 0;

	// HTTP GET request
	private static void setGetRequest(String leg) throws Exception
	{
		//endpoint - request url
		if (leg.equalsIgnoreCase("DIT"))
			url = "http://51.16.116.133:9080/run/runapplication/retRunService/getPayrunInfo";
		else
			url = "http://51.16.116.135:9080/run/runapplication/retRunService/getPayrunInfo";

		//creating URL obj
		URL obj = new URL(url);

		//create an HttpURLConnection
		con = (HttpURLConnection) obj.openConnection();
	}

	//add headers
	private static void addHeader(String headername, String headerValue)
	{
		//get.addHeader(headername, headerValue);
		con.setRequestProperty(headername, headerValue);
	}

	private static void executeGet() throws ClientProtocolException, IOException
	{
		//creating reponse
		//creating get connection
		con.setRequestMethod("GET");
		//entity = reponseGet.getEntity();
	}

	private static int getresponseStatusCode() throws IOException
	{
		//checking response result
		responseStatusCode = con.getResponseCode();
		System.out.println("responseStatusCode-"+responseStatusCode);
		return responseStatusCode;
	}

	private static String getResponseString() throws IOException
	{
		//InputStream in = reponseGet.getEntity().getContent();
		BufferedReader in  = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine = null;
		StringBuffer str = new StringBuffer();
		while ((inputLine = in.readLine())!= null)
		{			str.append(inputLine);			}
		responseString =str.toString();
		in.close();
		return str.toString();
	}

	private static String gettokenvalue(String getResponse)
	{
		String tokenvalue = getResponse.substring(36, 41);
		return tokenvalue;
	}


	private static void readJsonResponse(String responseString) throws JSONException {

		if (responseString.charAt(12) == '{') {
		responseString = responseString.substring(12, responseString.length()-1);}
		//System.out.println(responseString);
		JSONObject jsonResponse =  new JSONObject(responseString);
		//System.out.println("result after Reading JSON Response");
		System.out.println("Status code-"+responseStatusCode+"-"+responseString);
		//System.out.println("result: "+jsonResponse.getString("result"));
		//result =jsonResponse.getString("result");
		//System.out.println("token: "+jsonResponse.getString("token"));
		//token =jsonResponse.getString("token");
		//System.out.println("message: "+jsonResponse.getString("message"));
		if (jsonResponse.has("message"))
		{
			message = jsonResponse.getString("message");
			//System.out.println("Message is "+message);
			token = jsonResponse.getString("token");
			//System.out.println("token is -"+token+"-");
		}
		else {message =" ";}
	}

	private static void readJsonResponseHeader(String responseString, String headerName) throws JSONException {
		responseString = responseString.substring(12, responseString.length()-1);
		JSONObject jsonResponse =  new JSONObject(responseString);
		if (jsonResponse.has(headerName))
			System.out.println(headerName+"-"+jsonResponse.getString("headerName"));
	}

	private static void disconnectConnection()
	{
		con.disconnect();
	}

	public static void main(String[] args) throws Exception
	{
		//setting the leg
		setGetRequest("FIT");

		//adding headers to the request
		addHeader("Username", "batsudhi");
		addHeader("iid", "21130523");
		addHeader("Authorization", "Basic d2ZudXNlcjpBRFBhZHAxMQ==");
		//executing the getrequest
		executeGet();
		long startTimeseconds = System.currentTimeMillis();

		if (getresponseStatusCode() == 200)
		{
			getResponseString();
			readJsonResponse(responseString);
			do {
				setGetRequest("FIT");
				addHeader("Username", "batsudhi");
				addHeader("iid", "21130523");
				addHeader("Authorization", "Basic d2ZudXNlcjpBRFBhZHAxMQ==");
				addHeader("corelationid", token);
				executeGet();
				getResponseString();
				readJsonResponse(responseString);
				//Thread.sleep(2000);
			}
			while(message.equalsIgnoreCase("Retrieve still in progress. Please try after sometime"));
			long endTimeSeconds = System.currentTimeMillis();
			retrievalTimeInSec = ((endTimeSeconds - startTimeseconds)/1000);
			System.out.println(responseString);
			System.out.println("time taken is "+retrievalTimeInSec);
		}
	}
}
