package com.velocity.eShopCart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/test")
	public ResponseEntity HelloWorld() {
		
		return ResponseEntity.ok().body("Hello World");
	}
	
}
