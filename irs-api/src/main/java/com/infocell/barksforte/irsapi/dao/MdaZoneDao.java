package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.MdaZone;
import com.infocell.barksforte.irsapi.repositories.MdaZoneRepository;

@Service
public class MdaZoneDao {
	
	@Autowired
	private MdaZoneRepository repo;
	
	
	
	public MdaZone save(MdaZone obj) {
		
		return repo.save(obj);
	}
	
	public List<MdaZone> findAll(){
		return repo.findAll();
	}

	public MdaZone findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(MdaZone obj) {
		repo.delete(obj);
		
		
	}
}
