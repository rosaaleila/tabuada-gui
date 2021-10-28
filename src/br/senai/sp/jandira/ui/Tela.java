package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import br.senai.sp.jandira.model.Tabuada;

public class Tela {
	public void criarTela() {
		
		// chamando metodos necessarios para as operacoes
		Tabuada valoresTabuada = new Tabuada();
		
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
		lblResultado.setBounds(290, 45, 80, 30);
		
		// criando o scrollpane
		JScrollPane scrBarraDeRolagem = new JScrollPane();
		scrBarraDeRolagem.setBounds(290, 70, 150, 230);
		
		// definindo o model da lista
		DefaultListModel<String> modelListaOperacoes = new DefaultListModel<String>();
		
		//criando lista e a colocando no scrollpane
		JList<String> lsResultadoOperacoes = new JList<String>(modelListaOperacoes);
		scrBarraDeRolagem.getViewport().add(lsResultadoOperacoes);

		// colocar componentes na tela
		minhaTela.getContentPane().add(lblTitulo);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(lblMultiplicador);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(btnLimpar);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(txtMultiplicando);
		minhaTela.getContentPane().add(txtMultiplicador);
		minhaTela.getContentPane().add(scrBarraDeRolagem);
		
		//acoes botoes
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valoresTabuada.setMultiplicando(txtMultiplicando.getText()); // definindo o valor do multiplicando
				int multiplicando = valoresTabuada.getMultiplicando(); // atribuindo o valor a uma variavel
				
				valoresTabuada.setMultiplicador(txtMultiplicador.getText()); // definindo o valor do multiplicador
				int maximoMultiplicador = valoresTabuada.getMultiplicador(); // atribuindo o valor para uma variavel				
				
				for (int contador = 0; contador <= maximoMultiplicador; contador++) {
					modelListaOperacoes.addElement(multiplicando + " x " + contador + " = " + valoresTabuada.calcular(contador)); // o metodo calcular devolve o resultado da multiplicacao
				}
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// limpar tela
				modelListaOperacoes.clear();
				
			}
		});
		
		minhaTela.setVisible(true);
	}
}
