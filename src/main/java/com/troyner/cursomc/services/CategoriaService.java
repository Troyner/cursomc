package com.troyner.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.troyner.cursomc.domain.Categoria;
import com.troyner.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElse(null);
	}
	
}
