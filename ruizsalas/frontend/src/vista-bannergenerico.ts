import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: white var(--lumo-contrast-10pct); padding: var(--lumo-space-m); height: 100px; font-family: Lucida Calligraphy; font-size: 36px; align-items: flex-end;">
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; justify-content: flex-start; width: 100px; align-self: center;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://i.imgflip.com/6q57vm.png?a473472" width="90" height="90">
   </vaadin-button>
  </vaadin-horizontal-layout>MOMAZOS DIEGO 
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; width: 100px; align-self: center; justify-content: flex-end;">
   <vaadin-button theme="icon" aria-label="Add new" id="Revisar Noticias" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://cdn-icons-png.flaticon.com/512/6848/6848160.png" width="63" height="63">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="VerPeriodistas" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct); align-self: center;">
    <img src="https://cdn-icons-png.flaticon.com/512/1995/1995463.png" width="67" height="67">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="MisNoticias" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://cdn-icons-png.flaticon.com/512/9964/9964353.png" width="64" height="64">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="IniciarSesion" style="flex-grow: 0; flex-shrink: 1; background-color: var(--lumo-contrast-0pct); height: 100%; align-self: center;">
    <img src="https://cdn-icons-png.flaticon.com/512/5987/5987462.png" width="70" height="70">
   </vaadin-button>
   <vaadin-button style="color: black; flex-shrink: 1; flex-grow: 0; align-self: center;">
     SUSCRIBIRSE 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="background-color: #28a9fa; flex-shrink: 0; height: 0.5%; width: 90%; align-self: center;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-button style="height: 100%; width: 100%;background-color: var(--lumo-contrast-0pct);">
   ‎ 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="justify-content: space-between; flex-shrink: 1; height: 100%; width: 100%;">
  <vaadin-vertical-layout style="width: 10%; height: 100%; align-self: flex-end; flex-shrink: 0;">
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; overflow: hidden; height: 35%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://i.pinimg.com/originals/46/f3/18/46f318120f97b7f472ecbb43ac2ef20e.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);">
   </vaadin-button>
   <vaadin-horizontal-layout style="background-color: #28a9fa; flex-shrink: 0; height: 0.5%; width: 90%; align-self: center;"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 20%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://i.redd.it/el59y0snhf0a1.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);">
   </vaadin-button>
   <vaadin-horizontal-layout style="background-color: #28a9fa; flex-shrink: 0; height: 0.5%; width: 90%; align-self: center;"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 17%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://pbs.twimg.com/media/EyzRrIPWgAgnRSS.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);">
   </vaadin-button>
   <vaadin-horizontal-layout style="background-color: #28a9fa; flex-shrink: 0; height: 0.5%; width: 90%; align-self: center;"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://pbs.twimg.com/media/F8UzfyjWIAEB0E6.jpg" style="width: 90%; height: 75%; display: block;">
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 10%; flex-shrink: 0; height: 100%; align-self: flex-end;">
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; overflow: hidden; height: 25%; background-color: var(--lumo-contrast-0pct);">
    <img src="https://ih1.redbubble.net/image.5246978255.5442/flat,750x,075,f-pad,750x1000,f8f8f8.jpg" style="width: 90%; height: 75%; display: block;">
   </vaadin-button>
   <vaadin-horizontal-layout style="background-color: #28a9fa; flex-shrink: 0; height: 0.5%; width: 90%; align-self: flex-start;"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 25%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://i.etsystatic.com/44859972/r/il/d48ada/5367489789/il_fullxfull.5367489789_kiu9.jpg" style="width: 90%; height: 75%; display: block;">
   </vaadin-button>
   <vaadin-horizontal-layout style="background-color: #28a9fa; flex-shrink: 0; height: 0.5%; width: 90%; align-self: flex-start;"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 25%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://img.kwcdn.com/product/open/2023-07-26/1690338503239-6829046ed5684659927d56e426e160a0-goods.jpeg?imageMogr2/auto-orient%7CimageView2/2/w/800/q/70/format/webp" style="width: 90%; height: 75%; display: block;">
   </vaadin-button>
   <vaadin-horizontal-layout style="background-color: #28a9fa; flex-shrink: 0; height: 0.5%; width: 90%; align-self: flex-start;"></vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 37%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGVaFDrwHfevaBkNmOp8bLf31q6QbOBTUpz8WGjOVv0w&amp;s" style="width: 90%; height: 75%; display: block;">
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
