package javaproject;

public class logicaloperators {

	public static void main(String[] args) {
		
        //relational operators
		// < , > , <= ,>= ,!= , ==
		// boolean value 
				
				System.out.println(20 > 15); // true
				System.out.println(5 <= 10); // true
				System.out.println(50!= 5); // true
				System.out.println(50 < 100); // true
				System.out.println(98 >= 50);  // true
				System.out.println(10 == 10); // true
				
				
				// Logical operators 
				
				// AND  &&
				
				// true   &&  true  =========>  true
				// true   &&  false =========>  false
				// false  &&  true   =========> false
				// false  &&  false  =========> false
				
				
				System.out.println(7 == 7 && 10!= 50); 
				System.out.println(5!= 10 && 9 != 9);
				System.out.println(2 == 2 && 6 == 7);
				System.out.println(6 != 6 && 30 == 30);
				
				
				
				// OR ||
				
				// true   ||  true  =========>  true
				// true   ||  false =========>  true
				// false  ||  true   =========> true
				// false  ||  false  =========> false
				
				System.out.println(50 == 50|| 60!= 50); 
				System.out.println(8!= 8 || 3 != 7);
				System.out.println(2 == 2 || 6 == 6);
				System.out.println(2 != 2 || 6 == 7);
				
					
				// NOT !
				
				System.out.println(!(2==2));
				System.out.println(!(2!=2));
				
				
				
				
				
				
				
				
				
				
	}

}
