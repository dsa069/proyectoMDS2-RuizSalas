import { LitElement, html, css, customElement } from 'lit-element';
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-m);">
  <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 15%;">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>MOMAZOS DIEGO 
  <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 15%;">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing" style="width: 10%; height: 100%; flex-shrink: 0; align-items: flex-end;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
