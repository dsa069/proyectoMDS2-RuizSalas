package interfaz;
import vistas.*;

public class Lista_Secciones_noticia_item extends VistaListaseccionesnoticia_item {
//	private JRadioButton _marcar_seccion;
//	private JLabel _nombre_seccion;
	public Lista_Secciones_noticia _lista_Secciones_noticia;
	ocl_proyecto.Seccion seccion;
	public Lista_Secciones_noticia_item(Lista_Secciones_noticia _lista_Secciones_noticia, ocl_proyecto.Seccion seccion) {
		super();
		this._lista_Secciones_noticia = _lista_Secciones_noticia;
		//this.seccion.setNombre(seccion.getNombre());
		//this.seccion.getNombre().setNombre(seccion.getNombre());
	}

	public void marcar_seccion() {//radio buton no me lo pilla
		throw new UnsupportedOperationException();
	}
}