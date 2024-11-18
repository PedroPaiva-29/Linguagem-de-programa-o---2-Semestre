package negocio;

import persistencia.CompraDAO;

public class Compra {
	//propriedades da compra
	private int id =0;
	private Produto objproduto = null;
	private Cliente objCliente = null;
	private String data = "";
	private int quantidade = 0;
	
	//Métodos construtores da classe
	public Compra() {
		super();
	}

	public Compra(int id, Produto objproduto, Cliente objCliente, String data, int quantidade) {
		super();
		this.id = id;
		this.objproduto = objproduto;
		this.objCliente = objCliente;
		this.data = data;
		this.quantidade = quantidade;
	}

	//Métodos de acesso da classe
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getObjproduto() {
		return objproduto;
	}

	public void setObjproduto(Produto objproduto) {
		this.objproduto = objproduto;
	}

	public Cliente getObjCliente() {
		return objCliente;
	}

	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//Métodos da classe
	public void persistir() throws Exception {
		new CompraDAO().persistir(this);
	}
	
}
