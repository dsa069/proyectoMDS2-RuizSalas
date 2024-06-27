package interfaz;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import ocl_proyecto.EditorDAO;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;

public class Banner_registrado extends Banner_generico {
	//private JButton _visitar_Perfil;
	public Registrado _registrado;
	public Perfil_Uusario_Vista_UR PerfilUR;
	public Perfil_Usuario Perfil;
	public Banner_registrado BananaRegistardo;
	public Banner_Periodista BananaPeriodista;
	public Banner_Editor BananaEditor;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;

	ocl_proyecto.Usuario user;

	public Banner_registrado(Registrado _registrado, ocl_proyecto.Usuario usuario) {
		super(_registrado, usuario);
		this._registrado = _registrado;
		this.user = usuario;
		this.getBotonSuscribirseGenerico().setVisible(false);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);
		this.getBotonMisNoticiasGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);
		this.getBotonRevisarNoticiaGenerico().setVisible(false);

		//Estatico SS no editor
		try {
			if(EditorDAO.getEditorByORMID(user.getIdUsuario()) == null){
				this.SS = new Seleccion_de_secciones(this._registrado, this.user, this);
				this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SS);
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		this.imagen = new Image();
		File file = new File(IMAGE_PATH + this.user.getFoto_de_perfil());
		if (file.exists()) {
			StreamResource resource = new StreamResource(file.getName(), () -> {
				try {
					return new FileInputStream(file);
				} catch (FileNotFoundException e) {
					return null;
				}
			});

			Image image = new Image(resource, "Image not found");
			image.setMaxWidth("500px");
			this.imagen = image;
		} 

		this.imagen.getStyle().set("align-self", "center");
		this.getLayoutFotoPerfilBanner().as(VerticalLayout.class).removeAll();
		this.getLayoutFotoPerfilBanner().as(VerticalLayout.class).add(this.imagen);

		//CONDUCTOR PERFIL USUARIO
		this.getBotonIniciarSesionGenerico().addClickListener(event->{		
			try {
				if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(user.getIdUsuario()) != null) {
					this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
					PerfilUR = new Perfil_Uusario_Vista_UR(this._registrado.mainView.UR, (Usuario_suscrito_) this.user, this);
					this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(PerfilUR);
				}else {
					this.getCrearEditarNoticiaLayout().setVisible(false);
					this.getAltaPeriodistaLayout().setVisible(false);
					this.getHistorialNoticiasLayout().setVisible(false);
					this.getListarPeriodistaLayout().setVisible(false);
					this.getRevisarNoticiasLayout().setVisible(false);
					this.getLayoutGenericoVistaGenerica().setVisible(true);
					this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
					Perfil = new Perfil_Usuario(this._registrado, this.user, this);
					this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(Perfil);
				}
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
		
		//conductor portada banner
		this.getBotonpaginainicio().addClickListener(event->{
			try {
				if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(user.getIdUsuario()) != null) {
					this._registrado.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
					BananaRegistardo = new Banner_registrado(this._registrado, this.user);
					this._registrado.getBannerGenericoEstatico().as(VerticalLayout.class).add(BananaRegistardo);;
				}else if(PeriodistaDAO.getPeriodistaByORMID(user.getIdUsuario()) != null){
					this._registrado.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
					BananaPeriodista = new Banner_Periodista((Periodista)this._registrado,(ocl_proyecto.Periodista) this.user);
					this._registrado.getBannerGenericoEstatico().as(VerticalLayout.class).add(BananaPeriodista);
				}else if(EditorDAO.getEditorByORMID(user.getIdUsuario()) != null){
					this._registrado.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
					BananaEditor = new Banner_Editor((Editor)this._registrado, (ocl_proyecto.Editor)this.user);
					this._registrado.getBannerGenericoEstatico().as(VerticalLayout.class).add(BananaEditor);
				}
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
}