/**
 * 
 */
package baseDeDatos;

/**
 * Clase Tiempo representacion de tiempo en minutos y segundos
 * 
 * @author David Villegas
 * @version 10/11/2016 v1.0
 *
 */

public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;
	private String displayTiempo;
	
	/**
	 * Contructor con todos los parametros
	 * 
	 * @param horas valores de 0 a 24
	 * @param minutos valores de 0 a 59
	 * @param segundos valores de 0 a 59
	 * @param displayTiempo 
	 */
	public Tiempo(int horas, int minutos, int segundos, String displayTiempo) {
		this.horas = horas;
		if(minutos >= 0 && minutos <= 59){
			this.minutos = minutos;
		}else{
			this.minutos = 0;
		}
		if(segundos >=0 && segundos <=59){
			this.segundos = segundos;
		}else{
			this.segundos = 0;
		}
		this.displayTiempo = displayTiempo;
	}

	/**
	 * Contructor sin parametros
	 */
	public Tiempo() {
		this.horas=0;
		this.minutos=0;
		this.segundos=0;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @return the displayTiempo
	 */
	public String getDisplayTiempo() {
		return displayTiempo;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	/**
	 * @param displayTiempo the displayTiempo to set
	 */
	public void setDisplayTiempo(String displayTiempo) {
		this.displayTiempo = displayTiempo;
	}
	
	public int totalMinutos(){
		Integer totalmin = 0;
		totalmin = this.horas * 60;
		totalmin = totalmin + this.minutos;
		return totalmin;
	}
	
	public int totalSegundos(){
		int totalseg = 0;
		totalseg = this.horas * 60 * 60;
		totalseg = totalseg + this.minutos * 60;
		totalseg = totalseg + this.segundos;
		return totalseg;
	}
	
	public String impresion(){
		return "El Tiempo: "+this.horas+
				" : "+this.minutos+ 
				" : "+this.segundos;
	}
	
}
