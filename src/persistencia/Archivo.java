/**
 * 
 */
package persistencia;

import java.util.HashMap;

import baseDeDatos.Autor;
import baseDeDatos.Editorial;
import baseDeDatos.Publicacion;

/**
 * Coleccion de Autores, Editorial y Publicaciones
 * 
 * @author David Villegas
 * @version 10/11/2016
 */
public class Archivo {
	public static HashMap<Integer, Autor> autores =new HashMap<>();
	public static HashMap<Integer, Publicacion> publicaciones=new HashMap<>();
	public static HashMap<Integer, Editorial> editorial=new HashMap<>();
	
	public void agregar(String nombreColeccion, Object elemento){
		
	}
	
	public void eliminar(String nombreColeccion, Object elemento){
		
	}
	
	public boolean consultar(Object elemento){
		return false;
	}
	
	public void print(String nombreColeccion){
		
	}
	
	public boolean prestarPublicacion(Publicacion nombre){
		return false;
	}
	
	public String imprimirPublicacion(Autor autor){
		return "";
	}
	
	
}
