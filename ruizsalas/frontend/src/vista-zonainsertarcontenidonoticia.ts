import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-rich-text-editor/src/vaadin-rich-text-editor.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-zonainsertarcontenidonoticia')
export class VistaZonainsertarcontenidonoticia extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="" style="width: 100%; flex-shrink: 0; justify-content: space-between;">
  <vaadin-vertical-layout theme="spacing" id="visulizarImagenPrincipal" style="height: 100%; flex-shrink: 1; flex-grow: 0; width: 100%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; justify-content: center; flex-shrink: 1; flex-grow: 1; width: 100%;">
   <vaadin-text-field label="Fecha" placeholder="Insertar Fecha" style="width: 100%;" id="modificarFecha"></vaadin-text-field>
   <vaadin-text-field label="Ubicación" placeholder="Insertar Ubicación" style="width: 100%;" id="modificarUbicacion"></vaadin-text-field>
   <vaadin-vertical-layout theme="spacing" id="modificarImagen" style="width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; flex-grow: 1; flex-shrink: 1; width: 100%;" id="seleccionarTematicasEstatico"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;">
  <vaadin-text-field placeholder="Insertar Título" style="width: 100%; margin: var(--lumo-space-m);" id="modificarTitulo"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;">
  <vaadin-text-area placeholder="Insertar contenido de notica corto" style="width: 100%; flex-shrink: 0; margin: var(--lumo-space-m);" id="modificarTextoCorto"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;">
  <vaadin-rich-text-editor id="modificarTextoLargo" style="flex-shrink: 0; height: 69%; width: 100%; margin: var(--lumo-space-m);" html-value="<p><br></p>"></vaadin-rich-text-editor>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
