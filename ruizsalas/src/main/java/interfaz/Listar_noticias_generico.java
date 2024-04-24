package interfaz;
import vistas.*;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listar_noticias_generico extends VistaListarnoticiasgenerico {
	public Vector<Listar_noticias_generico_item> _item = new Vector<Listar_noticias_generico_item>();
	public Usuario usuario;
	public Listar_noticias_generico(Usuario usuario) {
		super();
		this.usuario = usuario;
		
		this.Noticia_item();
	}
	
	public void Noticia_item() {
		Listar_noticias_generico_item _item = new Listar_noticias_generico_item(this);
		this.getListaSimpleNoticias().as(VerticalLayout.class).add(_item);
	}
}