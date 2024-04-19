package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Contenido_cortado_noticia extends Noticia{
	
	public Usuario_No_Registrado _usuario;
	public Registro reg;
	public Contenido_cortado_noticia(Usuario_No_Registrado _usuario) {
		super(_usuario);
		this._usuario = _usuario;
		this.getNoticiaCompleta().setVisible(false);
		this.getSeleccionarSecciones().setVisible(false);
		this.getSeleccionarTematicas().setVisible(false);
		this.getValorarNoticia().setVisible(false);
		this.getEliminarNoticia().setVisible(false);
		
		this.getBotonSuscribirseNoticia().addClickListener(event->ConductorRegistro());
	}
	
	public void ConductorRegistro() {
		this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		reg = new Registro(this._usuario);
		this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(reg);
	}
}