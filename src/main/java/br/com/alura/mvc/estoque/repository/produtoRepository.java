package br.com.alura.mvc.estoque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.estoque.model.Produto;

@Repository
public interface produtoRepository extends JpaRepository<Produto, Long> {
	
	@Query("SELECT p FROM Produto p WHERE p.nomeProduto like %?1% "
			+ " OR p.codigo LIKE %?1%")

	 public List<Produto> produtoFindByName (String nome);

}
