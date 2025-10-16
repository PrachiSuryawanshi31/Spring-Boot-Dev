
public class Test {
	
	public static void main(String[] args) {
		
		Parent P1=new Parent();
		P1.child(20);
		
		P1.child("Prachi");
		
		P1.child(1876578454);
		
	}

}


class Parent
{
	void child(String name)
	{
		System.out.println("Name :"+name);
	}
	
	void child(int age)
	{
		System.out.println("Age :"+age);
	}
	
	void child(long mobNo)
	{
		System.out.println("Mobile No :"+mobNo);
	}
}


/*IN Method Overloading method name must be same  
 * Input Argument Compulsory Different
 *Return type and access modifier can be anything 
 **/



/*
 * Automatic Promotion
 * BSNLFD
 * B--->Byte
 * S--->Short
 * N--->Int
 * L--->Long
 * F--->Float
 * D--->Double */