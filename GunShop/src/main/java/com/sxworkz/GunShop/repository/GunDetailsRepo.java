package com.sxworkz.GunShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sxworkz.GunShop.entity.GunDetails;

public interface GunDetailsRepo extends JpaRepository<GunDetails, Integer> {
	
	GunDetails getByModelNo(String modelNo);

}
