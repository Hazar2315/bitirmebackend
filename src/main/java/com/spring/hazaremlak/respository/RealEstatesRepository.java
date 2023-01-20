package com.spring.hazaremlak.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import com.spring.hazaremlak.model.RealEstates;


public interface RealEstatesRepository extends JpaRepository<RealEstates,Integer>,
JpaSpecificationExecutor<RealEstates>{
	
	
}


