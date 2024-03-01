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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-m); height: 100px;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 27%;">
    <iron-icon icon="vaadin:newspaper" id="Icono pag principal" style="width: 100%; height: 100%; color: black;"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>MOMAZOS DIEGO 
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; flex-shrink: 0; align-self: flex-end; width: 100px;">
   <vaadin-button theme="icon" aria-label="Add new" id="Revisar Noticias" style="align-self: flex-end; flex-grow: 1; flex-shrink: 0; height: 100%; padding: var(--lumo-space-m); width: 15%;">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="VerPeriodistas" style="align-self: flex-end; flex-grow: 1; flex-shrink: 0; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="MisNoticias" style="align-self: flex-end; flex-grow: 1; flex-shrink: 0; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="IniciarSesion" style="align-self: flex-end; flex-grow: 1; flex-shrink: 0; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button>
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
