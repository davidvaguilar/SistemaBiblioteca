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
		
		String grupoUnoCorto=grupoUno.substring(0,4);
		String grupoDosCorto=grupoDos.substring(0,3);
		
		this.grupoUno = grupoUnoCorto;
		this.grupoDos = grupoDosCorto;
		
		Integer grupoUnoInt;
		Integer grupoDosInt;
		Integer digitoGrupoUno[];
		Integer digitoGrupoDos[];
		int aux, acum = 0;
		grupoUnoInt = Integer.parseInt(grupoUnoCorto);
		grupoDosInt = Integer.parseInt(grupoDosCorto);
		digitoGrupoUno = new Integer[4];
		digitoGrupoDos = new Integer[3];
		//Separacion Digitos Grupo Uno
		for (int i = 0; i < 4; i++) {
			aux = grupoUnoInt % 10;
			grupoUnoInt = grupoUnoInt/10;
			acum = acum + aux*(i+5);
			System.out.println(aux*(i+5));
		}
		//Separacion Digito Grupo Dos
		for (int i = 0; i < 3; i++) {
			aux = grupoDosInt % 10;
			grupoDosInt=grupoDosInt/10;
			acum = acum + aux * (i+2);
			System.out.println(acum);
		}
		
		aux = acum%11;
		digitoControl=String.valueOf(11 - aux);
		
		
	}
	/**
	 * Contructor sin parametros
	 */
	public Issn() {
		this.grupoUno="0000";
		this.grupoDos="000";
		this.digitoControl="0";
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
				" - " + this.grupoDos + this.digitoControl;
	}
	
	
}
