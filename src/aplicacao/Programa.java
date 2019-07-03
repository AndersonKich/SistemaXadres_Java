package aplicacao;

import xadres.Partida_de_Xadrez;

public class Programa {

	public static void main(String[] args) {
		
		Partida_de_Xadrez partida = new Partida_de_Xadrez();
		UI.imprimirTabuleiro(partida.getPeca());
		

	}

}
