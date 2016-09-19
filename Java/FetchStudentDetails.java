import java.util.Scanner;
public class FetchStudentDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			String wishtoContinue;
			Scanner reader = new Scanner(System.in);
			StudentData fetchStudent = new StudentData();
			do
			{
				System.out.println("Welcome to Student Information");
				System.out.println("1. Add Student");
				System.out.println("2. Retrieve Student");
				System.out.println("3. Delete Student");
				System.out.println("4. Exit");
				int choice = reader.nextInt();
				switch(choice)
				{
					case 1: 
						fetchStudent.addStudent();
					break;  
					case 2:
						fetchStudent.fetchStudent();
					break;
					case 3:
						fetchStudent.removeStudent();
					break;
					case 4:
						System.out.println("Thank You");
						System.exit(0);
					break;
					default:
						System.out.println("Wrong Choice");
					break;
				}
				System.out.println("Do you want to Continue");
				wishtoContinue = reader.next();
			}while(wishtoContinue.equals("y") || wishtoContinue.equals("Y"));	  
				 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
