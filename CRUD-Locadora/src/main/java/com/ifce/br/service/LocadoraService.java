package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Locadora;
import com.ifce.br.repository.LocadoraRepository;

@Service
public class LocadoraService {

	@Autowired
	private LocadoraRepository lr;
	
	public void cadastrarLocadora(Locadora locadora) {
		
		lr.save(locadora);
		
	}
	
	public List<Locadora> listarLocadora() {
		
		return lr.findAll();
		
		
	}
	
	
}
