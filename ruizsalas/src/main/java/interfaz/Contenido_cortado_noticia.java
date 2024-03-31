package interfaz;

public class Contenido_cortado_noticia extends Noticia{
	
	public Usuario_No_Registrado _usuario;
	public Contenido_cortado_noticia(Usuario_No_Registrado _usuario) {
		super(_usuario);
		this._usuario = _usuario;
		this.getNoticiaCompleta().setVisible(false);
		this.getSeleccionarSecciones().setVisible(false);
		this.getSeleccionarTematicas().setVisible(false);
		this.getValorarNoticia().setVisible(false);
		this.getEliminarNoticia().setVisible(false);
	}
}