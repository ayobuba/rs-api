package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.IpsaCode;
import com.infocell.barksforte.irsapi.repositories.IpsaCodeRepository;

@Service
public class IpsaCodeDao {
	
	@Autowired
	private IpsaCodeRepository repo;
	
	
	
	public IpsaCode save(IpsaCode obj) {
		
		return repo.save(obj);
	}
	
	public List<IpsaCode> findAll(){
		return repo.findAll();
	}

	public IpsaCode findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(IpsaCode obj) {
		repo.delete(obj);
		
		
	}
}
