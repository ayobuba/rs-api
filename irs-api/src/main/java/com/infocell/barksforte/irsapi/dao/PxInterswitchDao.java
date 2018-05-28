package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.PxInterswitch;
import com.infocell.barksforte.irsapi.repositories.PxInterswitchRepository;

@Service
public class PxInterswitchDao {
	
	@Autowired
	private PxInterswitchRepository repo;
	
	
	
	public PxInterswitch save(PxInterswitch obj) {
		
		return repo.save(obj);
	}
	
	public List<PxInterswitch> findAll(){
		return repo.findAll();
	}

	public PxInterswitch findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(PxInterswitch obj) {
		repo.delete(obj);
		
		
	}
}
