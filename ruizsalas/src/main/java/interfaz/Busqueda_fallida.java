package interfaz;

public class Busqueda_fallida extends Seleccion_de_secciones {
//	private JLabel _mensaje_de_error;
//	private JLabel _icono;
	public Usuario _unnamed_Usuario_;
	
	public Busqueda_fallida(Usuario _usuario, ocl_proyecto.Usuario usuarioocl ) {
		super(_usuario, usuarioocl, null );
		this._unnamed_Usuario_ = _usuario;
		this.getMsgError().setVisible(true);
		this.getLayoutGenericoSeccionesBanner().setVisible(false);
	}
	
	public void Msg_De_Error() {
		this.msgError = new Mensaje_de_error(this._unnamed_Usuario_);
		this.getMsgError().add(this.msgError);
	}
}