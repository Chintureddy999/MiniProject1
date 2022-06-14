package com.zensar.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.bean.AbstractUser;

import com.zensar.service.AbstractUserService;


public class AbstractUserController {
	@Autowired
	 AbstractUserService service;
		
	@GetMapping("/insertuser")
	public AbstractUser f1(@RequestBody AbstractUser Abstractuser) {
		return this.service.insertAbstractUser(Abstractuser);
	}
	@PostMapping(value ="/updateuser")
	public AbstractUser f2(@RequestBody AbstractUser Abstractuser) {
	return this.service.updateAbstractUser(Abstractuser);
	}

}
