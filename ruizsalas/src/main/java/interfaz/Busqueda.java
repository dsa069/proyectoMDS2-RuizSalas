package interfaz;

public class Busqueda extends Listar_noticias {
	public Usuario _unnamed_Usuario_;

	public Busqueda(Usuario _usuario, ocl_proyecto.Noticia[] notice, ocl_proyecto.Usuario usuario) {
		super(_usuario, usuario, null);
		this._unnamed_Usuario_ = _usuario;

		this.Noticia_item(notice);
	}
}