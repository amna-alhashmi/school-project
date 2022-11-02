package school;

import java.util.ArrayList;

public class Student implements studentInterface  {
	
	ArrayList<Course> ourCourse=new ArrayList<>(); // make this private

	int studentAge;
	String studentName;
	String studentEmail;
	double studentAmount;
	
	public void setStudentAge(int sA) {
		this.studentAge = sA;
	}

	public int getStudentAge() {
		return studentAge;

	}
	


	void setOurCourse(ArrayList<Course> ourCourse) {
		this.ourCourse = ourCourse;
	}

	public ArrayList<Course> getOurCourse() {
		return ourCourse;
	}

	

	public void setStudentName(String a) {
		this.studentName = a;

	}

	public String getStudentName() {
		return studentName;
	}

	

	public void setStudentEmail(String st) {
		this.studentEmail = st;
	}

	public String getStudentEmail() {
		return studentEmail;

	}

	

	public void setStudentAmount(double st) {
		this.studentAmount = st;
	}

	public double getStudentAmount() {
		return studentAmount;

	}
	@Override
public void studentAge(int studentAgeInput) {};

		
//		if (studentAgeInput>6&&studentAgeInput<18) {
//		System.out.println("Can join to school");
//		}
//		else{
//			System.out.println("Can not join to school");
//		}
//		
//		
//	}

}