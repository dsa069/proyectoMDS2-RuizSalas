import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-mensajedeerror')
export class VistaMensajedeerror extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: center; align-items: center; font-size: 100px">
 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-penrKPhqk6m6ya-citqeT12YQjkAmALUZgCVTwIgr83v-Cpp" width="30%" height="50%" style="align-self: center;">NO SE HAN ENCONTRADO RESULTADOS PARA LA BÚSQUEDA 
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
