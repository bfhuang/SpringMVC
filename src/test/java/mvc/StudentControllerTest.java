package mvc;

import model.Student;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentControllerTest {

	private StudentController studentController = new StudentController();

	@Test
	@Ignore
	public void shouldRenderStudentsPageAndReturnAllPassedStudentsList() {
		ModelMap modelMap = new ModelMap();

		List<Student> expectedStudents = newArrayList(
				new Student("studentTwo", 60),
				new Student("studentThree", 70));

		assertThat(studentController.getStudents(modelMap), is("students"));
		assertThat((List<Student>) modelMap.get("students"), is(expectedStudents));

	}

	@Test
	public void shouldGetJson() {

		RestTemplate restTemplate = new RestTemplate();

		Student forObject =  restTemplate.getForObject("http://localhost:8080/SpringMVC/passedStudents/student",
				Student.class);
		System.out.println(forObject.getName());
		System.out.println(forObject.toString());
	}




}
