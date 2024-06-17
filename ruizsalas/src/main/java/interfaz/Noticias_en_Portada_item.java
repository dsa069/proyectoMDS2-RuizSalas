package interfaz;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.EditorDAO;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_DAO;
import vistas.*;

public class Noticias_en_Portada_item extends Listar_noticias_item {
	public Noticias_en_Portada _noticias_en_Portada;
	ocl_proyecto.Noticia notitas;
	
	public Noticias_en_Portada_item(Noticias_en_Portada padre, 	ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._noticias_en_Portada = padre;
		this.notitas = Notas;
		//this.getMarcar().setVisible(false);
		
		this.getTitular2().setText(""+Notas.getTitulo());
		
	}
	
	@Override
	public void ConductorNoticia() {//Ir a noticia dependiendo del usuario
		try {
			if (this._listar_noticias.usuarioocl != null&&this._listar_noticias.usuarioocl.getIdUsuario() !=0) {
				if(UsuarioDAO.getUsuarioByORMID(this._noticias_en_Portada.usuarioocl.getIdUsuario())!=null) {
					if(EditorDAO.getEditorByORMID(this._noticias_en_Portada.usuarioocl.getIdUsuario())!=null) {
						Notification.show("editorrrr dnahdfaibd");	
						this._noticias_en_Portada._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						NVE = new Noticia_Vista_Editor (this._listar_noticias_generico.usuario.mainView.E, this._noticias_en_Portada.usuarioocl, this.notitas); 
						this._noticias_en_Portada._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NVE);
					}else {
						Notification.show("suscrito dnahdfaibd");				
						this._noticias_en_Portada._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.UR, this._noticias_en_Portada.usuarioocl, this.notitas); 
						this._noticias_en_Portada._unnamed_Pagina_de_inicio_.Selec.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
					}
				}
			} else {
				Notification.show("noregistaro");
				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
				NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario.mainView.UNR, null, this.notitas);
				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(NUNR);	
			}
			
		} catch (Exception e) {
			Notification.show("cacheado");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}