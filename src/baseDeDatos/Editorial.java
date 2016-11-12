/**
 * 
 */
package baseDeDatos;

/**
 * Representa una empresa Editorial en el Sistema
 * 
 * @author David Villegas
 * @version 08/11/2016 v1.0
 */
public class Editorial {
	private String nombre;
	private int annoCreacion;
	private String representateLegal;
	private int codigo;
	private String paisSede;
	
	/**
	 * Contructor con todos los parametros
	 * 
	 * @param nombre nombre fantasia de la empresa Editorial
	 * @param annoCreacion fecha de inaguracion
	 * @param representateLegal persona responsable de la empresa
	 * @param codigo codigo interno de la Editorial
	 * @param paisSede Lugar o ubicacion
	 */
	public Editorial(String nombre, int annoCreacion, String representateLegal, int codigo, String paisSede) {
		this.nombre = nombre;
		this.annoCreacion = annoCreacion;
		this.representateLegal = representateLegal;
		this.codigo = codigo;
		this.paisSede = paisSede;
	}
	/**
	 * Constructor sin parametros
	 */
	public Editorial() {
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the annoCreacion
	 */
	public int getAnnoCreacion() {
		return annoCreacion;
	}
	/**
	 * @return the representateLegal
	 */
	public String getRepresentateLegal() {
		return representateLegal;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @return the paisSede
	 */
	public String getPaisSede() {
		return paisSede;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param annoCreacion the annoCreacion to set
	 */
	public void setAnnoCreacion(int annoCreacion) {
		this.annoCreacion = annoCreacion;
	}
	/**
	 * @param representateLegal the representateLegal to set
	 */
	public void setRepresentateLegal(String representateLegal) {
		this.representateLegal = representateLegal;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @param paisSede the paisSede to set
	 */
	public void setPaisSede(String paisSede) {
		this.paisSede = paisSede;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", annoCreacion=" + annoCreacion + ", representateLegal="
				+ representateLegal + ", codigo=" + codigo + ", paisSede=" + paisSede + "]";
	}
	
	
}
