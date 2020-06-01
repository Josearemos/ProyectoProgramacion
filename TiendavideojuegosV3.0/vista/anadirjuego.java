package vista;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fondos.Fondo;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;

public class anadirjuego extends JFrame {

	private JPanel contentPane;
	private JTextField idjuegoInput;
	private JTextField tituloInput;
	private JTextField generoInput;
	private JTextField idiomaInput;
	private JTextField precioInput;
	private JTextField descripcionInput;
	 private JButton btnNewButton_2;
	
	public anadirjuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new Fondo("tetris.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//CENTRO
		setSize(900, 600);//tamano
		setResizable(false);
		
		JLabel lblIdjuego = new JLabel("IDJUEGO");
		lblIdjuego.setForeground(Color.YELLOW);
		lblIdjuego.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblIdjuego.setBackground(Color.BLUE);
		lblIdjuego.setBounds(63, 45, 89, 14);
		contentPane.add(lblIdjuego);
		
		JLabel lblTtulo = new JLabel("T\u00CDTULO");
		lblTtulo.setForeground(Color.GREEN);
		lblTtulo.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblTtulo.setBackground(Color.BLUE);
		lblTtulo.setBounds(63, 102, 89, 14);
		contentPane.add(lblTtulo);
		
		JLabel lblGnero = new JLabel("G\u00C9NERO");
		lblGnero.setForeground(Color.CYAN);
		lblGnero.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblGnero.setBackground(Color.BLUE);
		lblGnero.setBounds(63, 158, 89, 14);
		contentPane.add(lblGnero);
		
		JLabel lblIdioma = new JLabel("IDIOMA");
		lblIdioma.setForeground(Color.RED);
		lblIdioma.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblIdioma.setBackground(Color.BLUE);
		lblIdioma.setBounds(63, 215, 89, 14);
		contentPane.add(lblIdioma);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setForeground(Color.ORANGE);
		lblPrecio.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblPrecio.setBackground(Color.BLUE);
		lblPrecio.setBounds(63, 271, 89, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblDescripcin = new JLabel("DESCRIPCI\u00D3N");
		lblDescripcin.setForeground(Color.MAGENTA);
		lblDescripcin.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblDescripcin.setBackground(Color.BLUE);
		lblDescripcin.setBounds(51, 334, 117, 26);
		contentPane.add(lblDescripcin);
		
		idjuegoInput = new JTextField();
		idjuegoInput.setBounds(192, 24, 239, 35);
		contentPane.add(idjuegoInput);
		idjuegoInput.setColumns(10);
		
		tituloInput = new JTextField();
		tituloInput.setColumns(10);
		tituloInput.setBounds(192, 80, 239, 35);
		contentPane.add(tituloInput);
		
		generoInput = new JTextField();
		generoInput.setColumns(10);
		generoInput.setBounds(192, 137, 239, 35);
		contentPane.add(generoInput);
		
		idiomaInput = new JTextField();
		idiomaInput.setColumns(10);
		idiomaInput.setBounds(192, 194, 239, 35);
		contentPane.add(idiomaInput);
		
		precioInput = new JTextField();
		precioInput.setColumns(10);
		precioInput.setBounds(192, 250, 239, 35);
		contentPane.add(precioInput);
		
		descripcionInput = new JTextField();
		descripcionInput.setColumns(10);
		descripcionInput.setBounds(192, 303, 453, 93);
		contentPane.add(descripcionInput);
		
		JButton insertButton = new JButton("Añadir");
		insertButton.setBounds(283, 453, 219, 34);
		contentPane.add(insertButton);
		
		JButton deleteButton = new JButton("Eliminar");
		deleteButton.setBounds(558, 453, 213, 35);
		contentPane.add(deleteButton);
		
		btnNewButton_2 = new JButton("Atr\u00E1s");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.vertodo().setVisible(true);
                dispose();
			}
		});
		btnNewButton_2.setBounds(31, 453, 197, 34);
		contentPane.add(btnNewButton_2);

		

		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idjuego = idjuegoInput.getText();
				String titulo = tituloInput.getText();
				String genero = generoInput.getText();
				String idioma = idiomaInput.getText();
				String precio = precioInput.getText();
				String descripcion = descripcionInput.getText();
				
				new controlador.Login2().insertjuego(idjuego, titulo, genero, idioma, precio, descripcion);
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idjuego = idjuegoInput.getText();
				String titulo = tituloInput.getText();
				new controlador.Login2().deletejuego(idjuego,titulo);
			}
		});
			
	}
}
