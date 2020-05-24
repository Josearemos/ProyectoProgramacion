package beans;

public class juego {
	int idjuego;
	String titulo;
	String genero;
	String idioma;
	int cantidad;
	int idcomprador;
	int precio;
	
	public juego() {}
	public juego(int idjuego, String titulo, String genero, String idioma, int cantidad, int idcomprador, int precio) {
		this.idjuego = idjuego;
		this.titulo = titulo;
		this.genero = genero;
		this.idioma = idioma;
		this.cantidad = cantidad;
		this.idcomprador = idcomprador;
		this.precio = precio;
		
	}
	public int getIdjuego() {
		return idjuego;
	}
	public void setIdjuego(int idjuego) {
		this.idjuego = idjuego;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdcomprador() {
		return idcomprador;
	}
	public void setIdcomprador(int idcomprador) {
		this.idcomprador = idcomprador;
	}
	public int getprecio() {
		return precio;
	}
	public void setprecio(int precio) {
		this.precio = precio;
	}
}
