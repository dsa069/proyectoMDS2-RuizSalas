import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-zonaanuncios')
export class VistaZonaanuncios extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="flex-shrink: 0; width: 10%;">
  <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; overflow: hidden; height: 35%; background-color: var(--lumo-contrast-0pct);">
   <img src="https://i.pinimg.com/originals/46/f3/18/46f318120f97b7f472ecbb43ac2ef20e.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);">
  </vaadin-button>
  <hr style="width: 90%; flex-shrink: 0;">
  <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 20%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
   <img src="https://i.redd.it/el59y0snhf0a1.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);">
  </vaadin-button>
  <hr style="width: 90%; flex-shrink: 0;">
  <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 17%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
   <img src="https://pbs.twimg.com/media/EyzRrIPWgAgnRSS.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
   <img src="https://pbs.twimg.com/media/F8UzfyjWIAEB0E6.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
	}

	// Remove this method to render the contents of this view inside Shadow DOM
	createRenderRoot() {
		return this;
	}
}
