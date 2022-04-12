package school;

public class Human
{
	public String name = "";
	public String middleName = "";
	public String surname = "";
	
	public int age;
	private char gender;
	
	/** Constructor of Human*/
	public Human(String name, String middleName, String surname, int age, char gender)
	{
		this.name = name;
		this.middleName = middleName;
		this.surname = surname;
		
		this.age = age;
		setGender(gender);
	}
	
	@Override
	public String toString()
	{
		return ("Hello!\nMy name is " + name + " " + middleName + " " + surname + "\nI'm " + age + " years old\n");
	}

	public char getGender()
	{
		return gender;
	}
	
	/** Sets Gender only if it's Female Or Male*/
	public void setGender(char gender)
	{
		if(gender == 'M' || gender == 'F')
			this.gender = gender;
		else
			System.err.println("Not specified gender");
	}
}
