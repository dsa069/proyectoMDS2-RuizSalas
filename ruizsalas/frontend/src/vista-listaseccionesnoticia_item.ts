import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; font-size: 60px;">
 <hr style="width: 90%;">
 <vaadin-radio-group theme="vertical" style="align-self: center; width: 80%;" value="on">
  <vaadin-radio-button style="font-size: 40px;">
   <b style="font-size: 60px;">Text</b>
  </vaadin-radio-button>
 </vaadin-radio-group>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
