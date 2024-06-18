package interfaz;

public class Busqueda_fallida extends Seleccion_de_secciones {
	public Usuario _unnamed_Usuario_;

	public Busqueda_fallida(Usuario _usuario) {
		super(_usuario, null, null );
		this._unnamed_Usuario_ = _usuario;
		this.getMsgError().setVisible(true);
		this.getLayoutGenericoSeccionesBanner().setVisible(false);
		this.getLayoutBannerSeccionesBusqueda().setVisible(false);

		//ESTATICO MSG ERROR
		this.msgError = new Mensaje_de_error(this._unnamed_Usuario_);
		this.getMsgError().add(this.msgError);
	}
}