import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listaseccionesnoticia')
export class VistaListaseccionesnoticia extends LitElement {
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
<vaadin-vertical-layout theme="spacing">
 <vaadin-vertical-layout theme="spacing-xs" style="align-self: flex-start; align-items: center; width: 100%; font-size: 60px;">
   Sección 
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="SeccionesSelecionablesItem" style="flex-grow: 1; align-self: stretch;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
