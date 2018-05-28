package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Payerdata;
import com.infocell.barksforte.irsapi.repositories.PayerdataRepository;

@Service
public class PayerdataDao {
	
	@Autowired
	private PayerdataRepository repo;
	
	
	
	public Payerdata save(Payerdata obj) {
		
		return repo.save(obj);
	}
	
	public List<Payerdata> findAll(){
		return repo.findAll();
	}

	public Payerdata findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Payerdata obj) {
		repo.delete(obj);
		
		
	}
}
