package com.br.vangeld.graphic.model;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class teste extends JFrame{
	public static void main(String[] args) {
		JFrame janela = new JFrame("teste");
		janela.setBounds(300, 20, 800, 700);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		JLabel hora = new AtualizaHora();
		janela.add(hora);
	}
}