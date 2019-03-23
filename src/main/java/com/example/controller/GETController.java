package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Lectures;
import com.example.entity.Students;
import com.example.entity.Subjects;
import com.example.entity.Times;
import com.example.service.GETService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class GETController {
	@Autowired
	private GETService getService;

	// Get all LECTURES in database
	// @RequestMapping(value = "/lectures", method = RequestMethod.GET, produces =
	// "application/json")
	@GetMapping("/lectures")
	public List<Lectures> getListLectures() {
		return getService.getListLectures();
	}

	// Get all TIMES in database
	// @RequestMapping(value = "/times", method = RequestMethod.GET, produces =
	// "application/json")
	@GetMapping("/times")
	public List<Times> getListTimes() {
		return getService.getListTimes();
	}

	// Get all SUBJECTS in database
	// @RequestMapping(value = "/subjects", method = RequestMethod.GET, produces =
	// "application/json")
	@GetMapping("/subjects")
	public List<Subjects> getListSubject() {
		return getService.getListSubjects();
	}

	// Get all SUBJECTS in database
	// @RequestMapping(value = "/students", method = RequestMethod.GET, produces =
	// "application/json")
	@GetMapping("/students")
	public List<Students> getListStudents() {
		return getService.getListStudents();
	}
}
