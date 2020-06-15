package com.apirest.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.webflux.document.Email;
import com.apirest.webflux.services.EmailService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmailController {
	
	@Autowired
	EmailService service;
	
	@GetMapping(value="/email")
	public Flux<Email> getEmail(){
		return service.findAll();
	}
	
	@PostMapping(value="/email")
	public Mono<Email> save(@RequestBody Email email){
		return service.save(email);
	}
	
	
	
}
