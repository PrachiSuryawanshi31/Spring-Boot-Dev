
public class Service {
	
	public static void main(String[] args) {
		
Customer c1 = new Customer();
		
		c1.name="Prachi";
		c1.email="Prachi@gmail.com";
		c1.address="Latur";
		c1.age=5;
		c1.mobno=1234567891;
		
		Order O = new Order();
		
		O.name="Prachi";
		O.productName="Sofa";
		O.productPrice=20000;
		O.delivaryCharge=500;
		
		
		productReturn PR =new productReturn();
		PR.productName="Sofa";
		PR.productPrice=50000;
		
		
		
		AmezonService AS= new AmezonService();
		 String S=AS.openAccount(c1);
		 System.out.println(S);
		 
		 String S1=AS.orderSystem(O);
		 System.out.println(S1);
		 
		 String S2=AS.returnSystem(PR);
		 System.out.println(S2);
		
	}

}

class Customer
{
	 String	name;
	 String email;
	 String address;
	
	 int age;
	 long mobno;
	
}

class Order
{
	String name;
	String productName;
	int productPrice;
	int delivaryCharge;
	
}

class productReturn
{
	String productName;
	int productPrice;
	int accNo;
}

class AmezonService
{
	String openAccount(Customer c1)
	{
		return" Your Account is Opened Successfully !";
	}
	
	String orderSystem(Order O)
	{
		return "Your product orderd Successfully!";
	}
	
	String returnSystem(productReturn PR)
	{
		return "Your product is return with in 4 days ";
	}
}
