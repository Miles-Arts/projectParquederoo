package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaOperaciones extends JFrame {

	private JPanel panelPrinpal;
	private JTextField textField;


	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		panelPrinpal = new JPanel();
		panelPrinpal.setBackground(new Color(128, 64, 0));
		panelPrinpal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrinpal);
		panelPrinpal.setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(0, 128, 0));
		btnCancelar.setBounds(275, 124, 89, 23);
		panelPrinpal.add(btnCancelar);
		
	
		
		btnAceptar.setBounds(60, 124, 89, 23);
		panelPrinpal.add(btnAceptar);
		
		textField = new JTextField();
		textField.setBounds(63, 125, 86, 20);
		panelPrinpal.add(textField);
		textField.setColumns(10);
		
	}
}
