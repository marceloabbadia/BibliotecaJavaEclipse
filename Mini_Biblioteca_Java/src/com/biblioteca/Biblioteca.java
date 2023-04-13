package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	
	private String responsavel;
	private List<Livro> listaLivros = new ArrayList<Livro>();
	
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	public void adicionar(Livro livro) {
		listaLivros.add(livro);
	}
	
	public void listar() {
		for (Livro livro : listaLivros) {
			System.out.println(livro.getAutor() + " " + livro.getTitulo() + " " + livro.getPreco());		
		}
	}
		
	public void listar (List<Livro> listaLivros) {
		for (Livro livro : listaLivros) {
			System.out.println(livro.getAutor() + " " + livro.getTitulo() + " " + livro.getPreco());		
		}
	}
	
		
	
	public int pesquisaFaixaDePreco (double valorInicial, double valorFinal) {
		int quantidade = 0;
		
		for (Livro livro : listaLivros) {		
			if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
				quantidade++;
			}
		}
		return quantidade;
	}
		
	
	
	public double calcularValorTotalLivros() {
		
		double total = 0.0 ;
		
		
		for (Livro livro : listaLivros) {
			total += livro.getPreco();
		
		}
		
		return total;
	}
	
	public int quantidadeTotalLivros() {
		return listaLivros.size();
	}
	
	
	
	
	public List <Livro> pesquisaPorAutor (String autor) {
		
		List<Livro> listaAutor = new ArrayList <Livro>();
		
		for (Livro livro: listaLivros) {
			if (livro.getAutor().equals(autor)) {
				listaAutor.add(livro);
			}	
		}
		return listaAutor;
	}
	
	
	public void imprimirPorAutor (String autor) {
		
	for (Livro livro: listaLivros) {
		if (livro.getAutor().equals(autor)) {
			System.out.println(livro.toString());
			}
			
		}
	}
	
	public void excluirLivro( int indice) {
		listaLivros.remove(indice);
	}
	
	
	public void excluirTodos() {
		listaLivros.removeAll(listaLivros);
	}
	

}
