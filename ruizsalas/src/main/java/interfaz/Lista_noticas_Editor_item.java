package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Lista_noticas_Editor_item extends Listar_noticias_item {
	public Lista_noticas_Editor _lista_noticas_Editor;

	int seecionId;
	iEditor iEdito = new BD_Principal();

	public Lista_noticas_Editor_item(Lista_noticas_Editor padre, ocl_proyecto.Noticia Notas, int seccionId) {
		super(padre, Notas, false);
		this._lista_noticas_Editor = padre;
		this.seecionId=seccionId;
		this.getQuitarNoticiaDeSeccion().setVisible(true);
		this.getAnadirNoticiaPrincipal().setVisible(true);

		this.getQuitarNoticiaDeSeccion().addClickListener(event->quitar_noticia_de_seccion());
		this.getMasPP().addClickListener(event ->{ iEdito.ordenar_portada(this.Notas.getId_valoracion(), false);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().removeAll();
		this._lista_noticas_Editor.LSE._contiene = new Lista_noticas_Editor(this._lista_noticas_Editor.LSE._editor, _lista_noticas_Editor.LSE, this.seecionId);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().add(this._lista_noticas_Editor.LSE._contiene);
		});
		this.getMenosPP().addClickListener(event ->{ iEdito.ordenar_portada(this.Notas.getId_valoracion(), true);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().removeAll();
		this._lista_noticas_Editor.LSE._contiene = new Lista_noticas_Editor(this._lista_noticas_Editor.LSE._editor, _lista_noticas_Editor.LSE, this.seecionId);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().add(this._lista_noticas_Editor.LSE._contiene);
		});
	}

	public void quitar_noticia_de_seccion() {
		iEdito.quitar_noticia_de_seccion(this.Notas.getId_valoracion(), seecionId);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().removeAll();
		this._lista_noticas_Editor.LSE._contiene = new Lista_noticas_Editor(this._lista_noticas_Editor.LSE._editor, this._lista_noticas_Editor.LSE, this.seecionId);
		this._lista_noticas_Editor.LSE.getListaDeNoticiasEstatico().add(this._lista_noticas_Editor.LSE._contiene);
	}

	public void ConductorNoticia() {
		this._lista_noticas_Editor.LSE._lista_secciones_Editor.CBT.SESG.SESVE.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		NVE = new Noticia_Vista_Editor (this._lista_noticas_Editor._editor, this._lista_noticas_Editor.LSE._lista_secciones_Editor.CBT.SESG.SESVE.usuarioocl, this.Notas, this);
		this._lista_noticas_Editor.LSE._lista_secciones_Editor.CBT.SESG.SESVE.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NVE);
	}
}