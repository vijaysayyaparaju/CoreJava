package javaclass;

public class LoopingStatements {

	public static void main(String[] args) {
		for (int i=1; i<=11; i++) {
			System.out.println("a");
		}
		
		System.out.println("---------------------------");


		for (int i=1; i<=13; i++) {
			System.out.println("2 X "+ i + " = "+ (i*2));
		}
		
		System.out.println("---------------------------");

		
		int i=1;
		while (i<=20){
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------------------");

		
		int j=33;
		do {
			System.out.println(j);
			j++;
		}while(j<=39);
		
		System.out.println("---------------------------");

		
		for(int p = 1; p<=5; p++) {
			for(int q = 1; q<=p; q++) {
				System.out.print(p+" ");
			}
			System.out.println("");
		}
			
		
	}

}
