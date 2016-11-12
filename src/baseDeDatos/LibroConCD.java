/**
 * 
 */
package baseDeDatos;

/**
 * relacion entre clases Libro y Cd
 * 
 * @author David Villegas
 * @version 10/11/2016
 *
 */
public class LibroConCD extends Libro{
	private Cd cd;

	/**
	 * Contructor con todos los parametros
	 * @param cd valor de Clase Cd
	 */
	public LibroConCD(Cd cd) {
		this.cd = cd;
	}

	/**
	 * Contructor sin parametros
	 */
	public LibroConCD() {
	}

	/**
	 * @return the cd
	 */
	public Cd getCd() {
		return cd;
	}

	/**
	 * @param cd the cd to set
	 */
	public void setCd(Cd cd) {
		this.cd = cd;
	}
	
	public String impresion(){
		return this.cd.impresion();
	}
	
	
	
	
}
