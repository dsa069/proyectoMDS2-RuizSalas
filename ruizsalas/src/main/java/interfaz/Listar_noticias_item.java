package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Noticia;
import ocl_proyecto.UsuarioDAO;
import vistas.*;

public class Listar_noticias_item extends Listar_noticias_generico_item {
	public Listar_noticias _listar_noticias;
	public ver_valoracion verValoracion;
	ocl_proyecto.Valoracion valoracion;
	
	public Listar_noticias_item(Listar_noticias padre, ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._listar_noticias = padre;
		this.valoracion = Notas;
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular1().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		//ver valoracion
		this.verValoracion = new ver_valoracion(this._listar_noticias._usuario, this.valoracion);
		this.getVerValoracion().add(this.verValoracion);
		
		this.getTitular2().setText("" + Notas.getTitulo());		
	}
	
	@Override
	public void ConductorNoticia() {
		try {
			if (this._listar_noticias.usuarioocl != null&&this._listar_noticias.usuarioocl.getIdUsuario() !=0) {
				if(UsuarioDAO.getUsuarioByORMID(this._listar_noticias.usuarioocl.getIdUsuario())!=null) {
					if(EditorDAO.getEditorByORMID(this._listar_noticias.usuarioocl.getIdUsuario())!=null) {
						this._listar_noticias._unnamed_Listar_Secciones_item_._listar_Secciones.SecccccP.SSI._seleccion_de_secciones.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						NVE = new Noticia_Vista_Editor (this._listar_noticias_generico.usuario.mainView.E, this._listar_noticias.usuarioocl, (Noticia) this.valoracion); 
						this._listar_noticias._unnamed_Listar_Secciones_item_._listar_Secciones.SecccccP.SSI._seleccion_de_secciones.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NVE);
					}else {			
						this._listar_noticias._unnamed_Listar_Secciones_item_._listar_Secciones.SecccccP.SSI._seleccion_de_secciones.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.UR, this._listar_noticias.usuarioocl, (Noticia) this.valoracion); 
						this._listar_noticias._unnamed_Listar_Secciones_item_._listar_Secciones.SecccccP.SSI._seleccion_de_secciones.Banana.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
					}
				}
			} else {
				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
				NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario.mainView.UNR, null, (Noticia) this.valoracion);
				this._listar_noticias_generico.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(NUNR);	
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
