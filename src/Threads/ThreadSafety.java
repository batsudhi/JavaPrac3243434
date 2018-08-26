package Threads;

public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {

		ProcessingThread pt = new ProcessingThread();
		Thread t1 = new Thread(pt, "t1");

	}
}