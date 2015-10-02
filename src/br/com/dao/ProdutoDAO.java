package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.conexao.ConexaoMySQL;
import br.com.produto.Produto;


public class ProdutoDAO{

	public void salvarProduto(Produto produto) {
		
		
		String insert = "";
		insert += "INSERT INTO Produto (descricao, valor, quantidade) VALUES(";
		insert += "'" + produto.getsDsProduto() + "'";
		insert += ",";
		insert += produto.getdVlProduto();
		insert += ",";
		insert += produto.getdQtProduto();
		insert += ")";
		
		
		
		try{
			
			Connection connection = ConexaoMySQL.getConexaoMySQL();
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.execute();
			
		}catch(SQLException sqlException){
			System.out.println(sqlException.getMessage());
			
			
		}
	}
	
	

	public List<Produto> ConsultarProduto() {
		
		List<Produto> listProduto = new ArrayList<Produto>();
		
		String select = "SELECT * FROM PRODUTO";
		
		try{
			Connection connection = ConexaoMySQL.getConexaoMySQL();
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()){
				Produto produto = new Produto(resultSet.getInt("idProduto"),resultSet.getDouble("Valor"), resultSet.getInt("Quantidade"), resultSet.getString("Descricao"));
				listProduto.add(produto);
				System.out.println(produto);
			}
			
		}catch(Exception sqlException){
			System.out.println(sqlException.getMessage());
		}
		
		return listProduto;
	}

	public void removerProduto(Produto produto) {
		String delete = "DELETE FROM Produto WHERE IdProduto = ";
		delete += produto.getnCdProduto();
		
		try{
			
			Connection connection = ConexaoMySQL.getConexaoMySQL();
			PreparedStatement ps = connection.prepareStatement(delete);
			ps.execute();
			
		}catch(SQLException sqlException){
			System.out.println(sqlException.getMessage());
		}
	}

	public void atualizarProduto(Produto produto) {
		String update = "UPDATE Produto ";
		update += "set descricao = ";
		update += "'" + produto.getsDsProduto() + "'";
		update += ",";
		update += "valor = ";
		update += produto.getdVlProduto() ;
		update += ",";
		update += "quantidade = ";
		update += produto.getdQtProduto() ;
		update += "WHERE IdProduto ="; 
		update += produto.getnCdProduto();
		try{
			
			Connection connection = ConexaoMySQL.getConexaoMySQL();
			PreparedStatement ps = connection.prepareStatement(update.toString());
			ps.execute();
			
		}catch(SQLException sqlException){
			System.out.println(sqlException.getMessage());
		}
	}
}
