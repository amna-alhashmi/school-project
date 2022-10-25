package school;

import java.util.ArrayList;

public class Student {

	ArrayList<Course> ourCourse=new ArrayList<>(); // make this private

	void setOurCourse(ArrayList<Course> ourCourse) {
		this.ourCourse = ourCourse;
	}

	public ArrayList<Course> getOurCourse() {
		return ourCourse;
	}

	String studentName;

	public void setStudentName(String a) {
		this.studentName = a;

	}

	public String getStudentName() {
		return studentName;
	}

	String studentEmail;

	public void setStudentEmail(String st) {
		this.studentEmail = st;
	}

	public String getStudentEmail() {
		return studentEmail;

	}

	double studentAmount;

	public void setStudentAmount(double st) {
		this.studentAmount = st;
	}

	public double getStudentAmount() {
		return studentAmount;

	}
}