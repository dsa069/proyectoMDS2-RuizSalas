import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-periodistas_item')
export class VistaPeriodistas_item extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; justify-content: space-between; align-content: center; align-items: center;">
 <vaadin-horizontal-layout style="width: 70%; height: 100%; flex-shrink: 1; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="width: 15%; height: 100%;">
    ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ 
  </vaadin-vertical-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="flex-shrink: 0; width: 50%; height: 85%; overflow: hidden; background-color: var(--lumo-contrast-0pct); ">
   <vaadin-vertical-layout id="layoutFotoPeriodistas">
    <img src="https://render.fineartamerica.com/images/rendered/default/flat/round-beach-towel/images/artworkimages/medium/2/vegeta-blue-evolution-emerald-light-transparent.png?&amp;targetx=-2&amp;targety=-335&amp;imagewidth=788&amp;imageheight=1867&amp;modelwidth=788&amp;modelheight=788&amp;backgroundcolor=000000&amp;orientation=0" width="650" height="650" id="FotoPeriodistas" style="width: 100%; height: 100%;">
   </vaadin-vertical-layout>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; width: 15%; height: 20%; align-self: flex-end; overflow: hidden; background-color: var(--lumo-contrast-0pct);" id="BotonEliminarPeriodista">
   <img src="https://cdn-icons-png.flaticon.com/512/748/748138.png" width="75%" height="75%">
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 10%; align-items: center; flex-shrink: 1; flex-grow: 0; font-size: 50px; justify-content: space-between;" id="ApodoPeriodistas">
  <label> Apodo periodista </label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
}
  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
