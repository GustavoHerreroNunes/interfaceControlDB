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

public class frmPesquisaDisciplinas extends JInternalFrame {
	private JTextField txbCodigo;
	private JTextField txbNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPesquisaDisciplinas frame = new frmPesquisaDisciplinas();
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
	public frmPesquisaDisciplinas() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().setBackground(SystemColor.controlHighlight);
		setTitle("Pesquisa de Disciplinas");
		setBounds(100, 100, 525, 358);
		getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(210, 268, 89, 25);
		getContentPane().add(btnVoltar);
		
		JLabel lblCodigo = new JLabel("Insira o c\u00F3digo da Disciplina:");
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCodigo.setBounds(31, 50, 218, 25);
		getContentPane().add(lblCodigo);
		
		txbCodigo = new JTextField();
		txbCodigo.setFont(new Font("Arial", Font.PLAIN, 12));
		txbCodigo.setBounds(31, 86, 275, 20);
		getContentPane().add(txbCodigo);
		txbCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Insira o nome do Disciplina:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNome.setBounds(31, 170, 204, 25);
		getContentPane().add(lblNome);
		
		txbNome = new JTextField();
		txbNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txbNome.setColumns(10);
		txbNome.setBounds(31, 206, 275, 20);
		getContentPane().add(txbNome);
		
		JLabel lblHr = new JLabel("<html>\r\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n<hr></hr>\r\n</html>");
		lblHr.setBounds(31, 117, 430, 30);
		getContentPane().add(lblHr);

	}
}
