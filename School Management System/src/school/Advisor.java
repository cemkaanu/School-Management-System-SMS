package school;

public class Advisor extends Human
{
	public School currentSchool;
	
	public Student[] students = new Student[32];
	private int studentIndex = 0;
	
	/** Constructor of Advisor */
	public Advisor(String name, String middleName, String surname, int age, School currentSchool, char gender)
	{
		super(name, middleName, surname, age, gender);
		this.currentSchool = currentSchool;
	}
	
	/** Adds student to next available (null) place on students array*/
	public void AddStudent(Student student)
	{
		if(studentIndex < 40)
		{
			students[studentIndex] = student;
			studentIndex++;
		}
	}
	
	/** Shows all student info with their indexes*/
	public void ShowAllStudentInfo()
	{
		for(Student student : students)
		{
			if(student != null)
			{
				System.out.println("[" +java.util.Arrays.asList(students).indexOf(student) + "] " + student);
			}
		}
	}
	
	/** Shows every student's weekly courses with their indexes*/
	public void ShowAllWeeklyCourses()
	{
		for(Student student : students)
		{
			if(student != null)
			{
				System.out.println("[" +java.util.Arrays.asList(students).indexOf(student) + "]");
				student.ShowWeeklyCourses();
			}
		}
	}
	
	/** Shows every student's transcripts with their indexes*/
	public void ShowAllTranscripts()
	{
		for(Student student : students)
		{
			if(student != null)
			{
				System.out.println("[" +java.util.Arrays.asList(students).indexOf(student) + "]");
				student.ShowTranscript();
			}
		}
	}
	
	@Override
	public String toString() {
		return ("Advisor Info: " + name + " " + middleName + " " + surname + " - " + age + " years old " + getGender());
	}
}
