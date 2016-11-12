/**
 * 
 */
package baseDeDatos;

/**
 * Clase identifica a los autores en el Sistema
 * 
 * @author David Villegas
 * @version 08/11/2016 v1.0
 *
 */
public class Autor extends Persona{
	private String nacionalidad;
	private boolean casado;
	
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
	 * @param nacionalidad valor debe ser ingresado en letras
	 * @param casado valor debe ser ingresado true o false
	 */
	public Autor(String nombre, String apellidos, String rut, int edad, String direccion, String profesion,
			int cantidadDeHijos, String lugarDeTrabajo, int antiguedadLaboral, String nacionalidad, boolean casado) {
		super(nombre, apellidos, rut, edad, direccion, profesion, cantidadDeHijos, lugarDeTrabajo, antiguedadLaboral);
		this.nacionalidad = nacionalidad;
		this.casado = casado;
	}
	/**
	 * Constructor sin parametros
	 */
	public Autor() {
		super();
	}
	/**
	 * @return the nacionalidad
	 */
	private String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @return the casado
	 */
	private boolean isCasado() {
		return casado;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	private void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @param casado the casado to set
	 */
	private void setCasado(boolean casado) {
		this.casado = casado;
	}
	/* (non-Javadoc)
	 * @see baseDeDatos.Persona#impresion()
	 */
	@Override
	public String impresion() {
		String msj;
		msj = super.impresion()+
				"El Autor, tiene la nacionalidad : "+this.nacionalidad;
		if (casado) {
			msj = msj + " esta casado";
		}else{
			msj = msj + " no esta casado";
		}
		return msj;
				
	}
	
	
	
}
