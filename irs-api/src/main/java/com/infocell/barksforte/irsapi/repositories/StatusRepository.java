package com.infocell.barksforte.irsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infocell.barksforte.irsapi.entities.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {

}
