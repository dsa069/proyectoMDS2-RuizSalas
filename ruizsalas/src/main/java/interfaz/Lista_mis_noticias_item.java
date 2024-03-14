package interfaz;

//import UCL Proyecto.Eliminar_noticia;
import vistas.VistaListarnoticiasgenerico_item;

public class Lista_mis_noticias_item extends Listar_noticias_generico_item {
//	private JButton _editar_noticia;
	public Lista_mis_noticias _lista_mis_noticias;
//	public Eliminar_noticia _contiene_la_opcion_de;
	public Lista_mis_noticias_item(Listar_noticias_generico padre) {
		super(padre);
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
	}
}