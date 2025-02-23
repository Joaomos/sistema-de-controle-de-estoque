package model;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private Double preco;
	private int quantidade;
	static private int controleId = 1;
	
	
	
	public Produto(String nome, String descricao, Double preco, int quantidade) {
		super();
		this.id = generateId();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	private int generateId() {
		return controleId++;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void registrarEntrada(int quantidade) {
	    if (quantidade > 0) {
	        this.quantidade += quantidade;
	        System.out.println("Entrada registrada! Novo estoque: " + this.quantidade);
	    } else {
	        System.out.println("Erro: A quantidade deve ser maior que zero.");
	    }
	}
	public void registrarSaida(int quantidade) {
		if (quantidade > 0) {
			if(this.quantidade - quantidade >= 0) {
				this.quantidade -= quantidade;
				System.out.println("Entrada registrada! Novo estoque: " + this.quantidade);				
			} else {
				System.out.println("A quantidade que você está tentando remover é maior do que a quantidade em estoque.");
			}
		} else {
			System.out.println("Erro: A quantidade deve ser maior que zero.");
		}
	}
	
	public String toString() {
		return "Id: " + id + ".\n"
				+ "Nome: " + nome + "\n"
				+ "Descrição: " + descricao + "\n"
				+ "Preço: R$ " + preco + "\n"
				+ "Quantidade: " + quantidade + "\n";
	}
	
}
