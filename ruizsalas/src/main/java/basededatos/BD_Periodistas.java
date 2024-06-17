package basededatos;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;
import ocl_proyecto.Comentario;
import ocl_proyecto.ComentarioDAO;
import ocl_proyecto.Editor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Noticia;
import ocl_proyecto.Usuario;
import ocl_proyecto.Usuario_suscrito_DAO;

public class BD_Periodistas {
	public BD_Principal _bd_cont_periodistas;
	public ArrayList<Periodista> _contiene_periodistas = new ArrayList<Periodista>();

	public Periodista[] cargar_periodistas() 
		throws PersistentException {
			Periodista[] periodistas = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			periodistas = PeriodistaDAO.listPeriodistaByQuery(null, null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			return periodistas;
		} catch (Exception e) {
			t.rollback();
			return null;
		}
	}

	public void baja_periodista(int aIdUsuario) 
		throws PersistentException {
			Periodista periodista = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			periodista = PeriodistaDAO.getPeriodistaByORMID(aIdUsuario);
			periodista.setBaja(false);
			PeriodistaDAO.save(periodista);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Periodista registrar_periodista(String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) 
		throws PersistentException {
			Periodista periodista = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			periodista = PeriodistaDAO.createPeriodista();
			periodista.setApodo(aApodo);
			periodista.setDni(aDni);
			periodista.setCorreo(aCorreo);
			periodista.setContrasena(aContrasena);
			periodista.setFoto_de_perfil(aFoto_de_perfil);
			periodista.setBaja(true);
			PeriodistaDAO.save(periodista);
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return periodista;
	}

	public Usuario confirmar_Datos_Periodista(String aCorreo, String aContrasena) 
		throws PersistentException {
			Periodista periodista = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			periodista = PeriodistaDAO.loadPeriodistaByQuery(
					"correo = '"+aCorreo+"' AND contrasena = '"+aContrasena+"' AND Baja ='"+1+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}	
		return periodista;
	}

	public void guardar_cambios_Periodista(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) 
		throws PersistentException {
			Periodista periodista = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			periodista = PeriodistaDAO.getPeriodistaByORMID(aIdUsuario);
			periodista.setApodo(aApodo);
			periodista.setDni(aDni);
			periodista.setCorreo(aCorreo);
			periodista.setContrasena(aContrasena);
			periodista.setFoto_de_perfil(aFoto_de_perfil);
			PeriodistaDAO.save(periodista);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}
}