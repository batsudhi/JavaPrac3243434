package InterfacesPkg;

public interface ISam {
	public static final String name = "Java9";
	public void testAbstract();
	default void testDefault(){
		// call non-static method from another non-static method.
		testPrivateNonStatic();
		// call static method from non-static method
		testPrivateStatic();
		System.out.println("Default method");
	}

	public static void testStatic(){
		System.out.println("static method");
	}
	
	private void testPrivateNonStatic(){
		System.out.println("private non-static method");
	}
	
	private static void testPrivateStatic(){
		System.out.println("private static method");
	}
}