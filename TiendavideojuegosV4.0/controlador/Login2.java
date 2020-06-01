package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import beans.User;
import beans.juego;

public class Login2 {
	public void insertjuego(String idjuego, String titulo, String genero, String idioma, String precio, String descripcion) {
		new modelo.juego().insertjuego(idjuego, titulo, genero, idioma,precio ,descripcion);
	}
	
	public void updatejuego(String titulo, String precio) {
		new modelo.juego().updatejuego(precio, titulo);
	}
	
	public void deletejuego(String idjuego, String titulo) {
		new modelo.juego().deletejuego(idjuego, titulo);
	}
	
}
	


