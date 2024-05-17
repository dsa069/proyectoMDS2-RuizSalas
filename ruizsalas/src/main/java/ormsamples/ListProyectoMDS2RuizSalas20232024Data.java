/**
 * Licensee: Daniel Salas(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoMDS2RuizSalas20232024Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		ocl_proyecto.Usuario[] ocl_proyectoUsuarios = ocl_proyecto.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(ocl_proyectoUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Editor...");
		ocl_proyecto.Editor[] ocl_proyectoEditors = ocl_proyecto.EditorDAO.listEditorByQuery(null, null);
		length = Math.min(ocl_proyectoEditors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoEditors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_suscrito_...");
		ocl_proyecto.Usuario_suscrito_[] ocl_proyectoUsuario_suscrito_s = ocl_proyecto.Usuario_suscrito_DAO.listUsuario_suscrito_ByQuery(null, null);
		length = Math.min(ocl_proyectoUsuario_suscrito_s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoUsuario_suscrito_s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Valoracion...");
		ocl_proyecto.Valoracion[] ocl_proyectoValoracions = ocl_proyecto.ValoracionDAO.listValoracionByQuery(null, null);
		length = Math.min(ocl_proyectoValoracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoValoracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		ocl_proyecto.Comentario[] ocl_proyectoComentarios = ocl_proyecto.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(ocl_proyectoComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Periodista...");
		ocl_proyecto.Periodista[] ocl_proyectoPeriodistas = ocl_proyecto.PeriodistaDAO.listPeriodistaByQuery(null, null);
		length = Math.min(ocl_proyectoPeriodistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoPeriodistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Noticia...");
		ocl_proyecto.Noticia[] ocl_proyectoNoticias = ocl_proyecto.NoticiaDAO.listNoticiaByQuery(null, null);
		length = Math.min(ocl_proyectoNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		ocl_proyecto.Seccion[] ocl_proyectoSeccions = ocl_proyecto.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(ocl_proyectoSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tematica...");
		ocl_proyecto.Tematica[] ocl_proyectoTematicas = ocl_proyecto.TematicaDAO.listTematicaByQuery(null, null);
		length = Math.min(ocl_proyectoTematicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ocl_proyectoTematicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		ocl_proyecto.UsuarioCriteria locl_proyectoUsuarioCriteria = new ocl_proyecto.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoUsuarioCriteria.idUsuario.eq();
		locl_proyectoUsuarioCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Usuario[] ocl_proyectoUsuarios = locl_proyectoUsuarioCriteria.listUsuario();
		int length =ocl_proyectoUsuarios== null ? 0 : Math.min(ocl_proyectoUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Editor by Criteria...");
		ocl_proyecto.EditorCriteria locl_proyectoEditorCriteria = new ocl_proyecto.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoEditorCriteria.idUsuario.eq();
		locl_proyectoEditorCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Editor[] ocl_proyectoEditors = locl_proyectoEditorCriteria.listEditor();
		length =ocl_proyectoEditors== null ? 0 : Math.min(ocl_proyectoEditors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoEditors[i]);
		}
		System.out.println(length + " Editor record(s) retrieved."); 
		
		System.out.println("Listing Usuario_suscrito_ by Criteria...");
		ocl_proyecto.Usuario_suscrito_Criteria locl_proyectoUsuario_suscrito_Criteria = new ocl_proyecto.Usuario_suscrito_Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoUsuario_suscrito_Criteria.idUsuario.eq();
		locl_proyectoUsuario_suscrito_Criteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Usuario_suscrito_[] ocl_proyectoUsuario_suscrito_s = locl_proyectoUsuario_suscrito_Criteria.listUsuario_suscrito_();
		length =ocl_proyectoUsuario_suscrito_s== null ? 0 : Math.min(ocl_proyectoUsuario_suscrito_s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoUsuario_suscrito_s[i]);
		}
		System.out.println(length + " Usuario_suscrito_ record(s) retrieved."); 
		
		System.out.println("Listing Valoracion by Criteria...");
		ocl_proyecto.ValoracionCriteria locl_proyectoValoracionCriteria = new ocl_proyecto.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoValoracionCriteria.id_valoracion.eq();
		locl_proyectoValoracionCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Valoracion[] ocl_proyectoValoracions = locl_proyectoValoracionCriteria.listValoracion();
		length =ocl_proyectoValoracions== null ? 0 : Math.min(ocl_proyectoValoracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoValoracions[i]);
		}
		System.out.println(length + " Valoracion record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		ocl_proyecto.ComentarioCriteria locl_proyectoComentarioCriteria = new ocl_proyecto.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoComentarioCriteria.id_valoracion.eq();
		locl_proyectoComentarioCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Comentario[] ocl_proyectoComentarios = locl_proyectoComentarioCriteria.listComentario();
		length =ocl_proyectoComentarios== null ? 0 : Math.min(ocl_proyectoComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Periodista by Criteria...");
		ocl_proyecto.PeriodistaCriteria locl_proyectoPeriodistaCriteria = new ocl_proyecto.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoPeriodistaCriteria.idUsuario.eq();
		locl_proyectoPeriodistaCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Periodista[] ocl_proyectoPeriodistas = locl_proyectoPeriodistaCriteria.listPeriodista();
		length =ocl_proyectoPeriodistas== null ? 0 : Math.min(ocl_proyectoPeriodistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoPeriodistas[i]);
		}
		System.out.println(length + " Periodista record(s) retrieved."); 
		
		System.out.println("Listing Noticia by Criteria...");
		ocl_proyecto.NoticiaCriteria locl_proyectoNoticiaCriteria = new ocl_proyecto.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoNoticiaCriteria.id_valoracion.eq();
		locl_proyectoNoticiaCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Noticia[] ocl_proyectoNoticias = locl_proyectoNoticiaCriteria.listNoticia();
		length =ocl_proyectoNoticias== null ? 0 : Math.min(ocl_proyectoNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoNoticias[i]);
		}
		System.out.println(length + " Noticia record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		ocl_proyecto.SeccionCriteria locl_proyectoSeccionCriteria = new ocl_proyecto.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoSeccionCriteria.idSeccion.eq();
		locl_proyectoSeccionCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Seccion[] ocl_proyectoSeccions = locl_proyectoSeccionCriteria.listSeccion();
		length =ocl_proyectoSeccions== null ? 0 : Math.min(ocl_proyectoSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Tematica by Criteria...");
		ocl_proyecto.TematicaCriteria locl_proyectoTematicaCriteria = new ocl_proyecto.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//locl_proyectoTematicaCriteria.idTematica.eq();
		locl_proyectoTematicaCriteria.setMaxResults(ROW_COUNT);
		ocl_proyecto.Tematica[] ocl_proyectoTematicas = locl_proyectoTematicaCriteria.listTematica();
		length =ocl_proyectoTematicas== null ? 0 : Math.min(ocl_proyectoTematicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ocl_proyectoTematicas[i]);
		}
		System.out.println(length + " Tematica record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoMDS2RuizSalas20232024Data listProyectoMDS2RuizSalas20232024Data = new ListProyectoMDS2RuizSalas20232024Data();
			try {
				listProyectoMDS2RuizSalas20232024Data.listTestData();
				//listProyectoMDS2RuizSalas20232024Data.listByCriteria();
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
