package interfaz;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.EditorDAO;
import ocl_proyecto.UsuarioDAO;
import vistas.*;

public class Listar_noticias_item extends Listar_noticias_generico_item {
//	private JLabel _ver_valoracion;
	public Listar_noticias _listar_noticias;
	
	ocl_proyecto.Valoracion valoracion;
	
	public Listar_noticias_item(Listar_noticias padre, ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._listar_noticias = padre;
		this.valoracion = Notas;
		//this.getMarcar().setVisible(false);
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular1().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.Ver_Valoracion();
		
		this.getTitular2().setText("" + Notas.getTitulo());
		
//		this.getBotonImagenListarNoticias().addClickListener(event->ConductorNoticia());
//		this.getTitular1().addClickListener(event->ConductorNoticia());
//		this.getTitular2().addClickListener(event->ConductorNoticia());
		
	}
	
	public ver_valoracion verValoracion;
	public void Ver_Valoracion() {
		this.verValoracion = new ver_valoracion(this._listar_noticias._usuario, this.valoracion);
		this.getVerValoracion().add(this.verValoracion);
	}
	
//	
//	public void ConductorNoticia() {//Ir a noticia dependiendo del usuario
//		try {
//			if (this._listar_noticias.usuarioocl != null) {
//				if(UsuarioDAO.getUsuarioByORMID(this._listar_noticias.usuarioocl.getIdUsuario())!=null) {
//					if(EditorDAO.getEditorByORMID(this._listar_noticias.usuarioocl.getIdUsuario())!=null) {
//						Notification.show("editorrrr dnahdfaibd");	
//						this._listar_noticias._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
//						NVE = new Noticia_Vista_Editor (this._listar_noticias_generico.usuario.mainView.E, this._noticias_en_Portada.usuarioocl, this.notitas); 
//						this._listar_noticias._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NVE);
//					}else {
//						Notification.show("suscrito dnahdfaibd");				
//						this._listar_noticias._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
//						NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.UR, this._noticias_en_Portada.usuarioocl, this.notitas); 
//						this._listar_noticias._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
//					}
//				}
//			} else {
//				Notification.show("noregistaro");
//				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
//				NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario.mainView.UNR, null, this.notitas);
//				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(NUNR);	
//			}
//			
//		} catch (Exception e) {
//			Notification.show("cacheado");
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}
