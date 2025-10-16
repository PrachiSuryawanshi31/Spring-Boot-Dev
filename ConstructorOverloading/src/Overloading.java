
public class Overloading {
	public static void main(String[] args) {
		
		new Student("Prachi");
		
		//Student S=new Student("Prachi",20);
		new Student("Prachi",20,'A',1987657863);
	}
}


class Student
{
	
	Student(String name)
	{
		System.out.println("Name : "+name);
	}
	
	Student(String name ,int rollNo)
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No :"+rollNo);
	}
	
	Student(String name ,int rollNo,char div)
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No :"+rollNo);
		System.out.println("Divison :"+div);
	}
	
	Student(String name ,int rollNo,char div,float persentage)
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No :"+rollNo);
		System.out.println("Divison :"+div);
		System.out.println("Persentage: "+persentage);
	}
	
	Student(String name ,int rollNo,char div,float persentage,long mobNO)
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No :"+rollNo);
		System.out.println("Divison :"+div);
		System.out.println("Persentage: "+persentage);
		System.out.println("Mobile No :"+mobNO);
	}
}



/*Constructor Overloading
 * Multiple constructor in same class ,
 *  but with different number of arguments called Constructor overloading 
 
 */