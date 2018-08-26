package com.codinginterview;

public class StringBufBuid {

	public static void main(String[] args) {


		//Synchronized /Thread safe
		StringBuffer strBuff = new StringBuffer();

		long startTime = System.currentTimeMillis();

		for (int i = 0 ; i< 1000000; i++)
		{
			strBuff.append("hello ");
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("String Buffer duration "+duration);

		
		//not Synchronized / not Thread safe
		StringBuilder strBuild = new StringBuilder();

		long startTime1 = System.currentTimeMillis();

		for (int i = 0 ; i< 1000000; i++)
		{
			strBuild.append("hello ");
		}

		long endTime1 = System.currentTimeMillis();
		long duration1 = endTime1 - startTime1;
		System.out.println("String Builder duration "+duration1);
	}
}