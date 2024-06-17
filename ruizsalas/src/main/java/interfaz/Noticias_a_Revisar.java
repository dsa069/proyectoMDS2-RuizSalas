package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Noticia;
import vistas.*;

public class Noticias_a_Revisar extends Listar_noticias_generico {
	public Revisar_noticias _unnamed_Revisar_noticias_;
	public Editor editor;
	public Noticia[] notice;
	ocl_proyecto.Editor usuarioocl;
	iEditor iEdito = new BD_Principal();

	public Noticias_a_Revisar(Editor editor, ocl_proyecto.Editor usuarioocl, Revisar_noticias _unnamed_Revisar_noticias_) {
		super(editor);
		this.editor = editor;
		this.usuarioocl = usuarioocl;
		this._unnamed_Revisar_noticias_ = _unnamed_Revisar_noticias_;
		this.getPortada().setVisible(false);
		this.getColumnasNoticias().setVisible(false);
	}
	
	@Override
	public void Noticia_item() {
		notice = iEdito.cargar_noticias_a_revisar();
		for (int i=0; i<notice.length; i++) {
			Noticias_a_Revisar_item _item = new Noticias_a_Revisar_item(this, this.notice[i]);
			this.getListaSimpleNoticias().as(VerticalLayout.class).add(_item);
		}
	}
}