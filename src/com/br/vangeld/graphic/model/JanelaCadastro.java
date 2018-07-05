package com.br.vangeld.graphic.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.Box;
import javax.swing.JToggleButton;
import java.awt.Toolkit;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frame = new JanelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaCadastro.class.getResource("/com/br/vangeld/imagens/iconWindows.png")));
		setTitle("Van Geld Bank S/A - Register");
		setForeground(new Color(0, 0, 0));
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 20, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		
		JLabel label = new JLabel("");
		label.setBounds(320, 42, 0, 0);
		contentPane.add(label);
		
		Panel panel = new Panel();
		panel.setForeground(Color.ORANGE);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 42, 784, 574);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnFuncionrio = new JButton("Funcion\u00E1rio");
		btnFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFuncionrio.setBackground(Color.ORANGE);
		btnFuncionrio.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnFuncionrio.setBounds(343, 276, 99, 23);
		panel.add(btnFuncionrio);
		
		JButton btnConta = new JButton("Conta");
		btnConta.setBackground(Color.ORANGE);
		btnConta.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnConta.setBounds(343, 322, 99, 23);
		panel.add(btnConta);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setBackground(Color.ORANGE);
		btnCliente.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCliente.setBounds(343, 232, 99, 23);
		panel.add(btnCliente);
		
		JLabel lblAindaNaoECadastrado = new JLabel("Ainda n\u00E3o \u00E9 cadastrado?\r\n");
		lblAindaNaoECadastrado.setBounds(10, 11, 457, 39);
		panel.add(lblAindaNaoECadastrado);
		lblAindaNaoECadastrado.setForeground(Color.DARK_GRAY);
		lblAindaNaoECadastrado.setFont(new Font("Times New Roman", Font.BOLD, 33));
		
		JLabel lblEscolhaUmaDas = new JLabel("Escolha uma das opc\u00F5es abaixo, \u00E9 simples e r\u00E1pido!");
		lblEscolhaUmaDas.setBounds(10, 46, 423, 27);
		panel.add(lblEscolhaUmaDas);
		lblEscolhaUmaDas.setForeground(Color.DARK_GRAY);
		lblEscolhaUmaDas.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblCopyRight = new JLabel("\u00A9 2018 VAN GELD BANK S\\A All RIGHTS RESERVED");
		lblCopyRight.setBounds(236, 636, 292, 14);
		lblCopyRight.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCopyRight.setForeground(new Color(240, 248, 255));
		contentPane.add(lblCopyRight);
	}
	
}
