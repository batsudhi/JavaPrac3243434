package StringProg;

public class SplitString {

	public static void main(String[] args) {
		
		String sampleString = "Cat, Dog, Ele";
		
		String[] ani = sampleString.split(", ");
		for (String an : ani)
		{
			System.out.println(an);
		}
	}
}
