package mvc;

import model.Student;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentControllerTest {

	@Test
	public void shouldRenderStudentsPageAndReturnAllPassedStudentsList(){
		StudentController studentController = new StudentController();
		ModelMap modelMap = new ModelMap();

		List<Student>  expectedStudents = newArrayList(
				new Student("studentTwo",60),
				new Student("studentThree",70));

		assertThat(studentController.getStudents(modelMap), is("students"));
		assertThat((List<Student>) modelMap.get("students"), is(expectedStudents));

	}


}
