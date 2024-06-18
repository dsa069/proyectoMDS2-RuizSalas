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
	public Seleccion_de_secciones Selec;
	iUsuario iUsu = new BD_Principal();

	public Barra_de_busqueda(Usuario usuario, Seleccion_de_secciones Selec) {
		super();
		this.usuario = usuario;
		this.Selec=Selec;

		this.getBotonRealizadorBusqueda().addClickListener(event->{
			notice = iUsu.Buscar(this.getBarraBuscarNoticia().getValue());
			Notification.show("bebesita: " + notice.length);
			Notification.show("mama: " + this.getBarraBuscarNoticia().getValue());
			if (notice.length == 0 || this.getBarraBuscarNoticia().getValue().isEmpty()) {
				this.Selec.getLayoutGenericoSeccionesBanner().removeAll();
				busquedaFallida = new Busqueda_fallida(this.usuario);
				this.Selec.getLayoutGenericoSeccionesBanner().add(this.busquedaFallida);
			} else {
				this.Selec.getLayoutGenericoSeccionesBanner().removeAll();
				search = new Busqueda (this.usuario, notice);
				this.Selec.getLayoutGenericoSeccionesBanner().add(search);
			}
		});
	}
}