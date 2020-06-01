package beans;

public class juego {
	int idjuego;
	String titulo;
	String genero;
	String idioma;
	String precio;
	String descripcion;
	
	public juego(int idjuego, String titulo, String genero, String idioma, String precio, String descripcion) {
		this.idjuego = idjuego;
		this.titulo = titulo;
		this.genero = genero;
		this.idioma = idioma;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	public juego() {}
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
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}