package com.infocell.barksforte.irsapi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infocell.barksforte.irsapi.dao.BillItemDao;
import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.BillItem;

@RestController
@RequestMapping("/billitem")
public class BillItemController {
	
	@Autowired
	private BillItemDao dao;
	
	@PostMapping(value="/create")
	public BillItem createBill(BillItem obj) {
		return dao.save(obj);
		
	}
	
	@GetMapping("/getAll")
	public List<BillItem> getAll(){
		return dao.findAll();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<BillItem> getById(@PathVariable("id")Integer id) {
		BillItem obj=dao.findOne(id);
		if(obj==null) {
			return ResponseEntity.notFound().build();
			
		}
		return ResponseEntity.ok().body(obj);
		
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<BillItem> updateBill(@PathVariable("id")Integer id,@Valid BillItem objDetails){
		BillItem obj=dao.findOne(id);
		if(obj==null) {
			return ResponseEntity.notFound().build();
			
		}
		obj.setBill(objDetails.getBill());
		obj.setBillItemTotalList(objDetails.getBillItemTotalList());
		obj.setIsCertify(objDetails.getIsCertify());
		obj.setPxInterswitchList(objDetails.getPxInterswitchList());
		obj.setRemitaList(objDetails.getRemitaList());
		obj.setRevItem(objDetails.getRevItem());
		obj.setTransactionsList(objDetails.getTransactionsList());
		obj.setVehicleDetailsList(objDetails.getVehicleDetailsList());
		
		BillItem updateBill=dao.save(obj);
		
		return ResponseEntity.ok().body(updateBill);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<BillItem> removeBill(@PathVariable("id")Integer id){
		BillItem obj=dao.findOne(id);
		if(obj==null) {
			return ResponseEntity.notFound().build();
			
		}
		
		dao.delete(obj);
		return ResponseEntity.ok().build();
		
	}
}
