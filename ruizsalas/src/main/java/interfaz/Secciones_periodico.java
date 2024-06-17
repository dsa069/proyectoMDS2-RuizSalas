package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BD_Principal;
import basededatos.iUsuario;
import vistas.VistaSeccionesperiodico;

public class Secciones_periodico extends VistaSeccionesperiodico{
	public Usuario _accede;
	public Listar_Secciones _contiene;
	public Seleccion_de_secciones_item SSI;
	public iUsuario iusuario = new BD_Principal();
	public ocl_proyecto.Seccion seccion;

	public Secciones_periodico(Usuario usuario, ocl_proyecto.Seccion seccion,  Seleccion_de_secciones_item SSI) {
		super();
		this._accede = usuario;
		this.seccion = seccion;
		this.SSI = SSI;
		//Lista de secciones
		this._contiene = new Listar_Secciones(this._accede, this.seccion, this);
		this.getListaNoticiasEstatica().as(VerticalLayout.class).add(this._contiene);
		
		this.getBotonAvazarPaginaPeriodico().addClickListener(event->{
			this.getListaNoticiasEstatica().as(VerticalLayout.class).removeAll();
			_contiene = new Listar_Secciones(this._accede, this.seccion =  iusuario.cargar_seccion_palanteypatras(this.seccion.getIdSeccion(), true), this);
			this.getListaNoticiasEstatica().as(VerticalLayout.class).add(_contiene);
		});
		this.getBotonVolverPaginaAnterior().addClickListener(event->{
			this.getListaNoticiasEstatica().as(VerticalLayout.class).removeAll();
			_contiene = new Listar_Secciones(this._accede, this.seccion =  iusuario.cargar_seccion_palanteypatras(this.seccion.getIdSeccion(), false), this);
			this.getListaNoticiasEstatica().as(VerticalLayout.class).add(_contiene);
		});
	}
}