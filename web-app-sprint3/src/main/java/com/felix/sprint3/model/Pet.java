package com.felix.sprint3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "pet_nome")
	private String petNome;
	
	@Column(name = "dono_nome")
	private String donoNome;
	
	@Column(name = "email_dono")
	private String emailDono;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPetNome() {
		return petNome;
	}
	public void setPetNome(String petNome) {
		this.petNome = petNome;
	}
	public String getDonoNome() {
		return donoNome;
	}
	public void setDonoNome(String donoNome) {
		this.donoNome = donoNome;
	}
	public String getEmailDono() {
		return emailDono;
	}
	public void setEmailDono(String emailDono) {
		this.emailDono = emailDono;
	}
	
	
}
