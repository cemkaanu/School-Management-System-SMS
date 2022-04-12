package school;

import java.util.Random;

public class RandomCreation
{
	School school;
	
	// Random Creation
	String[] maleNames = {"Toygar","Çaðatay","Eyüp","Hakan","Hasan","Erkin","Tugay","Ercan","Ege","Yýldýrým","Mehmet","Ahmet","Metin","Kerem","Cengiz","Cem","Kaan","Ýrfan","Ýbrahim","Onur"};
	String[] femaleNames = {"Baþak","Yonca","Burçin","Hazal","Bahar","Meral","Aslý","Nilüfer","Melek","Defne","Betül","Yasemin","Simge","Ýpek","Mira","Ceren","Ýdil","Meltem","Burcu","Beyza"};
	String[] surnames = {"Aslan","Demirci","Kartal","Sadýk","Avcý","Uzun","Terzi","Yýlmaz","Çevik","Küçük","Balýk","Tilki","Güneþ","Baþtürk","Çevik","Gümüþ","Güler","Gül","Arslan","Çelik"};
	int randomIndex, studentIndex;
	char randomGender;
	
	Random random = new Random();
	
	/** Creates RNG Advisor*/
	public Advisor CreateRandomAdvisor()
	{
		randomGender = RandomGender();
		Advisor randomAdvisor = new Advisor(RandomName(false, randomGender), RandomName(true, randomGender), RandomSurname(), RandomAge(true), school, randomGender);
		return randomAdvisor;
	}
	
	/** Creates RNG Student and does the initial checks by updating GPA and checking for extra credits*/
	public Student CreateRandomStudent()
	{
		//Student student1 = new Student("Cem", "Kaan", "Ugur", 19, 3, 3.82f);
		
		randomGender = RandomGender();
		Student randomStudent = new Student(RandomName(false, randomGender), RandomName(true, randomGender), RandomSurname(), RandomAge(false), RandomSemester(), randomGender);
		
		randomStudent.currentSchool = school;
		
		randomStudent.AddSemesterCourses();
		
		for (Course course : randomStudent.weeklyCourses)
		{
			if(course != null)
			{
				course.studentScore = RandomScore();
				course.GetGrade();
			}
				
		}
		
		randomStudent.UpdateGPA();
		
		randomStudent.CheckExtraCredits();
		
		school.activeStudents[studentIndex] = randomStudent;
		studentIndex++;
		
		return randomStudent;
	}
	
	/** RNG gender with %50 chance */
	public char RandomGender()
	{
		if(random.nextFloat() >= 0.5f)
			return 'M';
		else
			return 'F';
	}
	
	/** RNG int between 0 and upper bound */
	public int RandomInt(int upperBound)
	{
		return random.nextInt(upperBound);
	}
	
	/** RNG name using gender and creates middleNames with %50 chance from maleNames/femaleNames array*/
	private String RandomName(boolean isMiddleName, char gender)
	{
		if(gender == 'M')
		{
			if(isMiddleName)
			{
				if(random.nextFloat() >= 0.5f)
					return maleNames[random.nextInt(maleNames.length)];
				else
					return "";
			}
			else
				return maleNames[random.nextInt(maleNames.length)];
		}
		else
		{
			if(isMiddleName)
			{
				if(random.nextFloat() >= 0.5f)
					return femaleNames[random.nextInt(femaleNames.length)];
				else
					return "";
			}
			else
				return femaleNames[random.nextInt(femaleNames.length)];
		}
		
		
	}
	
	/** RNG surname from surnames array*/
	private String RandomSurname()
	{
		return surnames[random.nextInt(surnames.length)];
	}
	
	/** RNG age
	 * if for advisor bounds are 24 and 36
	 * if for student bounds are 18 and 25*/
	private int RandomAge(boolean isAdvisor)
	{
		if(isAdvisor)
		{
			do
				randomIndex = random.nextInt(37);
			while (!(24 <= randomIndex && randomIndex <= 36));
		}
		else
		{
			do
				randomIndex = random.nextInt(26);
			while (!(18 <= randomIndex && randomIndex <= 25));
		}
		
		return randomIndex;
	}
	
	/** RNG semester*/
	private int RandomSemester()
	{
		return random.nextInt(8);
	}
	
	/** RNG score for each course
	 * with 2 Decimal Places*/
	private float RandomScore()
	{
		float temp = (float)Math.floor((25f + random.nextFloat() * (100f - 25f)) * 100) / 100;
		return temp;
	}
	
}
