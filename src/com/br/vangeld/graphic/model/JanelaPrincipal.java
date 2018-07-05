package com.br.vangeld.graphic.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPrincipal.class.getResource("/com/br/vangeld/imagens/iconWindows.png")));
		setTitle("Welcome to Van Geld Bank S/A");
		setForeground(new Color(0, 0, 0));
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);


		JLabel txtVanGeld = new JLabel("Van Geld");
		txtVanGeld.setBounds(183, 101, 402, 104);
		txtVanGeld.setToolTipText("");
		txtVanGeld.setHorizontalAlignment(SwingConstants.CENTER);
		txtVanGeld.setForeground(new Color(240, 248, 255));
		txtVanGeld.setBackground(new Color(0, 0, 0));
		txtVanGeld.setFont(new Font("Times New Roman", Font.PLAIN, 90));
		contentPane.add(txtVanGeld);

		JLabel label = new JLabel("");
		label.setBounds(320, 42, 0, 0);
		contentPane.add(label);

		JLabel txtBankSa = new JLabel("Bank S/A");
		txtBankSa.setBackground(Color.WHITE);
		txtBankSa.setForeground(new Color(240, 248, 255));
		txtBankSa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtBankSa.setBounds(505, 201, 69, 14);
		contentPane.add(txtBankSa);

		txtLogin = new JTextField();
		txtLogin.setBounds(305, 313, 155, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);


		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(Color.ORANGE);
		lblId.setBackground(new Color(240, 248, 255));
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblId.setBounds(305, 297, 46, 14);
		contentPane.add(lblId);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.ORANGE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPassword.setBounds(305, 344, 86, 14);
		contentPane.add(lblPassword);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(305, 361, 155, 20);
		contentPane.add(txtSenha);

		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtLogin.getText().equals("admin") && txtSenha.getText().equals("admin")) {
					try {
						JanelaTerminal frame = new JanelaTerminal();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Login ou Senha incorretos!");
				}
			}
		});
		btnLogin.setBackground(Color.ORANGE);
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLogin.setBounds(305, 397, 69, 23);
		contentPane.add(btnLogin);

		JLabel lblCopyRight = new JLabel("\u00A9 2018 VAN GELD BANK S\\A All RIGHTS RESERVED");
		lblCopyRight.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCopyRight.setForeground(new Color(240, 248, 255));
		lblCopyRight.setBounds(236, 636, 292, 14);
		contentPane.add(lblCopyRight);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					JanelaCadastro frame = new JanelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRegister.setBackground(Color.ORANGE);
		btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setBounds(384, 397, 76, 23);
		contentPane.add(btnRegister);
	}
}
