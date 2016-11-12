/**
 * 
 */
package baseDeDatos;

/**
 * Codigo asignado secuencialmente independiente del pais de origen, 
 * de la lengua, etc.
 * 
 * @author David Villegas
 * @version 08/11/2016 v1.0
 *
 */
public final class Issn {
	private String grupoUno;
	private String grupoDos;
	private String digitoControl;
	
	/**
	 * Contructor con dos parametros sin parametro digito Control
	 * 
	 * @param grupoUno digitos grupoUno
	 * @param grupoDos digitos grupoDos
	 */
	public Issn(String grupoUno, String grupoDos) {
		this.grupoUno = grupoUno;
		this.grupoDos = grupoDos;
	}
	/**
	 * Contructor sin parametros
	 */
	public Issn() {
	}
	/**
	 * @return the grupoUno
	 */
	public String getGrupoUno() {
		return grupoUno;
	}
	/**
	 * @return the grupoDos
	 */
	public String getGrupoDos() {
		return grupoDos;
	}
	/**
	 * @return the digitoControl
	 */
	public String getDigitoControl() {
		return digitoControl;
	}
	
	/**
	 * @param grupoUno the grupoUno to set
	 */
	private void setGrupoUno(String grupoUno) {
		this.grupoUno = grupoUno;
	}
	/**
	 * @param grupoDos the grupoDos to set
	 */
	private void setGrupoDos(String grupoDos) {
		this.grupoDos = grupoDos;
	}
	/**
	 * @param digitoControl the digitoControl to set
	 */
	private void setDigitoControl(String digitoControl) {
		this.digitoControl = digitoControl;
	}
	
	/**
	 * Impresion de la Clase Issn
	 * 
	 * @return Codigo Issn
	 */
	public String impresion(){
		return "ISSN - " + this.grupoUno+
				" - " + this.grupoDos+
				" - " + this.digitoControl;
	}
	
	
}
