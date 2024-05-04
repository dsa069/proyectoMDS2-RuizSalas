import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-bannersuscrito')
export class VistaBannersuscrito extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutBannerSuscrito">
 <vaadin-horizontal-layout style="width: 100%; height: 10%; align-self: center; justify-content: center; font-size: 36px;" id="textoPerfil">
   Perfil 
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 30%; flex-shrink: 0;" id="noticiaLayoutGenerico">
  <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; height: 50%;" id="noticiaLayout"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0;" id="noticiaEditorLayout"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 25%; width: 100%; flex-shrink: 0;" id="perfilUsuarioLayout">
  <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; height: 50%;" id="verDatosEstaticos"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct); width: 20%;" id="botonCerrarSesion">
    <iron-icon style="width: 100%; height: 90px;" src="https://cdn-icons-png.flaticon.com/128/660/660350.png"></iron-icon>
   </vaadin-button>
   <vaadin-horizontal-layout style="height: 100%; width: 20%; flex-shrink: 0;" id="darseDeBajaLayout"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct); width: 20%;" id="botonEditarDatosDelPerfil">
    <iron-icon style="width: 100%; height: 90px;" src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRGYVO6IvGN6qiLudolQK5Mizx4z0CAONYfOcDlZXT0u_ajOffS"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 25%; flex-shrink: 0;" id="editarPerfilLayout">
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0;" id="editarDatosEstaticos"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between; padding: var(--lumo-space-m);">
   <vaadin-button style="color: black; flex-shrink: 1; flex-grow: 0; align-self: center; font-size: 25px;" id="botonCancelarEditarPerfil">
     Cancelar 
   </vaadin-button>
   <vaadin-button style="color: black; flex-shrink: 1; flex-grow: 0; align-self: center; font-size: 25px;" id="botonGuardarEditarPerfil">
     Guardar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

