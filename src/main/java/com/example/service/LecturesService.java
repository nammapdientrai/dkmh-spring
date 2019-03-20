package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Lectures;
import com.example.repository.LecturesRepo;

@Service
public class LecturesService {
	@Autowired
	private LecturesRepo lecRepo;
	
	public List<Lectures> getListLectures(){
		return lecRepo.findAll();
	}
}
