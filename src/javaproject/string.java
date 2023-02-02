package javaproject;

public class string {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is inbuilt data type
		
		String fullName = "sonika";
		
		// create object of type string
		String a = fullName.toUpperCase(); // CHINMAY
		System.out.println(a);
		
		// creating instance or object of human class
		Human sonika = new Human("sonika joshi",25);
		System.out.println(sonika.age); 
		System.out.println(sonika.fullname); 
		sonika.talk();
		sonika.walk();
		
	

	}
	
	


}

class Human {
	// Properties or fields
	String fullname;
	int age;
	// constructor to set property values , field values
	public Human(String fullN, int age) { //
		this.fullname = fullN;
		this.age = age;
	}
	// methods 
	// talk() and walk()
	
	public void talk() {
		System.out.println("talking");
	}
	
	public void walk() {
		System.out.println("walking");
	}
	
}