package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Lista_mis_noticias extends Listar_noticias_generico {
	public Historial_noticias _unnamed_Historial_noticias_;
	public Vector<Lista_mis_noticias_item> _item = new Vector<Lista_mis_noticias_item>();
	
	public Periodista periodista;
	public Lista_mis_noticias(Periodista usuario) {
		super(usuario);
		this.periodista = usuario;
		this.getPortada().setVisible(false);
		this.getColumnasNoticias().setVisible(false);
	}
	
	@Override
	public void Noticia_item() {
		Lista_mis_noticias_item _item = new Lista_mis_noticias_item(this);
		this.getListaSimpleNoticias().as(VerticalLayout.class).add(_item);
	}
}