package BasicProg;

import java.util.ArrayList;
import java.util.Arrays;

public class StringManipulation {

	public static void main (String args[])
	{
		
		String str = "the rains have started here";
		String str2 = "tHe rains have started here";
		
		System.out.println("length is "+str.length());
		
		
		//charcter on fifth location
		System.out.println("fifth index "+ str.charAt(5));
		
		System.out.println("index of s  "+ str.indexOf('s'));  // 1st occurrence of s
		
		System.out.println("index of s " +str.indexOf('s', str.indexOf('s')+1)); // 2nd occurrence of s
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));  //-1, if it is returning -1 , it means it is not available
		
		
		//str comparison
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		//subsstring
		System.out.println(str.substring(0, 9)); // this will not include the 9th index
		
		//trim
		String s = "  Hello    World  ";
		System.out.println(s.trim()); // will trim only before and after spaces
		
		//replace method 
		
		System.out.println(s.replace(" ", ""));
		System.out.println(str.replace("t", "T"));
		
		//split method
		String test = "Hello Test Selenium";
		String[] test1 =  test.split(" ");
		System.out.println(Arrays.toString(test1));
		
		for (int i=0; i< test1.length; i++ ){
		System.out.println(test1[i]);
		}
		
		String s2 ="Hi ";
		
		//concat
		System.out.println(s2.concat(test));
		
		String x = "hello ";
		String y = "World";
		int a = 10;
		int b = 15;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y);

		
		
	}
	
}
