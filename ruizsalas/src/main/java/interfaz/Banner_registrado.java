package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

public class Banner_registrado extends Banner_generico {
	//private JButton _visitar_Perfil;
	public Banner_suscrito _puede_contener;
	public Registrado _registrado;
	public Perfil_Uusario_Vista_UR PerfilUR;
	public Perfil_Usuario Perfil;
	public Banner_registrado BananaRegistardo;
	public Usuario_No_Registrado Usus_no_reg;

	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Usuario_suscrito_ suscrito;
	ocl_proyecto.Noticia noticia;

	public Banner_registrado(Registrado _registrado, ocl_proyecto.Usuario usuario) {
		super(_registrado, usuario);
		this._registrado = _registrado;
		this.usuario = usuario;
		this.getBotonSuscribirseGenerico().setVisible(false);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);

		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfilUR());
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBanner());

//		this.setFotoPerfilBanner(createImageFromFile(usuarioBD.getFoto_de_perfil()));
	}

//	private Image createImageFromFile(String filePath) {
//		File file = new File(filePath);
//		if (file.exists()) {
//			StreamResource resource = new StreamResource(file.getName(), () -> {
//				try {
//					return new FileInputStream(file);
//				} catch (FileNotFoundException e) {
//					Notification.show("Error: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
//					return null;
//				}
//			});
//			Image image = new Image(resource, "Image not found");
//			image.setMaxWidth("500px");
//			return image;
//		} else {
//			Notification.show("File not found: " + filePath, 5000, Notification.Position.MIDDLE);
//			return new Image();
//		}
//	}

	public Noticia carlos;
	public void hola() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		carlos = new Noticia(this._registrado, this.noticia);
		this.getBannergenericolayout().as(VerticalLayout.class).add(carlos);
	}

	//PODEMOS CARGAR EN VISTA USUARIO Y CARGAR EL BANNER DE RESGITRADO PA QUE NO  SE MUEVO Y ME BAILE
	@Override
	public void ConductorPortadaBanner() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		BananaRegistardo = new Banner_registrado(this._registrado, this.usuario);
		this.getBannergenericolayout().as(VerticalLayout.class).add(BananaRegistardo);
	}

	//NOSE QUE SE PONE EN VEZ DE NULL SON LAS 1:20AM


	public void ConductorPerfilUR() {
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		PerfilUR = new Perfil_Uusario_Vista_UR(this._registrado.mainView.UR, this.suscrito);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(PerfilUR);
	}

	public void ConductorPerfil() {
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		Perfil = new Perfil_Usuario(this._registrado, this.suscrito);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(Perfil);
	}
}