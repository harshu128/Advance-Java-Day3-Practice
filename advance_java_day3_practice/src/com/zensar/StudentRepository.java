package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zensar.bean.Student;
import com.zensar.utility.DBUtil;

public class StudentRepository {
	
	public void addStudent(Student student)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into student values(?,?,?,?,?,?,?)";
		try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, student.getRoll_number());
		pst.setString(2, student.getStudent_name());
		pst.setString(3, student.getCourse());
		pst.setInt(4, student.getDuration());
		pst.setInt(5, student.getAge());
		pst.setString(6, student.getGender());
		pst.setString(7, student.getHometown());
		
		int result=pst.executeUpdate();
		if(result==0) {
			System.out.println("database opeartion failed");
		}
		else
		{
			System.out.println("database operation successful");
		}
		}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
	}
}

	public List<Student> getAllStudent(){
		List<Student> listOfAllStudent = new ArrayList<Student>();
		// jdbc code to fetch all employees from db and add them to this list
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from student";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int roll_number = rs.getInt("roll_number");
				String student_name = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				String gender=rs.getString("gender");
				String hometown=rs.getString("hometown");
				Student student = new Student(roll_number, student_name, course, duration, age,gender,hometown);
				listOfAllStudent.add(student);
			}
		}catch(Exception e) {
	System.out.println("Exception Occured:"+e);
}
System.out.println("listOfAllStudent:"+listOfAllStudent);
return listOfAllStudent;
}


	public void deleteStudent(int roll_number) {
		
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="delete from student where roll_number=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, roll_number);
			int result=pst.executeUpdate();
			if(result==0) {
				System.out.println("deletion failed");
			}else {
				System.out.println("deletion success");
			}
		}catch(Exception e) {
			System.out.println("Exception occured :"+e);
		}
	}
	

	public Student getStudent(int roll_number) {
		Student student = null;
		// jdbc code to connect to database and fetch employee details with this id
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from student where roll_number=?";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, roll_number);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
		String student_name = rs.getString("student_name");
		String course = rs.getString("course");
		int duration = rs.getInt("duration");
		int age = rs.getInt("age");
		String gender = rs.getString("gender");
		String hometown = rs.getString("hometown");
		student = new Student(roll_number, student_name, course, duration, age, gender, hometown);
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}

		return student;
		}

	public void updateStudent(Student student) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update student set student_name=?, course=?, duration=?, age=?, gender=?, hometown=? where roll_number=?";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,  student.getStudent_name());
		pst.setString(2, student.getCourse());
		pst.setInt(3, student.getDuration());
		pst.setInt(4,  student.getAge());
		pst.setString(5,  student.getGender());
		pst.setString(6, student.getHometown());
		pst.setInt(7, student.getRoll_number());		
		pst.executeUpdate();

		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}


	/*
	public Student getStudent(int roll_number) {
		Student student=null;
		//jdbc code to connect to database and fetch student details with this roll_number
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="select * from student wherer roll_number=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, roll_number);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				String student_name=rs.getString("student_name");
				String course=rs.getString("course");
				int duration=rs.getInt("duration");
				int age=rs.getInt("age");
				String gender=rs.getString("gender");
				String hometown=rs.getString("hometown");
				
				student=new Student(roll_number, student_name, course, duration, age, gender, hometown);
			}
			
		}catch(Exception e) {
			System.out.println("Exception occured:"+e);
		}
		return student;
	}
		*/
	}
