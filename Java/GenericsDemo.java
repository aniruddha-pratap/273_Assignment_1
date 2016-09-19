import java.util.ArrayList;

public class GenericsDemo {
	
	public static void main(String[] args) 
	{
		try
		{
			// TODO Auto-generated method stub
			ArrayList<Student> newStudents = new ArrayList<Student>();
			newStudents.add(new Student("011432317", "Aniruddha", "Singh", "4"));
			newStudents.add(new Student("011432316", "Ani", "Singh", "4"));
			for(Student student : newStudents)
				System.out.println(student.toString());
		}	
		catch(Exception e)
		{
			System.out.println(e);		
		}
	}	
}
