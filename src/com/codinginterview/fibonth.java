package com.codinginterview;

public class fibonth {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(n+" th value is "+fib(n));
	}


	public static int fib(int n)
	{
		int a = 0;
		int b = 1;
		int sum = 0;

		if (n<=0)
		{
			throw new IllegalArgumentException("give correct input");
		}
		else if (n==1)
		{
			System.out.println("Value is 0");
			return 0;
		}

		else if (n==2)
		{
			System.out.println("Value is 1");
			return 1;
		}

		else if (n>2)
		{
			for (int i=3; i<=n;i++)
			{
				sum = a+b;
				a=b;
				b=sum;
			}
			return sum;
		}
		return 0;

	}
}