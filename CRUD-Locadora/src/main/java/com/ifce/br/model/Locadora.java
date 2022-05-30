package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Locadora {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private String marca;
	private String modelo;
	private long ano;
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	
	
	
	
}
