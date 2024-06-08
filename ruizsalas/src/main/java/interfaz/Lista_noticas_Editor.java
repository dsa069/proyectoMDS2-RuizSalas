package interfaz;

import java.util.Vector;
import vistas.*;

public class Lista_noticas_Editor extends Listar_noticias {
	//public Lista_secciones_Editor_item _unnamed_Lista_secciones_Editor_item_;
	public Vector<Lista_noticas_Editor_item> _item = new Vector<Lista_noticas_Editor_item>();
	public Editor _editor;
    
	public Lista_noticas_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
	}
	@Override
	public void Noticia_item(int seccion) {
		notice = this.cargar_noticias_secciones(seccion);
		for (int i=0; i<notice.length; i++) {
			Lista_noticas_Editor_item _item = new Lista_noticas_Editor_item(this, this.notice[i]);
			this.getColumnasNoticias().add(_item);	
		}
	}
}