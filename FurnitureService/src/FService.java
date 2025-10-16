
public class FService {
	public static void main(String[] args) {
		
		Customer C1=new Customer();
		C1.setName("Prachi");
		C1.setAddress("Pune");
		C1.setMobNo(875698348);
		
		Order O=new Order();
		O.setProductName("Sofa");
		O.setProductPrice(200000);
		
		FurnitureService FS=new FurnitureService();
		
		String S=FS.openAccount(C1);
		System.out.println(S);
		
		String S2=FS.orderSystem(O);
		System.out.println(S2);
		
		String S3=FS.returnProduct(O);
		System.out.println(S3);
	}

}

class Customer
{
	private String name;
	private String address;
	private long mobNo;
	
	
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
	
	long getMobno()
	{
		return mobNo;
	}
	
	void setMobNo( long mobNo)
	{
		this.mobNo=mobNo;
	}
	
	
}

class Order
{
	private String productName;
	private int productPrice;
	
	
	 String getProductName()
	{
		return productName;
	}
	 
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	int getProductPrice() 
	{
		return productPrice;
	}
	public void setProductPrice(int productPrice)
	{
		this.productPrice = productPrice;
	}
	
	
}




class FurnitureService
{
	String openAccount(Customer C1)
	{
		return " Account is Created..!";
	}
	
	String orderSystem(Order O)
	{
		return "product is Ordered..! ";
	}
	
	String returnProduct(Order O)
	{
		return "Your Product is successfully return !";
	}
	
}
