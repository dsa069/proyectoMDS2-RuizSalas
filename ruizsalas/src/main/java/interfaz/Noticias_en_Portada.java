package interfaz;

import java.util.Vector;
import vistas.*;

public class Noticias_en_Portada extends Listar_noticias {
//	private JButton _acceder__a_noticia;
//	private JLabel _imagen_principal;
//	private JLabel _titulo;
//	private JLabel _resumen_corto;
//	private JLabel _valoracion;
	public Pagina_de_inicio _unnamed_Pagina_de_inicio_;
	public Vector<Noticias_en_Portada_item> _item = new Vector<Noticias_en_Portada_item>();
	
    public Usuario _usuario;
	public Noticias_en_Portada(Usuario _usuario) {
		super(_usuario);
		this._usuario = _usuario;
		this.getPortada().setVisible(true);
	}
	
	@Override
	public void Noticia_item() {
		Noticias_en_Portada_item _item = new Noticias_en_Portada_item(this);
		this.getPortada().add(_item);
		this.getColumnasNoticias().add(_item);
	}
}