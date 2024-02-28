import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-m);">
  <vaadin-vertical-layout style="flex-grow: 1; height: 100%;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 15%; padding: var(--lumo-space-m);">
    <iron-icon icon="lumo:plus" id="Icono pag principal"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>MOMAZOS DIEGO 
  <vaadin-vertical-layout style="flex-grow: 0; height: 100%; flex-shrink: 1;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: flex-end;">
    <vaadin-button theme="icon" aria-label="Add new" id="Revisar Noticias" style="align-self: flex-end; flex-grow: 1; flex-shrink: 0; height: 100%; width: 15%; padding: var(--lumo-space-m);">
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
    <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1; flex-shrink: 0; height: 100%; width: 15%; align-self: flex-end; padding: var(--lumo-space-m);" id="Registrarse1">
     <iron-icon icon="lumo:plus" id="Registrarse"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
