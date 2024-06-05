import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-barradebusqueda')
export class VistaBarradebusqueda extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: flex-start;" id="layoutGenericoDeBuscarNoticia">
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%;" theme="spacing">
  <vaadin-text-field placeholder="Search" style="flex-shrink: 0; width: 70%; flex-grow: 0;" id="barraBuscarNoticia">
   <iron-icon icon="lumo:search" slot="prefix" style="flex-grow: 0;"></iron-icon>
  </vaadin-text-field>
  <vaadin-button id="BotonRealizadorBusqueda" style="flex-shrink: 0; color: black;">
    Buscar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
