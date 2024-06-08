/**
 * Licensee: Daniel Salas(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoMDS2RuizSalas20232024Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			ocl_proyecto.Usuario locl_proyectoUsuario = ocl_proyecto.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.UsuarioDAO.save(locl_proyectoUsuario);
			ocl_proyecto.Editor locl_proyectoEditor = ocl_proyecto.EditorDAO.loadEditorByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.EditorDAO.save(locl_proyectoEditor);
			ocl_proyecto.Usuario_suscrito_ locl_proyectoUsuario_suscrito_ = ocl_proyecto.Usuario_suscrito_DAO.loadUsuario_suscrito_ByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.Usuario_suscrito_DAO.save(locl_proyectoUsuario_suscrito_);
			ocl_proyecto.Valoracion locl_proyectoValoracion = ocl_proyecto.ValoracionDAO.loadValoracionByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.ValoracionDAO.save(locl_proyectoValoracion);
			ocl_proyecto.Comentario locl_proyectoComentario = ocl_proyecto.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.ComentarioDAO.save(locl_proyectoComentario);
			ocl_proyecto.Periodista locl_proyectoPeriodista = ocl_proyecto.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.PeriodistaDAO.save(locl_proyectoPeriodista);
			ocl_proyecto.Noticia locl_proyectoNoticia = ocl_proyecto.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.NoticiaDAO.save(locl_proyectoNoticia);
			ocl_proyecto.Seccion locl_proyectoSeccion = ocl_proyecto.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.SeccionDAO.save(locl_proyectoSeccion);
			ocl_proyecto.Tematica locl_proyectoTematica = ocl_proyecto.TematicaDAO.loadTematicaByQuery(null, null);
			// Update the properties of the persistent object
			ocl_proyecto.TematicaDAO.save(locl_proyectoTematica);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		ocl_proyecto.UsuarioCriteria locl_proyectoUsuarioCriteria = new ocl_proyecto.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoUsuarioCriteria.idUsuario.eq();
		System.out.println(locl_proyectoUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Editor by EditorCriteria");
		ocl_proyecto.EditorCriteria locl_proyectoEditorCriteria = new ocl_proyecto.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoEditorCriteria.idUsuario.eq();
		System.out.println(locl_proyectoEditorCriteria.uniqueEditor());
		
		System.out.println("Retrieving Usuario_suscrito_ by Usuario_suscrito_Criteria");
		ocl_proyecto.Usuario_suscrito_Criteria locl_proyectoUsuario_suscrito_Criteria = new ocl_proyecto.Usuario_suscrito_Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoUsuario_suscrito_Criteria.idUsuario.eq();
		System.out.println(locl_proyectoUsuario_suscrito_Criteria.uniqueUsuario_suscrito_());
		
		System.out.println("Retrieving Valoracion by ValoracionCriteria");
		ocl_proyecto.ValoracionCriteria locl_proyectoValoracionCriteria = new ocl_proyecto.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoValoracionCriteria.id_valoracion.eq();
		System.out.println(locl_proyectoValoracionCriteria.uniqueValoracion());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		ocl_proyecto.ComentarioCriteria locl_proyectoComentarioCriteria = new ocl_proyecto.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoComentarioCriteria.id_valoracion.eq();
		System.out.println(locl_proyectoComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Periodista by PeriodistaCriteria");
		ocl_proyecto.PeriodistaCriteria locl_proyectoPeriodistaCriteria = new ocl_proyecto.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoPeriodistaCriteria.idUsuario.eq();
		System.out.println(locl_proyectoPeriodistaCriteria.uniquePeriodista());
		
		System.out.println("Retrieving Noticia by NoticiaCriteria");
		ocl_proyecto.NoticiaCriteria locl_proyectoNoticiaCriteria = new ocl_proyecto.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoNoticiaCriteria.id_valoracion.eq();
		System.out.println(locl_proyectoNoticiaCriteria.uniqueNoticia());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		ocl_proyecto.SeccionCriteria locl_proyectoSeccionCriteria = new ocl_proyecto.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoSeccionCriteria.idSeccion.eq();
		System.out.println(locl_proyectoSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Tematica by TematicaCriteria");
		ocl_proyecto.TematicaCriteria locl_proyectoTematicaCriteria = new ocl_proyecto.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//locl_proyectoTematicaCriteria.idTematica.eq();
		System.out.println(locl_proyectoTematicaCriteria.uniqueTematica());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoMDS2RuizSalas20232024Data retrieveAndUpdateProyectoMDS2RuizSalas20232024Data = new RetrieveAndUpdateProyectoMDS2RuizSalas20232024Data();
			try {
				retrieveAndUpdateProyectoMDS2RuizSalas20232024Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoMDS2RuizSalas20232024Data.retrieveByCriteria();
			}
			finally {
				ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
