package interfaz;
import vistas.*;

public class Noticias_en_Portada_item extends Listar_noticias_item {
	public Noticias_en_Portada _noticias_en_Portada;
	
	public Noticias_en_Portada_item(Noticias_en_Portada padre, 	ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._noticias_en_Portada = padre;
		//this.getMarcar().setVisible(false);
	}
	
}