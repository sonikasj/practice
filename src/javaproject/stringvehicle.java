package javaproject;

public class stringvehicle {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{  
     
	Vehicle tesla = new Vehicle("tesla","black");
      System.out.println("tesla.brand");
      System.out.println("tesla.color");
      tesla.start();
      tesla.stop();
		
		
	}

}
class Vehicle {
	string  brand;
	string color;

	public Vehicle (String tesla,String black){
		this.brand = brand;
		this.color =color;
	}
		public void start() {
			System.out.println("starting");
		}
		public void stop () {
			System.out.println("stoping");
			
		
	
}
	}
