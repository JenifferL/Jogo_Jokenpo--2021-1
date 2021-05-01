package jokenpo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Usuario jogador1 = new Usuario();
		Oponente nome = new Oponente();
		Scanner scanner = new Scanner(System.in);
		Resultado resultado = new Resultado();

		System.out.println("Digite seu nome: ");
		jogador1.setNome(scanner.nextLine());
		System.out.println("Escolha uma das opçõe a seguir: PEDRA, PAPEL ou TESOURA.");

		jogador1.setEscolha(scanner.nextLine());

		nome.escolhaOponente();

		resultado.geraResultado(jogador1, nome);
	}

}
