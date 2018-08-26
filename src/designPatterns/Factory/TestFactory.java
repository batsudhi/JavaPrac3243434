package designPatterns.Factory;

public class TestFactory {
	
	public static void main (String[] args)
	{
		Computer pc = ComputerFactory.getFactory("PC", "PC RAM 2gb", "PC hd 500gb", "PC cpu 2.4gHz");
		
		Computer server = ComputerFactory.getFactory("Server", "Server RAM 3gb", "Server hd 5000gb", "Server cpu 2.8GHz");
		
		
		System.out.println("Factory PC config : "+ pc.toString() );
		System.out.println("Factory Server config : "+ server.toString() );
	}

}
