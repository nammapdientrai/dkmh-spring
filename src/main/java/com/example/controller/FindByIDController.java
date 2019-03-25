package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Students;
import com.example.service.FindByIDService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class FindByIDController {

	@Autowired
	private FindByIDService findByIDService;

	//Find STUDENT in database
	@RequestMapping(value = "/students/{maso_sv}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> findByIDStudent(@PathVariable("maso_sv") int maso_sv) {
		Object result;
		HttpStatus status;
		Optional<Students> student = findByIDService.findByIDStudent(maso_sv);

		if (student.isPresent()) {
			result = student.get();
			status = HttpStatus.OK;
		} else {
			result = "find user fail!!!";
			status = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Object>(result, status);
	}

}
