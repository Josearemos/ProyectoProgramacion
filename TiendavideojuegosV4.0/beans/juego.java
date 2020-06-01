package beans;

public class juego {
	int idjuego;
	String nombre;
	String genero;
	String cantidad;
	String precio;
	String nombredependiente;
	String idcomprador;
	
	public juego(int idjuego, String nombre, String genero, String cantidad, String nombredependiente, String precio,String idcomprador) {
		this.idjuego = idjuego;
		this.nombre = nombre;
		this.genero = genero;
		this.cantidad = cantidad;
		this.precio = precio;
		this.nombredependiente = nombredependiente;
		this.idcomprador = idcomprador;
	}

	public int getIdjuego() {
		return idjuego;
	}

	public void setIdjuego(int idjuego) {
		this.idjuego = idjuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getNombredependiente() {
		return nombredependiente;
	}

	public void setNombredependiente(String nombredependiente) {
		this.nombredependiente = nombredependiente;
	}

	public String getIdcomprador() {
		return idcomprador;
	}

	public void setIdcomprador(String idcomprador) {
		this.idcomprador = idcomprador;
	}
}
