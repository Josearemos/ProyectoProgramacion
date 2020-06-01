package modelo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import controlador.controfactura;

public class Factura {
	public Factura() {
		
	}
	
	public static void imprimirfactura(String nombre)throws IOException{
		conexion conexion = new conexion();
		conexion.Conectar();
		ResultSet re = conexion.EjecutarSentencia("SELECT * FROM factura WHERE nombre='"+nombre+"'");
				controfactura Controlador = new controfactura();
				Controlador.controfactura(re);
		
	}
	
}

