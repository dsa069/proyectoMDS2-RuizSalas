package interfaz;

import vistas.*;

public class Noticias_a_Revisar_item extends Listar_noticias_generico_item {
//	private JButton _agregar_noticia;
//	private JButton _no_agregar_noticia;
//	private JLabel _autor;
//	private JLabel _foto;
//	private JLabel _version;
	public Noticias_a_Revisar _noticias_a_Revisar;
	public Noticias_a_Revisar_item(Listar_noticias_generico padre) {
		super(padre);
		//this.getMarcar().setVisible(false);
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.getAgregarNoticia().addClickListener(event->agregar_noticia());
		this.getNoAgregarNoticia().addClickListener(event->no_agregar_noticia());
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