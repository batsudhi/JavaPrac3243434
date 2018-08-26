package BasicProg;
import java.util.HashSet;

public class DistinctCharInAString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "GGeeksforrgeekk";
		
		finduniqueChar(str);
	}

	private static void finduniqueChar(String str) {
		 char[] charac = str.toCharArray();
		 
		HashSet<Character> charSet = new HashSet<Character>();
		 for (char c : charac )
		 {
			 if (charSet.add(c) == false)
			 {}
			 else
				 System.out.print(c); 
		 }
		
	}

}
