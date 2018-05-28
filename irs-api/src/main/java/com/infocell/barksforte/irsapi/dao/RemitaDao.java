package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Remita;
import com.infocell.barksforte.irsapi.repositories.RemitaRepository;

@Service
public class RemitaDao {
	
	@Autowired
	private RemitaRepository repo;
	
	
	
	public Remita save(Remita obj) {
		
		return repo.save(obj);
	}
	
	public List<Remita> findAll(){
		return repo.findAll();
	}

	public Remita findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Remita obj) {
		repo.delete(obj);
		
		
	}
}
