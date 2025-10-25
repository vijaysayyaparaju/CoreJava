package javaclass;

public class ReturnKeyword {
	
	public static int Addition(int a , int b) {
		return a+b;
	}
	
	public static void Division(int a , int b) {
		System.out.println("Division :" + (a/b));
	}
	
	public static void Sub(int a , int b) {
		System.out.println("Sub :" + (a-b));
	}
	
	public static void main(String[] args) {
		int a= 100;
		int b= 200;
		int c= 3;
		Sub(Addition(a,b),c);
	}

}
