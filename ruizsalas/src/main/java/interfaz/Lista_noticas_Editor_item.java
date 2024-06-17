package interfaz;
import com.vaadin.flow.component.notification.Notification;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Lista_noticas_Editor_item extends Listar_noticias_item {
	//private JButton _quitar_noticia_de_seccion;
	public Lista_noticas_Editor _lista_noticas_Editor;
	
	//ocl_proyecto.Noticia notice;
	//ocl_proyecto.Seccion seccion;
	int seecionId;
	iEditor iEdito = new BD_Principal();

	public Lista_noticas_Editor_item(Lista_noticas_Editor padre, ocl_proyecto.Noticia Notas, int seccionId) {
		super(padre, Notas);
		this._lista_noticas_Editor = padre;
		this.seecionId=seccionId;
		//this.getMarcar().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(true);
		
		this.getQuitarNoticiaDeSeccion().addClickListener(event->quitar_noticia_de_seccion());
	}
	
	public void quitar_noticia_de_seccion() {
		//Operación de la base de datos eliminar de la sección
		iEdito.quitar_noticia_de_seccion(this.Notas.getId_valoracion(), seecionId);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().removeAll();
		this._lista_noticas_Editor.LSE._contiene = new Lista_noticas_Editor(this._lista_noticas_Editor.LSE._editor, this._lista_noticas_Editor.LSE);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().add(this._lista_noticas_Editor.LSE._contiene);
	}
}