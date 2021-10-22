package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.Scrollable;

import br.senai.sp.jandira.model.Calculadora;

public class Tela {
	public void criarTela() {
		
		// formatando
		JFrame minhaTela = new JFrame();
		minhaTela.setLayout(null);
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(490, 370);
		minhaTela.setResizable(false);
		minhaTela.setTitle("Calcular Tabuada");
		
		// criando componentes
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Tabuada");
		lblTitulo.setBounds(30, 10, 500, 50);
		lblTitulo.setForeground(Color.blue);
		lblTitulo.setFont(new Font("", Font.BOLD, 20));
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(80, 70, 90, 30);
		lblMultiplicando.setFont(new Font("", Font.PLAIN, 15));
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(175, 71, 70, 30);
		
		JLabel lblMultiplicador = new JLabel();
		lblMultiplicador.setText("Máximo multiplicador:");
		lblMultiplicador.setBounds(30, 110, 140, 30);
		lblMultiplicador.setFont(new Font("", Font.PLAIN, 15));
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(175, 111, 70, 30);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setFont(new Font("", Font.BOLD, 19));
		btnCalcular.setForeground(Color.white);
		btnCalcular.setBackground(Color.green);
		btnCalcular.setBounds(30, 180, 210, 50);
		
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setFont(new Font("", Font.BOLD, 19));
		btnLimpar.setForeground(Color.white);
		btnLimpar.setBackground(Color.red);
		btnLimpar.setBounds(30, 250, 210, 50);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultado:");
		lblResultado.setBounds(290, 65, 80, 30);
		
		Calculadora valores = new Calculadora();
		DefaultListModel<String> complementos = new DefaultListModel<>();
		JList<String> lsOperacoes = new JList<String>(complementos);
		
		JScrollPane scrBarra = new JScrollPane(lsOperacoes);
		scrBarra.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		// colocar componentes na tela
		minhaTela.getContentPane().add(lblTitulo);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(lblMultiplicador);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(btnLimpar);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(txtMultiplicando);
		minhaTela.getContentPane().add(txtMultiplicador);
		minhaTela.getContentPane().add(lsOperacoes);
		minhaTela.getContentPane().add(scrBarra);
		
		//acoes botoes
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				valores.setMultiplicando(txtMultiplicando.getText());
				valores.setMultiplicador(txtMultiplicador.getText());
				
				for (int contador = 0; contador <= valores.getMultiplicador(); contador++) {
					valores.calcular(contador);
					complementos.addElement(valores.getMultiplicando() + " * " + contador + " = " + valores.getResultado());
				}

				lsOperacoes.setBounds(290, 100, 160, 200);
				
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				complementos.clear();
				
			}
		});
		
		minhaTela.setVisible(true);
	}
}
