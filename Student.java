package oppHomeWork3;

public class Student extends Human {

	private double average;
	private int course;

	public Student(String name, String surname, int age, boolean sex, String nationality, double average, int course) {
		super(name, surname, age, sex, nationality);
		this.average = average;
		this.course = course;

	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * @param average
	 *            the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}

	/**
	 * @return the course
	 */
	public int getCourse() {
		return course;
	}

	/**
	 * @param course
	 *            the course to set
	 */
	public void setCourse(int course) {
		this.course = course;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [average=" + average + ", course=" + course + "]";
	}

}