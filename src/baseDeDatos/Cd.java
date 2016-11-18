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
		this.tema = "";
		this.issn = new Issn();
		this.duracion = new Tiempo();
		this.cantidadPistas = 0;
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
				" con el codigo "+ this.issn.impresion() + " issn "+
				" con duracion: "+ this.duracion.impresion()+
				" con "+this.cantidadPistas+" cantidad de pistas";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((issn == null) ? 0 : issn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cd other = (Cd) obj;
		if (issn == null) {
			if (other.issn != null)
				return false;
		} else if (!issn.equals(other.issn))
			return false;
		return true;
	}
	
	
}
