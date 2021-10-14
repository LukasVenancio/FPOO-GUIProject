package br.senai.sp.jandira.ui;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;

public class Tela {

	public void criarTela() {

		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(600, 600);
		minhaTela.setTitle("Minha primeira Janela");
		minhaTela.setLayout(null);

		// Criar os componentes da tela
		JLabel lblIdade = new JLabel("Qual a sua idade?");
		lblIdade.setBounds(20, 20, 150, 30);

		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(20, 60, 100, 30);

		JButton bttVerificar = new JButton("VERIFICAR");
		minhaTela.getContentPane().add(bttVerificar);
		bttVerificar.setBounds(130, 60, 100, 30);

		JLabel lblResultado = new JLabel("RESULTADO");
		lblResultado.setBounds(20, 100, 150, 30);

		minhaTela.getContentPane().add(lblIdade);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(txtIdade);

		minhaTela.setVisible(true);

		//Listeners de eventos
		//Mouse
		
		txtIdade.addMouseListener(new MouseInputListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Soltei");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertei");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Saí");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entrei");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Cliquei");
				
			}
		});
	}

}
