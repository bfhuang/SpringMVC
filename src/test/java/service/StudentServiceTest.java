package service;

import model.Student;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentServiceTest {

	@Test
	public void shouldGetAllThePassedStudents() {
		//given
		StudentService studentService = new StudentService();
		List<Student>  expectedStudents = newArrayList(
				new Student("studentTwo",60),
				new Student("studentThree",70));
		//when
		List<Student> students = studentService.getAllPassedStudents();
		//then
		assertThat(students, is(expectedStudents));
	}
}
