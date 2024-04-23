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
	public Barra_de_busqueda buscar;
	public Mensaje_de_error msgError;
	public Pagina_de_inicio pagInicio;
	public Crear_Editar_Secciones_Tematicas _crearEditarSeccionesTematicas;
	
	public Editor editor;
	
	public Seleccion_de_secciones_generico(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.getBarraDeBusqueda().setVisible(false);
		this.getBotonEditarSecciones().setVisible(false);
		this.getMsgError().setVisible(false);
		
		Seleccion_de_secciones_generico_item _item = new Seleccion_de_secciones_generico_item(this);
		this.getLayoutSeccionesContenidasPeriodico().add(_item);
		
		this.CEseccionesEstatico();
	}
	public void CEseccionesEstatico() {
		this._crearEditarSeccionesTematicas = new Crear_Editar_Secciones_Tematicas(this.editor);
		this.getLayoutGenericoSeccionesBanner().add(_crearEditarSeccionesTematicas);
	}
}