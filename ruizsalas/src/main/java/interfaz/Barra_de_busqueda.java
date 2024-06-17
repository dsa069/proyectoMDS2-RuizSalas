package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Noticia;
import vistas.VistaBarradebusqueda;

public class Barra_de_busqueda extends VistaBarradebusqueda {
	public Usuario usuario;
	public Busqueda_fallida busquedaFallida;
	public Busqueda search;
	public Noticia[] notice;
	iUsuario iUsu = new BD_Principal();

	public Barra_de_busqueda(Usuario usuario) {
		super();
		this.usuario = usuario;

		this.getBotonRealizadorBusqueda().addClickListener(event->Buscar());
	}

	public void ConductorBusquedaFallida() {
		this.usuario.banner.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		busquedaFallida = new Busqueda_fallida(this.usuario, null);
		this.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.busquedaFallida);
//		this.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
//		busquedaFallida = new Busqueda_fallida(this.usuario, null);
//		this.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.busquedaFallida);
	}

	public void ConductorBuscarNoticia() {
		this.usuario.banner.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		Notification.show("bebesita: " + notice.length);
		for (int i=0; i<notice.length; i++) {
			search = new Busqueda (this.usuario, notice[i]);
		}
		this.usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(search);
	}

	public Noticia[] Buscar() {
		//if(error)this.ConductorBusquedafallida else conductorBuscar noticas
		notice = iUsu.Buscar(this.getBarraBuscarNoticia().getValue());
		if (notice.length == 0) {
			this.ConductorBusquedaFallida();
		} else {
			this.ConductorBuscarNoticia();
		}
		return notice; //Imaginemos cosas chingonas
	}
}