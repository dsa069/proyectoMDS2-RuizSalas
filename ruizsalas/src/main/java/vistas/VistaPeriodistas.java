package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-periodistas")
@JsModule("./src/vista-periodistas.ts")
public class VistaPeriodistas extends LitTemplate {

    public VistaPeriodistas() {
        // You can initialise any data required for the connected UI components here.
    }

}