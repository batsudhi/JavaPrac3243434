package BasicProg;

public class stringRepeat {

	public static void main (String args[])
	{
		
		String myString = "Fooolllllllooooouuuuppppp";
		char[] ch = myString.toCharArray();
		int arSize = myString.length();
		for(int i=0; i<arSize; i++)
		{	int count = 0;
			for(int j=0; j<arSize; j++)
			{	
				 if (ch[i] == ch[j])
				 {
					 count++;
				 }
			}
			
			System.out.println("The count of "+ch[i]+" is "+count );
			
			char[] al;
			//al[i]= ch[i];
			String trim = String.valueOf(myString.charAt(i));
			myString = myString.replaceAll(trim, " ");
		}
	}
}
