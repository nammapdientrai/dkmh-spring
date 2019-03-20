package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Lectures;
import com.example.service.LecturesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LecturesController {
	@Autowired
	private LecturesService ls;

	// Get all LECTURES in database
	@RequestMapping(value = "/lectures", method = RequestMethod.GET, produces = "application/json")
	public List<Lectures> getListEmployee() {
		return ls.getListLectures();
	}
}
