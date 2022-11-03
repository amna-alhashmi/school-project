package school;

import java.util.ArrayList;

public class School {
	String schoolName;

	 protected void finalize() throws Throwable
	    {
	        try {
	 
	            System.out.println("inside demo's finalize()");
	        }
	        catch (Throwable e) {
	 
	            throw e;
	        }
	        finally {
	 
	            System.out.println("Calling finalize method"
	                               + " of the Object class");
	 
	            // Calling finalize() of Object class
	            super.finalize();
	        }
	    } 
	ArrayList<Student> studentName=new ArrayList<>();

	void setStudentName(ArrayList<Student> studentName) {
		this.studentName = studentName;
	}

	public ArrayList<Student> getStudentName() {
		return studentName;
	}

	

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public static void main(String[] args) {

	}
}
