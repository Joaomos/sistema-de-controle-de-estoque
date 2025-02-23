package main;

import java.util.Scanner;

import model.Estoque;
import model.Produto;
import service.MovimentacaoEstoque;
import view.EstoqueView;

public class Main {
	private Estoque estoque;
	private MovimentacaoEstoque movimentacaoEstoque;
	private EstoqueView view;
	private Scanner entrada;
	

	public Main() {
		this.estoque = new Estoque();
		this.movimentacaoEstoque = new MovimentacaoEstoque(estoque.getProdutos());
		this.view = new EstoqueView();
		this.entrada = new Scanner(System.in);
	}
	
	
	public void inicializarSistema() {
		int opcao;
		do {
			view.exibirMenu();
			System.out.println("Escolha uma opção: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			processarOpcao(opcao);
		} while (opcao != 0);
		System.out.println("Sistema encerrado.");
		entrada.close();
	}
	
	public void processarOpcao(int opcao) {
		switch (opcao) {
        case 1:
            cadastrarProduto();
            break;
        case 2:
            registrarEntrada();
            break;
        case 3:
            registrarSaida();
            break;
        case 4:
            exibirEstoque();
            break;
        case 5:
            exibirSaldo();
            break;
        case 6:
            removerProduto();
            break;
        case 0:
            System.out.println("Saindo do sistema...");
            break;
        default:
            System.out.println("Opção inválida! Tente novamente.");
		}
	}
	
	private void cadastrarProduto() {
		System.out.println("Nome do produto: ");
		String nome = entrada.nextLine();
		
		System.out.println("Descrição do produto: ");
		String descricao = entrada.nextLine();
		
		System.out.println("Preço do produto: ");
		Double preco = entrada.nextDouble();
		
		System.out.println("Quantidade inicial: ");
		int quantidade = entrada.nextInt();
		 
		entrada.nextLine();
		
		Produto produto = new Produto(nome, descricao, preco, quantidade);
		estoque.cadastrarProduto(produto);
	}
	
	private void registrarEntrada() {
		System.out.println("Digite o Id do produto: ");
		int id = entrada.nextInt();
		System.out.println("Digite a quantidade a ser adicionada: ");
		int quantidade = entrada.nextInt();
		
		boolean sucesso = movimentacaoEstoque.registrarEntrada(id, quantidade);
		
		if(sucesso) {
			System.out.println("Entrada registrada com sucesso.");
		} else {
			System.out.println("A entrada não foi registrada com sucesso. Tente novamente.");
		}
	}
	
	private void registrarSaida() {
		System.out.println("Digite o Id do produto: ");
		int id = entrada.nextInt();
		System.out.println("Digite a quantidade a ser removida: ");
		int quantidade = entrada.nextInt();
		
		boolean sucesso = movimentacaoEstoque.registrarSaida(id, quantidade);
		
		if(sucesso) {
			System.out.println("Entrada registrada com sucesso.");
		} else {
			System.out.println("A entrada não foi registrada com sucesso. Tente novamente.");
		}
	}
	
	private void exibirEstoque() {
		estoque.listarProdutos();
	}
	
	private void exibirSaldo() {
		System.out.println("Digite o Id do produto: ");
		int id = entrada.nextInt();
		
		System.out.println(movimentacaoEstoque.exibirSaldo(id));
	}
	
	private void removerProduto() {
		System.out.println("Digite o Id do produto: ");
		int id = entrada.nextInt();
		
		estoque.removerProduto(id);
	}
	
	public static void main(String[] args) {
		Main sistema = new Main();
		sistema.inicializarSistema();
	}
	
}
