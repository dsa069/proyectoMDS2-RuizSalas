package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;
import ocl_proyecto.Noticia;
import ocl_proyecto.Usuario;

public class BD_Periodistas {
	public BD_Principal _bd_cont_periodistas;
	public Vector<Periodista> _contiene_periodistas = new Vector<Periodista>();

	public Periodista[] cargar_periodistas() {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_listar_mis_noticias(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void baja_periodista(int aIdUsuario) 
		throws PersistentException {
			Periodista periodista = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			periodista = PeriodistaDAO.getPeriodistaByORMID(aIdUsuario);
			PeriodistaDAO.deleteAndDissociate(periodista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}

	public Periodista registrar_periodista(String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) {
		throw new UnsupportedOperationException();
	}

	public Usuario confirmar_Datos_Periodista(String aCorreo, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios_Periodista(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) {
		throw new UnsupportedOperationException();
	}
}