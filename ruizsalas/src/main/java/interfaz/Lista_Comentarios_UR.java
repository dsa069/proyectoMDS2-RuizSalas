package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_Comentarios_UR extends Lista_Comentarios {
//	private JButton _escribir_comentario;
//	private JLabel _foto;
//	private JLabel _mi_apodo;
//	public Noticia_completa _unnamed_Noticia_completa_;
	public Vector<Lista_Comentarios_UR_item> _item = new Vector<Lista_Comentarios_UR_item>();
	
	public Registrado _registrado;
	public Lista_Comentarios_UR(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getEscribirComentario().setVisible(true);
	
		//this.getCampoEscribirComentario().addClickListener(event->escribir_comentario());ESCRIBIR COMENTARIOO CLICK LISTENER???
		}
	
	@Override
	public void Comentarios_item_Estaticos(){
		Lista_Comentarios_UR_item _item = new Lista_Comentarios_UR_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(_item);
	}

	public void escribir_comentario() {
		//throw new UnsupportedOperationException();
	}
}