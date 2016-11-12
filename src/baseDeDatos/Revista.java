/**
 * 
 */
package baseDeDatos;

/**
 * @author David Villegas
 * @version 10/11/2016 v1.0
 */
public class Revista extends Publicacion{
	private String nombre;
	private int periodicidad;
	private int cantidadEjemplares;
	private int cantidadPaginas;
	private Issn issn;
	private boolean traducida;
	
	/**
	 * Contructor con todos los parametros
	 *  
	 * @param titulo representa el titulo de la revista
	 * @param annoEdicion anno edicion de la revista
	 * @param autor persona que escribio la revista
	 * @param descripcion breve descripcion
	 * @param editorial empresa encargada de la edicion
	 * @param nombre nombre fantasia de la revista 
	 * @param periodicidad cantidad de dias que se publica 
	 * @param cantidadEjemplares total de ejemplares en circulacion
	 * @param cantidadPaginas total de paginas de la revista
	 * @param issn corresponde al titulo clave
	 * @param traducida opcion de espannol
	 */
	public Revista(String titulo, int annoEdicion, Autor autor, String descripcion, Editorial editorial, String nombre,
			int periodicidad, int cantidadEjemplares, int cantidadPaginas, Issn issn, boolean traducida) {
		super(titulo, annoEdicion, autor, descripcion, editorial);
		this.nombre = nombre;
		this.periodicidad = periodicidad;
		this.cantidadEjemplares = cantidadEjemplares;
		this.cantidadPaginas = cantidadPaginas;
		this.issn = issn;
		this.traducida = traducida;
	}

	/**
	 * Contructor Vacio
	 */
	public Revista() {
		super();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the periodicidad
	 */
	public int getPeriodicidad() {
		return periodicidad;
	}

	/**
	 * @return the cantidadEjemplares
	 */
	public int getCantidadEjemplares() {
		return cantidadEjemplares;
	}

	/**
	 * @return the cantidadPaginas
	 */
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	/**
	 * @return the issn
	 */
	public Issn getIssn() {
		return issn;
	}

	/**
	 * @return the traducida
	 */
	public boolean isTraducida() {
		return traducida;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param periodicidad the periodicidad to set
	 */
	public void setPeriodicidad(int periodicidad) {
		this.periodicidad = periodicidad;
	}

	/**
	 * @param cantidadEjemplares the cantidadEjemplares to set
	 */
	public void setCantidadEjemplares(int cantidadEjemplares) {
		this.cantidadEjemplares = cantidadEjemplares;
	}

	/**
	 * @param cantidadPaginas the cantidadPaginas to set
	 */
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	/**
	 * @param issn the issn to set
	 */
	public void setIssn(Issn issn) {
		this.issn = issn;
	}

	/**
	 * @param traducida the traducida to set
	 */
	public void setTraducida(boolean traducida) {
		this.traducida = traducida;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+
				"Revista [nombre=" + nombre + ", periodicidad=" + periodicidad + ", cantidadEjemplares="
				+ cantidadEjemplares + ", cantidadPaginas=" + cantidadPaginas + ", issn=" + issn + ", traducida="
				+ traducida + "]";
	}

	
	
	
	
}
