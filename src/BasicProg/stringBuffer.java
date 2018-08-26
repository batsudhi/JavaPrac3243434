package BasicProg;

public class stringBuffer {
	
	 public static void main(String args[]) {

//		 /https://www.tutorialspoint.com/java/lang/java_lang_stringbuffer.htm
		 
		 
		 //append
		 StringBuffer buff = new StringBuffer("tuts ");
	      System.out.println("buffer = " + buff);

	      // appends the boolean argument as string to the string buffer
	      buff.append(true);
	      
	      // print the string buffer after appending
	      System.out.println("After append = " + buff);

	      buff = new StringBuffer("abcd ");
	      System.out.println("buffer = " + buff);
	      
	      // appends the boolean argument as string to the string buffer    
	      buff.append(false);
	      
	      // print the string buffer after appending
	      System.out.println("After append = " + buff);
	      
	      
	      //---------------------------------------------
	      
	      StringBuffer buff1 = new StringBuffer("tutorials ");
	      System.out.println("buffer1 = " + buff1);

	      CharSequence cSeq = "tutspoint";
	     
	      // appends the CharSequence with start index 4 and end index 9
	      buff1.append(cSeq, 4, 9);
	    
	      // print the string buffer after appending
	      System.out.println("After append = " + buff1);
	      
	      
	      
	      
	      //reverse
	      StringBuffer buffer = new StringBuffer("Game Plan");
	      buffer.reverse();
	      System.out.println(buffer);
	      
	      //String Buffer delete() Method
	      StringBuffer sb1 = new StringBuffer("abcdefghijk");
	      sb1.delete(3, 7); 
	      System.out.println(sb1); 
	      
	      
	      //String Buffer insert() Method
	      StringBuffer sb2 = new StringBuffer("abcdefghijk");
	      sb2.insert(3, "123");
	      System.out.println(sb2); 
	      
	      //String Buffer replace() Method
	      StringBuffer sb3 = new StringBuffer("abcdefghijk");
	      sb3.replace(3, 8, "ZARA");
	      System.out.println(sb3); 
	      
	      String str = "Welcome to string handling tutorial";
	  	char ch1 = str.charAt(0);
	  	char ch2 = str.charAt(5);
	  	char ch3 = str.charAt(11);
	  	char ch4 = str.charAt(20);
	  	System.out.println("Character at 0 index is: "+ch1);
	  	System.out.println("Character at 5th index is: "+ch2);
	  	System.out.println("Character at 11th index is: "+ch3);
	  	System.out.println("Character at 20th index is: "+ch4);
	  	
	  	
	  	
	  	
	  	 StringBuffer buff3 = new StringBuffer("TutorialsPoint");
	     
	      // returns the current capacity of the String buffer i.e. 16 + 14
	      System.out.println("capacity = " + buff3.capacity());
	    
	      buff3 = new StringBuffer(" ");
	      
	      // returns the current capacity of the String buffer i.e. 16 + 1
	      
	         System.out.println("capacity = " + buff3.capacity());
	         
	         //16 is extra capacity for the  StringBuffer; this returns the current capacity
	         
	         String a = "sudhir";
	         char[] list =a.toCharArray();
	         
	         char[] result = new char[list.length];

	         for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
	            result[j] = list[i];
	         }
	         
	         System.out.println(result.toString());
	  	
	      
	   } 

}
