package br.com.global.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.global.cm.modelo.Tabuleiro;
import br.com.global.cm.visao.TelaInicial;
import br.com.global.cm.visao.TelaPrincipal;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {
			SwingUtilities.invokeLater(() -> {
				
				if(e.isGanhou() ) {
					JOptionPane.showMessageDialog(this, "Ganhou");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu");
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}
