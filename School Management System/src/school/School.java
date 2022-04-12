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
		
		semesters[0].AddCourse(new Course("BÝLGÝSAYAR MÜHENDÝSLÝÐÝNE GÝRÝÞ", 3));
		semesters[0].AddCourse(new Course("BÝLGÝSAYAR PROGRAMLAMA I", 3));
		semesters[0].AddCourse(new Course("FÝZÝK I", 4));
		semesters[0].AddCourse(new Course("MATEMATÝK I", 4));
		semesters[0].AddCourse(new Course("TÜRK DÝLÝ I", 2));
		semesters[0].AddCourse(new Course("YABANCI DÝL I (ÝNG.)", 3));
		//endregion
		
		//region 2nd Semester
		Semester semester2 = new Semester();
		semesters[1] = semester2;
				
		semesters[1].AddCourse(new Course("BÝLGÝSAYAR PROGRAMLAMA II", 3));
		semesters[1].AddCourse(new Course("FÝZÝK II", 4));
		semesters[1].AddCourse(new Course("LÝNEER CEBÝR", 3));
		semesters[1].AddCourse(new Course("MATEMATÝK II", 4));
		semesters[1].AddCourse(new Course("TÜRK DÝLÝ II", 2));
		semesters[1].AddCourse(new Course("YABANCI DÝL II (ÝNG.)", 3));
		//endregion
		
		//region 3rd Semester
		Semester semester3 = new Semester();
		semesters[2] = semester3;
						
		semesters[2].AddCourse(new Course("ATATÜRK ÝLK. VE ÝNK. TARÝHÝ I", 2));
		semesters[2].AddCourse(new Course("NESNE YÖNELÝMLÝ PROGRAMLAMA", 4));
		semesters[2].AddCourse(new Course("ELEKTRÝK MÜHENDÝSLÝÐÝNÝN TEMELLERÝ", 3));
		semesters[2].AddCourse(new Course("DÝFERANSÝYEL DENKLEMLER", 3));
		semesters[2].AddCourse(new Course("OLASILIK VE ÝSTATÝSTÝK", 3));
		semesters[2].AddCourse(new Course("SOSYAL SEÇMELÝ I", 3));
		//endregion
				
		//region 4th Semester
		Semester semester4 = new Semester();
		semesters[3] = semester4;
						
		semesters[3].AddCourse(new Course("ATATÜRK ÝLK. VE ÝNK. TARÝHÝ II", 2));
		semesters[3].AddCourse(new Course("VERÝ YAPILARI VE ALGORÝTMALAR", 4));
		semesters[3].AddCourse(new Course("BÝLGÝSAYAR MÝMARÝSÝ", 3));
		semesters[3].AddCourse(new Course("GÖRSEL PROGRAMLAMA", 3));
		semesters[3].AddCourse(new Course("ELEKTRONÝK DEVRELER", 3));
		semesters[3].AddCourse(new Course("AYRIK MATEMATÝK", 3));
		//endregion
				
		//region 5th Semester
		Semester semester5 = new Semester();
		semesters[4] = semester5;
						
		semesters[4].AddCourse(new Course("ÝÞLETÝM SÝSTEMLERÝ", 3));
		semesters[4].AddCourse(new Course("VERÝTABANI YÖNETÝMÝ", 3));
		semesters[4].AddCourse(new Course("BÝLÝÞÝM ETÝÐÝ VE HUKUKU", 2));
		semesters[4].AddCourse(new Course("YAZ STAJI I", 0));
		semesters[4].AddCourse(new Course("BÖLÜM SEÇMELÝ I", 3));
		semesters[4].AddCourse(new Course("MANTIKSAL DEVRE TASARIMI", 3));
		semesters[4].AddCourse(new Course("SAYISAL ANALÝZ", 3));
		//endregion
			
		//region 6th Semester
		Semester semester6 = new Semester();
		semesters[5] = semester6;
						
		semesters[5].AddCourse(new Course("BÖLÜM DIÞI SEÇMELÝ I", 3));
		semesters[5].AddCourse(new Course("YAZILIM MÜHENDÝSLÝÐÝ", 3));
		semesters[5].AddCourse(new Course("AÐ TEKNOLOJÝLERÝ", 3));
		semesters[5].AddCourse(new Course("MÝKROÝÞLEMCÝLER", 4));
		semesters[5].AddCourse(new Course("BÖLÜM SEÇMELÝ II", 3));
		semesters[5].AddCourse(new Course("ÝSTATÝSTÝKSEL ANALÝZ", 3));
		//endregion
				
		//region 7th Semester
		Semester semester7 = new Semester();
		semesters[6] = semester7;
						
		semesters[6].AddCourse(new Course("YAZ STAJI II", 0));
		semesters[6].AddCourse(new Course("BÝLGÝSAYAR PROJESÝ", 1));
		semesters[6].AddCourse(new Course("BÖLÜM SEÇMELÝ III", 3));
		semesters[6].AddCourse(new Course("BÖLÜM SEÇMELÝ IV", 3));
		semesters[6].AddCourse(new Course("BÖLÜM SEÇMELÝ V", 3));
		semesters[6].AddCourse(new Course("ÝÞ SAÐLIÐI VE GÜVENLÝÐÝ I", 3));
		semesters[6].AddCourse(new Course("SOSYAL SEÇMELÝ II", 3));
		//endregion
		
		//region 8th Semester
		Semester semester8 = new Semester();
		semesters[7] = semester8;
						
		semesters[7].AddCourse(new Course("BÖLÜM DIÞI SEÇMELÝ II", 3));
		semesters[7].AddCourse(new Course("	BÝTÝRME PROJESÝ", 1));
		semesters[7].AddCourse(new Course("BÖLÜM SEÇMELÝ VI", 3));
		semesters[7].AddCourse(new Course("BÖLÜM SEÇMELÝ VII", 3));
		semesters[7].AddCourse(new Course("	GÝRÝÞÝMCÝLÝK", 3));
		//endregion
	}
}
