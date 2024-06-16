package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import vistas.VistaPaginadeinicio;

public class Pagina_de_inicio extends VistaPaginadeinicio{
	//	private JScrollPanel _scroll;
	//	private JButton _next_page;
	public Usuario _unnamed_Usuario_;
	public Noticias_en_Portada _contiene;
	public Secciones_periodico SeccP;
	public Seleccion_de_secciones Selec;
	ocl_proyecto.Usuario usuarioocl;
	
	public iUsuario iusuario = new BD_Principal();

	public Pagina_de_inicio(Usuario usuario, ocl_proyecto.Usuario usuarioocl,  Seleccion_de_secciones Selec) {
		super();
		this._unnamed_Usuario_ = usuario;
		this.usuarioocl =  usuarioocl;
		this.Selec = Selec;
		this.Noticias_Portada();
		
		this.getBotonContinuarPaginaInicio().addClickListener(event->ConductorSiguientePagina());
	}
	
	public void Noticias_Portada() {
		this._contiene = new Noticias_en_Portada(this._unnamed_Usuario_, this.usuarioocl, this);
		this.getListaPortadaEstatica().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void ConductorSiguientePagina() {//SIguiente pag periodico (di)
		this._unnamed_Usuario_.mainView.P.BP.SS.getLayoutGenericoSeccionesBanner().removeAll();
		SeccP = new Secciones_periodico(this._unnamed_Usuario_, iusuario.cargar_seccion_primero());
		this._unnamed_Usuario_.mainView.P.BP.SS.getLayoutGenericoSeccionesBanner().add(SeccP);
	}
}