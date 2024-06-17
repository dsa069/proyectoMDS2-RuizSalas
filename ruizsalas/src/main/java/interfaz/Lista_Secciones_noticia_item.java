package interfaz;
import vistas.*;

public class Lista_Secciones_noticia_item extends VistaListaseccionesnoticia_item {
	public Lista_Secciones_noticia _lista_Secciones_noticia;
	ocl_proyecto.Seccion seccion;
	public Lista_Secciones_noticia_item(Lista_Secciones_noticia _lista_Secciones_noticia, ocl_proyecto.Seccion seccion) {
		super();
		this._lista_Secciones_noticia = _lista_Secciones_noticia;
		this.seccion = seccion;
		this.getSeleccionSeccion().setLabel("" + seccion.getNombre());
	}

	public void marcar_seccion() {
	}
}