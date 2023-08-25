package com.Exercicio02;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		int opcoes = 0;
		
		while (opcoes != 5) {
			
			switch (opcoes) {
			case 1:
				System.out.println("==== Mostrar albuns === ");
				Albuns[] albuns = dao.getAlbums();
				for(int i = 0; i < albuns.length; i++) {
					System.out.println(albuns[i].toString());
				}
				break;
			case 2:
				Albuns[] albuns2 = dao.getAlbums();
				Albuns albums = new Albuns(6, "reputation", 15, 2017);
				if(dao.inserirAlbum(albums) == true) {
					System.out.println("Inserção com sucesso -> " + albuns2.toString());
				}
				break;
			case 3:
				Albuns[] albuns3 = dao.getAlbums();
				int i = 0;
				Scanner le = new Scanner(System.in);
				i = le.nextInt();
				dao.excluirAlbum(albuns3[i].getCodigo());
				break;
			case 4:
				Albuns[] albuns4 = dao.getAlbums();
				int j = 0;
				Scanner ler = new Scanner(System.in);
				j = ler.nextInt();
				int quannova = 20;
				albuns4[j].setQuantidade(quannova);
				dao.atualizarAlbum(albuns4[j]);
				break;
			case 5:
				break;
				
				
			}
		}
		
		dao.close();
	}
}