package interfaz;
import org.orm.PersistentException;
import ocl_proyecto.Usuario_suscrito_DAO;
import vistas.*;
public class Editar_datos extends Introducir_datos_registro {
	public  Registrado registrado;
	public ocl_proyecto.Usuario user;

	public Editar_datos(Registrado registrado, ocl_proyecto.Usuario user) {
		super(registrado, user);
		this.registrado = registrado;
		this.user = user;
		this.getFotoTextamen().setVisible(true);
		this.getEditarPerfil().setVisible(true);

		try {
			if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(user.getIdUsuario()) != null) 
				this.getTarjetaDeCrédito().setVisible(true);
			else
				this.getTarjetaDeCrédito().setVisible(false);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}