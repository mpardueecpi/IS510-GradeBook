package edu.ecpi.is510;

import String;
import Integer;

public class Assignments 
{

  private Integer assignmentID;

  private Integer courseID;

  private String studentID;

  private Integer grade;

  public void setAssignmentID(int assnID) 
  {
  assignmentID = assnID;
  }

  public Integer getAssignmentID() 
  {
  return assignmentID;  
  }

  public void setCourseID(int crseID) 
  {
  courseID = crseID;  
  }

  public Integer getCourseID() 
  {
  return courseID;
  }

  public void setStudentID(String stuID) 
  {
  studentID = stuID;
  }

  public String getStudentID() 
  {
  return studentID;
  }

  public void setGrade(int grde) 
  {
  grade = grde;
  }

  public Integer getGrade() 
  {
  return grade;
  }

}
