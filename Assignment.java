//package edu.ecpi.is510.gradebook;

public class Assignment{
	private String assignmentName;
	private int assignmentValue;

	public Assignment(String assignmentName, int assignmentValue){
		this.assignmentName = assignmentName;
		this.assignmentValue = assignmentValue;
	}

	public Assignment(){
		this("Red", 0);
	}

	public void setAssignmentName(String assignmentName){
		this.assignmentName = assignmentName;
	}

	public String getAssignmentName(){
		return this.assignmentName;
	}

	public void setAssignmentValue(int assignmentValue){
		this.assignmentValue = assignmentValue;
	}

	public int getAssignmentValue(){
		return this.assignmentValue;
	}

	public String toString(){
		return "Assignment name is: " + this.assignmentName + ". Assignment value is: " + this.assignmentValue;
	}

}