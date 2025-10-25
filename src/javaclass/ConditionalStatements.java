package javaclass;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int a=100;
		int b=123;
		int c=100;
		
		//if statement 
		if(a==c) {
			System.out.println("both are equal");
		}
		
		// if else statement
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is lesser than b");
		}
		
		//elif statement 
		
		if(b==c) {
			System.out.println("a and b are equal");
		}
		else if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("a is lesser than b");
		}
		
		//nested if statement 
		
		if(a!=c) {
			if(a>b) {
				System.out.println("a is greater than b");
			}
			else {
				System.out.println("a is lesser than b");
			}
		}
		else {
			if(b==a) {
				System.out.println("a and b are equal");
			}
			else {
				System.out.println("not equal");
			}
		}
		
		//switch case
		String str= "VijAY";
		
		switch(str) {
		case "vijay":
			System.out.println(str);
			break;
		case "VIJAY":
			System.out.println(str);
			break;
		case "VijaY":
			System.out.println(str);
			break;
		default:
			System.out.println("no match found");
		}

	}

}
