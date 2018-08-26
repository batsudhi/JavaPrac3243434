package BasicProg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String args[]) {
	      
		//https://www.tutorialspoint.com/java/java_date_time.htm
		
		
		// Instantiate a Date object
	      Date date = new Date();

	      // display time and date using toString()
	      System.out.println(date.toString());
	      
	      
	      
	      
	      SimpleDateFormat ft = 
	    	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	    	      System.out.println("Current Date: " + ft.format(date));
	      
	    	      
	    	      
	    	      
	    	      // display time and date using printf
	    	      String str = String.format("Current Date/Time : %tc", date );

	    	      System.out.printf(str);
	      
	      //Parsing Strings into Dates
	    	      
	    	      
	    	      SimpleDateFormat ft1 = new SimpleDateFormat ("yyyy-MM-dd"); 
	    	      String input = args.length == 0 ? "1818-11-11" : args[0]; 

	    	      System.out.print(input + " Parses as "); 
	    	      Date t;
	    	      try {
	    	         t = ft1.parse(input); 
	    	         System.out.println(t); 
	    	      } catch (ParseException e) { 
	    	         System.out.println("Unparseable using " + ft1); 
	    	      }
	    	      
	    	      
	    	      
	    	      //Measuring Elapsed Time
	    	      
	    	      
	    	      try {
	    	          long start = System.currentTimeMillis( );
	    	          System.out.println(new Date( ) + "\n");
	    	          
	    	          Thread.sleep(5*60*10);
	    	          System.out.println(new Date( ) + "\n");
	    	          
	    	          long end = System.currentTimeMillis( );
	    	          long diff = end - start;
	    	          System.out.println("Difference is : " + diff);
	    	       } catch (Exception e) {
	    	          System.out.println("Got an exception!");
	    	       }
	    	      
	    	      
	    	      
	   }
	
	

}
