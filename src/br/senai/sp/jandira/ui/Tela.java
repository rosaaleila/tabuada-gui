package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela {
	public void criarTela() {
		// formatando
		JFrame minhaTela = new JFrame();
		minhaTela.setLayout(null);
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(500, 400);
		minhaTela.setResizable(false);
		minhaTela.setTitle("Calculadora");
		
		// criando componentes
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Tabuada");
		lblTitulo.setBounds(20, 10, 500, 50);
		lblTitulo.setForeground(Color.blue);
		lblTitulo.setBackground(Color.white);
		lblTitulo.setFont(new Font("", Font.BOLD, 20));
		
		// colocar componentes na tela
		minhaTela.getContentPane().add(lblTitulo);
		
		minhaTela.setVisible(true);
	}
}
