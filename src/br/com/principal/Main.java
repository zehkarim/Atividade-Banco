package br.com.principal;

import br.com.dao.ProdutoDAO;
import br.com.produto.Produto;


public class Main {

	public static void main (String args[]){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto(1, 12.0, 5, "Produto 1");
		produtoDAO.salvarProduto(produto);		
		
		produto.setsDsProduto("Produto 2");
		produto.setdVlProduto(10.0);
		
		produtoDAO.atualizarProduto(produto);
		
		produtoDAO.ConsultarProduto();
		
		produtoDAO.removerProduto(produto);
	}
}
