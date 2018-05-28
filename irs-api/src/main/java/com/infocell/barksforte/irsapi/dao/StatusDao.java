package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Status;
import com.infocell.barksforte.irsapi.repositories.StatusRepository;

@Service
public class StatusDao {
	
	@Autowired
	private StatusRepository repo;
	
	
	
	public Status save(Status obj) {
		
		return repo.save(obj);
	}
	
	public List<Status> findAll(){
		return repo.findAll();
	}

	public Status findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Status obj) {
		repo.delete(obj);
		
		
	}
}
