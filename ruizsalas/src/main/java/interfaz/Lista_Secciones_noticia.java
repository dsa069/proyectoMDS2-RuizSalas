package interfaz;
import vistas.*;
import java.util.Vector;

public class Lista_Secciones_noticia extends VistaListaseccionesnoticia {
//	private JLabel _seccion;
//	public Noticia_Vista_Editor _unnamed_Noticia_Vista_Editor_;
	public Vector<Lista_Secciones_noticia_item> _item = new Vector<Lista_Secciones_noticia_item>();
	public Editor editor;
	public Lista_Secciones_noticia(Editor editor) {
		super();
		this.editor = editor;
	}
}