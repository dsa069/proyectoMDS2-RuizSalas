import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-paginadeinicio')
export class VistaPaginadeinicio extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; height: 20%;">
  <vaadin-vertical-layout style="width: 100%; height: 100%;">
   <vaadin-horizontal-layout style="width: 100%; height: 75%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 25%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 80%;">
  <vaadin-vertical-layout style="width: 10%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 80%;">
   <vaadin-horizontal-layout style="width: 100%; height: 75%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 25%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 10%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
