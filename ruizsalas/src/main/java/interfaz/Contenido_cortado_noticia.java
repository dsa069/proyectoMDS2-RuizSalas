package interfaz;

public class Contenido_cortado_noticia extends Noticia{
	
	public Usuario_No_Registrado _usuario;
	public Contenido_cortado_noticia(Usuario_No_Registrado _usuario) {
		super(_usuario);
		this._usuario = _usuario;
	}
}