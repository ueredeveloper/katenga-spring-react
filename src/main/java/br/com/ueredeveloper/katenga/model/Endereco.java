package br.com.ueredeveloper.katenga.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="endereco")
public class Endereco {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="end_ID")
	Long endId;
	@Column(name="end_logradouro", columnDefinition="varchar(250)")
	String endLogradouro;
	@Column(name="end_cep", columnDefinition="varchar(14)") 
	String endCep;
	
	public Long getEndId() {
		return endId;
	}
	public void setEndId(Long endId) {
		this.endId = endId;
	}
	public String getEndLogradouro() {
		return endLogradouro;
	}
	public void setEndLogradouro(String endLogradouro) {
		this.endLogradouro = endLogradouro;
	}
	public String getEndCep() {
		return endCep;
	}
	public void setEndCep(String endCep) {
		this.endCep = endCep;
	}
	
	@Override
	public String toString() {
		return "Endereco [endId=" + endId + ", endLogradouro=" + endLogradouro + ", endCep=" + endCep + "]";
	}
	
	

	
	

}
