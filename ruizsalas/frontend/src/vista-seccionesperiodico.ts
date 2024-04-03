import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-seccionesperiodico')
export class VistaSeccionesperiodico extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; height: 80%; flex-shrink: 0;" id="listaNoticiasEstatica"></vaadin-vertical-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 20%; align-items: center; justify-content: center;">
  <vaadin-button theme="icon" aria-label="Add new" style="overflow: hidden; background-color: var(--lumo-contrast-0pct); flex-shrink: 0; height: 60%;">
   <img src="https://cdn-icons-png.flaticon.com/512/109/109618.png" style="height: 20%; width: 20%;">
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" style="overflow: hidden; background-color: var(--lumo-contrast-0pct); flex-shrink: 0; height: 60%;">
   <img src="https://cdn-icons-png.flaticon.com/512/109/109617.png" style="height: 20%; width: 20%;">
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
