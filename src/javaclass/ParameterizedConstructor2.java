package javaclass;

public class ParameterizedConstructor2 {
	boolean bool1;
	int int1;
	float float1;
	char char1;
	String str1; 
		
	ParameterizedConstructor2(){
		
	}
	
	ParameterizedConstructor2(boolean bool2,	int int2, float float2,char char2,String str2){
		bool1=bool2;
		int1=int2;
		float1=float2;
		char1=char2;
		str1=str2;	
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor2 paramCons = new ParameterizedConstructor2();
		
		System.out.println(paramCons.bool1);
		System.out.println(paramCons.int1);
		System.out.println(paramCons.float1);
		System.out.println(paramCons.char1);
		System.out.println(paramCons.str1);
		
		System.out.println("---------------------------------------------------------------------------");
		
		ParameterizedConstructor2 paramCons2 = new ParameterizedConstructor2(true,77,66.66F,'$',"vijay");
		
		System.out.println(paramCons2.bool1);
		System.out.println(paramCons2.int1);
		System.out.println(paramCons2.float1);
		System.out.println(paramCons2.char1);
		System.out.println(paramCons2.str1);


	}

}
