
public class Service {
	public static void main(String[] args) {
		
		Passenger P1 =new Passenger();
		P1.name="Prachi";
		P1.address="Pune";
		P1.age=20;
		P1.mobno=98567232;
		
		Booking B1=new Booking();
		B1.name="Prachi";
		B1.mobno=98643477;
		B1.ticketNo=5120;
		
		Validity V1 =new Validity();
		V1.mobNo=99210797;
		V1.ticketNO=8601;
		
		
		TrainService TS = new TrainService();
		
		String S=TS.loginSystem(P1);
		System.out.println(S);
		
		String S2=TS.bookingSystem(B1);
		System.out.println(S2);
		
		String S3=TS.ValidationSystem(V1);
		System.out.println(S3);
		
		
	}

}


class Passenger
{
	String name;
	String address;
	int age;
	long mobno;
	
}

class Booking
{
	String name;
	long mobno;
	int ticketNo;
	
}

class Validity
{
	long mobNo;
	int ticketNO;
}



class TrainService
{
	String loginSystem(Passenger P1)
	{
		return "Your are login Successfully !";
	}
	
	String bookingSystem(Booking B1)
	{
		return "Your ticket is booked!";
	}
	
	String ValidationSystem(Validity V1)
	{
		return "Your Ticket is valid for 24 hour";
	}
}
