package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Dkmh;
import com.example.service.InsertService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class InsertController {
	@Autowired
	private InsertService is;

	@PostMapping(value = "/dkmh")
	public ResponseEntity<String> registerCource(@RequestBody List<Dkmh> l) {
		String result = "Register cource fail !!!";

		HttpStatus status = HttpStatus.BAD_REQUEST;

		if (is.registerCource(l)) {
			result = "Register successfull !!!";
			status = HttpStatus.OK;
		}

		return new ResponseEntity<String>(result, status);

	}
}
