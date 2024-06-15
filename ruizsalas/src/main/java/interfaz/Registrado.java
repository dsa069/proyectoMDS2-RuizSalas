package interfaz;
//import basededatos.iRegistrado;
import proyectoMDS.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registrado extends Usuario {
	
	ocl_proyecto.Usuario usuario;
	
	public Registrado (MainView mainView, ocl_proyecto.Usuario usuario){
		super(mainView, usuario);
		this.usuario = usuario;
	
		this.Banner_R_Inico();
	}
//	public iRegistrado _iRegistrado;
//	public Editar_Perfil _accede;
	
	public Banner_registrado BR;
	
	public void Banner_R_Inico() {
		
//		try {
//			Notification.show(usuario.getApodo());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BR = new Banner_registrado(this, this.usuario);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BR);	
	}
}