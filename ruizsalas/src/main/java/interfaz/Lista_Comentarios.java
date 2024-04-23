package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Lista_Comentarios extends VistaListacomentarios {
	//public Noticia _unnamed_Noticia_;
	public Vector<Lista_Comentarios_item> _item = new Vector<Lista_Comentarios_item>();
	
	public Usuario usuario;
	public Lista_Comentarios(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.getEscribirComentario().setVisible(false);
	
		this.Comentarios_item_Estaticos();
		}
	
	public void Comentarios_item_Estaticos(){
		Lista_Comentarios_item _item = new Lista_Comentarios_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(_item);
	}
}