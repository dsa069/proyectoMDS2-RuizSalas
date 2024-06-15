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
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;

	ocl_proyecto.Usuario user;
	ocl_proyecto.Usuario_suscrito_ suscrito;
	//ocl_proyecto.Noticia noticia;

	public Banner_registrado(Registrado _registrado, ocl_proyecto.Usuario usuario) {
		super(_registrado, usuario);
		this._registrado = _registrado;
		this.user = usuario;
		this.getBotonSuscribirseGenerico().setVisible(false);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);

		this.imagen = new Image();
        File file = new File(IMAGE_PATH + this.user.getFoto_de_perfil());
        if (file.exists()) {
            StreamResource resource = new StreamResource(file.getName(), () -> {
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException e) {
                    Notification.show("Error: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
                    return null;
                }
            });

            Image image = new Image(resource, "Image not found");
            image.setMaxWidth("500px");
            this.imagen = image;
        } else {
            Notification.show("File not found: " + IMAGE_PATH + this.user.getFoto_de_perfil(), 5000, Notification.Position.MIDDLE);
        }

        this.imagen.getStyle().set("align-self", "center");
        this.getLayoutFotoPerfilBanner().as(VerticalLayout.class).removeAll();
        this.getLayoutFotoPerfilBanner().as(VerticalLayout.class).add(this.imagen);
		
		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfilUR());
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBanner());
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

//	public Noticia carlos;
//	public void hola() {
//		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
//		carlos = new Noticia(this._registrado, this.noticia);
//		this.getBannergenericolayout().as(VerticalLayout.class).add(carlos);
//	}

	//PODEMOS CARGAR EN VISTA USUARIO Y CARGAR EL BANNER DE RESGITRADO PA QUE NO  SE MUEVO Y ME BAILE
	@Override
	public void ConductorPortadaBanner() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		BananaRegistardo = new Banner_registrado(this._registrado, this.user);
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