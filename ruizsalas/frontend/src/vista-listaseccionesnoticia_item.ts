import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; font-size: 60px; font-size: 25px;">
 <hr style="width: 90%;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
  <vaadin-button style="align-self: center; width: 5%; background-color: var(--lumo-contrast-0pct);" id="botonSeccionNoticiaVacio">
   <img src="https://cdn.icon-icons.com/icons2/2249/PNG/512/checkbox_blank_circle_outline_icon_139816.png" style="width: 40%;">
  </vaadin-button>
  <vaadin-button style="align-self: center; width: 5%; background-color: var(--lumo-contrast-0pct);" id="botonSeccionNoticiaRelleno">
   <img src="https://cdn.icon-icons.com/icons2/2248/PNG/512/checkbox_marked_circle_icon_137772.png" style="width: 40%;">
  </vaadin-button>
  <label id="nombreSeccionNoticia">Seccion</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside  Shadow DOM
  createRenderRoot() {
    return this;
  }
}
