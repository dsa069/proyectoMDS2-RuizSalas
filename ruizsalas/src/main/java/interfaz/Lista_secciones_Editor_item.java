package interfaz;
import vistas.*;

public class Lista_secciones_Editor_item extends Listar_Secciones_item {
//	private JButton _borrar_seccion;
	public Lista_secciones_Editor _lista_secciones_Editor;
	public Lista_noticas_Editor _contiene;

	public Lista_secciones_Editor_item(Lista_secciones_Editor padre, ocl_proyecto.Seccion seccion) {
		super(padre, seccion);
		this._lista_secciones_Editor = padre;
		this.getBorrarSeccion().setVisible(true);
		
		this.getBorrarSeccion().addClickListener(event->borrar_seccion());
	}
	
	@Override
	public void Listar_Noticia() {
		this._contiene = new Lista_noticas_Editor(this._lista_secciones_Editor._editor);
		this.getListaDeNoticiasEstatico().add(this._contiene);
	}
	
	public void borrar_seccion() {
		//Operación eliminar sección base de datos
		throw new UnsupportedOperationException();
	}
}