package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iRegistrado;
import basededatos.iUsuario_Registardo;
import ocl_proyecto.EditorDAO;

public class Contenido_noticia_completo extends Noticia {
	public Registrado _registrado;
	public iRegistrado iregistrado = new BD_Principal();
	public Noticia_completa CC;
	public Contenido_noticia_completo CCC;

	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Noticia noticia;


	public Contenido_noticia_completo(Registrado registrado, ocl_proyecto.Usuario usuario, ocl_proyecto.Noticia noticia, Noticia_completa CC) {
		super(registrado, noticia, usuario);
		this._registrado = registrado;
		this.noticia = noticia;
		this.usuario = usuario;
		this.CC = CC;
		this.getNoticiaCortada().setVisible(false);
		this.getSeleccionarSecciones().setVisible(false);
		this.getSeleccionarTematicas().setVisible(false);
		this.getEliminarNoticia().setVisible(false);
		this.getBotonSuscribirse().setVisible(false);

		//ESTATICO COMENTARIOS UR
		try {
			if(EditorDAO.getEditorByORMID(this.usuario.getIdUsuario()) == null) {
				this._contiene = new Lista_Comentarios_UR(this._registrado, this.usuario, this.noticia,this);
				this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.getNoticiaCompleta().setProperty("innerHTML",noticia.getTexto_largo()); 
		
		this.getBotonLikeNoticia().addClickListener(event->valorar_noticia(true));
		this.getBotonNotLikeNoticia().addClickListener(event->valorar_noticia(false));
	}

	public void valorar_noticia(boolean valoracion) {
		iregistrado.valorar_noticia(usuario.getIdUsuario(), noticia.getId_valoracion(), valoracion);

		this.CC.getNoticiaLayout().removeAll();
		CCC = new Contenido_noticia_completo(this._registrado,this.usuario, this.noticia, this.CC);
		this.CC.getNoticiaLayout().add(this.CCC);
	}
}