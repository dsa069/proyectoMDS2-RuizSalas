package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.EditorDAO;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.Usuario_suscrito_DAO;
import vistas.*;

public class Noticias_en_Portada_item extends Listar_noticias_item {
	public Noticias_en_Portada _noticias_en_Portada;
	
	public Noticias_en_Portada_item(Noticias_en_Portada padre, 	ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._noticias_en_Portada = padre;
		//this.getMarcar().setVisible(false);
		
		this.getTitular2().setText(""+Notas.getTitulo());
		
//		this.getBotonImagenListarNoticias().addClickListener(event->ConductorNoticia());
//		this.getTitular1().addClickListener(event->ConductorNoticia());
//		this.getTitular2().addClickListener(event->ConductorNoticia());
	}
	
	
	public void ConductorNoticia() {//Ir a noticia dependiendo del usuario
		try {
			if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(this._noticias_en_Portada._usuario.usuario.getIdUsuario())!=null) {
				this._listar_noticias_generico.usuario.mainView.UR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
				NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.UR, null, this.Notas);
				this._listar_noticias_generico.usuario.mainView.UR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
			}
			if(PeriodistaDAO.getPeriodistaByORMID(this._noticias_en_Portada._usuario.usuario.getIdUsuario())!=null) {
				this._listar_noticias_generico.usuario.mainView.P.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
				NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.P, null, this.Notas);
				this._listar_noticias_generico.usuario.mainView.P.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
			} 
			if(EditorDAO.getEditorByORMID(this._noticias_en_Portada._usuario.usuario.getIdUsuario())!=null) {
				this._listar_noticias_generico.usuario.mainView.E.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
				NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.E, null, this.Notas);
				this._listar_noticias_generico.usuario.mainView.E.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
			}else {
				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
				NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario.mainView.UNR, null, this.Notas);
				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(NUNR);	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}