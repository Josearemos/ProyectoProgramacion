package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.User;

public class Login {
	
	public void insertUser(String user, String password) {
		new modelo.Users().insertUser(user,password);
	}
	
	public void updateUser(String user, String password) {
		new modelo.Users().insertUser(user,password);
	}
	
	public void deleteUser(String user) {
		new modelo.Users().deleteUser(user);
	}
	
	public void checkUser(String user, String password) {
		// Recoger los usuarios
		boolean check = new modelo.Users().checkUserAndPass(user, password);
		if(check) {
			JOptionPane.showMessageDialog(null, "Usuario correcto");
			new vista.verjuegos().setVisible(true);
		}else { // Sino error
			JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		}
	}
	
	public boolean checkUserOld(String user, String password) {
		// Recoger los usuarios
		ArrayList<User> usuarios = new modelo.Users().getAllUsers();
		// Comprobar si usuario y contraseña son correctos
		for(User usuario : usuarios) {
			if(user.equals(usuario.getUser()) && password.equals(usuario.getPassword())) {
				JOptionPane.showMessageDialog(null, "Usuario correcto");
			}else { // Sino error
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}
		}
		return true;
	}
	public void factura(String idjuego, String nombre, String cantidad, String precio, String iduser, String nombreuser) {

        FileWriter escribirFactura;
        BufferedWriter buferFactura;
        PrintWriter printFactura;

        try {

            Object sql;
		//	double total = Double.parseDouble(sql.getPreciojuegoSumaTotal(titulo));

            escribirFactura = new FileWriter("/tiendajuegos/src/vista/ejemplo.txt");//URL

            buferFactura = new BufferedWriter(escribirFactura);//analiza el txt
            printFactura = new PrintWriter(escribirFactura);//imprime¿?
           escribirFactura.write("ID Juego: "+idjuego+"\n Nombre:"+nombre+"\n Cantidad:"+cantidad+"\n Precio: "+precio+"\n Id Usuario: "+iduser+"\n Nombre Usuario:"+nombreuser);
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

            FileReader leerUser = new FileReader("/tiendajuegos/src/vista/ejemplo.txt");
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

        return result;//salida metodo muestra variable result

    }


}
