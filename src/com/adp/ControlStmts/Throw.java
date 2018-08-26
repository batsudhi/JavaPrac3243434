package com.adp.ControlStmts;

public class Throw {
static void validate(int age) throws InvalidAgeException{
	if (age<18)
		throw new InvalidAgeException("not eligible to vote");
	else
		System.out.println("eligible to vote");
}

public static void main(String[] args) {
try {
	validate(13);
}catch(Exception e) {
	System.out.println("Exception occured: "+e);
}

}
}


