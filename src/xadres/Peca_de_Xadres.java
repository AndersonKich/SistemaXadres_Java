package xadres;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public abstract class Peca_de_Xadres extends Peca{

	private Cor cor;
	private Integer contarMovimentos;
	
	public Peca_de_Xadres(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	
	
	
	
	
	
}
