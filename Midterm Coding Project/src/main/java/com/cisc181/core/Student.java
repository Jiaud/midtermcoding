package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Student extends Person {

	private String eMajor;
	private UUID StudentID;
	
	public String geteMajor ( )
    {
        return this.eMajor;
    }
    public void seteMajor (String Major)
    {
        this.eMajor = Major;    
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email)
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.eMajor = Major;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}