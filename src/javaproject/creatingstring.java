package javaproject;

public class creatingstring {

	public static void main(String[] args) {
		

		// creating a String
		
		// Program 1
		String subject = "I am learning selenium";
		String subject2 = "I am learning python";
		String subject3 = "I am learning java";
		System.out.println(subject);
		System.out.println(subject2);
		System.out.println(subject3);
		
		// String  + Integer  ===>  String
		// Integer + Integer  ===>  Integer
		// Integer + String   ===>  String
		// String  + String   ====> String
		
		// Program 2
		System.out.println("5"+2); 
		System.out.println(10+10); 
		System.out.println(9+"4");
		System.out.println("8"+"2"); 
		
		//Program 3
		//Length() of string
		
		String greet = "I am learning java";
		int b = greet.length();
		System.out.println(b);
		System.out.println(greet.length());
		
		int z = 20;
		System.out.println(z); 
		System.out.println("z");
		
		// Program 4
		String first = "Python";
		String second = "Learning";
		System.out.println(first+ " "+second);
		
		//Program 5
		
		String three = "I am learning ";
		String four = "java !";
		String five = three.concat(four);
		System.out.println(five);
		
		// Program 6
		String city = new String("dhangadhi");
		System.out.println(city);
		
		
		
		//program 7
		String city1 = "seattle";
		String cityU = city1.toUpperCase();
		System.out.println(cityU);
		
		String city2 = "Dhangadhi";
		String cityL = city2.toLowerCase();
		System.out.println(cityL);
		
		String city3 = "dhangadhi"; 
		System.out.println(city3.length());
		
		String country = "Nepal";
		int A = country.toUpperCase().toLowerCase().length();
		System.out.println(A);
		
	
		
		
		
		
	}

}
