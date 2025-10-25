package javaclass;

public class GlobalVariables {
	
	public static int a= 10;
	public static int b=40;
	public static int c= 220;
	
	int v=10;
	int k=100;
	
	public void addition() {
		System.out.println("addition :" + (k+v));
	}
	
	public static void Addition() {
		System.out.println("Addition :" + (a+c));
	}
	
	public static void Substraction() {
		System.out.println("Substraction :" + (c-a));
	}
	
	public static void Multiplication() {
		System.out.println("Multiplication :" + (c*b));
	}
	
	public static void Division() {
		System.out.println("Division :" + (c/b));
	}
	
	public static void ModDivision() {
		System.out.println("ModDivision :" + (a%b));
	}
	
	public static void main(String[] args) {
//		Division();
		
		
		GlobalVariables a = new GlobalVariables();
		System.out.println(a.v+" "+a.k	);
		a.addition();

		
		
	}

}
