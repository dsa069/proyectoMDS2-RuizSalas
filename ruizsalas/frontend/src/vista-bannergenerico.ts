import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-bannergenerico')
export class VistaBannergenerico extends LitElement {
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
<vaadin-vertical-layout style="height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-m); height: 100px; font-family: Arial; font-size: 25px; align-items: center;">
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; justify-content: flex-start; width: 100px; align-self: center;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://i.imgflip.com/6q57vm.png?a473472" width="90" height="90">
   </vaadin-button>
  </vaadin-horizontal-layout>MOMAZOS DIEGO 
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; width: 100px; align-self: center; justify-content: flex-end;">
   <vaadin-button theme="icon" aria-label="Add new" id="Revisar Noticias" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://cdn-icons-png.flaticon.com/512/6848/6848160.png" width="80" height="80">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="VerPeriodistas" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://cdn-icons-png.flaticon.com/512/1995/1995463.png" width="87" height="87">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="MisNoticias" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://cdn-icons-png.flaticon.com/512/9964/9964353.png" width="84" height="84">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="IniciarSesion" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://cdn-icons-png.flaticon.com/512/5987/5987462.png" width="90" height="90">
   </vaadin-button>
   <vaadin-button style="color: black; flex-shrink: 1; flex-grow: 0; align-self: center;">
     SUSCRIBIRSE 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
