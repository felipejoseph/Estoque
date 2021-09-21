package br.com.alura.mvc.estoque.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import br.com.alura.mvc.estoque.model.Produto;
import br.com.alura.mvc.estoque.repository.produtoRepository;


@Controller
public class HomeController {
	
	@Autowired
	private produtoRepository repository;
	
	
	
	@GetMapping("/home")
	public List<Produto> home(Model model,String nome) {
			if(nome != null) {
				return repository.produtoFindByName(nome);
			}else {
				
			}
//		List<Produto> produtos = repository.findAll(); 		
//		
//		model.addAttribute("produtos", produtos);
		
	        
			
			return repository.findAll();
	}
	
	
	@RequestMapping("/pesquisaproduto")
	public String pesquisa(Model model, @Param("nome") String nome) {
        List<Produto> listProducts = repository.produtoFindByName(nome);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("nome", nome);
         
        return "home";
	}
		

	
}
