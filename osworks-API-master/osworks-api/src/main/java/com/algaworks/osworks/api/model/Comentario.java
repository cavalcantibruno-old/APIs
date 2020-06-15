package com.algaworks.osworks.api.model;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import com.algaworks.osworks.domain.model.OrdemServico;

@Entity
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
	private OrdemServico ordemServico;
	
	private String descricao;
	private OffsetDateTime dataEnvio;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public OrdemServico getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public OffsetDateTime getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(OffsetDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
}
