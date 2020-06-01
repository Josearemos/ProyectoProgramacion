package fondos;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel {
ImageIcon icono;
	
	public Fondo(String nombre) {
		super();
		initialize();
		icono = new ImageIcon(getClass().getResource(nombre));
		setSize(icono.getIconWidth(), icono.getIconHeight());
	}
	
	protected void paintComponent (Graphics g) {
		
		Dimension d = getSize();
		g.drawImage(icono.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		
	}

}

