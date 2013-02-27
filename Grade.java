package gradebookgui;

public class Grade {
	private String studentId;
	private String teacherId;
	private String courseId;
	private String gradeNr;
	
	public Grade(String s,String t, String c, String g)
	{
	 studentId = s;
	 teacherId = t;
	 courseId = c;
	 gradeNr = g;
	}
	
	/*
	public String getStudentId(){
		return studentId;
		
	}
	public String getTeacherId()
	{
		return teacherId;
	}
	public String getCourseId()
	{
		return courseId;
	}	
	public String getGrade()
	{
		return gradeNr;
	}
	*/
	
	public String[] getGrade()
	{
		String[] myGrade = {studentId, teacherId, courseId, gradeNr};
		
                //Return the contents of the array
		return myGrade;
		
	}
	
        public String getGradeNr()
	{
		String[] myGrade = {studentId, teacherId, courseId, gradeNr};
		
		return myGrade[3];
		
	}
        
        
        public String getCourseNr()
	{
		String[] myGrade = {studentId, teacherId, courseId, gradeNr};
		
                //3rd item on teh array
		return myGrade[2];
		
	}
        
        
        public String getTeacherNr()
	{
		String[] myGrade = {studentId, teacherId, courseId, gradeNr};
		
                //2nd item on the array
		return myGrade[1];
		
	}
        
        
        public String getStudentNr()
	{
		String[] myGrade = {studentId, teacherId, courseId, gradeNr};
		
                //first item on the array
		return myGrade[0];
		
	}

        public void setGradeNr(String gNr)
	{
		
		this.gradeNr = gNr;
		
	}

}
	