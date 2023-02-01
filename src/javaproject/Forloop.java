package javaproject;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// for while 
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		
		// to print from 1 to 10000
		
		
		// for loop
		// for loop
		
//		for(initialization ; conditionCheck , increment/ decrement) {
//			
//		}
		
		// program 1
		
		for(int i = 0 ; i <=5 ; i++) { 
			System.out.println("hello");
		}
		
		for(int x = -1 ; x <= 3 ; x++) { // 1 // 2 // 3 // 4
			System.out.println(x); // 0 ,1 , 2 , 3
			System.out.println("hello");
		}
		
		for(int i = 3 ; i >= 1 ; i--) { // 2  // 1  // 0
			System.out.println(i); // 3 // 2 // 1
		}
		
		for(int i = 2 ; i <= 20 ; i = i + 2) { 
			System.out.println(i); 
		}
		
		for(int i = 3 ; i <= 30 ; i = i + 3) {
			System.out.println(i);
		}
		
		for(int i = 5 ; i >=2 ; i--) { 
			System.out.println(i); 
		}
		
		
		// i++                  increment the value of i by 1
		// i--                  decrement the value of i by 1
		// i = i + 2            increment value of i by 2
		// i = i + 1            increment value of i by 1
		
		// break statement with for loop
		
		for(int i = 1 ; i <= 5 ; i++) { 
			System.out.println(i); 
			if(i == 3) {
				break ;
			}
		}
		
		
		for(int i = 5 ; i >= 2 ; i--) { 
			if(i == 4) {
				break;
			}
			System.out.println(i); 
		}
		
		for(int i = 5 ; i >= 2 ; i--) {  
			System.out.println(i);  
			if(i == 4) {
				break;
			}
			
		}
		
		// continue statement with for
		
		for(int i = 1 ; i <=5 ; i++) {  
			if(i == 3) {
				continue ;
			}
			System.out.println(i); 
		}
		
	}

}
