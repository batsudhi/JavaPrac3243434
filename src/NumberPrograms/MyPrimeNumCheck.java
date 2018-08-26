package NumberPrograms;

public class MyPrimeNumCheck {

	private boolean isPrimeNumber(int num) {
		int i =2;
		while (i<= num/2)
		{
			if ((num%i)==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args){
        MyPrimeNumCheck mpc = new MyPrimeNumCheck();
        System.out.println("Is 17 prime number? "+mpc.isPrimeNumber(17));
        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));
    }

}
