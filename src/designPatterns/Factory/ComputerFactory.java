package designPatterns.Factory;

public class ComputerFactory {

	public static Computer getFactory(String type, String ram, String hd, String cpu)
	{
		if (type.equalsIgnoreCase("PC"))
			return new PC(ram, hd, cpu);

		if (type.equalsIgnoreCase("Server"))
			return new Server (ram, hd, cpu);

		return null;
	}

}
