package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;

public class Lista_comentarios_Vista_Editor_item extends Lista_Comentarios_UR_item {
	//private JButton _borrar_comentario;
	public Lista_comentarios_Vista_Editor _lista_comentarios_Vista_Editor_;
	
	ocl_proyecto.Comentario comentar;
	
	iEditor iEdito = new BD_Principal();

	public Lista_comentarios_Vista_Editor_item(Lista_comentarios_Vista_Editor padre, ocl_proyecto.Usuario us, ocl_proyecto.Comentario comentario) {
		super(padre, us, comentario);
		this._lista_comentarios_Vista_Editor_ = padre;
		this.comentar = comentario;
		
		this.getBorrarComentario().setVisible(true);
		
		this.getBorrarComentario().addClickListener(event->borrar_comentario());
	}
	
	public void borrar_comentario() {
		iEdito.borrar_comentario(this.comentar.getId_valoracion());
		this._lista_comentarios_Vista_Editor_.ramadam();
	}
	
	@Override
	public void valorar_comentario(boolean valoracion) {
		iregistrao.valorar_comentario(usuario.getIdUsuario(), comentar.getId_valoracion(), valoracion);
		this._lista_comentarios_Vista_Editor_.ramadam();
	}
}