package interfaz;

public class Contenido_noticia_completo extends Noticia {
	
	public Registrado _registrado;
	public Contenido_noticia_completo(Registrado registrado) {
		super(registrado);
		this._registrado = registrado;
	}
}