package interfaz;

import java.util.Vector;

public class Lista_comentarios_Vista_Editor extends Lista_Comentarios_UR {
	public Vector<Lista_comentarios_Vista_Editor_item> _item = new Vector<Lista_comentarios_Vista_Editor_item>();

	public Editor _editor;
	public Lista_comentarios_Vista_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		//this.getOcultar().setVisible(false);
		}


}