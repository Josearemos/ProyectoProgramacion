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
	
	public void checkjuego(int idjuego, String titulo, String genero, String idioma, String precio, String descripcion) {
		// Recoger los usuarios
		boolean check = new modelo.juego().checkUserAndPass(idjuego, titulo, idioma, genero, precio, descripcion);
		if(check) {
			JOptionPane.showMessageDialog(null, "Juego Encontrado");
		}else { // Sino error
			JOptionPane.showMessageDialog(null, "Juego No Encontrado");
		}
	}





	
	/*public boolean checkUserOld(String user, String password) {
		// Recoger los usuarios
		ArrayList<User> usuarios = new modelo.Users().getAllUsers();
		// Comprobar si usuario y contraseña son correctos
		for(User usuario : usuarios) {
			if(user.equals(usuario.getUser()) && password.equals(usuario.getPassword())) {
				JOptionPane.showMessageDialog(null, "Usuario Correcto");
			}else { // Sino error
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}
		}
		return true; */
	}
	


