package service;

import java.util.ArrayList;

import model.Produto;

public class MovimentacaoEstoque {
	
	private ArrayList<Produto> produtos;
	
	public MovimentacaoEstoque(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
	
	public boolean registrarEntrada(int id, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.registrarEntrada(quantidade); 
                return true;
            }
        }
        System.out.println("Erro: Produto com ID " + id + " não encontrado.");
        return false;
    }
	
	public boolean registrarSaida(int id, int quantidade) {
		for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.registrarSaida(quantidade); 
                return true;
            }
        }
		System.out.println("Erro: Produto com ID " + id + " não encontrado.");
        return false;
	}
	
	public String exibirSaldo(int id) {
		for (Produto produto : produtos) {
			if(produto.getId() == id) {
				return "A quantidade é de: " + produto.getQuantidade() + " " + produto.getNome() + "s.";
			}
		}
		
		return "Erro: Produto com ID " + id + " não encontrado.";
	}
}
