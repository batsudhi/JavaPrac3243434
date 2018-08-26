package API;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.JsonObject;

public class HttpURLConnectionExample {

	static String url;
	static HttpClient client;
	static HttpGet get;
	static HttpResponse reponseGet;
	static int responseStatusCode;
	static String tokenvalue;
	static HttpEntity entity;
	static String responseString;
	static JSONObject jsonResponse;


	//add headers
	private static void addHeader(String headername, String headerValue)
	{
		get.addHeader(headername, headerValue);
	}

	// HTTP GET request
	private static void setGetRequest(String leg) throws Exception
	{
		//endpoint - request url
		if (leg.equalsIgnoreCase("DIT"))	
			url = "http://51.16.116.133:9080/run/runapplication/retRunService/getPayrunInfo";
		else 
			url = "http://51.16.116.135:9080/run/runapplication/retRunService/getPayrunInfo";

		//create an HTTP connection
		client = new DefaultHttpClient();

		//creating get connection
		get = new HttpGet(url);
	}

	private static void executeGet() throws ClientProtocolException, IOException
	{
		//creating reponse
		reponseGet = client.execute(get);
		entity = reponseGet.getEntity();
	}


	private static int getresponseStatusCode()
	{	
		//checking response result
		responseStatusCode = reponseGet.getStatusLine().getStatusCode();
		System.out.println(responseStatusCode);
		return responseStatusCode;
	}

	private static String getResponseString() throws IOException
	{

		InputStream in = reponseGet.getEntity().getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		StringBuilder str = new StringBuilder();
		String line = null;
		while ((line = br.readLine())!= null)
		{
			str.append(line +"\n");
		}
		in.close();
		responseString =str.toString();
		return str.toString();

	}

	private static String gettokenvalue(String getResponse)
	{
		String tokenvalue = getResponse.substring(36, 41);
		return tokenvalue;
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

		if (getresponseStatusCode() == 200)
		{
			System.out.println(getResponseString());
			tokenvalue = gettokenvalue(responseString);
			get.addHeader("corelationid", tokenvalue);
			//creating reponse
			HttpResponse reponseGet2 = client.execute(get);
			System.out.println(getResponseString());

		}
	}
}






















