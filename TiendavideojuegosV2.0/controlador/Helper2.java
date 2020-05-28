package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.juego;

public class Helper2 {
	public ArrayList ResultSet3ArrayList(ResultSet resultados) {
		// Ya tengo los datos de la BBDD
		// Voy a transformarlos a objetos
		ArrayList<juego> arraylist = new ArrayList<juego>();
		try {
			while(resultados.next()) {
				int idjuego = resultados.getInt("idjuego");
				String titulo = resultados.getString("titulo");
				String genero = resultados.getString("genero");
				String idioma = resultados.getString("idioma");
				int cantidad = resultados.getInt("cantidad");
				int idcomprador = resultados.getInt("idcomprador");
				int precio = resultados.getInt("precio");
				arraylist.add(new juego(idjuego, titulo, genero, idioma,cantidad ,idcomprador, precio));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		
		return arraylist;
	}
}
