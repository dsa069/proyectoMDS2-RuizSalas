package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Noticia;
import vistas.VistaBarradebusqueda;

public class Barra_de_busqueda extends VistaBarradebusqueda {
	public Usuario usuario;
	public Busqueda_fallida busquedaFallida;
	public Noticia[] notice;
	iUsuario iUsu = new BD_Principal();

	public Barra_de_busqueda(Usuario usuario) {
		super();
		this.usuario = usuario;

		//this.getBotonRealizadorBusqueda().addClickListener(event->ConductorBusquedaFallida()); ESTO DONDE DEBERÍA ESTAR????????????????????
	}

	public void ConductorBusquedaFallida() {
		this.getLayoutGenericoDeBuscarNoticia().as(VerticalLayout.class).removeAll();
		busquedaFallida = new Busqueda_fallida(this.usuario);
		this.getLayoutGenericoDeBuscarNoticia().as(VerticalLayout.class).add(this.busquedaFallida);
	}

	public void ConductorBuscarNoticia() {
		//HACER
	}

	public Noticia[] Buscar() {
		//if(error)this.ConductorBusquedafallida else conductorBuscar noticas
		return iUsu.Buscar(this.getBarraBuscarNoticia().toString()); //Imaginemos cosas chingonas
	}
}