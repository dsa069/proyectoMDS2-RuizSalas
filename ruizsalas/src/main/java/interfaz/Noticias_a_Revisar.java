package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Noticias_a_Revisar extends Listar_noticias_generico {
	public Revisar_noticias _unnamed_Revisar_noticias_;
	public Vector<Noticias_a_Revisar_item> _item = new Vector<Noticias_a_Revisar_item>();
	public Usuario usuario;
	public Noticias_a_Revisar(Usuario usuario) {
		super(usuario);
		this.usuario = usuario;
		this.getPortada().setVisible(false);
		this.getColumnasNoticias().setVisible(false);
	}
	
	@Override
	public void Noticia_item() {
		Noticias_a_Revisar_item _item = new Noticias_a_Revisar_item(this);
		this.getListaSimpleNoticias().as(VerticalLayout.class).add(_item);
	}
}