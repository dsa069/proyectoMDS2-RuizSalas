package interfaz;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Listar_Secciones_item extends VistaListarsecciones_item {
	//private JLabel _nombre;
	public Listar_Secciones _listar_Secciones;
	public Listar_noticias _contiene;
	
	ocl_proyecto.Seccion seccion;

	public Listar_Secciones_item(Listar_Secciones _listar_Secciones, ocl_proyecto.Seccion seccion) {
		super();
		this._listar_Secciones = _listar_Secciones;
		this.seccion = seccion;
		this.getBorrarSeccion().setVisible(false);
		
		this.getLayoutTextoSeccionX().setText("" + seccion.getNombre());
		
		this.Listar_Noticia();
	}

	public void Listar_Noticia() {
		this._contiene = new Listar_noticias(this._listar_Secciones.usuario, _listar_Secciones.usuario.usuario, this);
		this.getListaDeNoticiasEstatico().add(this._contiene);
		this._contiene.Noticia_item( seccion.getIdSeccion());
	}
}