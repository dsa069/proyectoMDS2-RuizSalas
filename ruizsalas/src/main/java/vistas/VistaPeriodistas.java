package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;

@Tag("vista-periodistas")
@JsModule("./src/vista-periodistas.ts")
public class VistaPeriodistas extends LitTemplate {

    @Id("PeriodistasItemLayout")
	private HorizontalLayout periodistasItemLayout;

	public VistaPeriodistas() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getPeriodistasItemLayout() {
		return periodistasItemLayout;
	}

	public void setPeriodistasItemLayout(HorizontalLayout periodistasItemLayout) {
		this.periodistasItemLayout = periodistasItemLayout;
	}

}