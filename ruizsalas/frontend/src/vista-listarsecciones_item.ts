import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listarsecciones_item')
export class VistaListarsecciones_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout style="justify-content: space-between; width: 100%; height: 7%; font-size: 32px; align-items: center;">
   Sección 
  <vaadin-button theme="icon" aria-label="Add new" style="height: 80%; width: 6%; background-color: var(--lumo-contrast-0pct);" id="BorrarSeccion">
   <img src="https://cdn-icons-png.flaticon.com/512/1345/1345823.png" width="60" height="60">
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; height: 100%;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
