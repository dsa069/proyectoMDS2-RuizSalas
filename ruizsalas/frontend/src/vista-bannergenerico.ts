import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-bannergenerico')
export class VistaBannergenerico extends LitElement {
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
<vaadin-vertical-layout style="height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-m); height: 100px; font-family: Arial; font-size: 25px; align-items: center;">
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; justify-content: flex-start; width: 100px; align-self: center;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="vaadin:newspaper" id="Icono pag principal" style="color: black; width: 100%;"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>MOMAZOS DIEGO 
  <vaadin-horizontal-layout theme="spacing-s" style="flex-grow: 1; flex-shrink: 0; width: 100px; align-self: center; justify-content: flex-end;">
   <vaadin-button theme="icon" aria-label="Add new" id="Revisar Noticias" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; padding: var(--lumo-space-m); width: 15%;">
    <iron-icon icon="vaadin:edit" style="color: black; width: 100%;"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="VerPeriodistas" style="flex-grow: 0; flex-shrink: 1; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="vaadin:clipboard-user" style="color: black; width: 100%;"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="MisNoticias" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="vaadin:file-search" style="color: black; width: 100%;"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="IniciarSesion" style="flex-grow: 0; flex-shrink: 1; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="vaadin:user" style="color: black; width: 100%;"></iron-icon>
   </vaadin-button>
   <vaadin-button style="align-self: center; color: black;">
     SUSCRIBIRSE 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
