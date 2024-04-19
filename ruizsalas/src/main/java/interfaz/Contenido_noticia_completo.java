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
		//this.getBotonDislikeNoticia().addClickListener(event->DarDislike());
	}
	
	public void DarLike() {
		//operacion BD
	}
	
	public void DarDislike() {
		//operacion BD
	}
}