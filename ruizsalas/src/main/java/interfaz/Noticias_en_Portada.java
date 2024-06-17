package interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import ocl_proyecto.Noticia;
import ocl_proyecto.Seccion;
import vistas.*;

public class Noticias_en_Portada extends Listar_noticias {
	public Pagina_de_inicio _unnamed_Pagina_de_inicio_;
    public Usuario _usuario;
	ocl_proyecto.Usuario usuarioocl;
    
	public Noticias_en_Portada(Usuario _usuario,  ocl_proyecto.Usuario usuarioocl, Pagina_de_inicio _unnamed_Pagina_de_inicio_ ) {
		super(_usuario, usuarioocl, null);
		this._usuario = _usuario;
		this.usuarioocl =  usuarioocl;
		this._unnamed_Pagina_de_inicio_ = _unnamed_Pagina_de_inicio_;
		this.getPortada().setVisible(true);
	}
	
	@Override
	public void Noticia_item() {
		notice = this.cargar_noticias();
		Noticias_en_Portada_item _item = new Noticias_en_Portada_item(this, this.notice[0]);
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