import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listacomentarios')
export class VistaListacomentarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 30%;" id="EscribirComentario">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; height: 27%; font-size: 25px;">
   <vaadin-vertical-layout style="height: 100%; width: 4%;">
    <vaadin-button theme="icon" aria-label="Add new" style="overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%; width: 100%; height: 100%;">
     <img src="https://content.imageresizer.com/images/memes/among-us-drip-meme-8.jpg" width="300%" height="300%">
    </vaadin-button>
   </vaadin-vertical-layout>Pepe Mel 
  </vaadin-horizontal-layout>
  <vaadin-text-area placeholder="Escriba aquí su comentario" style="width: 100%; flex-shrink: 1; flex-grow: 1;"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 80%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
