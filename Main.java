package jokenpo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Usuario jogador1 = new Usuario();
		Oponente oponente = new Oponente();
		Scanner scanner = new Scanner(System.in);
		Resultado resultado = new Resultado();
		
		System.out.println("Digite seu nome: ");
		jogador1.setNome(scanner.nextLine());		
		
		System.out.println("Digite sua opcao (Pedra, papel ou tesoura): ");						   
		jogador1.setEscolha(scanner.nextLine());
		
		oponente.nomeOponente();
		oponente.escolhaOponente();
		
		resultado.geraResultado(jogador1, oponente);
	}

}