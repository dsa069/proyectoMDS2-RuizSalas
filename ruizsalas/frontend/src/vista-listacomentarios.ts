import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between; padding: var(--lumo-space-xl);">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 30%; align-self: stretch; align-items: stretch; justify-content: center;" id="EscribirComentario">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; height: 27%; font-size: 25px; align-self: stretch;">
   <vaadin-vertical-layout style="height: 100%; width: 4%;">
    <vaadin-button theme="icon" aria-label="Add new" style="overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%; width: 100%; height: 100%;">
     <vaadin-vertical-layout id="layoutImagenFotoPerfilComentar">
      <img src="https://content.imageresizer.com/images/memes/among-us-drip-meme-8.jpg" width="" height="" id="imagenFotoPerfilComentar" style="width: 100%;">
     </vaadin-vertical-layout>
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="layoutTextoNombreUsuario">
    <label> Pepe Mel </label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-text-area placeholder="Escriba aquí su comentario" style="width: 100%; flex-shrink: 1; flex-grow: 1; align-self: stretch;" id="CampoEscribirComentario"></vaadin-text-area>
  <vaadin-button id="botonAnadirComentarioNoticia" style="color: black; align-self: center;">
    Añadir 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 80%; flex-shrink: 0; flex-grow: 1;" id="ContenedorComentariosItem"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
