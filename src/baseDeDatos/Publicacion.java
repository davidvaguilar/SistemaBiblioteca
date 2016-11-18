/**
 * 
 */
package baseDeDatos;

/**
 * @author David Villegas
 * @version 08/11/2016 v1.0
 */
public abstract class Publicacion {
	protected String titulo;
	protected int annoEdicion;
	protected Autor autor;
	protected int codigoInterno;
	public static int siguienteCodigoDisponible = 1;
	protected String descripcion;
	protected Editorial editorial;
	
	/**
	 * Constructor con todos los parametros excepto codigoInterno 
	 * y siguienteCodigoDisponible
	 * 
	 * @param titulo titulo de la publicacion
	 * @param annoEdicion anno de edicion de la publicacion
	 * @param autor 
	 * @param descripcion
	 * @param editorial
	 */
	public Publicacion(String titulo, int annoEdicion, Autor autor, String descripcion, Editorial editorial) {
		this.titulo = titulo;
		this.annoEdicion = annoEdicion;
		this.autor = autor;
		this.descripcion = descripcion;
		this.editorial = editorial;
		this.setCodigoInterno(this.getSiguienteCodigoDisponible());
		
	}
	/**
	 * Constructor sin parametros
	 */
	public Publicacion() {
		this.titulo = "sin titulo";
		this.annoEdicion = 1900;
		this.autor = new Autor();
		this.descripcion = "";
		this.editorial=new Editorial();
		this.setCodigoInterno(this.getSiguienteCodigoDisponible());
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @return the annoEdicion
	 */
	public int getAnnoEdicion() {
		return annoEdicion;
	}
	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}
	/**
	 * @return the codigoInterno
	 */
	public int getCodigoInterno() {
		return codigoInterno;
	}
	/**
	 * @return the siguienteCodigoDisponible
	 */
	public static int getSiguienteCodigoDisponible() {
		return siguienteCodigoDisponible;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @return the editorial
	 */
	public Editorial getEditorial() {
		return editorial;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @param annoEdicion the annoEdicion to set
	 */
	public void setAnnoEdicion(int annoEdicion) {
		this.annoEdicion = annoEdicion;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	/**
	 * @param codigoInterno the codigoInterno to set
	 */
	public void setCodigoInterno(int codigoInterno) {
		this.codigoInterno = codigoInterno;
		this.siguienteCodigoDisponible = codigoInterno + 1;
	}
	/**
	 * @param siguienteCodigoDisponible the siguienteCodigoDisponible to set
	 */
	public static void setSiguienteCodigoDisponible(int siguienteCodigoDisponible) {
		Publicacion.siguienteCodigoDisponible = siguienteCodigoDisponible;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", annoEdicion=" + annoEdicion + ", autor=" + autor.impresion()
				+ ", codigoInterno=" + codigoInterno + ", descripcion=" + descripcion + ", editorial=" + editorial
				+ "]";
	}
	
	
	
	
}
