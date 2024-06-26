import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listarnoticiasgenerico')
export class VistaListarnoticiasgenerico extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; align-items: center; justify-content: center;" id="Portada"></vaadin-horizontal-layout>
 <vaadin-vertical-layout id="Columnas" style="flex-grow: 1; flex-shrink: 1; width: 100%; align-items: stretch; justify-content: center; align-self: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; align-items: stretch; justify-content: center; align-self: center;" id="ListaSimpleNoticias"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
