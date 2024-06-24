import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
<vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout style="flex-shrink: 0; height: 100%; width: 50%;">
  <vaadin-button theme="icon" aria-label="Add new" style="flex-shrink: 0; flex-grow: 0; overflow: hidden; height: 35%; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://marcadegol.com/fotos//2014/06/Messi-Lays-Brasil-2014.jpg" style="width: 90%; height: 75%; display: block;" id="imagenZonaDeAnuncios">
  </vaadin-button>
  <hr style="width: 90%; flex-shrink: 0;">
  <vaadin-button theme="icon" aria-label="Add new" style="flex-shrink: 0; flex-grow: 0; height: 35%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://cdn.bitlysdowssl-aws.com/wp-content/uploads/2021/10/logotipo-Eurocopa-Alemania-Foto-Archivo.jpg" style="width: 90%; height: 75%; display: block;" id="imagenZonaDeAnuncios1">
  </vaadin-button>
  <hr style="width: 90%; flex-shrink: 0;">
  <vaadin-button theme="icon" aria-label="Add new" style="flex-shrink: 0; flex-grow: 0; height: 17%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://cdn.resfu.com/media/img_news/leo-messi--en-un-comercial-de-adidas.jpg?size=1000x&amp;lossy=1" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button theme="icon" aria-label="Add new" style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://pbs.twimg.com/media/F8UzfyjWIAEB0E6.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://imagenes.heraldo.es/files/image_990_556/uploads/imagenes/2020/02/10/colacao.jpeg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://www.nesquik.es/sites/default/files/2023-03/Banner-NQ-768x768_0.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://i.pinimg.com/originals/2b/76/6b/2b766b89e70a779f895b2403dc26027f.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEil_sCiYwZWJzieGToeyNis99iZRaNJjkVHTkvQ_IG50i_ytnvjYk2ZDapB2X5L1Wjw-bm0LHM-eGJ0fnu4gonwbrwjB89Wz2mPTgyiPQifsix5SHuX1fyz9XPqaaCQJ237NKss9KD9Qj8/s1600/coca+cola+mejor+abiertos.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://www.ahorramas.com/on/demandware.static/-/Sites-ahorramas-master/default/dwca81a5d1/Assets/043986_Z1NL/large/2/7/1/7/2717fd8fd02a5267a86ceb925579a3cb0d98fc09_043986_Z1NL.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://miro.medium.com/v2/resize:fit:819/0*ERlWUfkT5WZ04AlT.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://static.mercadonegro.pe/wp-content/uploads/2023/05/29134632/APOYO-4.jpg" style="width: 90%; height: 75%; display: block;">
  </vaadin-button>
  <hr style="flex-shrink: 0; width: 90%;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 30%; overflow: hidden; background-color: var(--lumo-contrast-0pct); align-self: center;">
   <img src="https://epinium.com/wp-content/uploads/2018/09/amazon-advertising.jpg" style="width: 90%; height: 75%; display: block;">
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
