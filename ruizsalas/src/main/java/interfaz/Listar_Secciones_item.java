package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.*;

public class Listar_Secciones_item extends VistaListarsecciones_item {
	public Listar_Secciones _listar_Secciones;
	public Listar_noticias _contiene;
	ocl_proyecto.Seccion seccion;

	public Listar_Secciones_item(Listar_Secciones _listar_Secciones, ocl_proyecto.Seccion seccion) {
		super();
		this._listar_Secciones = _listar_Secciones;
		this.seccion = seccion;
		this.getBorrarSeccion().setVisible(false);

		//ESTATICO LISTA NOTICIAS NO EDITOR
		if(_listar_Secciones.ramadam) {
			this._contiene = new Listar_noticias(this._listar_Secciones.usuario, _listar_Secciones.usuario.usuario, this);
			this.getListaDeNoticiasEstatico().add(this._contiene);
			this._contiene.Noticia_item( seccion.getIdSeccion());
		}

		this.getLayoutTextoSeccionX().setText("" + seccion.getNombre());
	}
}