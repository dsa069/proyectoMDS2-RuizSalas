package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import ocl_proyecto.Editor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;
import vistas.*;

public class Listar_noticias_generico_item extends VistaListarnoticiasgenerico_item {
//	private JButton _acceder_a_noticia;
//	private JLabel _imagen_principal;
//	private JLabel _titulo;
//	private JLabel _resumen_corto;
	public Listar_noticias_generico _listar_noticias_generico;
	
	Noticia_Vista_UNR NUNR;
	Noticia_completa NUN;
	
	ocl_proyecto.Noticia Notas;
	
	public Listar_noticias_generico_item(Listar_noticias_generico _listar_noticias_generico, ocl_proyecto.Noticia Notas) {
		super();
		this._listar_noticias_generico = _listar_noticias_generico;
		this.Notas = Notas;
		
		this.setImagenListarNoticias(createImageFromFile(Notas.getImagen_principal()));
		this.getResumenNoticia().setText("" + Notas.getTexto_corto());
		
//		this.getBotonImagenListarNoticias().addClickListener(event->ConductorNoticia());
//		this.getTitular1().addClickListener(event->ConductorNoticia());
//		this.getTitular2().addClickListener(event->ConductorNoticia());
	}
	
	private Image createImageFromFile(String filePath) {
		File file = new File(filePath);
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
			return image;
		} else {
			Notification.show("File not found: " + filePath, 5000, Notification.Position.MIDDLE);
			return new Image();
		}
	}
	
	public void ConductorNoticiaUNR() {//Ir a noticia dependiendo del usuario
		this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario.mainView.UNR, null);
		this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(NUNR);
	}
	
	
	public void ConductorNoticiaUR() {//Ir a noticia dependiendo del usuario
		this._listar_noticias_generico.usuario.mainView.UR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.UR, null);
		this._listar_noticias_generico.usuario.mainView.UR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
	}
	
	
	
//	public void ConductorNoticia(Usuario _usuario) {//Ir a noticia dependiendo del usuario
//		try {
//			if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(_usuario.usuario.getIdUsuario())!=null) {
//				this._listar_noticias_generico.usuario.mainView.UR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
//				NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.UR, null);
//				this._listar_noticias_generico.usuario.mainView.UR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
//			}
//			if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(_usuario.usuario.getIdUsuario())!=null) {
//				this._listar_noticias_generico.usuario.mainView.P.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
//				NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.P, null);
//				this._listar_noticias_generico.usuario.mainView.P.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
//			} 
//			if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(_usuario.usuario.getIdUsuario())!=null) {
//				this._listar_noticias_generico.usuario.mainView.E.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
//				NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.E, null);
//				this._listar_noticias_generico.usuario.mainView.E.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
//			}else {
//				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
//				NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario.mainView.UNR, null);
//				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(NUNR);	
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
