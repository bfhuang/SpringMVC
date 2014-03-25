package dao;

import model.Student;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class StudentDao {

	public List<Student> getAllStudent() {
		return newArrayList(new Student("studentOne", 50),
				new Student("studentTwo", 60),
				new Student("studentThree", 70));
	}
}
