package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Noticia;
import ocl_proyecto.UsuarioDAO;
import vistas.*;

public class Noticias_a_Revisar_item extends Listar_noticias_generico_item {
	public Noticias_a_Revisar _noticias_a_Revisar;
	public Zona_de_autor_y_version_de_noticia zonaAutorYVersionDeNoticia;
	ocl_proyecto.Noticia notice;
	ocl_proyecto.Periodista per;
	iEditor iEdito = new BD_Principal();
	
	public Noticias_a_Revisar_item(Noticias_a_Revisar padre, ocl_proyecto.Noticia Notas) {
		super(padre,Notas);
		this._noticias_a_Revisar = padre;
		this.per = Notas.getAutor();
		this.notice = Notas;
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		//Zona de autor y version de noticia
		this.zonaAutorYVersionDeNoticia = new Zona_de_autor_y_version_de_noticia(this._noticias_a_Revisar.editor, this.per, this.notice);
		this.getZonaDeAutorYVersionDeNoticia().add(this.zonaAutorYVersionDeNoticia);
		
		this.getTitular1().setText("" + Notas.getTitulo());
		this.getAgregarNoticia().addClickListener(event->iEdito.agregar_noticia(notice.getId_valoracion(), true));
		this.getNoAgregarNoticia().addClickListener(event->iEdito.no_agregar_noticia(notice.getId_valoracion()));
	}
	
	@Override
	public void ConductorNoticia() {
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getLayoutGenericoVistaGenerica().setVisible(true);
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getRevisarNoticiasLayout().setVisible(false);
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		NVE = new Noticia_Vista_Editor (this._listar_noticias_generico.usuario.mainView.E, this._noticias_a_Revisar.usuarioocl, this.Notas);
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NVE);
	}
}