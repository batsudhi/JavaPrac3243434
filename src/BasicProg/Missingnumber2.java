package BasicProg;

public class Missingnumber2 {

	public static void main(String[] args) {
		//sum = n*(n+1)/2;
		
		
		int a[] = {1,2,3,4,6};
		
		int miss = getmissinno(a, a.length);
		
		System.out.println("missing number is "+miss);
	}

	private static int getmissinno(int[] a, int l) {
		
		int i , total=0;
		
		//coz one number is missing so we will consider the length as +1, hence (l+1)(l+2)
		total = (l+1)*(l+2) /2;
		for (i =0; i<l; i++) {
			total -= -a[i];
		}
		return total;
		
	}

}
