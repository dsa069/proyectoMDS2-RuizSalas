import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-darsedebaja')
export class VistaDarsedebaja extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; position: absolute;">
 <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 20%; width: 15%; background-color: var(--lumo-contrast-0pct); overflow: hidden; align-self: center;">
  <img src="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcS-QIMY_z_DvWGkbi_SldK1F2BZHLcnemkGsKGakuapRFadyJbN" style="height: 100%; width: 100%;">
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
