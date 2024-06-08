package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iPeriodista;
import ocl_proyecto.Noticia;
import vistas.*;

public class Lista_mis_noticias extends Listar_noticias_generico {
	public Historial_noticias _unnamed_Historial_noticias_;
	public Vector<Lista_mis_noticias_item> _item = new Vector<Lista_mis_noticias_item>();
	public Noticia[] notice;
	
	ocl_proyecto.Usuario user;
	
	iPeriodista iPeriodita = new BD_Principal();
	
	public Periodista periodista;
	public Lista_mis_noticias(Periodista usuario) {
		super(usuario);
		this.periodista = usuario;
		this.getPortada().setVisible(false);
		this.getColumnasNoticias().setVisible(false);
		
	}
	
	@Override
	public void Noticia_item() {
		notice = this.cargar_noticias();
		for (int i=0; i<notice.length; i++) {
			Lista_mis_noticias_item _item = new Lista_mis_noticias_item(this, this.notice[i]);
			this.getListaSimpleNoticias().as(VerticalLayout.class).add(_item);
		}
	}
	
	public Noticia[] cargar_listar_mis_noticias() {
		return iPeriodita.cargar_listar_mis_noticias(user.getIdUsuario());
	}
	
	@Override
	public Noticia[] cargar_noticias() {
		return iPeriodita.cargar_listar_mis_noticias(this.user.getIdUsuario());
	}
}