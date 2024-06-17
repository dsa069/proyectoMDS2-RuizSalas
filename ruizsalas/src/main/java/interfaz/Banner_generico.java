package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.VistaBannergenerico;

public class Banner_generico extends VistaBannergenerico{

	public Usuario usuario;
	public Seleccion_de_secciones SS;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	ocl_proyecto.Usuario usuarioBD;
	
	public Banner_generico(Usuario usuario, ocl_proyecto.Usuario usuarioBD) {
		super();
		this.usuario = usuario;
		this.usuarioBD = usuarioBD;
		
		this.getRegistroLayout().setVisible(false);
		this.getIniciarSesionLayout().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(false);
		this.getListarPeriodistaLayout().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(false);
		
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBanner());
	}
	
	public void ConductorPortadaBanner() {
	}
}