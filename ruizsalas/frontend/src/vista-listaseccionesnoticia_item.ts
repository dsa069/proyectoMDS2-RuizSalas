import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

@customElement('vista-listaseccionesnoticia_item')
export class VistaListaseccionesnoticia_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; font-size: 60px; align-items: stretch;">
 <hr style="width: 90%;">
 <vaadin-checkbox id="SeleccionSeccion" style="width: 80%; align-self: center; font-size: 60px;" theme="vertical">
  Furgo
 </vaadin-checkbox>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside  Shadow DOM
  createRenderRoot() {
    return this;
  }
}
