package vista;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class anadirjuego extends JFrame {

	private JPanel contentPane;
	private JTextField idjuegoInput;
	private JTextField tituloInput;
	private JTextField generoInput;
	private JTextField idiomaInput;
	private JTextField cantidadInput;
	private JTextField idcomprador;
	
	public anadirjuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		idjuegoInput = new JTextField();
		idjuegoInput.setBounds(131, 43, 149, 23);
		panel.add(idjuegoInput);
		idjuegoInput.setColumns(10);
		
		tituloInput = new JTextField();
		tituloInput.setBounds(131, 10, 149, 23);
		panel.add(tituloInput);
		tituloInput.setColumns(10);
		
		generoInput = new JTextField();
		generoInput.setBounds(131, 79, 149, 23);
		panel.add(generoInput);
		generoInput.setColumns(10);
		
		idiomaInput = new JTextField();
		idiomaInput.setBounds(131, 112, 152, 23);
		panel.add(idiomaInput);
		idiomaInput.setColumns(10);
		
		cantidadInput = new JTextField();
		cantidadInput.setBounds(131, 145, 149, 23);
		panel.add(cantidadInput);
		cantidadInput.setColumns(10);
		
		idcomprador = new JTextField();
		idcomprador.setBounds(131, 178, 149, 20);
		panel.add(idcomprador);
		idcomprador.setColumns(10);
		
		JLabel idjuegoLabel = new JLabel("ID Del Juego");
		idjuegoLabel.setBounds(10, 14, 88, 14);
		panel.add(idjuegoLabel);
		
		JLabel tituloLabel = new JLabel("Título");
		tituloLabel.setBounds(10, 52, 60, 14);
		panel.add(tituloLabel);
		
		JLabel generoLabel = new JLabel("Género");
		generoLabel.setBounds(10, 83, 60, 14);
		panel.add(generoLabel);
		
		JLabel idiomaLabel = new JLabel("Idioma");
		idiomaLabel.setBounds(10, 149, 42, 14);
		panel.add(idiomaLabel);
		
		JLabel cantidadLabel = new JLabel("Cantidad");
		cantidadLabel.setBounds(10, 112, 46, 14);
		panel.add(cantidadLabel);
		
		JLabel idcompradorLabel = new JLabel("ID De Comprador");
		idcompradorLabel.setBounds(10, 184, 86, 14);
		panel.add(idcompradorLabel);
		
		JButton insertButton = new JButton("Añadir");
		insertButton.setBounds(10, 220, 89, 23);
		panel.add(insertButton);
		
		JButton loginButton = new JButton("Buscar");
		loginButton.setBounds(115, 220, 89, 23);
		panel.add(loginButton);
		
		JButton updateButton = new JButton("Actualizar");
		updateButton.setBounds(214, 220, 101, 23);
		panel.add(updateButton);
		
		JButton deleteButton = new JButton("Eliminar");
		deleteButton.setBounds(327, 220, 89, 23);
		panel.add(deleteButton);
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador
				String idjuego = idjuegoInput.getText();
				String  titulo = tituloInput.getText();
				String  genero = tituloInput.getText();
				String  idioma = tituloInput.getText();
				String  cantidad = tituloInput.getText();
				String  idcomprador = tituloInput.getText();
				new controlador.Login2().checkjuego(idjuego, titulo, idioma, genero, cantidad, idcomprador);
			}
		});
		
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idjuego = idjuegoInput.getText();
				String  titulo = tituloInput.getText();
				String  genero = tituloInput.getText();
				String  idioma = tituloInput.getText();
				String  cantidad = tituloInput.getText();
				String  idcomprador = tituloInput.getText();
				new controlador.Login2().insertjuego(idjuego, titulo, idioma, genero, cantidad, idcomprador);
			}
		});
		
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String idjuego = idjuegoInput.getText();
					String titulo = tituloInput.getText();
					new controlador.Login2().updatejuego(idjuego, titulo);
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titulo = tituloInput.getText();
				new controlador.Login2().deletejuego(titulo);
			}
		});
	}
}