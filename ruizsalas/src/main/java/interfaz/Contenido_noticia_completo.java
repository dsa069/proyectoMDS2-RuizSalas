package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Contenido_noticia_completo extends Noticia {
	
	public Registrado _registrado;
	public Contenido_noticia_completo(Registrado registrado) {
		super(registrado);
		this._registrado = registrado;
		this.getNoticiaCortada().setVisible(false);
		this.getSeleccionarSecciones().setVisible(false);
		this.getSeleccionarTematicas().setVisible(false);
		this.getEliminarNoticia().setVisible(false);
		this.getBotonSuscribirse().setVisible(false);
		
		this.getBotonLikeNoticia().addClickListener(event->DarLike());
		this.getBotonNotLikeNoticia().addClickListener(event->DarDislike());
	}
	
	@Override
	public void Lista_De_Comentarios() {
		this._contiene = new Lista_Comentarios_UR(this._registrado);
		this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void DarLike() {
		//operacion BD
	}
	
	public void DarDislike() {
		//operacion BD
	}
}