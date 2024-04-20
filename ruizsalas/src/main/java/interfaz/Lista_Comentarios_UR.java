package interfaz;

import java.util.Vector;

public class Lista_Comentarios_UR extends Lista_Comentarios {
//	private JButton _escribir_comentario;
//	private JLabel _foto;
//	private JLabel _mi_apodo;
//	public Noticia_completa _unnamed_Noticia_completa_;
	public Vector<Lista_Comentarios_UR_item> _item = new Vector<Lista_Comentarios_UR_item>();
	
	public Registrado _registrado;
	public Lista_Comentarios_UR(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getEscribirComentario().setVisible(true);
		
		this.escribir_comentario();
		}

	public void escribir_comentario() {
		throw new UnsupportedOperationException();
	}
}