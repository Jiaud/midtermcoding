package com.cisc181.eNums;

import java.util.UUID;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private String Major;
	
	public Course(String CourseName) {
		super();
		setCourseID(UUID.randomUUID());
		CourseName = getCourseName();
	}
	
	public Course(int GradePoints) {
		
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

}
