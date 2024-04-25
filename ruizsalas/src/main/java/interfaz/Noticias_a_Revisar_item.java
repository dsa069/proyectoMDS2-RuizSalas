package interfaz;

import vistas.*;

public class Noticias_a_Revisar_item extends Listar_noticias_generico_item {
//	private JButton _agregar_noticia;
//	private JButton _no_agregar_noticia;
//	private JLabel _autor;
//	private JLabel _foto;
//	private JLabel _version;
	public Noticias_a_Revisar _noticias_a_Revisar;
	public Noticias_a_Revisar_item(Listar_noticias_generico padre, ocl_proyecto.Noticia Notas) {
		super(padre,Notas);
		//this.getMarcar().setVisible(false);
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.Zona_De_Autor_Y_Version_De_Noticia();
		
		this.getTitular1().setText(Notas.getTitulo());
		
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
		throw new UnsupportedOperationException();
	}

	public void no_agregar_noticia() {
		//Operacion base de datos
		throw new UnsupportedOperationException();
	}
}