package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.User;
import beans.juego;

public class Login2 {
	public void insertjuego(String idjuego, String titulo, String genero, String idioma, String cantidad, String idcomprador) {
		new modelo.juego().insertjuego(idjuego, titulo, genero, idioma,cantidad ,idcomprador);
	}
	
	public void updatejuego(String idjuego, String titulo ) {
		new modelo.juego().updatejuego(idjuego,titulo);
	}
	
	public void deletejuego(String titulo) {
		new modelo.juego().deletejuego(titulo);
	}
	
	public void checkjuego(String idjuego, String titulo, String idioma, String genero, String cantidad, String idcomprador) {
		// Recoger los usuarios
		boolean check = new modelo.juego().checkUserAndPass(idjuego, titulo, idioma, genero, cantidad, idcomprador);
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
	


