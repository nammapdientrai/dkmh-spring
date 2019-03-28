package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.DeleteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DeleteController {
	@Autowired
	private DeleteService ds;

	@DeleteMapping("/delete/{dkmh_id}")
	public ResponseEntity<String> deleteource(@PathVariable("dkmh_id") String dkmh_id) {
		String result = "delete cource fail !!!";

		HttpStatus status = HttpStatus.BAD_REQUEST;

		if (ds.deleteCource(dkmh_id)) {
			result = "delete successfull !!!";
			status = HttpStatus.OK;
		}

		return new ResponseEntity<String>(result, status);

	}
}
