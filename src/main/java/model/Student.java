package model;

public class Student {
	private String name;
	private double grade;

	public Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		if (Double.compare(student.grade, grade) != 0) return false;
		if (name != null ? !name.equals(student.name) : student.name != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = name != null ? name.hashCode() : 0;
		temp = Double.doubleToLongBits(grade);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}
