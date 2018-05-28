package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Transactions;
import com.infocell.barksforte.irsapi.repositories.TransactionsRepository;

@Service
public class TransactionsDao {
	
	@Autowired
	private TransactionsRepository repo;
	
	
	
	public Transactions save(Transactions obj) {
		
		return repo.save(obj);
	}
	
	public List<Transactions> findAll(){
		return repo.findAll();
	}

	public Transactions findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Transactions obj) {
		repo.delete(obj);
		
		
	}
}
