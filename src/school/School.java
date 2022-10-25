package school;

import java.util.ArrayList;

public class School {
	ArrayList<Student> studentName=new ArrayList<>();

	void setStudentName(ArrayList<Student> studentName) {
		this.studentName = studentName;
	}

	public ArrayList<Student> getStudentName() {
		return studentName;
	}

	String schoolName;

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public static void main(String[] args) {

	}
}
