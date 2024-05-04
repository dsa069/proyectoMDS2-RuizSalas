import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-introducirdatos')
export class VistaIntroducirdatos extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 50%; height: 100%; flex-shrink: 0; align-items: center; justify-content: center;" id="editarPerfil">
  <vaadin-button theme="icon" aria-label="Add new" style="height: 60%; flex-shrink: 0; overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%;">
   <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" width="60%" height="60%" id="imagenPerfilIntroducirDatos">
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 100%; width: 50%; justify-content: center;" theme="spacing">
  <vaadin-text-field label="Email" placeholder="Email" style="width: 90%; flex-shrink: 0;"></vaadin-text-field>
  <vaadin-text-field label="Contraseña" placeholder="Contraseña" style="width: 90%; flex-shrink: 0;"></vaadin-text-field>
  <vaadin-vertical-layout theme="spacing" id="zonaRegistrarPeriodista" style="flex-shrink: 0; width: 100%; flex-grow: 0;">
   <vaadin-text-field label="Apodo" placeholder="Apodo" style="width: 90%; flex-shrink: 0;"></vaadin-text-field>
   <vaadin-text-field label="DNI" placeholder="DNI" style="width: 90%; flex-shrink: 0;"></vaadin-text-field>
   <vaadin-vertical-layout theme="spacing" id="FotoTextamen" style="align-self: stretch;">
    <vaadin-text-field label="Foto" placeholder="Foto" style="width: 90%; flex-shrink: 0;"></vaadin-text-field>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="datosRegistro" style="width: 100%; flex-shrink: 0;">
   <vaadin-text-field label="Tarjeta de crédito" placeholder="Tarjeta de crédito" style="width: 90%; flex-shrink: 0;"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
