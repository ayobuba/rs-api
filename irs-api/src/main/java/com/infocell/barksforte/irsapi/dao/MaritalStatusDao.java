package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.MaritalStatus;
import com.infocell.barksforte.irsapi.repositories.MaritalStatusRepository;

@Service
public class MaritalStatusDao {
	
	@Autowired
	private MaritalStatusRepository repo;
	
	
	
	public MaritalStatus save(MaritalStatus obj) {
		
		return repo.save(obj);
	}
	
	public List<MaritalStatus> findAll(){
		return repo.findAll();
	}

	public MaritalStatus findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(MaritalStatus obj) {
		repo.delete(obj);
		
		
	}
}
