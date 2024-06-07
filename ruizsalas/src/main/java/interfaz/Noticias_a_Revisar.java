package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Noticia;
import vistas.*;

public class Noticias_a_Revisar extends Listar_noticias_generico {
	public Revisar_noticias _unnamed_Revisar_noticias_;
	public Vector<Noticias_a_Revisar_item> _item = new Vector<Noticias_a_Revisar_item>();
	public Editor editor;
	public Noticia[] notice;
	
	ocl_proyecto.Noticia not;
	
	iEditor iEdito = new BD_Principal();

	public Noticias_a_Revisar(Editor editor) {
		super(editor);
		this.editor = editor;
		this.getPortada().setVisible(false);
		this.getColumnasNoticias().setVisible(false);
		
		notice = cargar_noticias_a_revisar();
		for (int i=0; i<notice.length; i++) {
			Noticias_a_Revisar_item NRI = new Noticias_a_Revisar_item(this, notice[i]);
			this.getListaSimpleNoticias().as(VerticalLayout.class).add(NRI);
		}
	}
	
	@Override
	public void Noticia_item() {
		Noticias_a_Revisar_item _item = new Noticias_a_Revisar_item(this, this.Notas);
		this.getListaSimpleNoticias().as(VerticalLayout.class).add(_item);
	}
	
	public Noticia[] cargar_noticias_a_revisar() {
		return iEdito.cargar_noticias_a_revisar();
	}
}