package arrayPrograms;

public class Stringsplitprog {

	public static void main(String[] args) {
		String s = "apple, mango, apple, banana, peach, grapes,mango";
		s= s.replaceAll("[,;\\s]"," ");
		System.out.println(s);
		String[] fruits =  s.split("\\s");
		for (String e: fruits)
		{	
			int count=0;
			System.out.print(e);
			for (String f:fruits)
			{
				if (e.equalsIgnoreCase(f))
					{count++;}
			}
			System.out.println("- "+count);
		}
	}
}
