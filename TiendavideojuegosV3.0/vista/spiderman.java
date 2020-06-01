package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;
import fondos.Fondo;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class spiderman extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JButton btnNewButton_1;
	private ImageIcon icon;
    private Image image;
    private Image modifiImage;
    private JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					godofwar frame = new godofwar();
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
	public spiderman() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(spiderman.class.getResource("/vista/icono.PNG")));
		setTitle("Spider-Man");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new Fondo("spiderfondo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//CENTRO
		setSize(800, 500);//tamano
		setResizable(false); // Para que no se pueda cambiar tamaño
	
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(273, 10, 225, 129);
        icon = new ImageIcon(Login.class.getResource("/fondos/spiderlogo.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(200,100, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel1.setIcon(icon);
		contentPane.add(lblNewLabel1);
		
		table_1 = new JTable();
		table_1.setToolTipText("");
		table_1.setFont(new Font("Arial", Font.PLAIN, 18));
		table_1.setBounds(182, 229, 464, 130);
		contentPane.add(table_1);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 18));
		table.setBounds(112, 160, 606, 40);
		contentPane.add(table);
		
		btnNewButton_1 = new JButton("Mostrar Informaci\u00F3n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "SELECT * FROM juego WHERE titulo='Spider-Man'";


                DefaultTableModel model = new DefaultTableModel();

                model.addColumn("idjuego");
                model.addColumn("titulo");
                model.addColumn("genero");
                model.addColumn("idioma");
                model.addColumn("precio");

                

                table.setModel(model);

                String[] dato = new String[6];

                try {

                    ResultSet result = conexion.EjecutarSentencia(sql);

                    while (result.next()) {
                        dato[0] = result.getString(1);
                        dato[1] = result.getString(2);
                        dato[2] = result.getString(3);
                        dato[3] = result.getString(4);
                        dato[4] = result.getString(5);
                        model.addRow(dato);
                    }
                }catch (SQLException e1) {
                    e1.printStackTrace();
                }
                String sql1 = "SELECT descripcion FROM juego WHERE titulo = 'Spider-Man'";		//conectamos con php


                DefaultTableModel model1 = new DefaultTableModel();

                 
                model1.addColumn("descripcion");
                  

              table_1.setModel(model1);

               String[] dato1 = new String[1];

              try {

                  ResultSet result = conexion.EjecutarSentencia(sql1);

                   while (result.next()) {
                  	 	dato1[0] = result.getString(1);

                          model1.addRow(dato1);
                     }
                 }catch (SQLException e1) {
                     e1.printStackTrace();
                  }
  			}
  		});

		
		btnNewButton_1.setBounds(309, 398, 189, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.facturaspider().setVisible(true);
                dispose();
			}
		});
		
		
		btnNewButton.setBounds(553, 398, 189, 40);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Atr\u00E1s");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.verjuegos().setVisible(true);
                dispose();
			
			}
		});
		btnNewButton_2.setBounds(54, 398, 189, 40);
		contentPane.add(btnNewButton_2);
	}
}

