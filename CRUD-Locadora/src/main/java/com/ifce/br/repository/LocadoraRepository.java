package com.ifce.br.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Locadora;

@Repository
public interface LocadoraRepository extends JpaRepository<Locadora, Long> {

	
	
	
	
}
