/**
This is the Students class with the set and get methods
@author Kasam Hamza
@version 1.0.1
**/

package edu.ecpi.is510;

import java.awt.*;
import java.util.ArrayList;

public class Students extends Users 
{
  protected String studentID;
  protected String major;
  protected String[] grades;
  ArrayList<String> grades2 = new ArrayList<String>();

  public void setStudentID(String studentIDx) 
  {
	this.studentID = studentIDx;
  }

  public String getStudentID() 
  {  
	  return studentID;
  }

  public void setMajor(String majorx) 
  {
	  this.major = majorx;
  }

  public String getMajor() 
  {  
	  return major;
  }

  public String[] viewGrades() 
  {  
	  grades = new String[grades2.size()];
	  String[] returnedArray = grades2.toArray(grades);
	  return grades;
  }

}