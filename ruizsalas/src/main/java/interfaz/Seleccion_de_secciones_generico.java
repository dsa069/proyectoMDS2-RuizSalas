package interfaz;

import java.util.Vector;
import vistas.VistaSeleccindeseccionesgenerico;

;public class Seleccion_de_secciones_generico extends VistaSeleccindeseccionesgenerico{
//	private JLabel _editar_secciones_text;
//	public Listar_noticias _unnamed_Listar_noticias_;
	public Vector<Seleccion_de_secciones_generico_item> _item = new Vector<Seleccion_de_secciones_generico_item>();
//	public Banner_no_registrado _unnamed_Banner_no_registrado_;
	public Banner_suscrito _puede_contener;
	
	public Usuario usuario;
	public Seleccion_de_secciones_generico(Usuario usuario) {
		super();
	this.usuario = usuario;
	this.getBarraDeBusqueda().setVisible(false);
	this.getBotonEditarSecciones().setVisible(false);
		}
}