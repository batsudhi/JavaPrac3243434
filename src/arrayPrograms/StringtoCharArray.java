package arrayPrograms;

public class StringtoCharArray {

	public static void main(String[] args) {

		//String to char array
		String s1 = "Sudhir";
		char[] c1 = s1.toCharArray();
		
		for(char c:c1)
		{
			System.out.println(c);
		}
		
		
		//char array to string
		char[] ch = {'I','n','d','i','a'};
		String s =  new String (ch);
		System.out.println(s);
		
	}
}
