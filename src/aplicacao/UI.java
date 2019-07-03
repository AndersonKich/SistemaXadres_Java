package aplicacao;

import xadres.Peca_de_Xadres;

public class UI {

	public static void imprimirTabuleiro(Peca_de_Xadres[][] pecas) {
		for(int i=0;i<pecas.length;i++) {
			System.out.print((8 - i) + " ");
			for(int j=0;j<pecas[i].length;j++) {
				imprimirPeca(pecas[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void imprimirPeca(Peca_de_Xadres peca) {
		
		if(peca == null) {
			System.out.print("-");
		}else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
	
	
	
	
}
