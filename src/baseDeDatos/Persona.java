/**
 * 
 */
package baseDeDatos;

/**
 * Clase Abstacta para los usuarios del Sistema
 * 
 * @author David Villegas
 * @version 08/11/2016 v1.0
 */
public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected String rut;
	protected int edad;
	protected String direccion;
	protected String profesion;
	protected int cantidadDeHijos;
	protected String lugarDeTrabajo;
	protected int antiguedadLaboral;
	
	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre primer y segundo nombre
	 * @param apellidos primer y segundo apellido
	 * @param rut rut con digito verificador
	 * @param edad valor debe ser ingresado en numeros
	 * @param direccion direccion personal
	 * @param profesion valor en letras
	 * @param cantidadDeHijos valor debe ser ingresado en numeros
	 * @param lugarDeTrabajo nombre de la empresa empleadora
	 * @param antiguedadLaboral cantidad de annos, valor debe ser ingresado en numeros 
	 */
	public Persona(String nombre, String apellidos, String rut, int edad, String direccion, String profesion,
			int cantidadDeHijos, String lugarDeTrabajo, int antiguedadLaboral) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rut = rut;
		this.edad = edad;
		this.direccion = direccion;
		this.profesion = profesion;
		this.cantidadDeHijos = cantidadDeHijos;
		this.lugarDeTrabajo = lugarDeTrabajo;
		this.antiguedadLaboral = antiguedadLaboral;
	}
	/**
	 * Contructor sin parametros
	 */
	public Persona() {
	}
	/**
	 * @return the nombre
	 */
	private String getNombre() {
		return nombre;
	}
	/**
	 * @return the apellidos
	 */
	private String getApellidos() {
		return apellidos;
	}
	/**
	 * @return the rut
	 */
	private String getRut() {
		return rut;
	}
	/**
	 * @return the edad
	 */
	private int getEdad() {
		return edad;
	}
	/**
	 * @return the direccion
	 */
	private String getDireccion() {
		return direccion;
	}
	/**
	 * @return the profesion
	 */
	private String getProfesion() {
		return profesion;
	}
	/**
	 * @return the cantidadDeHijos
	 */
	private int getCantidadDeHijos() {
		return cantidadDeHijos;
	}
	/**
	 * @return the lugarDeTrabajo
	 */
	private String getLugarDeTrabajo() {
		return lugarDeTrabajo;
	}
	/**
	 * @return the antiguedadLaboral
	 */
	private int getAntiguedadLaboral() {
		return antiguedadLaboral;
	}
	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @param rut the rut to set
	 */
	private void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @param edad the edad to set
	 */
	private void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @param direccion the direccion to set
	 */
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @param profesion the profesion to set
	 */
	private void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	/**
	 * @param cantidadDeHijos the cantidadDeHijos to set
	 */
	private void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}
	/**
	 * @param lugarDeTrabajo the lugarDeTrabajo to set
	 */
	private void setLugarDeTrabajo(String lugarDeTrabajo) {
		this.lugarDeTrabajo = lugarDeTrabajo;
	}
	/**
	 * @param antiguedadLaboral the antiguedadLaboral to set
	 */
	private void setAntiguedadLaboral(int antiguedadLaboral) {
		this.antiguedadLaboral = antiguedadLaboral;
	}

	/**
	 * Impresion de la Clase Persona
	 * @return String de atributos de la clase Persona
	 */
	public String impresion(){
		return "La Persona: Rut : " + this.rut +
				" nombre completo : " + this.nombre + " " + this.apellidos +
				" tiene : " + this.edad + " annos" +
				" domicilio : " + this.direccion +
				" con profesion : " + this.profesion +
				" tiene : " + this.cantidadDeHijos + " hijos" +
				" trabaja en : " + this.lugarDeTrabajo +
				" lleva trabajando : " + this.antiguedadLaboral;
	}
	
	
}
