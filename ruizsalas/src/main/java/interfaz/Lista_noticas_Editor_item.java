package interfaz;
import vistas.*;

public class Lista_noticas_Editor_item extends Listar_noticias_item {
	//private JButton _quitar_noticia_de_seccion;
	public Lista_noticas_Editor _lista_noticas_Editor;

	public Lista_noticas_Editor_item(Listar_noticias padre) {
		super(padre);
		//this.getMarcar().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(true);
	}
	
	public void quitar_noticia_de_seccion() {
		throw new UnsupportedOperationException();
	}
}