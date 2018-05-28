package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Transdetails;
import com.infocell.barksforte.irsapi.repositories.TransdetailsRepository;

@Service
public class TransdetailsDao {
	
	@Autowired
	private TransdetailsRepository repo;
	
	
	
	public Transdetails save(Transdetails obj) {
		
		return repo.save(obj);
	}
	
	public List<Transdetails> findAll(){
		return repo.findAll();
	}

	public Transdetails findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Transdetails obj) {
		repo.delete(obj);
		
		
	}
}
