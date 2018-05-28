package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.Mda;
import com.infocell.barksforte.irsapi.repositories.MdaRepository;

@Service
public class MdaDao {
	
	@Autowired
	private MdaRepository repo;
	
	
	
	public Mda save(Mda obj) {
		
		return repo.save(obj);
	}
	
	public List<Mda> findAll(){
		return repo.findAll();
	}

	public Mda findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Mda obj) {
		repo.delete(obj);
		
		
	}
}
