/**
 * 
 */
package persistencia;

import baseDeDatos.Autor;
import baseDeDatos.Editorial;
import baseDeDatos.Isbn;
import baseDeDatos.Libro;

/**
 * Representa una Libro Digital
 * 
 * @author David Villegas
 *@version 10/11/2016
 */
public class LibroDigital extends Libro {
	private String link;
	private int numeroVisitas;
	
	/**
	 * Contructor con todos los parametros
	 * 
	 * @param titulo
	 * @param annoEdicion
	 * @param autor
	 * @param descripcion
	 * @param editorial
	 * @param tema
	 * @param version
	 * @param cantidadTomos
	 * @param cantidadPaginas
	 * @param isbn
	 * @param idioma
	 * @param link
	 * @param numeroVisitas
	 */
	public LibroDigital(String titulo, int annoEdicion, Autor autor, String descripcion, Editorial editorial,
			String tema, int version, int cantidadTomos, int cantidadPaginas, Isbn isbn, String idioma, String link,
			int numeroVisitas) {
		super(titulo, annoEdicion, autor, descripcion, editorial, tema, version, cantidadTomos, cantidadPaginas, isbn,
				idioma);
		this.link = link;
		this.numeroVisitas = numeroVisitas;
	}
	/**
	 * Constructor sin parametros
	 */
	public LibroDigital() {
		super();
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @return the numeroVisitas
	 */
	public int getNumeroVisitas() {
		return numeroVisitas;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @param numeroVisitas the numeroVisitas to set
	 */
	public void setNumeroVisitas(int numeroVisitas) {
		this.numeroVisitas = numeroVisitas;
	}
	
	public void registroNuevaVisita(){
		
	}
	
	public String impresion(){
		return "El libro digital tiene : link: "+this.link+
				" con la cantidad de visitas :"+this.numeroVisitas;
	}
	
}
