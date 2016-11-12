/**
 * 
 */
package persistencia;

import baseDeDatos.Isbn;

/**
 * La principal del Sistema Biblioteca
 * 
 * @author David Villegas
 * @version 10/11/2016 v1.0
 *
 */
public class Main {

	/**
	 * Funcion Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Isbn isbn=new Isbn("9795", "111111", "22222", "333333");
		Isbn isbn=new Isbn();
		System.out.println(isbn.impresion());

	}

}
