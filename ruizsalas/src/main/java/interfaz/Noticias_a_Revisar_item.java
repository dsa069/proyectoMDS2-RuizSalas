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
//	private JButton _agregar_noticia;
//	private JButton _no_agregar_noticia;
//	private JLabel _autor;
//	private JLabel _foto;
//	private JLabel _version;
	public Noticias_a_Revisar _noticias_a_Revisar;
	
	ocl_proyecto.Noticia notice;
	ocl_proyecto.Periodista per;
	
	iEditor iEdito = new BD_Principal();
	
	public Noticias_a_Revisar_item(Noticias_a_Revisar padre, ocl_proyecto.Noticia Notas) {
		super(padre,Notas);
		this._noticias_a_Revisar = padre;
		this.per = Notas.getAutor();
		this.notice = Notas;
		//this.getMarcar().setVisible(false);
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.Zona_De_Autor_Y_Version_De_Noticia();
		
		this.getTitular1().setText("" + Notas.getTitulo());
		
		this.getAgregarNoticia().addClickListener(event->agregar_noticia(true));
		this.getNoAgregarNoticia().addClickListener(event->no_agregar_noticia());
	}

	public Zona_de_autor_y_version_de_noticia zonaAutorYVersionDeNoticia;
	public void Zona_De_Autor_Y_Version_De_Noticia() {
		this.zonaAutorYVersionDeNoticia = new Zona_de_autor_y_version_de_noticia(this._noticias_a_Revisar.editor, this.per, this.notice);
		this.getZonaDeAutorYVersionDeNoticia().add(this.zonaAutorYVersionDeNoticia);
	}
	
	@Override
	public void ConductorNoticia() {
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getLayoutGenericoVistaGenerica().setVisible(true);
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getRevisarNoticiasLayout().setVisible(false);
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		NVE = new Noticia_Vista_Editor (this._listar_noticias_generico.usuario.mainView.E, this._noticias_a_Revisar.usuarioocl, this.Notas);
		this._noticias_a_Revisar._unnamed_Revisar_noticias_.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NVE);
	}
	
	public void agregar_noticia(boolean agregar) {
		//Operación base de datos
		iEdito.agregar_noticia(notice.getId_valoracion(), agregar);
	}

	public void no_agregar_noticia() {
		//Operacion base de datos
		iEdito.no_agregar_noticia(notice.getId_valoracion());
	}
}