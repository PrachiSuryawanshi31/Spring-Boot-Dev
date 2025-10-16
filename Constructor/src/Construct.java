
public class Construct {
	public static void main(String[] args) {
		
		new Student("Prachi",90);
		
	}
}


class Student
{
	Student(String name ,int rollNo)   //PArmetarized Constructor
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No :"+rollNo);
	}
		
}


/*
 * Constructor is same like method ,But without return type
 * in constructor, Class name and method name must be same
 * Used to Create a object and initialize the variable
 */

