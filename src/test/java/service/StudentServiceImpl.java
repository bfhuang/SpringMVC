package service;

import dao.StudentDao;
import model.Student;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class StudentServiceImpl {

	@Test
	public void shouldGetAllThePassedStudents() {
		//given
		StudentDao studentDao = Mockito.mock(StudentDao.class);
		when(studentDao.getAllStudent()).thenReturn(
				Arrays.asList(new Student("studentOne", 50),
						new Student("studentTwo", 60),
						new Student("studentThree", 70)));
		StudentServiceImp studentService = new StudentServiceImp(new StudentDao());
		//when
		List<Student> students = studentService.getAllPassedStudents();
		//then
		assertThat(students.size(), is(2));
		assertThat(students.get(0).getGrade(), is(60.0));
	}
}
