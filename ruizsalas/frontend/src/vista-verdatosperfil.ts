import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-verdatosperfil')
export class VistaVerdatosperfil extends LitElement {
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
 <vaadin-vertical-layout style="flex-shrink: 0; width: 50%; height: 100%; justify-content: center;">
  <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" width="45%" height="40%" style="height: 50%; flex-shrink: 0; overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%; align-self: center;" id="imagenUsuarioVerDatos">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; width: 50%; justify-content: center; font-size: 35px;">
  <vaadin-vertical-layout id="layoutNombreUsuario1" style="flex-shrink: 0;">
    El Bob Mafioso 
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutDNIUsuario1" style="flex-shrink: 0;">
    35196854K 
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutCorreoUsuario1" style="flex-shrink: 0;">
    mafiosoBob69@hotmail.com 
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutNickNameUsuario1" style="flex-shrink: 0;">
    Mafioso69Bob 
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutTarjetaCreditoUsuario1" style="flex-shrink: 0;">
    0123456789 
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
