package com.apirest.webflux.services;

import com.apirest.webflux.document.Email;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmailService {
	
	Flux<Email> findAll();
	Mono<Email> save(Email email);
	
}
