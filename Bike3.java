class Vehicle{  
	int speed=70000;
	static final int gear;
	Vehicle() {
		System.out.println("Inside parent class");
	}
	static {gear = 5;}
	void run(){
		System.out.println("running Inside Veh");
		//this.gear = 6;
	}
}  
class Bike3 extends Vehicle{
	int speed = 100;
	Bike3() {
		//super();
		{System.out.println("Inside IIB");}
		System.out.println("Inside Child");
	}
	void run(){
		System.out.println("running Inside Bike");
		//super.run();
	}
	
	//@Override
	@SuppressWarnings(value ="Override")
	void run1(){
		System.out.println("To check annotation");
	}
	int speed1=100;  
	void display(int h){
		h++;
		System.out.println(super.speed);//will print speed of Bike   
	}  
	public static void main(String args[]){  
	
		String s= "A";
		System.out.println("asn is " + (-2>1));
	
		if((-2)>1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}  
}  
