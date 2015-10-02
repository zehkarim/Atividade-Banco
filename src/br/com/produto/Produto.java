package br.com.produto;






public class Produto {


	private int nCdProduto;
	private Double dVlProduto;
	private int dQtProduto;
	private String sDsProduto;
	
	
	
	public Produto(int nCdProduto, Double dVlProduto, int dQtProduto,
			String sDsProduto) {
		super();
		this.nCdProduto = nCdProduto;
		this.dVlProduto = dVlProduto;
		this.dQtProduto = dQtProduto;
		this.sDsProduto = sDsProduto;
	}
	public int getnCdProduto() {
		return nCdProduto;
	}
	public void setnCdProduto(int nCdProduto) {
		this.nCdProduto = nCdProduto;
	}
	public Double getdVlProduto() {
		return dVlProduto;
	}
	public void setdVlProduto(Double dVlProduto) {
		this.dVlProduto = dVlProduto;
	}
	public int getdQtProduto() {
		return dQtProduto;
	}
	public void setdQtProduto(int dQtProduto) {
		this.dQtProduto = dQtProduto;
	}
	public String getsDsProduto() {
		return sDsProduto;
	}
	public void setsDsProduto(String sDsProduto) {
		this.sDsProduto = sDsProduto;
	}

	

}
