package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Lectures;
import com.example.entity.Students;
import com.example.entity.Subjects;
import com.example.entity.Times;
import com.example.repository.LecturesRepo;
import com.example.repository.StudentsRepo;
import com.example.repository.SubjectsRepo;
import com.example.repository.TimesRepo;

@Service
public class GETService {
	@Autowired
	private LecturesRepo lecRepo;

	@Autowired
	private TimesRepo timesRepo;

	@Autowired
	private SubjectsRepo subjectRepo;
	
	@Autowired 
	private StudentsRepo studentsRepo;

	public List<Lectures> getListLectures() {
		return lecRepo.findAll();
	}

	public List<Times> getListTimes() {
		return timesRepo.findAll();
	}

	public List<Subjects> getListSubjects() {
		return subjectRepo.findAll();
	}
	
	public List<Students> getListStudents() {
		return studentsRepo.findAll();
	}
}
