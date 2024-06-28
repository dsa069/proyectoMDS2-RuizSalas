package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;
import ocl_proyecto.Editor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;
import ocl_proyecto.Usuario;

public class BD_Usuarios_suscritos {
	public BD_Principal _bd_cont_us_suscritos;
	public Vector<Usuario_suscrito_> _contiene_usuarios_suscritos = new Vector<Usuario_suscrito_>();

	public void cancelar_cobro_suscripcion(int aIdUsuario) 
		throws PersistentException {
			Usuario_suscrito_ us_sus = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			us_sus = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(aIdUsuario);
			us_sus.setBaja(false);
			Usuario_suscrito_DAO.save(us_sus);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Usuario_suscrito_ crear_Usuario(String aCorreo, String aContrasena, String aApodo, String aFoto_de_perfil, String aDni, long aTarjeta_de_credito) 
		throws PersistentException {
			Usuario_suscrito_ us_sus = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			us_sus = Usuario_suscrito_DAO.createUsuario_suscrito_();
			us_sus.setApodo(aApodo);
			us_sus.setDni(aDni);
			us_sus.setCorreo(aCorreo);
			us_sus.setContrasena(aContrasena);
			us_sus.setFoto_de_perfil(aFoto_de_perfil);
			us_sus.setTarjeta_de_credito(aTarjeta_de_credito);
			us_sus.setBaja(true);
			Usuario_suscrito_DAO.save(us_sus);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return us_sus;
	}

	public Usuario confirmar_Datos_US(String aCorreo, String aContrasena) 
		throws PersistentException {
			Usuario_suscrito_ us_sus = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			us_sus = Usuario_suscrito_DAO.loadUsuario_suscrito_ByQuery(
					"correo = '"+aCorreo+"' AND contrasena = '"+aContrasena+"' AND Baja ='"+1+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return us_sus;
	}

	public void guardar_cambios_US(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil, long aTarjeta_de_credito) 
		throws PersistentException {
			Usuario_suscrito_ us_sus = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			us_sus = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(aIdUsuario);
			us_sus.setApodo(aApodo);
			us_sus.setDni(aDni);
			us_sus.setCorreo(aCorreo);
			us_sus.setContrasena(aContrasena);
			if(aFoto_de_perfil != null)
				us_sus.setFoto_de_perfil(aFoto_de_perfil);
			us_sus.setTarjeta_de_credito(aTarjeta_de_credito);
			Usuario_suscrito_DAO.save(us_sus);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}
}