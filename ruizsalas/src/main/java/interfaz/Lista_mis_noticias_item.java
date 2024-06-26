package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iPeriodista;
//import UCL Proyecto.Eliminar_noticia;
import vistas.VistaListarnoticiasgenerico_item;

public class Lista_mis_noticias_item extends Listar_noticias_generico_item {
	public Lista_mis_noticias _lista_mis_noticias;
	public Crear_Editar_Noticia crearEditarNoticia;

	iPeriodista iPeriodita = new BD_Principal();

	public Lista_mis_noticias_item(Lista_mis_noticias padre, ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._lista_mis_noticias = padre;
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		this.getAnadirNoticiaPrincipal().setVisible(false);

		this.getTitular1().setText("" + Notas.getTitulo());

		this.getEliminarNoticiaPropia().addClickListener(event->eliminar_noticia_propia());

		//DINAMICO IR A EDITAR NOTICIA
		this.getEditarNoticia().addClickListener(event->{
			this._lista_mis_noticias.periodista.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			crearEditarNoticia = new Crear_Editar_Noticia(this._lista_mis_noticias.periodista, this._lista_mis_noticias._unnamed_Historial_noticias_.periodista,this.Notas);
			this._lista_mis_noticias.periodista.getBannerGenericoEstatico().as(VerticalLayout.class).add(crearEditarNoticia);
		});
	}

	@Override
	public void ConductorNoticia() {
		this._lista_mis_noticias._unnamed_Historial_noticias_.getLayoutGenericoVistaGenerica().setVisible(true);
		this._lista_mis_noticias._unnamed_Historial_noticias_.getHistorialNoticiasLayout().setVisible(false);
		this._lista_mis_noticias._unnamed_Historial_noticias_.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.E, this._lista_mis_noticias._unnamed_Historial_noticias_.periodista, this.Notas);
		this._lista_mis_noticias._unnamed_Historial_noticias_.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
	}

	public void eliminar_noticia_propia() {
		iPeriodita.eliminar_noticia_propia(this.Notas.getId_valoracion());
		this._lista_mis_noticias._unnamed_Historial_noticias_.getHistorialNoticiasEstatico().as(VerticalLayout.class).removeAll();
		this._lista_mis_noticias._unnamed_Historial_noticias_._contiene = new Lista_mis_noticias(this._lista_mis_noticias._unnamed_Historial_noticias_._unnamed_Periodista_, _lista_mis_noticias._unnamed_Historial_noticias_);
		this._lista_mis_noticias._unnamed_Historial_noticias_._contiene.Noticia_item(this._lista_mis_noticias._unnamed_Historial_noticias_.periodista.getIdUsuario());
		this._lista_mis_noticias._unnamed_Historial_noticias_.getHistorialNoticiasEstatico().as(VerticalLayout.class).add(this._lista_mis_noticias._unnamed_Historial_noticias_._contiene);
	}
}