package interfaz;

import proyectoMDS.MainView;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registrado extends Usuario {
	public Banner_registrado BR;
	ocl_proyecto.Usuario usuario;
	
	public Registrado (MainView mainView, ocl_proyecto.Usuario usuario){
		super(mainView, usuario);
		this.usuario = usuario;
		//Banner registrado inicio
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BR = new Banner_registrado(this, this.usuario);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BR);	
	}
}