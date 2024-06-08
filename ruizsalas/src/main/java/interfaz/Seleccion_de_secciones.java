package interfaz;

import java.util.Vector;

import ocl_proyecto.Seccion;
import vistas.*;

public class Seleccion_de_secciones extends Seleccion_de_secciones_generico {
	//private JTextField _barra_de_busqueda;
	//public Listar_noticias _puede_contener;
	public Vector<Seleccion_de_secciones_item> _item = new Vector<Seleccion_de_secciones_item>();
	
	ocl_proyecto.Seccion seccion;
	
	public Usuario _usuario;
	public Seleccion_de_secciones(Usuario _usuario) {
		super(_usuario);
		this._usuario = _usuario;
		this.getBarraDeBusqueda().setVisible(true);
		this.getEditarTexto().setVisible(false);
		this.getMsgError().setVisible(true);
		
		this.CEseccionesEstatico();
		this.barraBusqueda();	
		this.InicioPortada();
	}
	
	@Override
	public void Seleccion_de_secciones_item_Estatico(Seccion[] sec) {
		sec = cargar_secciones_generico();
		for (int i=0; i<sec.length; i++) {
			Seleccion_de_secciones_item SSI = new Seleccion_de_secciones_item(this, sec[i]);
			this.getLayoutSeccionesContenidasPeriodico().add(SSI);
		}
	}
	
	public void barraBusqueda() {
		buscar = new Barra_de_busqueda(this.usuario);
		this.getBarraDeBusqueda().add(this.buscar);
	}
	
	public void InicioPortada() {
		this.pagInicio = new Pagina_de_inicio(this.usuario);
		this.getLayoutGenericoSeccionesBanner().add(pagInicio);
	}
	
	@Override
	public void CEseccionesEstatico() {
//no hace lo del super
	}
}