package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBarradebusqueda;

public class Barra_de_busqueda extends VistaBarradebusqueda {
	public Usuario usuario;
	public Busqueda_fallida busquedaFallida;
	public Barra_de_busqueda(Usuario usuario) {
		super();
	this.usuario = usuario;
	
	//this.getBarraBuscarNoticia().addClickListener(event->ConductorBusquedaFallida())); como hacer clicklistenner?
	}
	
	public void ConductorBusquedaFallida() {
		this.getLayoutGenericoDeBuscarNoticia().as(VerticalLayout.class).removeAll();
		busquedaFallida = new Busqueda_fallida(this.usuario);
		this.getLayoutGenericoDeBuscarNoticia().as(VerticalLayout.class).add(this.busquedaFallida);
	}
	
	public void ConductorBuscarNoticia() {
		//HACER
	}
	
	public void Buscar() {
		//if(error)this.ConductorBusquedafallida else conductorBuscar noticas
	}
}