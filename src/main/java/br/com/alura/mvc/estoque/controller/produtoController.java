package br.com.alura.mvc.estoque.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.estoque.dto.RequisicaoNovoProduto;
import br.com.alura.mvc.estoque.model.Produto;
import br.com.alura.mvc.estoque.repository.produtoRepository;

@Controller
@RequestMapping("produto")
public class produtoController {
	
	@Autowired
	private produtoRepository produtoRepository;
	
	@GetMapping("formulario")
	public String formulario(RequisicaoNovoProduto requisicao) {
		
		return "produto/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoProduto requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "produto/formulario";
		}
		
		Produto produto = requisicao.toProduto();
		produtoRepository.save(produto);
		
		return"produto/formulario";
	}
	
}
