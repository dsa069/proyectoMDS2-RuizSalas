import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-creareditarseccionestematicas')
export class VistaCreareditarseccionestematicas extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 1; align-items: center; font-size: 40px; justify-content: center;" id="CrearTematicaCabecera">
   Crear temática 
  <vaadin-text-field label="" placeholder="Introducir nombre temática" style="align-self: center; flex-shrink: 0; width: 60%;"></vaadin-text-field>
  <vaadin-button theme="icon" aria-label="Add new" style="overflow: hidden; background-color: var(--lumo-contrast-0pct); flex-shrink: 0; height: 60%; width: 20%;" id="botonCrearNuevaTematica">
   <img src="https://cdn-icons-png.flaticon.com/512/117/117885.png" style="height: 15%; width: 15%;">
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 70%; flex-shrink: 1;" id="listaSeccionesEstaticas"></vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 20%; flex-shrink: 0; align-items: center; justify-content: center;">
  <vaadin-button theme="icon" aria-label="Add new" style="overflow: hidden; background-color: var(--lumo-contrast-0pct); flex-shrink: 0; height: 60%;" id="CrearTematicasPatras">
   <img src="https://cdn-icons-png.flaticon.com/512/109/109618.png" style="height: 20%; width: 20%;">
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" style="overflow: hidden; background-color: var(--lumo-contrast-0pct); flex-shrink: 0; height: 60%;" id="CrearTematicasPalante">
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
