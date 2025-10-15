public class Service {
	public static void main(String[] args) {
		
		
		Customer c1 = new Customer();
		
		c1.setName("Prachi");
		c1.setEmail("Prachi@gmail.com");
		c1.setAddress("Latur");
		c1.setAge(20);
		c1.setMobno(1234567891);
		
		
		BankService BS= new BankService();
		String S=BS.openAccount(c1);
		System.out.println(S);
	}
}

class Customer
{
	private String name;
	private String email;
	private String address;
	private int age;
	private long mobno;
	
	
	
	String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	
	String getAddress()
	{
		return address;
	}
	
	void setAddress(String address)
	{
		this.address=address;
	}
	
	String getEmail()
	{
		return email;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	
	long getMobno()
	{
		return mobno;
	}
	void setMobno(long mobno)
	{
		this.mobno=mobno;
	}
	
	int getAge()
	{
		return age;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	
}

class BankService
{
	public String openAccount(Customer c1)
	{
		if(c1.getAge()>18)
		{
			System.out.println("Your age is "+ c1.getAge());
			System.out.println("Your account is opened");
			
			
		}
		
		
		return "your account is not opened";
		
	}
}