package BasicProg;

public class Onetohunwoloop {

	public static void main(String[] args) {
		
		Onetohunwoloop o = new Onetohunwoloop();
		o.printnos(120);

	}
	
	public void  printnos(int n)
	{
		if (n>0)
		{
		printnos(n-1);
		System.out.println((n));
		}
		return;
	}
}
