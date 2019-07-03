package xadres;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class Partida_de_Xadrez {

	private Tabuleiro tabuleiro;
	
	
	public Partida_de_Xadrez() {
		tabuleiro = new Tabuleiro(8,8);
		iniciarPartida();
	}
	
	public Peca_de_Xadres[][] getPeca() {
		Peca_de_Xadres[][] mat = new Peca_de_Xadres[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for(int i=0;i<tabuleiro.getLinha();i++) {
			for(int j=0;j<tabuleiro.getColuna();j++) {
				mat[i][j] = (Peca_de_Xadres)tabuleiro.peca(i, j);	
			}
		}
		
		return mat;
	}
	
	public void iniciarPartida() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCO),new Posicao(2,1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETO),new Posicao(5,3));
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.PRETO),new Posicao(3,6));
	}
	
}
