package com.produtos.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Email;
import com.produtos.apirest.repository.EmailRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class EmailResource {
	
	@Autowired
	EmailRepository emailRepository;
	
	@GetMapping("/emails")
	public List<Email> listaEmail(){
		return emailRepository.findAll();
	}
	
	@PostMapping("/email")
	public Email salvaEmail(@RequestBody @Valid Email email) {
		return emailRepository.save(email);
	}
}
