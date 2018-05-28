package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.RevWallet;
import com.infocell.barksforte.irsapi.repositories.RevWalletRepository;

@Service
public class RevWalletDao {
	
	@Autowired
	private RevWalletRepository repo;
	
	
	
	public RevWallet save(RevWallet obj) {
		
		return repo.save(obj);
	}
	
	public List<RevWallet> findAll(){
		return repo.findAll();
	}

	public RevWallet findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(RevWallet obj) {
		repo.delete(obj);
		
		
	}
}
