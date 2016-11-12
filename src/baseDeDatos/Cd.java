/**
 * 
 */
package baseDeDatos;

/**
 * representa un CD en el sistema
 * 
 * @author David Villegas
 * @version 10/11/2016
 */
public class Cd extends Publicacion {
	private String tema;
	private Issn issn;
	private Tiempo duracion; 
	private int cantidadPistas;
	
	/**
	 * Contructor con todos los parametros
	 * 
	 * @param titulo
	 * @param annoEdicion
	 * @param autor
	 * @param descripcion
	 * @param editorial
	 * @param tema
	 * @param issn
	 * @param duracion
	 * @param cantidadPistas
	 */
	public Cd(String titulo, int annoEdicion, Autor autor, String descripcion, Editorial editorial, String tema,
			Issn issn, Tiempo duracion, int cantidadPistas) {
		super(titulo, annoEdicion, autor, descripcion, editorial);
		this.tema = tema;
		this.issn = issn;
		this.duracion = duracion;
		this.cantidadPistas = cantidadPistas;
	}

	/**
	 * Contructor sin parametros
	 */
	public Cd() {
	}

	/**
	 * @return the tema
	 */
	public String getTema() {
		return tema;
	}

	/**
	 * @return the issn
	 */
	public Issn getIssn() {
		return issn;
	}

	/**
	 * @return the duracion
	 */
	public Tiempo getDuracion() {
		return duracion;
	}

	/**
	 * @return the cantidadPistas
	 */
	public int getCantidadPistas() {
		return cantidadPistas;
	}

	/**
	 * @param tema the tema to set
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}

	/**
	 * @param issn the issn to set
	 */
	public void setIssn(Issn issn) {
		this.issn = issn;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(Tiempo duracion) {
		this.duracion = duracion;
	}

	/**
	 * @param cantidadPistas the cantidadPistas to set
	 */
	public void setCantidadPistas(int cantidadPistas) {
		this.cantidadPistas = cantidadPistas;
	}
	
	public String impresion(){
		return "El CD: nombre del tema: "+this.tema+
				" con el codigo "+ this.issn+ " issn "+
				" con duracion: "+ this.duracion+
				" con "+this.cantidadPistas+" cantidad de pistas";
	}
	
	
}
