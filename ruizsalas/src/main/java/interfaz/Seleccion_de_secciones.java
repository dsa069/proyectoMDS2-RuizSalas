package interfaz;

import java.util.Vector;
import com.vaadin.flow.component.notification.Notification;
import ocl_proyecto.Seccion;
import vistas.*;

public class Seleccion_de_secciones extends Seleccion_de_secciones_generico {
	ocl_proyecto.Usuario usuarioocl;
	public Usuario _usuario;
	public Banner_registrado Banana;
	
	public Seleccion_de_secciones(Usuario _usuario, ocl_proyecto.Usuario usuariocl, Banner_registrado Banana) {
		super(_usuario, null);
		this._usuario = _usuario;
		this.usuarioocl =  usuariocl;
		this.Banana = Banana;
		this.getBarraDeBusqueda().setVisible(true);
		this.getEditarTexto().setVisible(false);
		this.getMsgError().setVisible(true);
		
		this.CEseccionesEstatico();
		//Barra de busqueda
		buscar = new Barra_de_busqueda(this.usuario);
		this.getBarraDeBusqueda().add(this.buscar);
		//Inicio portada
		this.pagInicio = new Pagina_de_inicio(this.usuario, this.usuarioocl, this);
		this.getLayoutGenericoSeccionesBanner().add(pagInicio);
	}
	
	@Override
	public void Seleccion_de_secciones_item_Estatico() {
		sec = cargar_secciones();
		for (int i=0; i<sec.length; i++) {
			Seleccion_de_secciones_item SSI = new Seleccion_de_secciones_item(this, sec[i]);
			this.getLayoutSeccionesContenidasPeriodico().add(SSI);
		}
	}
	
	@Override
	public Seccion[] cargar_secciones() {
		return iUsuario.cargar_secciones_generico();
	}
	
	@Override
	public void CEseccionesEstatico() {
	}
}