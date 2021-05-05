package com.te.ecommercespringrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.te.ecommercespringrest.beans.AdminBean;
import com.te.ecommercespringrest.beans.AdminResponse;
import com.te.ecommercespringrest.service.AdminService;

public class AdminController {

	@Autowired
	private AdminService service;

	@GetMapping(path = "/getEmp", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public AdminResponse getItem(int id) {

		AdminResponse response = new AdminResponse();
		AdminBean infoBean = (AdminBean) service.getAllItems();

		if (infoBean != null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setBean(infoBean);
		} else {
			response.setStatusCode(404);
			response.setMsg("Failure , Data Not found");
		}

		return response; 
}
}
