/**
 * Licensee: Daniel Salas(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import java.sql.Date;

import org.orm.*;

import ocl_proyecto.Comentario;
import ocl_proyecto.Noticia;
import ocl_proyecto.Periodista;
import ocl_proyecto.Seccion;
import ocl_proyecto.Tematica;
import basededatos.BD_Comentarios;
import basededatos.BD_Editores;
import basededatos.BD_Periodistas;
import basededatos.BD_Principal;
import basededatos.BD_Secciones;
import basededatos.BD_Tematicas;
import basededatos.BD_Usuarios_suscritos;
import basededatos.Bd_Noticias;
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
			BD_Editores _bd_editores = new BD_Editores();
			BD_Usuarios_suscritos _bd_us_suscritos = new BD_Usuarios_suscritos();
			BD_Comentarios _bd_comentarios = new BD_Comentarios();
			BD_Periodistas _bd_periodistas = new BD_Periodistas();
			Bd_Noticias _bd_noticias = new Bd_Noticias();
			BD_Secciones _bd_secciones = new BD_Secciones();
			BD_Tematicas _bd_tematicas = new BD_Tematicas();
			BD_Principal _bd_principal = new BD_Principal();

//			Comentario[] comentarios =_bd_comentarios.cargar_listar_comenatrios(1);
//			Comentario comentario =_bd_comentarios.escribir_comentario("cum", 5, 60);
//			_bd_comentarios.valorar_comentario(1, 1, false);

//			Noticia[] noticias = _bd_noticias.cargar_listar_mis_noticias(1);
//			Noticia[] noticiass = _bd_noticias.cargar_noticias_a_revisar();
//			Noticia[] noticiasss = _bd_noticias.cargar_secciones_generico(1);
//			Noticia[] noticiassss = _bd_noticias.Buscar("Taylor Swift no quiere a sus fans de Barcelona");
//			_bd_noticias.eliminar_noticia_propia(34);
//			_bd_noticias.agregar_noticia(1, true);
//			_bd_noticias.no_agregar_noticia(9);
//			_bd_noticias.guardar_cambios_noticia(890, "hola", "Barcelona debido a que las obras no están terminadas", "Taylor Swift no quiere a sus fans de Barcelona", "https://static.eldiario.es/clip/068c589d-5afd-4201-84ac-7ae66372d3a8_16-9-discover-aspect-ratio_default_1090295.jpg", "Carboneras", Date.valueOf("2024-08-09"), null, 4);
//			_bd_noticias.valorar_noticia(2, 5, false);
//			_bd_noticias.eliminar_noticia(55);
//			_bd_noticias.guardar_cambios_noticia(3, "Fernando volvió a traernos la magia y la ilusión a nuestro corazón", "Esta pasada madrugada hemos podido ver otro espectaculo de nuestro mago favorito, otra vuelta mágica bajo la lluvia de Montreal (Canadá) que nos permite volver a soñar con un buen resultado este fin de semana, tras una primera posición en los libres2", "Otra más de Magic Alonso", "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2024/06/08/17177979059305.jpg", "Montreal", Date.valueOf("2024-06-08"), null, 3);
//			_bd_noticias.valorar_noticia(1, 34, true);
//			_bd_noticias.eliminar_noticia(29);
//			_bd_noticias.cargar_noticias_secciones(1);

//			_bd_editores.guardar_cambios_Editor(2, "Pepe", "78451232", "pepe@gmail.mel", "PepeMel3", "https://static.eldiario.es/clip/068c589d-5afd-4201-84ac-7ae66372d3a8_16-9-discover-aspect-ratio_default_1090295.jpg");
//			_bd_editores.confirmar_Datos_Editor("pepe@gmail.mel", "PepeMel3");

//			Periodista[] periodita = _bd_periodistas.cargar_periodistas();
//			_bd_periodistas.registrar_periodista("Paco", "78451289", "paco@chocolatero.es", "PaquitoElChocolatero", "https://static.eldiario.es/clip/068c589d-5afd-4201-84ac-7ae66372d3a8_16-9-discover-aspect-ratio_default_1090295.jpg");
//			_bd_periodistas.baja_periodista(6);
//			_bd_periodistas.confirmar_Datos_Periodista("paco@chocolatero.es", "PaquitoElChocolatero");
//			_bd_periodistas.guardar_cambios_Periodista(3, "Paco", "78451289", "paco@chocolatero.es", "PaquitoElChocolatero", "https://static.eldiario.es/clip/068c589d-5afd-4201-84ac-7ae66372d3a8_16-9-discover-aspect-ratio_default_1090295.jpg");

//			Seccion[] sec = _bd_secciones.cargar_secciones_generico();
//			Seccion[] secc = _bd_secciones.cargar_secciones_seleccion();
//			Seccion[] seccc = _bd_secciones.cargar_secciones_vista_editor();
//			_bd_secciones.marcar_seccion(1, 34);
//			_bd_secciones.anadir_seccion("Jueguillos");
//			_bd_secciones.borrar_seccion(2);
//			_bd_secciones.quitar_noticia_de_seccion(25, 3);

//			Tematica[] tematic =  _bd_tematicas.cargar_tematicas(25);
//			Tematica[] tematics =  _bd_tematicas.cargar_tematicas_seleccion();
//			_bd_tematicas.anadir_seccion("Jueguillos", 3);
//			_bd_tematicas.marcar_tematica(1, 34);
//			_bd_tematicas.borrar_seccion(2);

//			_bd_us_suscritos.crear_Usuario("Paco", "78451289", "paco@chocolatero.es", "PaquitoElChocolatero", "https://static.eldiario.es/clip/068c589d-5afd-4201-84ac-7ae66372d3a8_16-9-discover-aspect-ratio_default_1090295.jpg", 123456789);
//			_bd_us_suscritos.confirmar_Datos_US("paco@chocolatero.es", "PaquitoElChocolatero");
//			_bd_us_suscritos.guardar_cambios_US(2, "Paco", "78451289", "paco@chocolatero.es", "PaquitoElChocolatero", "https://static.eldiario.es/clip/068c589d-5afd-4201-84ac-7ae66372d3a8_16-9-discover-aspect-ratio_default_1090295.jpg", 1234567890);
//			_bd_us_suscritos.cancelar_cobro_suscripcion(1);
//			_bd_us_suscritos.crear_Usuario("us@gmail.com", "cock", "Aleandro", "images/sadam.jpg", "23342423424R", 564657568);

//			_bd_principal.borrar_seccion(3, 3);
//			_bd_principal.cargar_valoracion(55);
//			Noticia[] notis =_bd_noticias.cargar_noticias_portada();
//			 for (Noticia notice: notis) {
//				 System.out.println("===================================DISI==========================================");
//				 System.out.println("Disi " + notice.getId_valoracion());
//			 }
				 
			
			//listProyectoMDS2RuizSalas20232024Data.listTestData();
			//listProyectoMDS2RuizSalas20232024Data.listByCriteria();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
