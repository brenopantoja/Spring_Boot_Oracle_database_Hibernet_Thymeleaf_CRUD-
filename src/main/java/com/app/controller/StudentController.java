package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.Student;
import com.app.repo.StudentRepo;

/*
 * 
 *  Class of end point of {@link Student}
 *  @author Breno R. Pantoja
 */

@Controller
public class StudentController {

	@Autowired
	private StudentRepo repo;

	/*
	 * It is return data of users
	 * 
	 * @param model It is able of show user data
	 * 
	 * @return the data to home page
	 */
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("studentlist", repo.findAll());
		return "home";
	}

	
	@GetMapping("/saveStudentPage")
	public String saveStudentPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add_student";
	}

	/*
	 * It is able of: To save user data
	 * 
	 * @param model It is able of add user data
	 * 
	 * @return save of the data user and add data to going home
	 */

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		repo.save(student);
		return "redirect:/";
	}

	/*
	 * It is able of: To update user data
	 * 
	 * @param model It is able of add user data
	 * 
	 * @return save of the data user and update data to going home
	 */

	@GetMapping("/updateStudentPage/{id}")
	public String showUpdateStudentPage(@PathVariable("id") int id, Model model) {
		Optional<Student> temp = repo.findById(id);
		Student student = temp.get();
		model.addAttribute("student", student);
		return "update_student";
	}

	/*
	 * It is able of: To delete user data
	 * 
	 * @param model It is able of add user data
	 * 
	 * @return save of the data user and delete data to going home
	 */
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		repo.deleteById(id);

		return "redirect:/";
	}
}