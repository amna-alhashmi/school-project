package school;

import java.util.ArrayList;

public class Course {

	ArrayList<Marks> ourMarks = new ArrayList<>();
	String courseName;
	
	
	
	
	
	public void setOurMarks(ArrayList<Marks> ourMarks) {
		this.ourMarks = ourMarks;
	}

	public ArrayList<Marks> getOurCourse() {
		return ourMarks;
	}

	

	public void setCourseName(String a) {
		this.courseName = a;
	}

	public String courseName() {
		return courseName;
	}

}
