package com.apirest.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.webflux.document.Email;

public interface EmailRepository extends ReactiveMongoRepository<Email, String>{
	
}
