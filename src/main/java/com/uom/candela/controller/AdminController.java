package com.uom.candela.controller;


import com.uom.candela.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uom.candela.service.AdminService;


@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/add-admin", method=RequestMethod.POST)
	public void addUser(@RequestBody Admin Admin)
	{  
		adminService.addAdmin(Admin);
	}
}
