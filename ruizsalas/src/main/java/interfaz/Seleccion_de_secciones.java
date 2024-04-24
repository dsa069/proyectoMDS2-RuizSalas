package interfaz;

import java.util.Vector;
import vistas.*;

public class Seleccion_de_secciones extends Seleccion_de_secciones_generico {
	//private JTextField _barra_de_busqueda;
	//public Listar_noticias _puede_contener;
	public Vector<Seleccion_de_secciones_item> _item = new Vector<Seleccion_de_secciones_item>();
	
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
	public void Seleccion_de_secciones_item_Estatico() {
		Seleccion_de_secciones_item _item = new Seleccion_de_secciones_item(this);
		this.getLayoutSeccionesContenidasPeriodico().add(_item);
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