package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Dkmh;
import com.example.repository.DkmhRepo;

@Service
public class InsertService {
	@Autowired
	private DkmhRepo dr;

	@Transactional
	public boolean registerCource(List<Dkmh> l) {
		try {
			dr.saveAll(l);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
