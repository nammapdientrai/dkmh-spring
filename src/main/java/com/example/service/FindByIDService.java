package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Students;
import com.example.repository.StudentsRepo;

@Service
public class FindByIDService {
	@Autowired
	private StudentsRepo sr;

	public Optional<Students> findByIDStudent(int maso_sv) {
		return sr.findById(maso_sv);
	}
}
