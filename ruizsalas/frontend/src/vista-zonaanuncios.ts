import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="flex-shrink: 0; width: 100%; height: 100%;">
 <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; overflow: hidden; height: 35%; background-color: var(--lumo-contrast-0pct);">
  <img src="https://marcadegol.com/fotos//2014/06/Messi-Lays-Brasil-2014.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);" id="imagenZonaDeAnuncios">
 </vaadin-button>
 <hr style="width: 90%; flex-shrink: 0;">
 <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 20%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
  <img src="https://cdn.bitlysdowssl-aws.com/wp-content/uploads/2021/10/logotipo-Eurocopa-Alemania-Foto-Archivo.jpg" style="width: 90%; height: 75%; display: block; margin: var(--lumo-space-s);" id="imagenZonaDeAnuncios1">
 </vaadin-button>
 <hr style="width: 90%; flex-shrink: 0;">
 <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 17%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
  <img src="https://cdn.resfu.com/media/img_news/leo-messi--en-un-comercial-de-adidas.jpg?size=1000x&amp;lossy=1" style="width: 90%; height: 75%; display: block;">
 </vaadin-button>
 <hr style="flex-shrink: 0; width: 90%;">
 <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
  <img src="https://pbs.twimg.com/media/F8UzfyjWIAEB0E6.jpg" style="width: 90%; height: 75%; display: block;">
 </vaadin-button>
</vaadin-vertical-layout>
`;
	}

	// Remove this method to render the contents of this view inside Shadow DOM
	createRenderRoot() {
		return this;
	}
}
