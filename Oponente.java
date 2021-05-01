package jokenpo;

import java.util.Random;

public class Oponente {

	private int nome;
	private String nomeConvertido;
	private int sistema;
	private String sistemaConvertido;

	public void nomeOponente() {
		Random nome = new Random();

		for (int i = 0; i < 3; i++) {
			this.setNome(nome.nextInt(4));
		}
		
		switch (getNome()) {	
			case 0:
				setNomeConvertido("Evandro");
				break;
				
			case 1:
				setNomeConvertido("Jeni");
				break;
				
			case 2:
				setNomeConvertido("Roberta");
				break;
				
			case 3:
				setNomeConvertido("Thiago");
				break;
		}
		
		System.out.println("Nome do seu oponente: " + getNomeConvertido());
	}

	public void escolhaOponente() {
		Random cpu = new Random();
		
		for (int i = 0; i < 2; i++) {
			this.setSistema(cpu.nextInt(3));
		}
		
		if (getSistema() == 0) {
			setSistemaConvertido("Pedra");
		} else if (getSistema() == 1) {
			setSistemaConvertido("Papel");
		} else {
			setSistemaConvertido("Tesoura");
		}
		
		System.out.println("Escolha do seu oponente: " + getSistemaConvertido());
		
		getSistemaConvertido();
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

	public int getNome() {
		return this.nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public String getNomeConvertido() {
		return this.nomeConvertido;
	}

	public void setNomeConvertido(String nomeConvertido) {
		this.nomeConvertido = nomeConvertido;
	}

}