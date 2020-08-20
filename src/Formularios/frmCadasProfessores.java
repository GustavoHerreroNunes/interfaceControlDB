package Formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class frmCadasProfessores extends JInternalFrame {
	private JTextField txbCodigo;
	private JTextField txbNome;
	private JTextField txbEndereco;
	private JTextField txbCPF;
	private JTextField txbRG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadasProfessores frame = new frmCadasProfessores();
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
	public frmCadasProfessores() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().setBackground(SystemColor.controlHighlight);
		setTitle("Cadastro de Professores");
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
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNome.setBounds(239, 50, 53, 25);
		getContentPane().add(lblNome);
		
		txbNome = new JTextField();
		txbNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txbNome.setColumns(10);
		txbNome.setBounds(302, 54, 178, 20);
		getContentPane().add(txbNome);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 17));
		lblEndereco.setBounds(31, 97, 76, 25);
		getContentPane().add(lblEndereco);
		
		txbEndereco = new JTextField();
		txbEndereco.setFont(new Font("Arial", Font.PLAIN, 12));
		txbEndereco.setColumns(10);
		txbEndereco.setBounds(117, 101, 363, 20);
		getContentPane().add(txbEndereco);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCPF.setBounds(31, 139, 38, 25);
		getContentPane().add(lblCPF);
		
		txbCPF = new JTextField();
		txbCPF.setFont(new Font("Arial", Font.PLAIN, 12));
		txbCPF.setColumns(10);
		txbCPF.setBounds(79, 143, 178, 20);
		getContentPane().add(txbCPF);
		
		txbRG = new JTextField();
		txbRG.setFont(new Font("Arial", Font.PLAIN, 12));
		txbRG.setColumns(10);
		txbRG.setBounds(305, 143, 175, 20);
		getContentPane().add(txbRG);
		
		JLabel lblRG = new JLabel("RG:");
		lblRG.setFont(new Font("Arial", Font.PLAIN, 17));
		lblRG.setBounds(267, 139, 28, 25);
		getContentPane().add(lblRG);

	}
}
