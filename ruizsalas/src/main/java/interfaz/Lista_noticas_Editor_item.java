package interfaz;
import vistas.*;

public class Lista_noticas_Editor_item extends Listar_noticias_item {
	//private JButton _quitar_noticia_de_seccion;
	public Lista_noticas_Editor _lista_noticas_Editor;

	public Lista_noticas_Editor_item(Listar_noticias padre, ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		//this.getMarcar().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(true);
		
		this.getQuitarNoticiaDeSeccion().addClickListener(event->quitar_noticia_de_seccion());
	}
	
	public void quitar_noticia_de_seccion() {
		//Operación de la base de datos eliminar de la sección
		throw new UnsupportedOperationException();
	}
}