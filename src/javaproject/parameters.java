package javaproject;

public class parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //calling the function
		addition();
		
	//calling next function	
		Division(100,20);
		Division(50,10);
		
		
	//calling third function
		int A = multiplication (15,5);
		System.out.println(A + 50);
		System.out.println(A/4);
		System.out.println(A*.20);
	}
	//2 function with parameter and return type
	private static void Division(int i, int j) {
		System.out.println(i/j);
	}
		
	//1 function without parameter and without return type
     private static void addition() {
		System.out.println(10+20);
		
	}
     //function with parameter and with return type
     private static int multiplication(int x,int y) {
    	 
		return x*y;
    	 
     }
}
 