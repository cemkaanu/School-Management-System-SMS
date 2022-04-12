package school;

public class Course
{
	// General
	public String courseName;
	public int credit;
	
	// Student Specific
	public float studentScore;
	public float multiplier;
	
	/** Constructor of Course*/
	public Course(String courseName, int credit)
	{
		this.courseName = courseName;
		this.credit = credit;
	}
	
	/** Sets and Returns Grade and Multiplier using students current score on this course*/
	public String GetGrade()
	{
		if(90 <= studentScore && studentScore <= 100)
		{
			multiplier = 4.0f;
			return "AA";
		}
		else if(85 <= studentScore && studentScore < 90)
		{
			multiplier = 3.5f;
			return "BA";
		}
		else if(75 <= studentScore && studentScore < 85)
		{
			multiplier = 3.0f;
			return "BB";
		}
		else if(65 <= studentScore && studentScore < 75)
		{
			multiplier = 2.5f;
			return "CB";
		}
		else if(55 <= studentScore && studentScore < 65)
		{
			multiplier = 2.0f;
			return "CC";
		}
		else if(45 <= studentScore && studentScore < 55)
		{
			multiplier = 1.8f;
			return "DC";
		}
		else if(40 <= studentScore && studentScore < 45)
		{
			multiplier = 1.5f;
			return "DD";
		}
		else if(0 <= studentScore && studentScore < 40)
		{
			multiplier = 1.0f;
			return "FF";
		}
		else
			return "Wrong Score";
	}
	
	@Override
	public String toString()
	{
		return (courseName + " Course is " + credit + " credits");
	}
}
