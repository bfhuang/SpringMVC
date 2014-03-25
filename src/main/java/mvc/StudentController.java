package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.StudentService;

@Controller
@RequestMapping("/passedStudents")
public class StudentController {
	private StudentService studentService = new StudentService();

	@RequestMapping(method = RequestMethod.GET)
	public String getStudents(ModelMap model) {
		model.addAttribute("students", studentService.getAllPassedStudents());
		return "students";
	}

}
