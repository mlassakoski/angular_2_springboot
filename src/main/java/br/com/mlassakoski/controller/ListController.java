package br.com.mlassakoski.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

	private static final List<String> COURSES = Arrays.asList("Angularjs", "Angular", "Reactjs", "Emberjs", "Vuejs");

	@RequestMapping(value = "api/courses", method = RequestMethod.GET)
	public List<String> handleCoursesList() {
		System.out.println("it' works!!");

		return COURSES;
	}
}
