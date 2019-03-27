package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Subjects;

public interface SubjectsRepo extends JpaRepository<Subjects, String> {

}
