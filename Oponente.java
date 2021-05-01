package jokenpo;

import java.util.Random;

public class Oponente {

	private int sistema;
	private String sistemaConvertido;

	public void escolhaOponente() {
		Random cpu = new Random();

		for (int i = 0; i < 3; i++) {
			this.setSistema(cpu.nextInt(3));
		}

		if (getSistema() == 0) {
			setSistemaConvertido("Pedra");
		} else if (getSistema() == 1) {
			setSistemaConvertido("Papel");
		} else {
			setSistemaConvertido("Tesoura");
		}

		System.out.println("O Computador escolheu: " + getSistemaConvertido());
		System.out.println();

	}

	public int getSistema() {
		return sistema;
	}

	public void setSistema(int sistema) {
		this.sistema = sistema;
	}

	public String getSistemaConvertido() {
		return this.sistemaConvertido;
	}

	public void setSistemaConvertido(String conversao) {
		this.sistemaConvertido = conversao;
	}

}
