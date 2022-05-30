package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Locadora;
import com.ifce.br.service.LocadoraService;

@Controller
public class LocadoraController {

	@Autowired
	private LocadoraService ls;
	
	
	@GetMapping("/locadora/cadastro")
	public String cadastroLocadora() {
		
		
		
		return "cadastro";
	}
	@GetMapping("/locadora/salvar")
	public String salvar(Locadora locadora) {
		
		ls.cadastrarLocadora(locadora);
		
		return "telaSucesso";
	}
	@GetMapping("/locadora/listar")
	public ModelAndView listar() {
		
		List<Locadora> locadora = ls.listarLocadora();
		ModelAndView mv = new ModelAndView("listagem");
		
		mv.addObject("listar", locadora);
		
		return mv;
	}
	
	
	
}
