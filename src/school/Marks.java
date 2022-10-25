package school;

public class Marks {

	int courseMark;

	public void setCourseMarks(int courseMarks) {
		if (courseMarks > 0 && courseMarks < 100) {
			this.courseMark = courseMarks;
		} else {
			System.out.println("pls enter marks between 0,100");
		}
	}

	public int getCourseMarks() {
		return courseMark;
	}

}
