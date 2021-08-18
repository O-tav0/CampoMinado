package br.com.global.cm.visao;

import javax.swing.JFrame;

import br.com.global.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	private Tabuleiro tabuleiro;
	
	public TelaPrincipal(Tabuleiro tabuleiro) {
		//Tabuleiro tabuleiro = new Tabuleiro(16,30,50);
		this.tabuleiro = tabuleiro;
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
