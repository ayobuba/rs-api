package com.infocell.barksforte.irsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infocell.barksforte.irsapi.entities.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {

}
