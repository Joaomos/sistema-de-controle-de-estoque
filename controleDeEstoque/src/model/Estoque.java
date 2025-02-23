package model;

import java.util.ArrayList;


public class Estoque {

	private ArrayList<Produto> produtos;
	
	

    public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public Estoque() {
        this.produtos = new ArrayList<>();
    }
    
	public void cadastrarProduto(Produto produto) {
		this.produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso! ID: " + produto.getId());
	}
	
	public void removerProduto(int id) {
	    Produto produtoRemover = null;
	    for (Produto p : produtos) {
	        if (p.getId() == id) {
	            produtoRemover = p;
	            break;
	        }
	    }

	    if (produtoRemover != null) {
	        produtos.remove(produtoRemover);
	        System.out.println("Produto removido com sucesso!");
	    } else {
	        System.out.println("Erro: Produto com ID " + id + " não encontrado.");
	    }
	}

	
	public void listarProdutos() {
		System.out.println("\n=== Lista de Produtos ===");
		if(produtos.isEmpty()) {
			System.out.println("Nenhuma produto cadastrado.");
		} else {
			for (int i = 0; i < produtos.size(); i++) {
				System.out.println("\nProduto " + (i+1));
				System.out.println(produtos.get(i));
			}
		}
	}
	
	
}
