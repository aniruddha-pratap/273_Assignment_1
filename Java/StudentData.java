import java.util.HashMap;
import java.util.Scanner;

public class StudentData 
{
	 HashMap<String,Student> map = new HashMap<String,Student>();
	 Scanner reader = new Scanner(System.in);
	 String studentId;
	 public void addStudent()
	 {
		 System.out.println("Enter Student Id");
		 String studentId = reader.nextLine();
		 System.out.println("Enter First Name");
		 String firstName=reader.nextLine();
		 System.out.println("Enter Last Number");
		 String lastName=reader.nextLine();
		 System.out.println("Enter GPA");
		 String totalGpa= reader.nextLine();
		 map.put(studentId,new Student(firstName,lastName,totalGpa));
		 System.out.println(map.get(studentId));
		 System.out.println("Details are Successfully added");
	 }
	 
	 public void fetchStudent()
	{
		System.out.println("Enter Student Id");
		studentId = reader.nextLine();
		if(map.containsKey(studentId))
		{
			Student studentDetails= map.get(studentId);
			String stDetails = studentDetails.toString();
			System.out.println("Details for " + studentId + ":" + stDetails); 
		}
		else
		{
			System.out.println("No Records fetched for Student Id "+ studentId);
		}
	}

	public void removeStudent()
	{
		System.out.println("Enter Student Id");
		studentId = reader.nextLine();
		if(map.containsKey(studentId))
		{
			map.remove(studentId);
			System.out.println("Removed details for Student Id: "+ studentId);
		}
		else
		{
			System.out.println("No Records found for Student Id: "+ studentId);
		}
	}
}






