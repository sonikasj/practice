package javaproject;

public class Arithematicoperators {

	public static void main(String[] args) {
		int x = 20;
		int y = 15;
		//Arithematic operators (Addition +,Multiplication *,Division /,subtraction -,Modulus %)
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//10 pairs
		// calculator 
		calculator (15,5);
		calculator (20,2);	
 
	}

	private static void calculator(int i, int j) {
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		
	}

}
