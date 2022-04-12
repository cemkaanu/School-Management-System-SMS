package school;

public class School
{
	Semester[] semesters = new Semester[8];
	
	Advisor[] advisors = new Advisor[8];
	Student[] activeStudents = new Student[256];
	
	/** Constructor of School*/
 	public School()
	{
		SemesterInfo();
	}
 	
 	/** Shows all advisor info with their indexes on advisors array*/
 	public void ShowAllAdvisorInfo()
 	{
 		for (Advisor advisor : advisors)
 		{
 			if(advisor != null)
			{
				System.out.println("[" +java.util.Arrays.asList(advisors).indexOf(advisor) + "] " + advisor);
			}
		}
 	}
 	
 	/** Shows all student info with their indexes on students array*/
 	public void ShowAllStudentInfo()
 	{
 		for (Student student : activeStudents)
 		{
 			if(student != null)
			{
				System.out.println("[" +java.util.Arrays.asList(activeStudents).indexOf(student) + "] " + student);
			}
		}
 	}
	
 	/** Adds Istanbul Gelisim University's Computer Science semester and course info to the objects*/
	private void SemesterInfo()
	{
		//region 1st Semester
		Semester semester1 = new Semester();
		semesters[0] = semester1;
		
		semesters[0].AddCourse(new Course("B�LG�SAYAR M�HEND�SL���NE G�R��", 3));
		semesters[0].AddCourse(new Course("B�LG�SAYAR PROGRAMLAMA I", 3));
		semesters[0].AddCourse(new Course("F�Z�K I", 4));
		semesters[0].AddCourse(new Course("MATEMAT�K I", 4));
		semesters[0].AddCourse(new Course("T�RK D�L� I", 2));
		semesters[0].AddCourse(new Course("YABANCI D�L I (�NG.)", 3));
		//endregion
		
		//region 2nd Semester
		Semester semester2 = new Semester();
		semesters[1] = semester2;
				
		semesters[1].AddCourse(new Course("B�LG�SAYAR PROGRAMLAMA II", 3));
		semesters[1].AddCourse(new Course("F�Z�K II", 4));
		semesters[1].AddCourse(new Course("L�NEER CEB�R", 3));
		semesters[1].AddCourse(new Course("MATEMAT�K II", 4));
		semesters[1].AddCourse(new Course("T�RK D�L� II", 2));
		semesters[1].AddCourse(new Course("YABANCI D�L II (�NG.)", 3));
		//endregion
		
		//region 3rd Semester
		Semester semester3 = new Semester();
		semesters[2] = semester3;
						
		semesters[2].AddCourse(new Course("ATAT�RK �LK. VE �NK. TAR�H� I", 2));
		semesters[2].AddCourse(new Course("NESNE Y�NEL�ML� PROGRAMLAMA", 4));
		semesters[2].AddCourse(new Course("ELEKTR�K M�HEND�SL���N�N TEMELLER�", 3));
		semesters[2].AddCourse(new Course("D�FERANS�YEL DENKLEMLER", 3));
		semesters[2].AddCourse(new Course("OLASILIK VE �STAT�ST�K", 3));
		semesters[2].AddCourse(new Course("SOSYAL SE�MEL� I", 3));
		//endregion
				
		//region 4th Semester
		Semester semester4 = new Semester();
		semesters[3] = semester4;
						
		semesters[3].AddCourse(new Course("ATAT�RK �LK. VE �NK. TAR�H� II", 2));
		semesters[3].AddCourse(new Course("VER� YAPILARI VE ALGOR�TMALAR", 4));
		semesters[3].AddCourse(new Course("B�LG�SAYAR M�MAR�S�", 3));
		semesters[3].AddCourse(new Course("G�RSEL PROGRAMLAMA", 3));
		semesters[3].AddCourse(new Course("ELEKTRON�K DEVRELER", 3));
		semesters[3].AddCourse(new Course("AYRIK MATEMAT�K", 3));
		//endregion
				
		//region 5th Semester
		Semester semester5 = new Semester();
		semesters[4] = semester5;
						
		semesters[4].AddCourse(new Course("��LET�M S�STEMLER�", 3));
		semesters[4].AddCourse(new Course("VER�TABANI Y�NET�M�", 3));
		semesters[4].AddCourse(new Course("B�L���M ET��� VE HUKUKU", 2));
		semesters[4].AddCourse(new Course("YAZ STAJI I", 0));
		semesters[4].AddCourse(new Course("B�L�M SE�MEL� I", 3));
		semesters[4].AddCourse(new Course("MANTIKSAL DEVRE TASARIMI", 3));
		semesters[4].AddCourse(new Course("SAYISAL ANAL�Z", 3));
		//endregion
			
		//region 6th Semester
		Semester semester6 = new Semester();
		semesters[5] = semester6;
						
		semesters[5].AddCourse(new Course("B�L�M DI�I SE�MEL� I", 3));
		semesters[5].AddCourse(new Course("YAZILIM M�HEND�SL���", 3));
		semesters[5].AddCourse(new Course("A� TEKNOLOJ�LER�", 3));
		semesters[5].AddCourse(new Course("M�KRO��LEMC�LER", 4));
		semesters[5].AddCourse(new Course("B�L�M SE�MEL� II", 3));
		semesters[5].AddCourse(new Course("�STAT�ST�KSEL ANAL�Z", 3));
		//endregion
				
		//region 7th Semester
		Semester semester7 = new Semester();
		semesters[6] = semester7;
						
		semesters[6].AddCourse(new Course("YAZ STAJI II", 0));
		semesters[6].AddCourse(new Course("B�LG�SAYAR PROJES�", 1));
		semesters[6].AddCourse(new Course("B�L�M SE�MEL� III", 3));
		semesters[6].AddCourse(new Course("B�L�M SE�MEL� IV", 3));
		semesters[6].AddCourse(new Course("B�L�M SE�MEL� V", 3));
		semesters[6].AddCourse(new Course("�� SA�LI�I VE G�VENL��� I", 3));
		semesters[6].AddCourse(new Course("SOSYAL SE�MEL� II", 3));
		//endregion
		
		//region 8th Semester
		Semester semester8 = new Semester();
		semesters[7] = semester8;
						
		semesters[7].AddCourse(new Course("B�L�M DI�I SE�MEL� II", 3));
		semesters[7].AddCourse(new Course("	B�T�RME PROJES�", 1));
		semesters[7].AddCourse(new Course("B�L�M SE�MEL� VI", 3));
		semesters[7].AddCourse(new Course("B�L�M SE�MEL� VII", 3));
		semesters[7].AddCourse(new Course("	G�R���MC�L�K", 3));
		//endregion
	}
}
