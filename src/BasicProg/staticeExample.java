package BasicProg;

public class staticeExample {

		   private static int numInstances = 0;

		   protected static int getCount() {
		      return numInstances;
		   }

		   private static void addInstance() {
		      numInstances++;
		   }

		   staticeExample() {
			   staticeExample.addInstance();
		   }

		   public static void main(String[] arguments) {
		      System.out.println("Starting with " + staticeExample.getCount() + " instances");

		      for (int i = 0; i < 500; ++i) {
		         new staticeExample();
		      }
		      System.out.println("Created " + staticeExample.getCount() + " instances");
		   }
		
	
	
}
