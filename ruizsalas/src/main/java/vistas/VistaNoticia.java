package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-noticia")
@JsModule("./src/vista-noticia.ts")
public class VistaNoticia extends LitTemplate {

    public VistaNoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}