package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;

public class juego {
	public ArrayList<juego> getAlljuego() {
		ResultSet resultados = conexion.EjecutarSentencia("SELECT * FROM juego");
		ArrayList<juego> juego = new controlador.Helper2().ResultSet3ArrayList(resultados);
		return juego;
	}
	
	public boolean checkUserAndPass(int idjuego, String titulo) {
		ResultSet usuarioBD = conexion.EjecutarSentencia("SELECT * FROM juego WHERE idjuego='"+idjuego+"' AND titulo='"+titulo+"'");
		
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void insertjuego(String idjuego, String titulo, String genero, String idioma, String precio,String descripcion) {
		conexion.EjecutarUpdate("INSERT INTO juego (idjuego, titulo, genero, idioma,precio ,descripcion) VALUES ('"+idjuego+"', '"+titulo+"','"+genero+"','"+idioma+"','"+precio+"','"+descripcion+"');");
		// TODO Auto-generated method stub
		
	}
	
	public void updatejuego(String titulo, String precio) {
		conexion.EjecutarUpdate("UPDATE juego SET precio='"+precio+"' WHERE titulo='"+titulo+"'");
	}
	
	public void deletejuego(String idjuego, String titulo) {
		conexion.EjecutarUpdate("DELETE FROM juego WHERE titulo = '"+titulo+"';");
	}

	public boolean checkUserAndPass(int idjuego, String titulo, String idioma, String genero, String precio,String descripcion) {
			ResultSet usuarioBD = conexion.EjecutarSentencia("SELECT * FROM juego WHERE idjuego='"+idjuego+"' AND titulo='"+titulo+"'");
		
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}


	
}


	


