package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.Peca_de_Xadres;

public class Rei extends Peca_de_Xadres {

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "K";
	}

	
}
