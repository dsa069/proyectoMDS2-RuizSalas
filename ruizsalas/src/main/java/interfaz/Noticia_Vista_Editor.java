package interfaz;

//import UCL Proyecto.Eliminar_noticia;

public class Noticia_Vista_Editor extends Noticia_completa {
	//public Editor _unnamed_Editor_;
	//public Lista_Secciones_noticia _contiene;
	//public Eliminar_noticia _contiene_la_opcion_de;
	
	public Registrado _registrado;
	public Noticia_Vista_Editor(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
	}
}