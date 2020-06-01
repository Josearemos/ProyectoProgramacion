package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import fondos.Fondo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class verjuegos extends JFrame {

	private JPanel contentPane;
	private JTextField tituloInput;

	
	public verjuegos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new Fondo("verfondoconsola2.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);// AVISOOOOO
		setSize(500, 550);//tamano
		setResizable(false); // Para que no se pueda cambiar tamaño
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 0, 0);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		tituloInput = new JTextField();
		tituloInput.setBounds(155, 10, 149, 23);
		panel.add(tituloInput);
		tituloInput.setColumns(10);
		
		JLabel tituloLabel = new JLabel("Título");
		tituloLabel.setBounds(115, 37, 46, 14);
		panel.add(tituloLabel);
        
        JLabel lblNewLabel = new JLabel("God Of War");
        lblNewLabel.setForeground(new Color(0, 206, 209));
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblNewLabel.setBounds(41, 13, 143, 38);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new vista.spiderman().setVisible(true);
                dispose();
        	}
        });
        btnNewButton_1.setIcon(new ImageIcon(verjuegos.class.getResource("/iconos/intent4.png")));
        btnNewButton_1.setBounds(20, 277, 138, 185);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel_1 = new JLabel("Spider-Man");
        lblNewLabel_1.setForeground(new Color(0, 206, 209));
        lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblNewLabel_1.setBounds(41, 244, 127, 23);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Dragon Quest XI");
        lblNewLabel_2.setForeground(new Color(255, 0, 0));
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblNewLabel_2.setBounds(268, 18, 203, 29);
        contentPane.add(lblNewLabel_2);
        
        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new vista.dragonquest().setVisible(true);
                dispose();
        	}
        });
        btnNewButton_2.setIcon(new ImageIcon(verjuegos.class.getResource("/iconos/intent3.png")));
        btnNewButton_2.setBounds(279, 50, 127, 184);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new vista.forza().setVisible(true);
                dispose();
        	}
        });
        btnNewButton_3.setIcon(new ImageIcon(verjuegos.class.getResource("/iconos/intent5.png")));
        btnNewButton_3.setBounds(279, 277, 127, 185);
        contentPane.add(btnNewButton_3);
        
        JLabel lblNewLabel_3 = new JLabel("Forza Horizon 4");
        lblNewLabel_3.setForeground(new Color(124, 252, 0));
        lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblNewLabel_3.setBounds(268, 244, 170, 23);
        contentPane.add(lblNewLabel_3);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new vista.godofwar().setVisible(true);
                dispose();
        	}
        });
        btnNewButton.setIcon(new ImageIcon(verjuegos.class.getResource("/iconos/intent2.png")));
        btnNewButton.setBounds(31, 49, 127, 185);
        contentPane.add(btnNewButton);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(788, 290, -77, -304);
        contentPane.add(scrollPane);
        
        JButton btnNewButton_4 = new JButton("Ver Todos");
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new vista.vertodo().setVisible(true);
                dispose();
        	}
        });
        btnNewButton_4.setBounds(161, 475, 113, 37);
        contentPane.add(btnNewButton_4);
	}
}
//modifiImage = image.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);