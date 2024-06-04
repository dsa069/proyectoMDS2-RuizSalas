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
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1;" id="Portada"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1;" id="ColumnasNoticias"></vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; flex-grow: 1;" id="ListaSimpleNoticias"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
