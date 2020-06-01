package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fondos.Fondo;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField passwordInput;
	private JTextField userInput;
	private ImageIcon icon;
    private Image image;
    private Image modifiImage;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/vista/icono.PNG")));
		setTitle("COMEBACK");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new Fondo("fondo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//CENTRO
		setSize(800, 500);//tamano
		setResizable(false); // Para que no se pueda cambiar tamaño
		
		passwordInput = new JTextField();
		passwordInput.setBounds(243, 225, 239, 35);
		contentPane.add(passwordInput);
		passwordInput.setColumns(10);
		
		userInput = new JPasswordField();
		userInput.setColumns(10);
		userInput.setBounds(243, 295, 239, 35);
		contentPane.add(userInput);
		
		
		JLabel userLabel = new JLabel("Usuario");
		userLabel.setBackground(Color.BLUE);
		userLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		userLabel.setForeground(new Color(255, 255, 0));
		userLabel.setBounds(105, 233, 89, 14);
		contentPane.add(userLabel);
		
		JLabel passwordLabel = new JLabel("Contrase\u00F1a");
		passwordLabel.setBackground(Color.BLACK);
		passwordLabel.setForeground(new Color(255, 255, 0));
		passwordLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		passwordLabel.setBounds(105, 303, 116, 14);
		contentPane.add(passwordLabel);
		
		JButton insertButton = new JButton("Insertar");
		insertButton.setBounds(43, 392, 140, 35);
		contentPane.add(insertButton);
		
		JButton loginButton = new JButton("Entrar");
		loginButton.setBounds(214, 392, 140, 35);
		contentPane.add(loginButton);
		
		JButton updateButton = new JButton("Actualizar");
		updateButton.setBounds(393, 392, 116, 35);
		contentPane.add(updateButton);
		
		JButton deleteButton = new JButton("Eliminar");
		deleteButton.setBounds(580, 392, 116, 35);
		contentPane.add(deleteButton);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(290, 10, 200, 184);
        icon = new ImageIcon(Login.class.getResource("/vista/icono.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(200,200, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel1.setIcon(icon);
		contentPane.add(lblNewLabel1);
		
	
		
		
       
        
        
		
		// Acciones
		
		loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Llamar al controlador
                String user = userInput.getText();
                String password = passwordInput.getText();
                new controlador.Login().checkUser(user, password);
                dispose();

            }


        });
		
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().insertUser(user, password);
			}
		});
		
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String user = userInput.getText();
					String password = passwordInput.getText();
					new controlador.Login().updateUser(user, password);
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				new controlador.Login().deleteUser(user);
			}
		});
	}
}
