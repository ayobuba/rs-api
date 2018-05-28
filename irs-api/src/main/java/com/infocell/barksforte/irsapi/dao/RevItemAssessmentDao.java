package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.RevItemAssessment;
import com.infocell.barksforte.irsapi.repositories.RevItemAssessmentRepository;

@Service
public class RevItemAssessmentDao {
	
	@Autowired
	private RevItemAssessmentRepository repo;
	
	
	
	public RevItemAssessment save(RevItemAssessment obj) {
		
		return repo.save(obj);
	}
	
	public List<RevItemAssessment> findAll(){
		return repo.findAll();
	}

	public RevItemAssessment findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(RevItemAssessment obj) {
		repo.delete(obj);
		
		
	}
}
