package interfaz;

public class Busqueda extends Listar_noticias {
	public Usuario _unnamed_Usuario_;
	public  Barra_de_busqueda BBQ;

	public Busqueda(Usuario _usuario, ocl_proyecto.Noticia[] notice, Barra_de_busqueda BBQ, ocl_proyecto.Usuario user) {
		super(_usuario, user, null);
		this._unnamed_Usuario_ = _usuario;
		this.BBQ = BBQ;

		this.filtro_noticias(notice, this, 0);
	}
}