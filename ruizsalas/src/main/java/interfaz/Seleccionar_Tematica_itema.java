package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.TematicaDAO;
import vistas.*;

public class Seleccionar_Tematica_itema extends VistaSeleccionartematica_item {
	public Seleccionar_Tematica _seleccionar_Tematica;
	iEditor ieditor = new BD_Principal();
	ocl_proyecto.Tematica tematica;
	ocl_proyecto.Noticia noticia;
	public Seleccionar_Tematica_itema(Seleccionar_Tematica _seleccionar_Tematica, ocl_proyecto.Tematica tematica, ocl_proyecto.Noticia noticia) {
		super();
		this._seleccionar_Tematica = _seleccionar_Tematica;
		this.tematica = tematica;
		this.noticia = noticia;
		
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
		
		this.getSeleccionTamaticaNoticia().setText("" + tematica.getNombre());
		this.getBotonCheckboxRelleno().addClickListener(event->marcar_tematica());
		this.getBotonCheckboxVacio().addClickListener(event->marcar_tematica());
	}

	public void marcar_tematica() {
		ieditor.marcar_tematica(this.tematica.getIdTematica(), this.noticia.getId_valoracion());
		this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).remove(this);
		Seleccionar_Tematica_itema STI = new Seleccionar_Tematica_itema(this._seleccionar_Tematica, this.tematica, this.noticia);
		this._seleccionar_Tematica.getTematicaSelecionableItem().as(VerticalLayout.class).add(STI);
	}

}