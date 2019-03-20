package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Lectures;

public interface LecturesRepo extends JpaRepository<Lectures, String>{

}
