package Formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class frmCadasDisciplinas extends JInternalFrame {
	private JTextField txbCodigo;
	private JTextField txbSigla;
	private JTextField txbNome;
	private JTextField txbCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadasDisciplinas frame = new frmCadasDisciplinas();
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
	public frmCadasDisciplinas() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().setBackground(SystemColor.controlHighlight);
		setTitle("Cadastro de Disciplinas");
		setBounds(100, 100, 525, 300);
		getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(207, 219, 89, 25);
		getContentPane().add(btnVoltar);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCodigo.setBounds(31, 50, 63, 25);
		getContentPane().add(lblCodigo);
		
		txbCodigo = new JTextField();
		txbCodigo.setFont(new Font("Arial", Font.PLAIN, 12));
		txbCodigo.setBounds(104, 54, 109, 20);
		getContentPane().add(txbCodigo);
		txbCodigo.setColumns(10);
		
		JLabel lblSigla = new JLabel("Sigla:");
		lblSigla.setFont(new Font("Arial", Font.PLAIN, 17));
		lblSigla.setBounds(324, 97, 41, 25);
		getContentPane().add(lblSigla);
		
		txbSigla = new JTextField();
		txbSigla.setFont(new Font("Arial", Font.PLAIN, 12));
		txbSigla.setColumns(10);
		txbSigla.setBounds(375, 101, 109, 20);
		getContentPane().add(txbSigla);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNome.setBounds(31, 97, 47, 25);
		getContentPane().add(lblNome);
		
		txbNome = new JTextField();
		txbNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txbNome.setColumns(10);
		txbNome.setBounds(88, 101, 218, 20);
		getContentPane().add(txbNome);
		
		JLabel lblCodProfessor = new JLabel("C\u00F3digo do Professor:");
		lblCodProfessor.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCodProfessor.setBounds(31, 139, 156, 25);
		getContentPane().add(lblCodProfessor);
		
		txbCPF = new JTextField();
		txbCPF.setFont(new Font("Arial", Font.PLAIN, 12));
		txbCPF.setColumns(10);
		txbCPF.setBounds(197, 143, 109, 20);
		getContentPane().add(txbCPF);

	}
}
