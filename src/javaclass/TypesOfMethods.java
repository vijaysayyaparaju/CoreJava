package javaclass;

public class TypesOfMethods {
	
	
	//without parameters and without result(Return)
	public static void Addition() {	
		int a =10;
		int b=100;
		System.out.println("Addition :"+(a+b));
	}
	
	//without parameters and with result(Return)
	public static int Substraction() {
		int a =10;
		int b=100;
		return (b-a);
	}
	
	//with parameters and without result(Return)
	public static void Multiplication(int a, int b) {
		System.out.println("Multiplication :"+(a*b));
	}
	
	//with parameters and with result(Return)
	public static int Division(int a , int b) {
		return b/a;
	}
	
	public static void ModDivision(int a, int b) {
		System.out.println("ModDivision :"+ (a%b));
	}
	
	public static String firstname() {
		return "vijay";
	}
	
	public static String lastname() {
		return "varma";
	}
	
	public static void Fullname(String Fullname) {
		System.out.println(Fullname);
	}

	public static void main(String[] args) {
		
		Addition();	
		
		int result = Substraction();
		System.out.println("Substraction :" + result);
		
		Multiplication(30,2);
		
		int result2 = Division(2,100);
		System.out.println("Division :"+ result2);
		
		System.out.println("Divison :" + Division(2,30)*7);
		
		ModDivision(Division(2,30),Substraction());
		
		String name1= firstname();
		String name2= lastname();

		System.out.println(name1 +" " +name2);
		System.out.println(firstname() +" " +lastname());


	}

}
