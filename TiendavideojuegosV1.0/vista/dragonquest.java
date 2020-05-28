package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class dragonquest extends JFrame {

	private JPanel contentPane;
	private JTable table;
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
	public dragonquest() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/vista/icono.PNG"));
		setTitle("Dragon Quest XI");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new Fondo("dragonfondo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//CENTRO
		setSize(800, 500);//tamano
		setResizable(false); // Para que no se pueda cambiar tamaño
	
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(283, -12, 257, 191);
        icon = new ImageIcon(Login.class.getResource("/fondos/dragonlogo.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(220,150, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel1.setIcon(icon);
		contentPane.add(lblNewLabel1);
		
		
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setBounds(30, 160, 741, 40);
		contentPane.add(table);
		
		btnNewButton_1 = new JButton("Mostrar Informaci\u00F3n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "SELECT * FROM juego WHERE titulo='Dragon Quest XI'";


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
				
			}
		});
		
		btnNewButton_1.setBounds(296, 398, 189, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.factura().setVisible(true);
                dispose();
			}
		});
		btnNewButton.setBounds(541, 398, 189, 40);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Atr\u00E1s");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.verjuegos().setVisible(true);
                dispose();
			}
		});
		btnNewButton_2.setBounds(55, 398, 189, 40);
		contentPane.add(btnNewButton_2);
		
	}
}

