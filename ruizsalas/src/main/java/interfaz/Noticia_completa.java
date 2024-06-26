package interfaz;

import org.orm.PersistentException;

import ocl_proyecto.EditorDAO;
import ocl_proyecto.Usuario;

public class Noticia_completa extends Banner_suscrito {
	public Registrado _unnamed_Registrado_;
	public Contenido_noticia_completo Noticia;
	ocl_proyecto.Noticia noticia;
	ocl_proyecto.Usuario sus;

	public Noticia_completa(Registrado _registrado, ocl_proyecto.Usuario suscrito, ocl_proyecto.Noticia notice) {
		super(_registrado, suscrito);
		this._unnamed_Registrado_ = _registrado;
		this.noticia = notice;
		this.sus = suscrito;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getTextoPerfil().setVisible(false);
		this.getPerfilUsuarioLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
		this.getEditarPerfilLayout().setVisible(false);

		//ESTATICO CONTENIDO NOTICIA COMPLETO
		try {
			if(EditorDAO.getEditorByORMID(this.sus.getIdUsuario()) == null) {
				this.Noticia = new Contenido_noticia_completo(this._unnamed_Registrado_,this.sus, this.noticia, this);
				this.getNoticiaLayout().add(this.Noticia);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}