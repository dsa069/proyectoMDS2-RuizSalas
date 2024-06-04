package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Noticia;
import ocl_proyecto.Periodista;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;

import java.util.Date;
import ocl_proyecto.Tematica;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;

public class Bd_Noticias {
	public BD_Principal _bd_cont_noticias;
	public Vector<Noticia> _contiene_noticias = new Vector<Noticia>();

	public Noticia[] cargar_noticias_a_revisar(boolean aAgregada) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_listar_mis_noticias(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_secciones_generico(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_noticia_propia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void agregar_noticia(int aId_noticia, boolean aAgregada) {
		throw new UnsupportedOperationException();
	}

	public void no_agregar_noticia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_noticia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas) {
		throw new UnsupportedOperationException();
	}

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion) 
	throws PersistentException {
		Noticia noticia = null;
		Usuario_suscrito_ usuario = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
	try {
		noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
		usuario = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(aIdUsuario);
		
		if(!noticia.es_valorado_por.contains(usuario)) {//SI YA HA VALORADO, NO PUEDE VOLVER A VALORAR
			noticia.es_valorado_por.add(usuario);
			if(aValoracion)
				noticia.setNum_likes(noticia.getNum_likes()+1);
			else
				noticia.setNum_dislikes(noticia.getNum_dislikes()+1);
			NoticiaDAO.save(noticia);
		}
		t.commit();
	} catch (Exception e) {
		t.rollback();
	}
	//	ProyectoPersistentManager.instance().disposePersistentManager();

	}

	public Noticia[] Buscar(String aBusqueda) {
		throw new UnsupportedOperationException();
	}
	
	public Noticia[] cargar_lista_mis_noticias(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}