
public class Test {
	
	public static void main(String[] args) {
		
		/*AccountService AS=new AccountService();
		System.out.println(AS.name);
		System.out.println(AS.location);
		System.out.println(AS.type);
		
		AS.printMBalance();
	*/
		
		/*SavingAccount SA = new SavingAccount();
		System.out.println(SA.name);
		System.out.println(SA.location);
		System.out.println(SA.type);
		
		SA.printMBalance();*/
		
		CurrentAccount CA= new CurrentAccount();
		System.out.println(CA.name);
		System.out.println(CA.location);
		System.out.println(CA.type);
		
		CA.printMBalance();

}
}


class AccountService
{
	String name ="SBI";
	String location="Latur";
	String type="Account";
	
	
	public void printMBalance()
	{
		System.out.println("500");
	}
}


class SavingAccount extends AccountService
{
	public void printMBalance()
	{
		System.out.println("1000");
	}
}


class CurrentAccount extends AccountService
{
	public void printMBalance()
	{
		System.out.println("5000");
	}
}

