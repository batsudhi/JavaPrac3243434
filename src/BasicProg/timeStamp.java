package BasicProg;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeStamp {

	
	    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	    public static void main(String[] args) throws InterruptedException {

	        //method 1
	        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	        System.out.println(timestamp);
	        
	        System.out.println("current miliseconds - "+System.currentTimeMillis());
	        //method 2 - via Date
	        Date date = new Date();
	        System.out.println(new Timestamp(date.getTime()));

	        //return number of milliseconds since January 1, 1970, 00:00:00 GMT
	        long start = System.currentTimeMillis();
	        System.out.println("start milliseconds- "+ start);
	        Thread.sleep(3000);
	        long end =  System.currentTimeMillis();
	        System.out.println("end milliseconds- "+ end);
	        
	        System.out.println("Time diff is "+ (end-start));
	        //format timestamp
	        System.out.println(sdf.format(timestamp));
	        
	        
	        //Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss - dd/MM/yyyy");
			String currentTimeStamp = dateFormat.format(date);

	    }

	}