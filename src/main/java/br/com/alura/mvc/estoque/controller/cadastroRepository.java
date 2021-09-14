package br.com.alura.mvc.estoque.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.alura.mvc.estoque.model.Produto;

public class cadastroRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Produto> recuperaProduto(){
		Query querry = entityManager.createQuery("select p from Produto p", Produto.class);
		
		return querry.getResultList();
		
	}

}
