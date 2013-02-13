import java.util.Arrays;


public class Gradebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of students t ostore it in a course
		Student[] myStudent = new Student[3];
		Teacher[] myTeacher = new Teacher[2];
		
		
		//Initialize a student object
		myStudent[0] = new Student("Juan","1001");
		myStudent[1] = new Student("Kasam","1002");
		myStudent[2] = new Student("Matt","1003");
		
		//Initialize teh teacher
		myTeacher[0] = new Teacher("Dr Pardue","10");
		myTeacher[1] = new Teacher("Dr Bryant","11");
		
		
		//initialize the course
		Course myCourse = new Course("OO Programming","IS510");
		
		//Initiazlize and array of grades
		Grade[] myGrade = new Grade[3];
		
		myGrade[0]  = new Grade(myStudent[0].getId(), 
				myTeacher[0].getId(),
				myCourse.getId(),
				"99");
		myGrade[1]  = new Grade(myStudent[1].getId(), 
				myTeacher[0].getId(),
				myCourse.getId(),
				"97");
		myGrade[2]  = new Grade(myStudent[2].getId(), 
				myTeacher[0].getId(),
				myCourse.getId(),
				"98");
		
		
		//Display the sutendt info
		for(int i = 0; i< myStudent.length; i++)
		{
			System.out.printf("%s (%s)",
					myStudent[i].getId(),
					myStudent[i].getName());
					
		}
		

		//print the teacher info
		for(int i = 0; i< myTeacher.length; i++)
		{
			System.out.printf("%s (%s)",
					myTeacher[i].getId(),
					myTeacher[i].getName());
					
		}
		
		
		//print the course info
		System.out.printf("%s (%s)",
				myCourse.getId(),
				myCourse.getName());

	
	
	//print the grades info
	for(int i = 0; i< myGrade.length; i++)
	{
		System.out.printf("%s ",
				Arrays.toString(myGrade[i].getGrade()));
				
	}

}
}
