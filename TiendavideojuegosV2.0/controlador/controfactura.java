package controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class controfactura {
	static java.util.Date fecha = new Date();
	
		public static void controfactura(ResultSet re) throws IOException{
			File a =new File("facturajuego.txt");
			FileWriter es = new FileWriter(a);
			String idjuego,nombre,cantidad,precio,iduser,nombreuser;
			
			
			try {
				while(re.next()) {
					idjuego = re.getString("idjuego");
					nombre = re.getString("nombre");
					cantidad = re.getString("cantidad");
					precio = re.getString("precio");
					iduser = re.getString("iduser");
					nombreuser = re.getString("nombreuser");
					
					es.write("IDJuego: "+idjuego+" Nombre: "+nombre+" Cantidad: "+cantidad+" Precio: "+precio+" IDUsuario: "+iduser+" Nombre Usuario: "+nombreuser+" Fecha: "+fecha);
				}
			}catch (SQLException e1) {
				e1.printStackTrace();
			}finally {
				es.close();
				Desktop fichero = Desktop.getDesktop();
				fichero.open(new File("facturajuego.txt"));
			}
			
		}
}
