package interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BD_Principal;
import basededatos.iEditor;
import basededatos.iUsuario;
import ocl_proyecto.Noticia;
import ocl_proyecto.Seccion;
import vistas.VistaSelecciondeseccionesgenerico;

public class Seleccion_de_secciones_generico extends VistaSelecciondeseccionesgenerico{
	public Usuario usuario;
	public Barra_de_busqueda buscar;
	public Mensaje_de_error msgError;
	public Pagina_de_inicio pagInicio;
	public Crear_Editar_Secciones_Tematicas _crearEditarSeccionesTematicas;
	public Seleccion_de_secciones_Vista_Editor SESVE;
	public Seccion[] sec;
	iEditor iUsuario = new BD_Principal();
	
	public Seleccion_de_secciones_generico(Usuario usuario, Seleccion_de_secciones_Vista_Editor SESVE) {
		super();
		this.usuario = usuario;
		this.SESVE=SESVE;
		this.getBarraDeBusqueda().setVisible(false);
		this.getBotonEditarSecciones().setVisible(false);
		this.getMsgError().setVisible(false);
		this.Seleccion_de_secciones_item_Estatico();
		this.CEseccionesEstatico();
	}
	
	public void Seleccion_de_secciones_item_Estatico() {
		sec = this.cargar_secciones();
		for (int i=0; i<sec.length; i++) {
			Seleccion_de_secciones_generico_item SSGI = new Seleccion_de_secciones_generico_item(this, sec[i]);
			this.getLayoutSeccionesContenidasPeriodico().add(SSGI);
		}
	}
	
	public void CEseccionesEstatico() {
		this._crearEditarSeccionesTematicas = new Crear_Editar_Secciones_Tematicas((Editor) this.usuario, iUsuario.cargar_portada(), this);
		this.getLayoutGenericoSeccionesBanner().add(_crearEditarSeccionesTematicas);
	}
	
	public Seccion[] cargar_secciones() {
		return iUsuario.cargar_secciones_vista_editor();
	}
}