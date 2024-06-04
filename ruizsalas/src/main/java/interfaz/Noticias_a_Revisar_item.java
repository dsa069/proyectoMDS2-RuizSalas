package interfaz;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Noticias_a_Revisar_item extends Listar_noticias_generico_item {
//	private JButton _agregar_noticia;
//	private JButton _no_agregar_noticia;
//	private JLabel _autor;
//	private JLabel _foto;
//	private JLabel _version;
	public Noticias_a_Revisar _noticias_a_Revisar;
	
	ocl_proyecto.Noticia notice;
	
	iEditor iEdito = new BD_Principal();
	
	public Noticias_a_Revisar_item(Noticias_a_Revisar padre, ocl_proyecto.Noticia Notas) {
		super(padre,Notas);
		this._noticias_a_Revisar = padre;
		//this.getMarcar().setVisible(false);
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.Zona_De_Autor_Y_Version_De_Noticia();
		
//		this.getTitular1().setText(Notas.getTitulo());
		
		this.getAgregarNoticia().addClickListener(event->agregar_noticia());
		this.getNoAgregarNoticia().addClickListener(event->no_agregar_noticia());
	}

	public Zona_de_autor_y_version_de_noticia zonaAutorYVersionDeNoticia;
	public void Zona_De_Autor_Y_Version_De_Noticia() {
		this.zonaAutorYVersionDeNoticia = new Zona_de_autor_y_version_de_noticia(this._noticias_a_Revisar.editor,null);
		this.getZonaDeAutorYVersionDeNoticia().add(this.zonaAutorYVersionDeNoticia);
	}
	
	public void agregar_noticia() {
		//Operación base de datos
		iEdito.agregar_noticia(notice.getId_noticia(), notice.getAgregada());
		throw new UnsupportedOperationException();
	}

	public void no_agregar_noticia() {
		//Operacion base de datos
		iEdito.no_agregar_noticia(notice.getId_noticia());
		throw new UnsupportedOperationException();
	}
}