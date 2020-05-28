package controlador;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class factura {
	public void factura(String idjuego, String nombre, String cantidad, String precio, String iduser, String nombreuser) {

        FileWriter escribirFactura;
        BufferedWriter buferFactura;
        PrintWriter printFactura;
        
        java.util.Date fecha = new Date();
        try {

            Object sql;
		//	double total = Double.parseDouble(sql.getPreciojuegoSumaTotal(titulo));

            escribirFactura = new FileWriter("Fichero/fichero.txt");//URL

            buferFactura = new BufferedWriter(escribirFactura);//analiza el txt
            printFactura = new PrintWriter(escribirFactura);//imprime¿?
           escribirFactura.write("ID Juego: "+idjuego+"\n Nombre:"+nombre+"\n Cantidad:"+cantidad+"\n Precio: "+precio+"\n Id Usuario: "+iduser+"\n Nombre Usuario:"+nombreuser+"\nFecha: "+fecha);
//ESCRIBE 
            escribirFactura.close();
            buferFactura.close();



        } catch (IOException e1) {
            System.out.println("No se ha podido escribir en el archivo.");
            e1.printStackTrace();
        }
    }
	public String leerfactura(boolean recuerda) {

        String result = "";

        try {

            FileReader leerUser = new FileReader("Fichero/fichero.txt");
            BufferedReader br = new BufferedReader(leerUser);



                int c=0;
                String texto = "";

                while((texto=br.readLine())!=null) {//hace que se lea
                    result+=texto+"\n";//guarda texto
                }

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");//controla el error
            e.printStackTrace();
        }

        return result;//salida metodo muestra variable resultado 


	}
}


