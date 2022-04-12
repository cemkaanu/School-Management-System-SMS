package school;

public class Student extends Human
{
	public School currentSchool;
	public float currentGPA;
	
	public int availableCredits;
	public int currentSemester;
	
	public Course[] weeklyCourses = new Course[8];
	
	/** Constructor of Student */
	public Student(String name, String middleName, String surname, int age, int currentSemester, char gender)
	{
		super(name, middleName, surname, age, gender);
		this.currentSemester = currentSemester;
	}
	
	/** Adds student's current semester courses to student's weekly courses array*/
	public void AddSemesterCourses()
	{
		availableCredits = 30;
		
		for(int i = 0; i < currentSchool.semesters[currentSemester].semesterCourses.length; i++)
		{
			if(currentSchool.semesters[currentSemester].semesterCourses[i] != null)
				AddCourse(currentSchool.semesters[currentSemester].semesterCourses[i]);
		}
		
		availableCredits = 0;
	}
	
	/** Checks if the student is eligible to receive extra credits */
	public void CheckExtraCredits()
	{
		if(3.5f <= currentGPA && currentGPA <= 4.0f)
			availableCredits += 6;
		else if(3.0f <= currentGPA && currentGPA < 3.5f)
			availableCredits += 3;
	}
	
	/** Shows weekly course list of student*/
	public void ShowWeeklyCourses()
	{
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println(this);
		System.out.println("\t\tWeekly Courses");
		for(int i = 0; i < 8; i++)
		{
			if(weeklyCourses[i] != null)
			{
				System.out.println(i + "." + weeklyCourses[i]);
			}
		}
		System.out.println("------------------------------------------------------------------------------------------------------\n");
	}
	
	/** Adds course to the weekly course list if student has enough credit for that course*/
	public void AddCourse(Course course)
	{
		if(CheckDuplicateCourse(course)) return;
		
		for(int i = 0; i < weeklyCourses.length; i++)
		{
			if(weeklyCourses[i] == null)
			{
				if(availableCredits >= course.credit)
				{
					availableCredits -= course.credit;
					weeklyCourses[i] = course;
					return;
				}
				else
				{
					System.err.println("You don't have enough credits\n");
					return;
				}
					
			}
		}
	}
	
	/** Drops course and refunds that course's credit to student*/
	public void DropCourse(int courseNumber)
	{
		if(weeklyCourses[courseNumber] != null)
		{
			availableCredits += weeklyCourses[courseNumber].credit;
			System.out.println("Dropping " + weeklyCourses[courseNumber].courseName);
			System.out.println(this.name + " now have "+ availableCredits + " credit(s)\n");
			weeklyCourses[courseNumber] = null;
			
		}
	}
	
	/** Checks if the student trying to take a course that he/she is already has */
	public boolean CheckDuplicateCourse(Course course)
	{
		for(int i = 0; i < weeklyCourses.length; i++)
		{
			if(weeklyCourses[i] != null && weeklyCourses[i].equals(course))
			{
				System.err.println("You already have this course\n");
				return true;
			}
				
		}
		
		return false;
	}
	
	/** Formats and shows transcript with updated GPA*/
	public void ShowTranscript()
	{	 
		UpdateGPA();
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println(this);
		System.out.println("\t\t\tTranscript");
		for(int i = 0; i < 8; i++)
		{
			if(weeklyCourses[i] != null)
			{
				System.out.println(i + "." + weeklyCourses[i] + " | Score: " + weeklyCourses[i].studentScore + " Grade: " + weeklyCourses[i].GetGrade());
			}
		}
		System.out.println("------------------------------------------------------------------------------------------------------\n");
	}
	
	/** Calculates and updates GPA*/
	public void UpdateGPA()
	{
		float qualityPoints = 0;
		float totalCredits = 0;
		
		for (Course course : weeklyCourses)
		{
			if(course != null)
			{
				course.GetGrade();
				qualityPoints += (course.credit * course.multiplier);
				totalCredits += course.credit;
			}
		}
		
		currentGPA = (float)Math.floor((qualityPoints / totalCredits) * 100) / 100;
		
		totalCredits = 0;
		qualityPoints = 0;
	
	}
	
	@Override
	public String toString()
	{
		return ("Student Info: " + name + " " + middleName + " " + surname + " - " + age + " years old " + getGender() + " - in " + (currentSemester + 1) + ".Semester - has a " + currentGPA + "GPA\n");
	}
	
}
