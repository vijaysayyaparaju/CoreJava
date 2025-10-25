package javaclass;

public class InterviewQuestions {
	
	
	public static void SwapeNumbersUsing3rdVariable(int a, int b) {
		System.out.println("Before Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		
		int c = a;
		a=b;
		b=c;
		
		System.out.println("After Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}
	
	public static void SwapeNumbersWithouUsing3rdVariable(int a, int b) {
		System.out.println("Before Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		
		a=a+b; //60
		b=a-b; //40
		a=a-b; //20
		
		System.out.println("After Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}
	
	public static void SwapeStringUsing3rdVariable(String a, String b) {
		System.out.println("Before Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		
		String c = a;
		a=b;
		b=c;
		
		System.out.println("After Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}
	
	
	public static void SwapeStringWithoutUsing3rdVariable(String a, String b) {
		System.out.println("Before Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		
		a=a+b ;
		b=a.replace(b, "");
		a=a.replace(b, "");
		
		System.out.println("After Swapping Numbers");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}
	public static void EvenOrOdd(int num) {
		if (num % 2 ==0) {
			System.out.println(num + ": is an even number");
		}else {
			System.out.println(num + ": is an odd number");
		}
	}
	
	
	
	public static void ReverseNumber(int num) {
		int rev =0;
		int Number = num;
		
		while (num > 0) {
			int digit = num %10;
			rev = rev *10 + digit;
			num = num/10;	
		}
			System.out.println(rev);
	}
	
	
	public static void Armstrong(int num) {
		int temp = 0;
		int originalNum  = num;
		
		while(num != 0)
		{
			int rem = num %10;
			temp = temp + (int)Math.pow(rem, 3);
			num = num /10;
		}
		if (originalNum == temp) {
			System.out.println(originalNum + ": is armstrong");
		}else {
			System.out.println(originalNum + ": is not a armstrong");
		}
	}
	
	public static void CheckNumberPalindrome(int num) {
		int RevNum =0;
		int TempNum = num;
		
		while (TempNum > 0) {
			int digit = TempNum %10;
			RevNum = RevNum *10 + digit;
			TempNum = TempNum/10;
		}
		if (num == RevNum) {
			System.out.println(num+ ": is palindrome");
		}else {
			System.out.println(num+ ": is not palindrome");
		}
	}
	
	
	public static void CheckStringPalindrome(String str) {
		String RevStr= "";
//		char[] charArr = str.toCharArray();
		for (char eachchar : str.toCharArray()) {
			RevStr = eachchar + RevStr;
		}
		if(str.equals(RevStr)) {
			System.out.println(RevStr + ": is a palindrome");
		}else {
			System.out.println(RevStr + ": is not palindrome");

		}
	}
	
	public static void ReverseString(String str) {
		String RevStr= "";
		
		for(int i=0; i<str.length(); i++) {
			RevStr = str.charAt(i) + RevStr;
		}
		System.out.println(RevStr);
	}
	
	public static void ReverseString2(String str) {
		String RevStr= "";
		
		for(int i=str.length()-1; i>=0; i--) {
			RevStr = RevStr +  str.charAt(i);
		}
		System.out.println(RevStr);
	}
	
	public static void ReverseString3(String str) {
		String RevStr= "";
//		char[] charArr = str.toCharArray();
		for (char eachchar : str.toCharArray()) {
			RevStr = eachchar + RevStr;
		}
		
		System.out.println(RevStr);
	}
	
		
	public static void PrimeNumber(int num) {
		int count = 0;
		for (int i=2; i<=num; i++) {
			if (num %i ==0){
				count ++;
			}
		}
		if (count==1)
			System.out.println(num + ": is an prime number");
		else
			System.out.println(num + ": is not an prime number");

		}
	
	
	public static void PrimeNumber2() {
		System.out.print("Prime numbers from 2 to 20: ");

        for (int num = 2; num <= 20; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
			
	
	
	public static void main(String[] args) {
//		SwapeNumbersUsing3rdVariable(10,20);
//		SwapeNumbersWithouUsing3rdVariable(20,40);
//		SwapeStringUsing3rdVariable("Hello", "Java");
//		SwapeStringWithoutUsing3rdVariable("Java", "Hello");
//		EvenOrOdd(10);
		PrimeNumber(22);
		PrimeNumber2();
//		ReverseNumber(123);
//		Armstrong(153);
//		CheckNumberPalindrome(101);
//		CheckStringPalindrome("vns");
//		ReverseString("vijay");
//		ReverseString2("varma");
//		ReverseString3("abcd");
		
	}

}
