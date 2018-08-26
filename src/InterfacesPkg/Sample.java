package InterfacesPkg;

	public class Sample implements ISam{
		@Override
		public void testAbstract() {
			System.out.println("Overridden 'testAbstract' method");
		}
		public static void main(String[] args) {
			System.out.println("constant variable value : "+ name);
			// access static method
			ISam.testStatic();
			// create object for Sample class
			Sample sam = new Sample();
			// we can access default method using object
			sam.testDefault();
			// call abstract method (implementation in Sample class)
			sam.testAbstract();
		}
}
