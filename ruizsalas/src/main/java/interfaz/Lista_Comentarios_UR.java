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
	
	ocl_proyecto.Usuario user;
	ocl_proyecto.Comentario comentario;
	
	public Lista_Comentarios_UR(Registrado _registrado, ocl_proyecto.Usuario usuario) {
		super(_registrado, usuario);
		this._registrado = _registrado;
		this.getEscribirComentario().setVisible(true);
		
		this.getImagenFotoPerfilComentar().setSrc(user.getFoto_de_perfil());
		this.getLayoutTextoNombreUsuario().setText(user.getApodo());
	
		//this.getCampoEscribirComentario().addClickListener(event->escribir_comentario());ESCRIBIR COMENTARIOO CLICK LISTENER???
		}
	
	@Override
	public void Comentarios_item_Estaticos(){
		Lista_Comentarios_UR_item _item = new Lista_Comentarios_UR_item(this, this.user, this.comentario);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(_item);
	}

	public void escribir_comentario() {
		//throw new UnsupportedOperationException();
	}
}