package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.Noticia;
import ocl_proyecto.Seccion;
import vistas.*;

public class Noticias_en_Portada extends Listar_noticias {
//	private JButton _acceder__a_noticia;
//	private JLabel _imagen_principal;
//	private JLabel _titulo;
//	private JLabel _resumen_corto;
//	private JLabel _valoracion;
	public Pagina_de_inicio _unnamed_Pagina_de_inicio_;
	public Vector<Noticias_en_Portada_item> _item = new Vector<Noticias_en_Portada_item>();
    public Usuario _usuario;
	public Noticias_en_Portada(Usuario _usuario) {
		super(_usuario);
		this._usuario = _usuario;
		this.getPortada().setVisible(true);
	}
	
	@Override
	public void Noticia_item() {
		notice = this.cargar_noticias();
		Listar_noticias_generico_item _item = new Listar_noticias_generico_item(this, this.notice[0]);
		this.getPortada().add(_item);
		for (int i=1; i<notice.length; i++) {
			Noticias_en_Portada_item ambatukam = new Noticias_en_Portada_item(this, this.notice[i]);
			this.getColumnasNoticias().add(ambatukam);
		}
	}
	@Override
	public Noticia[] cargar_noticias() {
		return iUsuario.cargar_noticias_portada();
	}
}