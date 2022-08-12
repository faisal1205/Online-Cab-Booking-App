package com.masai.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.CabDriver;
import com.masai.entities.CabDriverCabDTO;
import com.masai.services.cabdriver.CabDriverService;

@RestController
@RequestMapping(value = "/cabdriver")
public class CabDriverController {

	@Autowired
	private CabDriverService cabDriverService;
	
	@PostMapping("/create")
	public ResponseEntity<CabDriver> insertCabDriverHandler(@RequestBody CabDriverCabDTO cabdto){
		
		return cabDriverService.insertCabDriver(cabdto);
	}
	
	
}