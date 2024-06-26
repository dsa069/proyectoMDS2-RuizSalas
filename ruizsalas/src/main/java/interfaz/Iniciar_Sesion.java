package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;

public class Iniciar_Sesion extends Banner_no_registrado{
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	public Introducir_Datos _contiene;
	public Usuario_Registardo usreg;
	public Periodista uspe;
	public Editor used;

	ocl_proyecto.Usuario user;
	public iUsuario_No_Registrado iUsuario_No_Registrado = new BD_Principal();

	public Iniciar_Sesion(Usuario_No_Registrado _usuarioNoRegistrado, ocl_proyecto.Usuario usuario) {
		super(_usuarioNoRegistrado, usuario);
		this._unnamed_Usuario_No_Registrado_ = _usuarioNoRegistrado;
		this.user = usuario;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getIniciarSesionLayout().setVisible(true);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);

		//ESTATICO INSERTAR DATOS
		this._contiene = new Introducir_Datos(this._unnamed_Usuario_No_Registrado_, this.user);
		this.getDatosIniciarSesionEstaticos().as(VerticalLayout.class).add(this._contiene);

		this.getBotonCancelarSesion().addClickListener(event->{
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			registro = new Registro(this._usuarioNoRegistrado, this.usuario);
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).add(registro);
		});
		this.getBotonConfirmarSesion().addClickListener(event->confirmar_Datos());
	}

	public void confirmar_Datos() {
		user = iUsuario_No_Registrado.confirmar_Datos(this._contiene.getCampoEmail().getValue(), this._contiene.getCampoContrasena().getValue());
		try {
			if(user == null) {
				Notification.show("Usuario incorrecrto");
			} else if (Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(user.getIdUsuario())!=null) {
				this._unnamed_Usuario_No_Registrado_.mainView.removeAll();
				usreg = new Usuario_Registardo(this._unnamed_Usuario_No_Registrado_.mainView, (Usuario_suscrito_) user);
				this._unnamed_Usuario_No_Registrado_.mainView.add(usreg);
			} else if (PeriodistaDAO.getPeriodistaByORMID(user.getIdUsuario())!=null) {
				this._unnamed_Usuario_No_Registrado_.mainView.removeAll();
				uspe = new Periodista(this._unnamed_Usuario_No_Registrado_.mainView, (ocl_proyecto.Periodista) user);
				this._unnamed_Usuario_No_Registrado_.mainView.add(uspe);
			} else if (EditorDAO.getEditorByORMID(user.getIdUsuario())!=null) {
				this._unnamed_Usuario_No_Registrado_.mainView.removeAll();
				used = new Editor(this._unnamed_Usuario_No_Registrado_.mainView,  (ocl_proyecto.Editor) user);
				this._unnamed_Usuario_No_Registrado_.mainView.add(used);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}