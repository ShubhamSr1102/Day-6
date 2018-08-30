package com.capgemini.collections;

public class Student implements Comparable<Student>{

	private String studentName;
	private int studentRollNumber;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentRollNumber) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	@Override
	public int compareTo(Student student) {
				int result = this.studentName.compareTo(student.studentName);
				if(result == 0)
					return Integer.compare(this.getStudentRollNumber(),student.getStudentRollNumber());
				return result;

	}
	@Override
	public String toString() {
		return studentName;
	}
	
}
