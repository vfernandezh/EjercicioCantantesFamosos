package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class UI extends JFrame {

	private JPanel contentPane;
	protected JTextField NombreCantante;
	protected JTextField NombreDisco;
	protected JButton botonIntroducir;
	protected JPanel panelPrincipal;
	protected JTextArea textLista;
	protected JButton btnIntorducirOtro;
	protected JPanel panel;
	
	

	public JTextField getNombreCantante() {
		return NombreCantante;
	}
	public JTextField getNombreDisco() {
		return NombreDisco;
	}
	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblListaDeCantantes = new JLabel("Lista De Cantantes");
		lblListaDeCantantes.setForeground(new Color(0, 0, 0));
		lblListaDeCantantes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListaDeCantantes.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblListaDeCantantes.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblListaDeCantantes, BorderLayout.NORTH);
		
		
		IntroducirDatos();
		
	}
	private void MostrarLista() {
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		textLista = new JTextArea();
		textLista.setFont(new Font("Monospaced", Font.BOLD, 15));
		textLista.setBorder(new LineBorder(new Color(0, 0, 0)));
		textLista.setBackground(new Color(128, 128, 128));
		textLista.setEditable(false);
		panel.add(textLista, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(105, 105, 105));
		panel.add(panel_1, BorderLayout.SOUTH);
		
		btnIntorducirOtro = new JButton("Intorducir otro");
		panel_1.add(btnIntorducirOtro);
		
	}
	
	private void IntroducirDatos() {
		panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNombreDelCantante = new JLabel("Nombre del cantante:");
		lblNombreDelCantante.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDelCantante.setBorder(new EmptyBorder(15, 0, 10, 0));
		lblNombreDelCantante.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		panelPrincipal.add(lblNombreDelCantante, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panelPrincipal.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 70, 0, 70));
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		NombreCantante = new JTextField();
		panel_3.add(NombreCantante, BorderLayout.NORTH);
		NombreCantante.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDiscoMasVendido = new JLabel("Disco mas vendido:");
		panel_2.add(lblDiscoMasVendido, BorderLayout.NORTH);
		lblDiscoMasVendido.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscoMasVendido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblDiscoMasVendido.setBorder(new EmptyBorder(15, 0, 10, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 70, 0, 70));
		panel_4.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		NombreDisco = new JTextField();
		panel_5.add(NombreDisco, BorderLayout.NORTH);
		NombreDisco.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(20, 0, 0, 0));
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		botonIntroducir = new JButton("Introducir");
		panel_6.add(botonIntroducir);
	
		
		
		
	}
	
	public void VisualizarLista() {
		remove(panelPrincipal);
		MostrarLista();
	}
	public void VisualizarPanelPrincipal() {
		remove(panel);
		IntroducirDatos();
	}
}
