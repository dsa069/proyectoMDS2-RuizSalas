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
  <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" width="45%" height="40%" style="height: 50%; flex-shrink: 0; overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%; align-self: center;">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; width: 50%; justify-content: center; font-size: 35px;">
  <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; height: 7%; align-items: center;">
    El Bob Mafioso 
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 7%; align-items: center;">
    35196854K 
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 7%; align-items: center;">
    mafiosoBob69@hotmail.com 
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 7%; align-items: center;">
    Mafioso69Bob 
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 7%; align-items: center;">
    0123456789 
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
