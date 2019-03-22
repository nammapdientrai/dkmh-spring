package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Times;

public interface TimesRepo extends JpaRepository<Times, String> {

}
