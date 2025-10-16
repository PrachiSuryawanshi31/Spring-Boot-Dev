/*
public class VehicleService {
	public static void main(String[] args) {
		
		car C =new car();
		
		C.displyinf();
		C.showDetails();
	
	}

}

class vehicle
{
	String brand="Honda";
	int speed=120;
	

	public void displyinf()
	{
		System.out.println("Brand:" +brand);
		System.out.println("Speed: "+speed);
	}
}

class car extends vehicle
{
	
	
	private int seatingCapacity=5;
	
	
	
	public void   showDetails()
	{
		System.out.println("seatingCapacity:"+seatingCapacity);
	}
}*/


public class VehicleService {
	public static void main(String[] args) {
		
		car C =new car();
		
		C.setBrand("Honda");
		C.setSpeed(120);
		C.setSeatingCapacity(5);
		
		C.displyinfo();
		C.showDetails();
	
	}

}

class vehicle
{
	private String brand;
	private int speed;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void displyinfo()
	{
		System.out.println("Brand:" +brand);
		System.out.println("Speed: "+speed);
	}
}

class car extends vehicle
{
	
	private int seatingCapacity;
	
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}




	public void   showDetails()
	{
		System.out.println("seatingCapacity:"+seatingCapacity);
	}
}

