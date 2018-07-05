package com.br.vangeld.graphic.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.Toolkit;

public class JanelaTerminal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
	LocalDateTime horaAtual = LocalDateTime.now();;
	
	JLabel hora = new JLabel(horaAtual.format(fmt));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaTerminal frame = new JanelaTerminal();
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
	public JanelaTerminal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaTerminal.class.getResource("/com/br/vangeld/imagens/iconWindows.png")));
		{
			setTitle("Van Geld Bank S/A - Terminal");
			setForeground(new Color(0, 0, 0));
			setBackground(Color.BLACK);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(300, 20, 800, 700);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(51, 153, 255));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			hora.setBackground(new Color(0, 0, 0));
			hora.setVerticalAlignment(SwingConstants.TOP);
			setResizable(false);


			
			JLabel label = new JLabel("");
			label.setBounds(320, 42, 0, 0);
			contentPane.add(label);
			
			Panel panel = new Panel();
			panel.setForeground(Color.ORANGE);
			panel.setBackground(new Color(255, 127, 80));
			panel.setBounds(0, 42, 784, 574);
			contentPane.add(panel);
			panel.setLayout(null);

			
			textField = new JTextField();
			textField.setBounds(269, 222, 249, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel txtNumeroDaConta = new JLabel("N\u00DAMERO DA CONTA:");
			txtNumeroDaConta.setFont(new Font("Times New Roman", Font.BOLD, 12));
			txtNumeroDaConta.setBounds(269, 204, 134, 14);
			panel.add(txtNumeroDaConta);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Consulta Saldo", "Realizar Deposito", "Realizar Saque"}));
			comboBox.setToolTipText("");
			comboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
			comboBox.setBounds(269, 269, 249, 22);
			panel.add(comboBox);
			
			JLabel txtOperacao = new JLabel("OPERA\u00C7\u00C3O:");
			txtOperacao.setFont(new Font("Times New Roman", Font.BOLD, 12));
			txtOperacao.setBounds(269, 253, 85, 14);
			panel.add(txtOperacao);
			
			JButton btnValidar = new JButton("Validar");
			btnValidar.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnValidar.setBounds(349, 316, 89, 23);
			panel.add(btnValidar);
			
			JLabel txtCopyRight = new JLabel("\u00A9 2018 VAN GELD BANK S\\A All RIGHTS RESERVED");
			txtCopyRight.setBounds(236, 636, 292, 14);
			txtCopyRight.setFont(new Font("Times New Roman", Font.BOLD, 12));
			txtCopyRight.setForeground(new Color(240, 248, 255));
			contentPane.add(txtCopyRight);
			
			JLabel Hora = new AtualizaHora();
			Hora.setFont(new Font("Times New Roman", Font.BOLD, 15));
			Hora.setBounds(310, 11, 144, 24);
			contentPane.add(Hora);

		}
	}
}
