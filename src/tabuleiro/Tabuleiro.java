package tabuleiro;

public class Tabuleiro {

	private Integer linha;
	private Integer coluna;
	private Peca[][] pecas;// Matriz de pecas
	
	public Tabuleiro(Integer linha, Integer coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];
	}

	public Integer getLinha() {
		return linha;
	}

	public void setLinha(Integer linha) {
		this.linha = linha;
	}

	public Integer getColuna() {
		return coluna;
	}

	public void setColuna(Integer coluna) {
		this.coluna = coluna;
	}
	//Funcao que retorna a peca na linha e coluna selecionada
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	//Funcao que retorna a posicao da peca na linha e coluna selecionada
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
		
	}
	
	public void colocarPeca(Peca peca,Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
}
