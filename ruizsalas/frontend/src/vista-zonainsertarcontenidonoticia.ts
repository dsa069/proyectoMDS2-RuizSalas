import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
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
<vaadin-vertical-layout style="width: 2400px; height: 900px;">
 <vaadin-horizontal-layout theme="" style="width: 100%; flex-shrink: 0; justify-content: space-between;">
  <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; flex-shrink: 1; flex-grow: 0; width: 100%;">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-vertical-layout style="height: 100%; justify-content: center; flex-shrink: 1; flex-grow: 1; width: 100%;">
   <vaadin-text-field label="Fecha" placeholder="Insertar Fecha" style="width: 100%;"></vaadin-text-field>
   <vaadin-text-field label="Ubicación" placeholder="Insertar Ubicación" style="width: 100%;"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; flex-grow: 1; flex-shrink: 1; width: 100%;" id="seleccionarTematicasEstatico"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;">
  <vaadin-text-field placeholder="Insertar Título" style="width: 100%; margin: var(--lumo-space-m);"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;">
  <vaadin-text-area placeholder="Insertar contenido de notica corto" style="width: 100%; flex-shrink: 0; margin: var(--lumo-space-m);"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;">
  <vaadin-text-area placeholder="Insertar contenido de noticia completo" style="width: 100%; flex-shrink: 0; height: 69%; margin: var(--lumo-space-m);"></vaadin-text-area>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
