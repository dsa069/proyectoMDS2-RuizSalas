package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.Tematica;
import ocl_proyecto.TematicaDAO;
import vistas.*;

public class Seleccionar_Tematica_itema extends VistaSeleccionartematica_item {
	public Seleccionar_Tematica _seleccionar_Tematica;
	public boolean temp;
	public Lista_Secciones_noticia Secciones;
	iEditor ieditor = new BD_Principal();
	ocl_proyecto.Tematica tematica;
	ocl_proyecto.Noticia noticia;

	public Seleccionar_Tematica_itema(Seleccionar_Tematica _seleccionar_Tematica, ocl_proyecto.Tematica tematica, ocl_proyecto.Noticia noticia, boolean temp) {
		super();
		this._seleccionar_Tematica = _seleccionar_Tematica;
		this.tematica = tematica;
		this.noticia = noticia;
		this.temp = temp;
		
		 if(this.noticia == null || this.noticia.getId_valoracion() == 0 ) {
			if (temp) {
				this.getBotonCheckboxVacio().setVisible(false);
				this.getBotonCheckboxRelleno().setVisible(true);
			}else {
				this.getBotonCheckboxRelleno().setVisible(false);
				this.getBotonCheckboxVacio().setVisible(true);
			}
		}
		else {
			try {
		
				if (!NoticiaDAO.getNoticiaByORMID(this.noticia.getId_valoracion()).contiene.contains(TematicaDAO.getTematicaByORMID(tematica.getIdTematica()))) {
					this.getBotonCheckboxRelleno().setVisible(false);
					this.getBotonCheckboxVacio().setVisible(true);
				} else {
					this.getBotonCheckboxVacio().setVisible(false);
					this.getBotonCheckboxRelleno().setVisible(true);
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.getSeleccionTamaticaNoticia().setText("" + tematica.getNombre());
		this.getBotonCheckboxRelleno().addClickListener(event->{
			if (this.noticia == null || this.noticia.getId_valoracion() == 0 ) {
				//NO GUARDAR TEMATICA
				_seleccionar_Tematica.tematicasNoticia.remove(this.tematica);
				for (Tematica tematica2 : _seleccionar_Tematica.tematicasNoticia) {
					Notification.show("EN ARRAY " + tematica2.getNombre());
				}
				this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).remove(this);
				Seleccionar_Tematica_itema STI = new Seleccionar_Tematica_itema(this._seleccionar_Tematica, this.tematica, null, false);
				this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).add(STI);
			} else {
				marcar_tematica();
			}
				
		});
		this.getBotonCheckboxVacio().addClickListener(event->{
			if (this.noticia == null || this.noticia.getId_valoracion() == 0 ) {
				//GUARDAR TEMATICA
				
				_seleccionar_Tematica.tematicasNoticia.add(this.tematica);
				for (Tematica tematica2 : _seleccionar_Tematica.tematicasNoticia) {
					Notification.show("EN ARRAY " + tematica2.getNombre());
				}
				this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).remove(this);
				Seleccionar_Tematica_itema STI = new Seleccionar_Tematica_itema(this._seleccionar_Tematica, this.tematica, null, true);
				this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).add(STI);
			} else {
				marcar_tematica();
			}
		});
		
	}
	
	public void marcar_tematica() {
		ieditor.marcar_tematica(this.tematica.getIdTematica(), this.noticia.getId_valoracion());
		
		this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).remove(this);
		Seleccionar_Tematica_itema STI = new Seleccionar_Tematica_itema(this._seleccionar_Tematica, this.tematica, this.noticia, false);
		this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).add(STI);
		
		this._seleccionar_Tematica.Content.getSeleccionarSecciones().as(VerticalLayout.class).removeAll();
		this.Secciones = new Lista_Secciones_noticia(this._seleccionar_Tematica.Content.editor, this.noticia, this._seleccionar_Tematica.Content);
		this._seleccionar_Tematica.Content.getSeleccionarSecciones().as(VerticalLayout.class).add(Secciones);

	}
}