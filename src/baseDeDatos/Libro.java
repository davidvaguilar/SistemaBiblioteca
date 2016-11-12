/**
 * 
 */
package baseDeDatos;

/**
 * representa a los libros en el sistema
 * 
 * @author David Villegas
 *@version 08/11/2016 v1.0
 */
public class Libro extends Publicacion{
	protected String tema;
	protected int version;
	protected int cantidadTomos;
	protected int cantidadPaginas;
	protected Isbn isbn;
	protected String idioma;
	
	/**
	 * Constructor con todos los parametros
	 * 
	 * @param titulo valor titulo del libro
	 * @param annoEdicion año de edicion
	 * @param autor objeto Autor del Libro
	 * @param descripcion comentarios del libro
	 * @param editorial empresa responsable de la edicion del libro
	 * @param tema realacionada al libro
	 * @param version version del libro
	 * @param cantidadTomos valor numerico de la cantidad de tomos del libro
	 * @param cantidadPaginas valor numerico de la cantidad de paginas del libro
	 * @param isbn codigo unico para el libro
	 * @param idioma idioma publicado del libro
	 */
	public Libro(String titulo, int annoEdicion, Autor autor, String descripcion, Editorial editorial, String tema,
			int version, int cantidadTomos, int cantidadPaginas, Isbn isbn, String idioma) {
		super(titulo, annoEdicion, autor, descripcion, editorial);
		this.tema = tema;
		this.version = version;
		this.cantidadTomos = cantidadTomos;
		this.cantidadPaginas = cantidadPaginas;
		this.isbn = isbn;
		this.idioma = idioma;
	}
	/**
	 * Constructor sin parametros
	 */
	public Libro() {
		super();
	}
	/**
	 * @return the tema
	 */
	public String getTema() {
		return tema;
	}
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @return the cantidadTomos
	 */
	public int getCantidadTomos() {
		return cantidadTomos;
	}
	/**
	 * @return the cantidadPaginas
	 */
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	/**
	 * @return the isbn
	 */
	public Isbn getIsbn() {
		return isbn;
	}
	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}
	/**
	 * @param tema the tema to set
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @param cantidadTomos the cantidadTomos to set
	 */
	public void setCantidadTomos(int cantidadTomos) {
		this.cantidadTomos = cantidadTomos;
	}
	/**
	 * @param cantidadPaginas the cantidadPaginas to set
	 */
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}
	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+
				"Libro [tema=" + tema + ", version=" + version + ", cantidadTomos=" + cantidadTomos
				+ ", cantidadPaginas=" + cantidadPaginas + ", isbn=" + isbn + ", idioma=" + idioma + "]";
	}
	
	
	
	
	
}
