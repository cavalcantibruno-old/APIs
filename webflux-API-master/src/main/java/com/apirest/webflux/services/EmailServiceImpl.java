package com.apirest.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.webflux.document.Email;
import com.apirest.webflux.repository.EmailRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	EmailRepository er;
	
	@Override
	public Flux<Email> findAll() {
		return er.findAll();
	}

	@Override
	public Mono<Email> save(Email email) {
		return er.save(email);
	}
	
	
}
