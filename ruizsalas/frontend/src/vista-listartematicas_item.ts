import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listartematicas_item')
export class VistaListartematicas_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; font-size: 30px; padding-left: 80px; padding-right: 80px;">
 <hr style="width: 100%;">
 <vaadin-vertical-layout id="layoutNombredelaTematica" style="align-items: flex-start;">
  <label style="align-self: flex-start;"> Text </label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
