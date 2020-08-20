package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Toolkit;

public class frmMenus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenus frame = new frmMenus();
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
	public frmMenus() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\Formularios_MDI\\assets\\img\\logo.png"));
		setForeground(Color.WHITE);
		setTitle("Admins Education System - Beta Version");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 530);
		setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 994, 479);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(0, 139, 139));
		setJMenuBar(menuBar);
		
		JMenu mnCadas = new JMenu("Cadastrar");
		mnCadas.setForeground(new Color(255, 255, 255));
		mnCadas.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnCadas);
		
		JMenuItem mntmCadasProf = new JMenuItem("Professores");
		mntmCadasProf.setBackground(new Color(0, 179, 179));
		mntmCadasProf.setFont(new Font("Arial", Font.BOLD, 12));
		mntmCadasProf.setForeground(new Color(255, 255, 255));
		mntmCadasProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadasProfessores frmP = new frmCadasProfessores();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		mnCadas.add(mntmCadasProf);
		
		JMenuItem mntmCadasDisci = new JMenuItem("Disciplinas");
		mntmCadasDisci.setForeground(new Color(255, 255, 255));
		mntmCadasDisci.setFont(new Font("Arial", Font.BOLD, 12));
		mntmCadasDisci.setBackground(new Color(0, 179, 179));
		mntmCadasDisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadasDisciplinas frmD = new frmCadasDisciplinas();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnCadas.add(mntmCadasDisci);
		
		JMenu mnPesquisar = new JMenu("Pesquisar");
		mnPesquisar.setForeground(new Color(255, 255, 255));
		mnPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnPesquisar);
		
		JMenuItem mntmPesquisarProf = new JMenuItem("Professores");
		mntmPesquisarProf.setForeground(new Color(255, 255, 255));
		mntmPesquisarProf.setBackground(new Color(0, 179, 179));
		mntmPesquisarProf.setFont(new Font("Arial", Font.BOLD, 12));
		mntmPesquisarProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPesquisaProfessores frmP = new frmPesquisaProfessores();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		mnPesquisar.add(mntmPesquisarProf);
		
		JMenuItem mntmPesquisarDisci = new JMenuItem("Disciplinas");
		mntmPesquisarDisci.setBackground(new Color(0, 179, 179));
		mntmPesquisarDisci.setFont(new Font("Arial", Font.BOLD, 12));
		mntmPesquisarDisci.setForeground(new Color(255, 255, 255));
		mntmPesquisarDisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPesquisaDisciplinas frmD = new frmPesquisaDisciplinas();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnPesquisar.add(mntmPesquisarDisci);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setFont(new Font("Arial", Font.BOLD, 12));
		mnSair.setForeground(Color.WHITE);
		menuBar.add(mnSair);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setForeground(new Color(255, 255, 255));
		mntmSair.setFont(new Font("Arial", Font.BOLD, 12));
		mntmSair.setBackground(new Color(0, 179, 179));
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnSair.add(mntmSair);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setEnabled(false);
		toolBar.setBackground(new Color(100, 189, 189));
		toolBar.setBounds(0, 0, 994, 41);
		panel.add(toolBar);
		
		JButton btnCadasProf = new JButton("");
		btnCadasProf.setBackground(new Color(100, 189, 189));
		btnCadasProf.setBorder(null);
		btnCadasProf.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\Formularios_MDI\\assets\\img\\cadasProf.png"));
		btnCadasProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadasProfessores frmP = new frmCadasProfessores();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_3);
		toolBar.add(btnCadasProf);
		
		JButton btnCadasDisci = new JButton("");
		btnCadasDisci.setBackground(new Color(100, 189, 189));
		btnCadasDisci.setBorder(null);
		btnCadasDisci.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\Formularios_MDI\\assets\\img\\cadasDisci.png"));
		btnCadasDisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadasDisciplinas frmD = new frmCadasDisciplinas();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut);
		toolBar.add(btnCadasDisci);
		
		JButton btnPesquisarProf = new JButton("");
		btnPesquisarProf.setBackground(new Color(100, 189, 189));
		btnPesquisarProf.setBorder(null);
		btnPesquisarProf.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\Formularios_MDI\\assets\\img\\pesquisarProf.png"));
		btnPesquisarProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPesquisaProfessores frmP = new frmPesquisaProfessores();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_1);
		
		toolBar.add(btnPesquisarProf);
		
		JButton btnPesquisarDisci = new JButton("");
		btnPesquisarDisci.setBackground(new Color(100, 189, 189));
		btnPesquisarDisci.setBorder(null);
		btnPesquisarDisci.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\Formularios_MDI\\assets\\img\\pesquisarDisci.png"));
		btnPesquisarDisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPesquisaDisciplinas frmD = new frmPesquisaDisciplinas();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_2);
		toolBar.add(btnPesquisarDisci);
	}
}
