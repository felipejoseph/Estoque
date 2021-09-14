package br.com.alura.mvc.estoque.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.estoque.model.Produto;

public class RequisicaoNovoProduto {
	@NotBlank
	private String nomeProduto;
	@NotBlank
	private String codigo;
	@NotBlank
	private String descricao;
	
	private String urlImagem;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public Produto toProduto() {
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		produto.setDescricao(descricao);
		produto.setNomeProduto(nomeProduto);
		produto.setUrlImagem(urlImagem);
		return produto;
	}
	
	

}
