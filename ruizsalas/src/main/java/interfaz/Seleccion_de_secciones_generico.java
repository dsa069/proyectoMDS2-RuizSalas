package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Seccion;
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
	public Seccion[] sec;
	
	public Editor editor;
	
	ocl_proyecto.Seccion seccion;
	
	iEditor iEdito = new BD_Principal();
	
	public Seleccion_de_secciones_generico(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.getBarraDeBusqueda().setVisible(false);
		this.getBotonEditarSecciones().setVisible(false);
		this.getMsgError().setVisible(false);
		
		
		sec = this.cargar_secciones_generico();
		
		this.Seleccion_de_secciones_item_Estatico(sec);
		this.CEseccionesEstatico();
	}
	
	public void Seleccion_de_secciones_item_Estatico(Seccion[] sec) {
		for (int i=0; i<sec.length; i++) {
			Seleccion_de_secciones_generico_item SSGI = new Seleccion_de_secciones_generico_item(this, sec[i]);
			this.getLayoutSeccionesContenidasPeriodico().add(SSGI);
		}
	}
	
	public void CEseccionesEstatico() {
		this._crearEditarSeccionesTematicas = new Crear_Editar_Secciones_Tematicas((Editor) this.usuario);
		this.getLayoutGenericoSeccionesBanner().add(_crearEditarSeccionesTematicas);
	}
	
	public Seccion[] cargar_secciones_generico() {
		return iEdito.cargar_secciones_generico();
	}
}