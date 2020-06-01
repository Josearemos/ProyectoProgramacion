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
	
	public static void imprimirfactura()throws IOException{
		conexion conexion = new conexion();
		conexion.Conectar();
		ResultSet re = conexion.EjecutarSentencia("SELECT * FROM factura WHERE nombre='God Of War'");
				controfactura Controlador = new controfactura();
				Controlador.controfactura(re);
		
	}
	public static void imprimirfactura2()throws IOException{
		conexion conexion = new conexion();
		conexion.Conectar();
		ResultSet re = conexion.EjecutarSentencia("SELECT * FROM factura WHERE nombre='Spider-Man'");
				controfactura Controlador = new controfactura();
				Controlador.controfactura(re);
		
	}
	public static void imprimirfactura3()throws IOException{
		conexion conexion = new conexion();
		conexion.Conectar();
		ResultSet re = conexion.EjecutarSentencia("SELECT * FROM factura WHERE nombre='Forza Horizon 4'");
				controfactura Controlador = new controfactura();
				Controlador.controfactura(re);
		
	}
	public static void imprimirfactura4()throws IOException{
		conexion conexion = new conexion();
		conexion.Conectar();
		ResultSet re = conexion.EjecutarSentencia("SELECT * FROM factura WHERE nombre='Dragon Quest XI'");
				controfactura Controlador = new controfactura();
				Controlador.controfactura(re);
		
	}
}

