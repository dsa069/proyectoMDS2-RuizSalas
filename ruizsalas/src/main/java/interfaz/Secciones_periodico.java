package interfaz;

import vistas.VistaSeccionesperiodico;

public class Secciones_periodico extends VistaSeccionesperiodico{
//	private JScrollPanel _scroll;
//	private JButton _next_page;
	public Usuario _accede;
	public Listar_Secciones _contiene;
	
	public Usuario usuario;
	public Secciones_periodico(Usuario usuario) {
		super();
		this.usuario = usuario;
	}
}