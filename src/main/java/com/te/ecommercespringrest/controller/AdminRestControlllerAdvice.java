package com.te.ecommercespringrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.ecommercespringrest.beans.AdminResponse;
import com.te.ecommercespringrest.custexp.AdminExcetion;

@RestControllerAdvice
public class AdminRestControlllerAdvice {

	@ExceptionHandler(AdminExcetion.class)
	public AdminResponse handleEmployeeExp(AdminExcetion exception) {
		AdminResponse response = new AdminResponse();
		response.setStatusCode(500);
		response.setMsg(exception.getMessage());
		return response;
	}
}
