package jokenpo;

public class Resultado {

	public void geraResultado(Usuario jogador, Oponente computador ) {
		
	
		if (jogador.getEscolha().equalsIgnoreCase("Tesoura"))
        {
            if (computador.getSistemaConvertido().equalsIgnoreCase("Papel"))
            {
                System.out.println("Você ganhou!");
                return;
            }
            else if (computador.getSistemaConvertido().equalsIgnoreCase("Pedra"))
            {
            	System.out.println("Você perdeu!");
                return;
            }

            System.out.println("Jogo empatado!");
        }

        if (jogador.getEscolha().equalsIgnoreCase("Papel"))
        {
            if (computador.getSistemaConvertido().equalsIgnoreCase("Pedra"))
            {
            	System.out.println("Você ganhou!");
                return;
            }
            else if (computador.getSistemaConvertido().equalsIgnoreCase("Tesoura"))
            {
            	System.out.println("Você perdeu!");
                return;
            }

            System.out.println("Jogo empatado!");
        }
        
        if (jogador.getEscolha().equalsIgnoreCase("Pedra"))
        {
            if (computador.getSistemaConvertido().equalsIgnoreCase("Tesoura"))
            {
            	System.out.println("Você ganhou!");
                return;
            }
            else if (computador.getSistemaConvertido().equalsIgnoreCase("Papel"))
            {
            	System.out.println("Você perdeu!");
                return;
            }

            System.out.println("Jogo empatado!");
        }
		
	}
}