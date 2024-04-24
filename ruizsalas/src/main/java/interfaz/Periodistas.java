package interfaz;
import vistas.*;
import java.util.Vector;

public class Periodistas extends VistaPeriodistas {
	public Lista_periodistas _unnamed_Lista_periodistas_;
	public Vector<Periodistas_item> _item = new Vector<Periodistas_item>();
	public Editor editor;
	public Periodistas(Editor editor) {
		super();
		this.editor = editor;
		
		Periodistas_item _item = new Periodistas_item(this, null);
		this.getPeriodistasItemLayout().add(_item);
	}
}