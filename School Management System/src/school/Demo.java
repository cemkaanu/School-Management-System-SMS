package school;

/** Demonstration Class
 * @author Cem Kaan Ugur
 * @author 200403613
 * @author Bilgisayar Muhendisligi
*/

public class Demo
{
	static RandomCreation randomCreation = new RandomCreation();
	static School gelisimUniversitesi = new School();
	static Advisor exampleAdvisor;
	static Student exampleStudent;
	
	public static void main(String[] args)
	{
		RandomInitialization();
		
		exampleAdvisor = gelisimUniversitesi.advisors[4];
		
		exampleStudent = exampleAdvisor.students[19];
		
		while(exampleStudent.currentSemester == 7)
		{
			exampleStudent = exampleAdvisor.students[randomCreation.RandomInt(exampleAdvisor.students.length)];
		}
		
		AddDropCourseDemo();
		
		ChangeNoteDemo();
		
		//ShowInfoDemo();
	}
	
	/** Demonstration of Adding and Dropping course with and without available credits */
	static void AddDropCourseDemo()
	{
		System.out.println("\n\n-------------Add - Drop Course Demonstration-------------\n\n");
		
		exampleStudent.ShowWeeklyCourses();
		
		exampleStudent.AddCourse(exampleStudent.currentSchool.semesters[exampleStudent.currentSemester + 1].semesterCourses[3]);
		
		exampleStudent.DropCourse(1);
		
		exampleStudent.AddCourse(exampleStudent.currentSchool.semesters[exampleStudent.currentSemester + 1].semesterCourses[0]);
		
		exampleStudent.ShowWeeklyCourses();
	}
	
	/** Demonstration of changing note therefore updating GPA and Transcript */
	static void ChangeNoteDemo()
	{
		System.out.println("\n\n-------------Change Note Demonstration-------------\n\n");
		
		exampleStudent.ShowTranscript();
		
		exampleStudent.weeklyCourses[0].studentScore = 100.0f;
		
		exampleStudent.ShowTranscript();
	}
	
	/** Demonstration of Advisor being able to see info individually or all info at once*/
	static void ShowInfoDemo()
	{
		System.out.println("\n\n-------------Show All Info Demonstration-------------\n\n");
		
		System.out.println(exampleStudent);
		
		System.out.println(exampleAdvisor);
		
		exampleAdvisor.ShowAllStudentInfo();
		
		exampleAdvisor.ShowAllTranscripts();
		
		exampleAdvisor.ShowAllWeeklyCourses();
	}
	
	/** Random initialization for this demonstration*/
	static void RandomInitialization()
	{
		randomCreation.school = gelisimUniversitesi;
		
		for(int i = 0; i < gelisimUniversitesi.advisors.length; i++)
			gelisimUniversitesi.advisors[i] = randomCreation.CreateRandomAdvisor();
		
		for (Advisor advisor : gelisimUniversitesi.advisors)
		{
			FillAdvisor(advisor);
		}
		
		gelisimUniversitesi.ShowAllAdvisorInfo();
		
		System.out.println("--------------------------------------------------------\n");
		
		gelisimUniversitesi.ShowAllStudentInfo();
		
		System.out.println("Randomly Created 8 Advisors and 256 Students\n");
	}
	
	/** Fills advisor's students array with rng students */
	static void FillAdvisor(Advisor advisor)
	{
		for(int i = 0; i < advisor.students.length; i++)
		{
			advisor.AddStudent(randomCreation.CreateRandomStudent());
		}	
	}

}
