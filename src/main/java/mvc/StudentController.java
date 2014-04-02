package mvc;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;

import java.util.List;

@Controller
@RequestMapping(value = "passedStudents")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Value("myValue")
	private String myValue;


	@RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_XHTML_XML_VALUE, MediaType.TEXT_HTML_VALUE})
	public String getStudents(ModelMap model) {
		model.addAttribute("students", studentService.getAllPassedStudents());
		model.addAttribute("myValue", myValue);
		return "students";
	}

	@RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Student> getJson() {
		return studentService.getAllPassedStudents();
	}
}