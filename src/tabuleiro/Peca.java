package tabuleiro;

public abstract class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.posicao = null;
		this.tabuleiro = tabuleiro;
	}

	protected Posicao getPosicao() {
		return posicao;
	}


	
}
