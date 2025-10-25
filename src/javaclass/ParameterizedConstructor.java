package javaclass;

public class ParameterizedConstructor {
	boolean bool1;
	int int1;
	float float1;
	static char char1;
	static String str1; 
		
	
	ParameterizedConstructor(boolean bool1,	int int1, float float1,char char1,String str1){
		this.bool1=bool1;
		this.int1=int1;
		this.float1=float1;
		ParameterizedConstructor.char1=char1;
		ParameterizedConstructor.str1=str1;	
	}
	
	public void Display() {
		boolean bool1= true;
		int int1=200;
		float float1= 77.07F;
		char char1='B';
		String str1="varma";
		
		System.out.println(bool1);
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(char1);
		System.out.println(str1);
	
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor paramCons2 = new ParameterizedConstructor(true,77,66.66F,'$',"vijay");
		
		System.out.println(paramCons2.bool1);
		System.out.println(paramCons2.int1);
		System.out.println(paramCons2.float1);
		System.out.println(ParameterizedConstructor.char1);
		System.out.println(ParameterizedConstructor.str1);
		System.out.println("--------------------------------------------------------");
		paramCons2.Display();

	}

}
