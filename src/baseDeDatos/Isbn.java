/**
 * 
 */
package baseDeDatos;

/**
 * Sistema Internacional de enumeracion para producciones 
 * editoriales
 * 
 * @author David Villegas
 * @version 08/11/2016 v1.0
 */
public final class Isbn {
	private String eanInternacional;
	private String paisOrigen;
	private String idEditor;
	private String idTitulo;
	private String verificador;
	
	/**
	 * Contructor con cuatro parametros sin verificador
	 * 
	 * @param eanInternacional solo puede tomar codigo 978 y 979
	 * @param paisOrigen identificacion del Pais
	 * @param idEditor identificacion de la Editorial
	 * @param idTitulo identifica una editorial concreta de una publicacion
	 */
	public Isbn(String eanInternacional, String paisOrigen, String idEditor, String idTitulo) {

		String eanIntCorto = eanInternacional.substring(0, 3);
		String paisOrigenCorto;
		String idEditorCorto;
		String idTituloCorto;
		Integer aux;
		int acum=0;
		
		int paisOrigenInt, idEditorInt, idTituloInt;
		if(eanIntCorto.equals("978")||eanIntCorto.equals("979")){
			this.eanInternacional = eanIntCorto;
		}else{
			this.eanInternacional = "978";
		}
		//Contando largo 4 Pais Origen
		paisOrigenCorto= paisOrigen.substring(0, 4);
		this.paisOrigen = paisOrigenCorto;
		// Cortando Largo Id Editor
		idEditorCorto=idEditor.substring(0,2);
		this.idEditor = idEditorCorto;
		// Id Titulo largo 3
		idTituloCorto=idTitulo.substring(0,3);
		this.idTitulo = idTituloCorto;
		//Sacamos digito Verificador
		
		paisOrigenInt = Integer.parseInt(paisOrigen);
		idEditorInt = Integer.parseInt(idEditor);
		idTituloInt = Integer.parseInt(idTitulo);
		
		for (int i = 0; i < 4; i++) {
			aux =  paisOrigenInt % 10;
			paisOrigenInt=paisOrigenInt / 10;
			acum = acum + aux * (4-i);
		}
		
		for (int i = 0; i < 2; i++) {
			aux=  idEditorInt % 10;
			idEditorInt = idEditorInt / 10;
			acum = acum + aux * (6-i);
		}
		
		for (int i = 0; i < 3; i++) {
			aux =  idTituloInt % 10;
			idTituloInt = idTituloInt / 10;
			acum = acum + aux * (9-i);
		}
		
		if(acum % 11 == 10){
			this.verificador = "X";
		}else{
			this.verificador = String.valueOf(acum % 11);
		}
	
	}
	/**
	 * Contructor Vacio
	 */
	public Isbn() {
		this.eanInternacional="979";
		this.paisOrigen="0000";
		this.idEditor="00";
		this.idTitulo="000";
		this.verificador="0";
	}
	/**
	 * @return the eanInternacional
	 */
	public String getEanInternacional() {
		return eanInternacional;
	}
	/**
	 * @return the paisOrigen
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}
	/**
	 * @return the idEditor
	 */
	public String getIdEditor() {
		return idEditor;
	}
	/**
	 * @return the idTitulo
	 */
	public String getIdTitulo() {
		return idTitulo;
	}
	/**
	 * @return the verificador
	 */
	public String getVerificador() {
		return verificador;
	}
	/**
	 * @param eanInternacional the eanInternacional to set
	 */
	private void setEanInternacional(String eanInternacional) {
		this.eanInternacional = eanInternacional;
	}
	/**
	 * @param paisOrigen the paisOrigen to set
	 */
	private void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	/**
	 * @param idEditor the idEditor to set
	 */
	private void setIdEditor(String idEditor) {
		this.idEditor = idEditor;
	}
	/**
	 * @param idTitulo the idTitulo to set
	 */
	private void setIdTitulo(String idTitulo) {
		this.idTitulo = idTitulo;
	}
	/**
	 * @param verificador the verificador to set
	 */
	private void setVerificador(String verificador) {
		this.verificador = verificador;
	}
	
	/**
	 * Impresion de la Clase
	 * 
	 * @return Codigo Isbn
	 */
	public String impresion(){
		return "ISBN - " + this.eanInternacional+
				" - " + this.paisOrigen+
				" - " + this.idEditor+
				" - " + this.idTitulo+
				" - " + this.verificador;
	}
	
	
	
}
