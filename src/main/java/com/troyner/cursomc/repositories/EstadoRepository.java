package com.troyner.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.troyner.cursomc.domain.Cidade;
import com.troyner.cursomc.domain.Estado;
import com.troyner.cursomc.domain.Produto;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
