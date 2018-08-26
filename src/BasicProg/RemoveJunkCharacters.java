package BasicProg;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		
		String s = "String without! @#$%^&*()junk characters";

		//. use regular expression -  [^a-zA-Z0-9]  -   ^ - means except

		s = s.replaceAll("[^a-zA-Z0-9 ]", ""); // -  this will replace all characters apart from  a-zA-Z0-9; junk characters include spaces , so i left a space at the end, after 9

		System.out.println(s);
			
		}
	
}
