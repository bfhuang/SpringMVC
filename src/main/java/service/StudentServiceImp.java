package service;

import com.google.common.base.Predicate;
import dao.StudentDao;
import model.Student;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.newArrayList;

public class StudentServiceImp implements StudentService {
	public static final int PASS_SCORE = 60;
	private StudentDao studentDao;

	public StudentServiceImp(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public List<Student> getAllPassedStudents() {
		Collection<Student> filteredStudents =
				filter(studentDao.getAllStudent(), new Predicate<Student>() {
					@Override
					public boolean apply(Student student) {
						return student.getGrade() >= PASS_SCORE;
					}
				});
		return newArrayList(filteredStudents);
	}
}
