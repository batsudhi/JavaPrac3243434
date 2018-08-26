package BasicProg;

public class StaticInstanceCounter {
	   private static int numInstances = 0;

	   
	   protected static int getCount() {
	      return numInstances;
	   }

	   private static void addInstance() {
	      numInstances++;
	      System.out.println(StaticInstanceCounter.numInstances + "th instances");
	   }

	   //constructor
	   StaticInstanceCounter() {
		   StaticInstanceCounter.addInstance();
	   }

	   //main function
	   public static void main(String[] arguments) {
	      System.out.println("Starting with " + StaticInstanceCounter.getCount() + " instances");

	      for (int i = 0; i < 500; ++i) {
	         new StaticInstanceCounter();
	      }
	      System.out.println("Created " + StaticInstanceCounter.getCount() + " instances");
	   }
	}