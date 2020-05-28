package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;
import fondos.Fondo;
import modelo.Factura;

public class facturaspider extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facturaspider frame = new facturaspider();
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
	public facturaspider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new Fondo("spiderfondo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//CENTRO
		setSize(800, 500);//tamano
		setResizable(false); // Para que no se pueda cambiar tamaño
	
	//tabla
			JTable table = new JTable();
			table.setFont(new Font("Arial", Font.PLAIN, 18));
			table.setBounds(59, 209, 703, 70);
			contentPane.add(table);
			//boton mostrar info
			
			
			JButton btnNewButton_1 = new JButton("Mostrar Informaci\u00F3n");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sql = "SELECT * FROM factura WHERE nombre='Spider-Man'";		//conectamos con php


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("idjuego");
	                model.addColumn("nombre");				//columnas
	                model.addColumn("cantidad");
	                model.addColumn("precio");

	                

	                table.setModel(model);

	                String[] dato = new String[4];

	                try {

	                    ResultSet result = conexion.EjecutarSentencia(sql);

	                    while (result.next()) {
	                        dato[0] = result.getString(1);
	                        dato[1] = result.getString(2);
	                        dato[2] = result.getString(3);
	                        dato[3] = result.getString(4);
	                        model.addRow(dato);
	                    }
	                }catch (SQLException e1) {
	                    e1.printStackTrace();
	                }
					
				}
			});
			
			btnNewButton_1.setBounds(586, 397, 189, 40);
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Atr\u00E1s");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new vista.spiderman().setVisible(true);
	                dispose();
				}
			});
			btnNewButton_2.setBounds(59, 397, 189, 40);
			contentPane.add(btnNewButton_2);
			
			JButton btnNewButton = new JButton("Imprimir Factura");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Factura factura = new Factura();
					try {
						Factura.imprimirfactura2();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton.setBounds(257, 300, 189, 40);
			contentPane.add(btnNewButton);
			
		}
}