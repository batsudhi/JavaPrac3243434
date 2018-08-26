package BasicProg;

public class StringReverse {
	
	 public static void main(String[] args) {
		 
		 String s = "Selenium";
		 int l = s.length();
		 System.out.println("String length for Selenium = "+l);
		 
		 String rev = "";
		 
		 for (int i= l-1; i>=0; i--)
		 {
			 rev =  rev + s.charAt(i);
		 }
		 
		 System.out.println("Reversed String is "+rev);
		 
		 
		 //using StringBuffer class
		 
		 StringBuffer sb = new StringBuffer(s);
		 System.out.println("String reverse using StringBuffer class = "+sb.reverse());
		 
	 }

}
