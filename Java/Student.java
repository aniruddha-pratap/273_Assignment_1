public class Student {
	
	String totalGPA;
	String studentFirstName;
	String studentLastName;
	String studentId;
	
	public Student(String studentFirstName, String studentLastName, String totalGPA)
    {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.totalGPA = totalGPA;
    }
	public Student(String studentId, String studentFirstName, String studentLastName, String totalGPA)
    {
		this.studentId = studentId;	
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.totalGPA = totalGPA;
    }
	
	public String getFirstName() {
		return studentFirstName;
	}
	
	public String getLastName() {
		return studentLastName;
	}

	public String getGPA() {
		return totalGPA;
	}

	public String getStudentid() {
		return studentId;
	}

	public void setStudentid(String studentId) {
		this.studentId = studentId;
	}
	
	@Override
	public String toString()
	{	
		return String.format("FirstName: %s\t Last Name: %s\n GPA: %s", this.studentFirstName,this.studentLastName,this.totalGPA);
	}	
}
