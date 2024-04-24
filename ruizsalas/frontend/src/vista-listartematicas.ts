import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listartematicas')
export class VistaListartematicas extends LitElement {
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
 <vaadin-vertical-layout theme="spacing-xs" style="flex-grow: 0; flex-shrink: 1; align-self: flex-start; width: 100%; align-items: center; font-size: 60px;">
   Temáticas 
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="Tematicasitem" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
