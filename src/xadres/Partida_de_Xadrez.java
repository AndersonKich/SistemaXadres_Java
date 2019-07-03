package xadres;

import tabuleiro.Tabuleiro;

public class Partida_de_Xadrez {

	private Tabuleiro tabuleiro;
	
	
	public Partida_de_Xadrez() {
		tabuleiro = new Tabuleiro(8,8);
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
	
	
	
}
