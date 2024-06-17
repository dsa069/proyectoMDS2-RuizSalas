package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import basededatos.iPeriodista;
import ocl_proyecto.Noticia;
import ocl_proyecto.PeriodistaDAO;
import vistas.*;

public class Lista_mis_noticias extends Listar_noticias_generico {
	public Historial_noticias _unnamed_Historial_noticias_;
	public Vector<Lista_mis_noticias_item> _item = new Vector<Lista_mis_noticias_item>();
	public Noticia[] notice;
	public Noticia[] not;
	

	iPeriodista yuseppe = new BD_Principal();

	
	public Periodista periodista;
	public Lista_mis_noticias(Periodista usuario, Historial_noticias _unnamed_Historial_noticias_) {
		super(usuario);
		this.periodista = usuario;
		this._unnamed_Historial_noticias_ =_unnamed_Historial_noticias_;
		this.getPortada().setVisible(false);
		this.getColumnasNoticias().setVisible(false);
		
	}
	

	public void Noticia_item(int IdPeriodista) {
		notice = this.cargar_noticias(IdPeriodista);
		for (int i=0; i<notice.length; i++) {
			Lista_mis_noticias_item _item = new Lista_mis_noticias_item(this, this.notice[i]);
			this.getListaSimpleNoticias().as(VerticalLayout.class).add(_item);
		}
	}
	
	@Override
	public void Noticia_item() {

	}
	
	@Override
	public Noticia[] cargar_noticias() {
		return null;
	}
	
	public Noticia[] cargar_noticias(int IdPeriodista) {
		return yuseppe.cargar_listar_mis_noticias(IdPeriodista);
	}
}