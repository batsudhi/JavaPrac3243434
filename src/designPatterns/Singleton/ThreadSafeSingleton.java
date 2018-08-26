package designPatterns.Singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton inst;
	
	private ThreadSafeSingleton(){};
	
	/*public static synchronized ThreadSafeSingleton getInstance()
	{
		if (inst == null)
			{inst = new ThreadSafeSingleton();}
		return inst;
	}*/
	
	public static ThreadSafeSingleton getInstance()
	{
		if (inst == null)
			{
				synchronized (ThreadSafeSingleton.class)
				{
					if (inst == null)
					{
					inst = new ThreadSafeSingleton();
					}
				}
			}
		return inst;
	}
	
}
