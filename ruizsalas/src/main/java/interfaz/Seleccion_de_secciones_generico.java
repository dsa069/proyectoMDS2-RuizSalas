package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaSelecciondeseccionesgenerico;

public class Seleccion_de_secciones_generico extends VistaSelecciondeseccionesgenerico{
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
		this.getMsgError().setVisible(false);
	}
	
	public Barra_de_busqueda buscar;
	public void barraBusqueda() {
		this.buscar = new Barra_de_busqueda(null);
		this.getBarraDeBusqueda().as(VerticalLayout.class).add(this.buscar);
	}
	
	public Mensaje_de_error msgError;
	public void Msg_De_Error() {
		this.msgError = new Mensaje_de_error(null);
		this.getMsgError().as(VerticalLayout.class).add(this.msgError);
	}
}