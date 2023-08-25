package com.Exercicio02;

public class Albuns {
	private int codigo;
	private String nome;
	private int quantidade;
	private int ano;
	
	public Albuns() {
		this.codigo = -1;
		this.nome = "";
		this.quantidade = -1;
		this.ano = -1;
	}
	
	public Albuns(int codigo, String nome, int quantidade, int ano) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + ", quantidade de musicas =" + quantidade + ", ano de lançamento =" + ano + "]";
	}	
}
