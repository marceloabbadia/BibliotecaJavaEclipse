package com.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static Scanner sc = new Scanner (System.in);
	public static Scanner ss = new Scanner (System.in);

	public static void main(String[] args) {
			
		
		testarBiblioteca();
		
}
		
		
		public static void testarBiblioteca() {
			
			
			int menu;
			double preco, valorInicial, valorFinal;
			
			Livro livro;
			String titulo, autor;
			Biblioteca bib = new Biblioteca();
			
			do {
				
				exibirMenu();
			
				menu = sc.nextInt();
				
				
						
				switch (menu) {
				
			
				
				case 1:
					ss.nextLine();
					System.out.println("Titulo: ");
					titulo = ss.nextLine();
					
					System.out.println("Autor :");
					autor = ss.nextLine();
					System.out.println("Preco :");
					preco = sc.nextDouble();
				
					livro = new Livro (titulo, autor, preco);
					bib.adicionar(livro);
				
					break;
				
				case 2:
					System.out.println("\n========Listagem de Livros =============");
					bib.listar();
					System.out.println("============================================");
					break;
				
				case 3:	
					System.out.println("\n========Pesquisar por faixa de preco=============");
					System.out.println("Digite valor inicial: ");
					valorInicial = sc.nextDouble();
					System.out.println("Digite o valor final: ");
					valorFinal = sc.nextDouble();
					System.out.println("A quantidade de livros nesse faixa de preco é: " + bib.pesquisaFaixaDePreco(valorInicial,valorFinal));
					break;
				
				case 4:
					System.out.println("Existem " + bib.quantidadeTotalLivros() + " livros");
					break;
				
				case 5:
					System.out.println("O valor total em livros é de R$ " + bib.calcularValorTotalLivros());

					break;
				
				case 6:
					System.out.println("Informe o nome do autor: ");
					autor = ss.nextLine();
					List <Livro> meuLivro;
					meuLivro = bib.pesquisaPorAutor(autor);
					System.out.println("Os livros encontrados foram: "); 
					bib.listar(meuLivro);
					
					break;
				
				case 7:
					System.out.println("Informe o codigo do livro: ");
					int i = sc.nextInt();
					if ( bib.quantidadeTotalLivros() == 0) {
						System.out.println("Nao tem nenhum livro para ser excluido.");
					} else {
						bib.excluirLivro(i);
						System.out.println("Livro excluido!");
					}
					break;
				
				case 8:
					System.out.println("Tem certeza que deseja excluir todos os livros? (S/N)");
					char s = ss.next().charAt(0);
					if ( s == 's' || s == 'S' && bib.quantidadeTotalLivros() != 0) {
						bib.excluirTodos();
					} else {
						System.out.println("Nao tem nenhum livro para ser excluido.");
					}
					break;
			
				case 9:
					System.out.println("Saindo do Sistema.");
					break;
					
				default:
					System.out.println("Opcao inválida");
				
				}
			
				
			} while (menu != 9);
			
		}
			


		public static void exibirMenu() {
			
			System.out.println("********** BIBLIOTECA DA FACULDADE **************");
			System.out.println("");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Listar todos livros adicionados");
			System.out.println("3 - Pesquisar por faixa de preco");
			System.out.println("4 - Calcular quantidade total de livros cadastrados");
			System.out.println("5 - Valor total em R$ de livros cadastrados");
			System.out.println("6 - Pesquisar livro por nome do autor");
			System.out.println("7 - Excluir 01 livro");
			System.out.println("8 - Excluir todos os livros");
			System.out.println("9 - Sair");
			
			
		}
			
	}


