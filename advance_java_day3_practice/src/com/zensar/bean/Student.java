package com.zensar.bean;

public class Student {
	
	private int roll_number;
	private String student_name;
	private String course;
	private int duration;
	private int age;
	private String gender;
	private String hometown;
	
	public Student(int roll_number, String student_name, String course, int duration, int age, String gender, String hometown) {
	super();
	this.roll_number=roll_number;
	this.student_name=student_name;
	this.course=course;
	this.duration=duration;
	this.age=age;
	this.gender=gender;
	this.hometown=hometown;
	}

	public int getRoll_number() {
		return roll_number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", student_name=" + student_name + ", course=" + course
				+ ", duration=" + duration + ", age=" + age + ", gender=" + gender + ", hometown=" + hometown + "]";
	}


}
