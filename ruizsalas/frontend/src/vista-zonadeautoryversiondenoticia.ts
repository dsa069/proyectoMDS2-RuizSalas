import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-zonadeautoryversiondenoticia')
export class VistaZonadeautoryversiondenoticia extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;font-size: 32px;">
 <vaadin-button theme="icon" aria-label="Add new" style="width: 10%; height: 15%; flex-shrink: 0; background-color: var(--lumo-contrast-0pct);">
  <vaadin-vertical-layout theme="spacing" id="layoutFotoPeriodistaNoticia">
   <img src="https://cdn-icons-png.flaticon.com/512/5987/5987462.png" style="width: 100%;" id="FotoPeriodistaNoticia">
  </vaadin-vertical-layout>
 </vaadin-button>
 <vaadin-vertical-layout style="align-self: center; flex-shrink: 0; flex-direction: column; justify-content: center;" id="NombreAutorNoticia">
  <label> Autor </label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 20%; flex-shrink: 0;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-direction: column; align-self: center;" id="VersionNoticia">
  <label> Versión </label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
