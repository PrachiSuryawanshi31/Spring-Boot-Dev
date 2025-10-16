

public class Company {
	
	public static void main(String[] args) {
		
		Manager M =new Manager();
		M.name="Prachi";
		M.age=20;
		M.empId=2001;
		M.salary=500000.0;
		M.department="IT";
		
		System.out.println("Name:"+M.name);
		System.out.println("Age :"+M.age);
		System.out.println("EmpId: "+M.empId);
		System.out.println("Salary:"+M.salary);
		System.out.println("Department:"+M.department);

	}

}

class Person
{
	String name;
	int age;
	
}

class Employee extends Person
{
	int empId;
	double salary;
	
}

class Manager extends Employee
{
	String department;
}
