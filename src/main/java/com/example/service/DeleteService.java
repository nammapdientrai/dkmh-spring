package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.repository.DkmhRepo;

@Service
public class DeleteService {
	@Autowired
	private DkmhRepo dr;

	@Query("")
	public boolean deleteCource(String dkmh_id) {
		try {
			dr.deleteById(dkmh_id);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
