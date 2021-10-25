package com.sxworkz.GunShop.controller;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sxworkz.GunShop.dto.GunDetailsDto;
import com.sxworkz.GunShop.entity.GunDetails;
import com.sxworkz.GunShop.repository.GunDetailsRepo;

@RestController
public class RegistrationController {
	
	@Autowired
	GunDetailsRepo gunDetailsRepo;

	@PostMapping("/register")
	boolean register(@RequestBody GunDetailsDto detailsDto) {
		
		GunDetails details = new GunDetails();
		System.out.println(detailsDto);
		BeanUtils.copyProperties(detailsDto, details);
		System.out.println(details);
		GunDetails details2 =gunDetailsRepo.save(details);
		if (Objects.isNull(details2)) {
			return false;
		}else {
			return true;
		}
		
		
	}
	
	@GetMapping("/getByName")
	GunDetails getByName(String name) {
		
		GunDetails entity =gunDetailsRepo.getByModelNo(name);
		
		return entity;
		
	}
}
