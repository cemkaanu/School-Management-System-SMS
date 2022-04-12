package school;

public class Semester
{
	public Course[] semesterCourses = new Course[8];
	private int courseIndex = 0;
	
	/** Adds course to the next available place in semesterCourses array*/
	public void AddCourse(Course course)
	{
		if(courseIndex < 8)
		{
			semesterCourses[courseIndex] = course;
			courseIndex++;
		}
	}
}
