import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-seleccionartematica')
export class VistaSeleccionartematica extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="align-self: flex-start; align-items: center; width: 100%; font-size: 25px; flex-shrink: 0;">
   Temáticas 
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="TematicaSelecionableItem" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
