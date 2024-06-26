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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="justify-content: space-around; width: 100%; height: 7%; font-size: 32px; align-items: center; margin: var(--lumo-space-xl);">
  <vaadin-vertical-layout id="layoutTextoSeccionX" style="flex-shrink: 0; align-items: center;">
   <label> Sección </label>
  </vaadin-vertical-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; width: 25%; background-color: var(--lumo-contrast-0pct); flex-shrink: 0;" id="BorrarSeccion">
   <img src="https://cdn-icons-png.flaticon.com/512/1345/1345823.png" width="50" height="50">
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; height: 100%;" id="listaDeNoticiasEstatico"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside  Shadow DOM
  createRenderRoot() {
    return this;
  }
}
