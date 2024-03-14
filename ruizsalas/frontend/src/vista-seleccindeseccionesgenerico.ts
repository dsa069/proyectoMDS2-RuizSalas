import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-seleccindeseccionesgenerico')
export class VistaSeleccindeseccionesgenerico extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; font-size: 28px; padding: var(--lumo-space-m);">
  <vaadin-horizontal-layout style="flex-shrink: 0;" id="EditarTexto">
    EDITAR 
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0;">
    SECCIONES 
  </vaadin-horizontal-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="background-color: var(--lumo-contrast-0pct); flex-grow: 1; width: 10%;" id="BotonEditarSecciones">
   <iron-icon style="width: 100%;" src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRGYVO6IvGN6qiLudolQK5Mizx4z0CAONYfOcDlZXT0u_ajOffS"></iron-icon>
  </vaadin-button>
  <hr style="flex-grow: 0; flex-shrink: 1; height: 2%;">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 1; padding: var(--lumo-space-m);"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; flex-shrink: 0; padding: var(--lumo-space-m);">
  <vaadin-text-field placeholder="Buscar" style="flex-grow: 1;" id="BarraDeBusqueda">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
