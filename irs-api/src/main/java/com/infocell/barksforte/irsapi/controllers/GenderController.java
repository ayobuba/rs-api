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

import com.infocell.barksforte.irsapi.dao.BillDao;
import com.infocell.barksforte.irsapi.entities.Bill;

@RestController
@RequestMapping("/bill")
public class GenderController {
	
	@Autowired
	private BillDao dao;
	
	@PostMapping(value="/create")
	public Bill createBill(Bill obj) {
		return dao.save(obj);
		
	}
	
	@GetMapping("/getbills")
	public List<Bill> getAll(){
		return dao.findAll();
	}

	@GetMapping("/getbill/{id}")
	public ResponseEntity<Bill> getById(@PathVariable("id")Integer id) {
		Bill obj=dao.findOne(id);
		if(obj==null) {
			return ResponseEntity.notFound().build();
			
		}
		return ResponseEntity.ok().body(obj);
		
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<Bill> updateBill(@PathVariable("id")Integer id,@Valid Bill objDetails){
		Bill obj=dao.findOne(id);
		if(obj==null) {
			return ResponseEntity.notFound().build();
			
		}
		obj.setBilldate(objDetails.getBilldate());
		obj.setBillItemList(objDetails.getBillItemList());
		obj.setClientIp(objDetails.getClientIp());
		obj.setIsagentbill(objDetails.getIsagentbill());
		obj.setMdaZone(objDetails.getMdaZone());
		obj.setParastatal(objDetails.getParastatal());
		obj.setPayer(obj.getPayer());
		obj.setStatus(objDetails.getStatus());
		obj.setTitle(objDetails.getTitle());
		
		Bill updateBill=dao.save(obj);
		
		return ResponseEntity.ok().body(updateBill);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Bill> removeBill(@PathVariable("id")Integer id){
		Bill obj=dao.findOne(id);
		if(obj==null) {
			return ResponseEntity.notFound().build();
			
		}
		
		dao.delete(obj);
		return ResponseEntity.ok().build();
		
	}
}
