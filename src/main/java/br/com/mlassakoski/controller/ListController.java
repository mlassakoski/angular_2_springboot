package br.com.mlassakoski.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

	@RequestMapping(value = "api/list", method = RequestMethod.GET)
	public String handleList() {
		System.out.println("it' works!!");
		return "success";
	}
}
