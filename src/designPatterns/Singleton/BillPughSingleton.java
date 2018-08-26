package designPatterns.Singleton;

public class BillPughSingleton {
	
		private BillPughSingleton(){}
		
	private static class SinngletonHelper
	{
		private static final BillPughSingleton inst = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance ()
	{
		return SinngletonHelper.inst;
	}
	
	
}
