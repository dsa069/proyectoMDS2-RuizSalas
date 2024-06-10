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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout style="flex-shrink: 0; height: 100%; justify-content: center; flex-grow: 1; margin: var(--lumo-space-xl);" id="layoutImagenUsuarioVerDatos">
  <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" width="" height="" style="height: 75%; flex-shrink: 0; overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%; align-self: center; width: 75%;" id="imagenUsuarioVerDatos">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; justify-content: center; font-size: 35px; flex-grow: 1;">
  <vaadin-vertical-layout id="layoutNombreUsuario1" style="flex-shrink: 0; flex-grow: 0; margin: var(--lumo-space-m); width: 100%;">
   <label> El Bob Mafioso </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutDNIUsuario1" style="flex-shrink: 0; flex-grow: 0; margin: var(--lumo-space-m); width: 100%;">
   <label> 35196854K </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutCorreoUsuario1" style="flex-shrink: 0; flex-grow: 0; margin: var(--lumo-space-m); width: 100%;">
   <label> mafiosoBob69@hotmail.com </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutNickNameUsuario1" style="flex-shrink: 0; flex-grow: 0; margin: var(--lumo-space-m); width: 100%;">
   <label> Mafioso69Bob </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutTarjetaCreditoUsuario1" style="flex-shrink: 0; flex-grow: 0; margin: var(--lumo-space-m); width: 100%;">
   <label> 0123456789 </label>
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
