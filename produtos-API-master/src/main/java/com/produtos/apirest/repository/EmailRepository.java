package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
