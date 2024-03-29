import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-horizontal-layout style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: white var(--lumo-contrast-10pct); padding: var(--lumo-space-m); height: 10%; font-family: Lucida Calligraphy; font-size: 36px; align-items: flex-end;">
  <vaadin-horizontal-layout style="align-self: center; flex-grow: 1; flex-shrink: 0; width: 33%; height: 100%;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://i.imgflip.com/6q57vm.png?a473472" width="90" height="90">
   </vaadin-button>
  </vaadin-horizontal-layout>MOMAZOS DIEGO 
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; justify-content: flex-end; width: 33%; align-self: center; height: 100%;">
   <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);" id="botonRevisarNoticia">
    <img src="https://cdn-icons-png.flaticon.com/512/6848/6848160.png" width="63" height="63">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);" id="botonIrAPeriodistas">
    <img src="https://cdn-icons-png.flaticon.com/512/1995/1995463.png" width="67" height="67">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);" id="botonHistorialNoticia">
    <img src="https://cdn-icons-png.flaticon.com/512/9964/9964353.png" width="64" height="64">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://cdn-icons-png.flaticon.com/512/5987/5987462.png" width="70" height="70">
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 10%; align-self: center; justify-content: center; font-size: 36px;" id="textoPerfil">
   Perfil 
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 30%; flex-shrink: 0;" id="noticiaLayoutGenerico">
  <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; height: 50%;" id="noticiaLayout"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0;" id="noticiaEditorLayout"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 25%; width: 100%; flex-shrink: 0;" id="perfilUsuarioLayout">
  <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; height: 50%;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct); width: 20%;">
    <iron-icon style="width: 100%; height: 90px;" src="https://cdn-icons-png.flaticon.com/128/660/660350.png"></iron-icon>
   </vaadin-button>
   <vaadin-horizontal-layout style="height: 100%; width: 20%; flex-shrink: 0;" id="darseDeBajaLayout"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct); width: 20%;">
    <iron-icon style="width: 100%; height: 90px;" src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRGYVO6IvGN6qiLudolQK5Mizx4z0CAONYfOcDlZXT0u_ajOffS"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 25%; flex-shrink: 0;" id="editarPerfilLayout">
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between; padding: var(--lumo-space-m);">
   <vaadin-button style="color: black; flex-shrink: 1; flex-grow: 0; align-self: center; font-size: 25px;">
     Cancelar 
   </vaadin-button>
   <vaadin-button style="color: black; flex-shrink: 1; flex-grow: 0; align-self: center; font-size: 25px;">
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
