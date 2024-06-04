package interfaz;
import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Lista_noticas_Editor_item extends Listar_noticias_item {
	//private JButton _quitar_noticia_de_seccion;
	public Lista_noticas_Editor _lista_noticas_Editor;
	
	ocl_proyecto.Noticia notice;
	
	iEditor iEdito = new BD_Principal();

	public Lista_noticas_Editor_item(Lista_noticas_Editor padre, ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._lista_noticas_Editor = padre;
		//this.getMarcar().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(true);
		
		this.getQuitarNoticiaDeSeccion().addClickListener(event->quitar_noticia_de_seccion());
	}
	
	public void quitar_noticia_de_seccion() {
		//Operación de la base de datos eliminar de la sección
		iEdito.quitar_noticia_de_seccion(this.notice.getId_noticia());
		throw new UnsupportedOperationException();
	}
}