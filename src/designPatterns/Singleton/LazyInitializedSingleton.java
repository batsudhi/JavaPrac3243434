package designPatterns.Singleton;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton inst;

	private LazyInitializedSingleton(){};

	public static LazyInitializedSingleton getInstance()
	{
		if (inst == null)
		{
			inst = new LazyInitializedSingleton();
			return inst;
		}
		return inst;
	}

}
