package interfaz;
import org.orm.PersistentException;

import ocl_proyecto.Usuario_suscrito_DAO;
import vistas.*;
public class Editar_datos extends Introducir_datos_registro {
	public  Registrado registrado;
	public ocl_proyecto.Usuario user;
	public 	ocl_proyecto.Usuario_suscrito_ suscrito;
	
	public Editar_datos(Registrado registrado, ocl_proyecto.Usuario user) {
		super(registrado, user);
		this.registrado = registrado;
		this.user = user;
		this.getFotoTextamen().setVisible(true);
		this.getEditarPerfil().setVisible(true);
		
		this.getCampoEmail().setValue(this.user.getCorreo());
		this.getCampoContrasena().setValue(this.user.getContrasena());
		this.getCampoApodo().setValue(this.user.getApodo());
		this.getCampoDNI().setValue(this.user.getDni());

		try {
			suscrito = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(user.getIdUsuario());
			if(suscrito != null) { 
				this.getTarjetaDeCrédito().setVisible(true);
				this.getTarjetaDeCrédito().setValue(String.valueOf(suscrito.getTarjeta_de_credito()));	
			}
			else
				this.getTarjetaDeCrédito().setVisible(false);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}