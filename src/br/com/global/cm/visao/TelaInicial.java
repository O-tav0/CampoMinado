package br.com.global.cm.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.com.global.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaInicial extends JFrame {

	TelaInicial() {
		setTitle("Escolha de dificuldade");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10,150));
	
		
		JButton botaoFacil = new JButton("Nível fácil");
		botaoFacil.setSize(120, 120);
		botaoFacil.setBackground(new Color(0,100,0));
		botaoFacil.setForeground(new Color(255,255,255));
		
		botaoFacil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarJogo(new Tabuleiro(10,10,5));
			}
		});
		
		JButton botaoMedio = new JButton("Nível Médio");
		botaoMedio.setSize(120,120);
		botaoMedio.setBackground(new Color(222, 187, 0));
		botaoMedio.setForeground(new Color(0,0,0));
		
		botaoMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarJogo(new Tabuleiro(20,20,35));
			}
		});
		
		
		JButton botaoDificil = new JButton("Nível Difícil");
		botaoDificil.setSize(120,120);
		botaoDificil.setBackground(new Color(165, 7, 0));
		botaoDificil.setForeground(new Color(255,255,255));
		
		botaoDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarJogo(new Tabuleiro(30,30,50));
			}
		});
	
		add(botaoFacil);
		add(botaoMedio);
		add(botaoDificil);
		setVisible(true);
	}
	
	public void mostrarJogo(Tabuleiro tabuleiro) {
		TelaPrincipal tp = new TelaPrincipal(tabuleiro);
	}

	public static void main(String[] args) {
		new TelaInicial();
	}
}
