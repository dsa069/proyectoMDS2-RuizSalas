import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-listacomentarios_item')
export class VistaListacomentarios_item extends LitElement {
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
<vaadin-vertical-layout theme="spacing-xl" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%; font-size: 100px; align-items: center; justify-content: space-between;">
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 50%; align-items: center;">
   <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 22%; flex-shrink: 1;">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; height: 100%; flex-shrink: 0; overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%; ">
     <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" width="75%" height="50%">
    </vaadin-button>
   </vaadin-vertical-layout>Victor Vallejo 
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 1; height: 100%; justify-content: flex-end; width: 50%; align-items: center;">
   <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; width: 22%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" style="height: 100%; width: 100%;">
   </vaadin-button> 69 
   <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" style="height: 100%; width: 15%;">
   <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; width: 22%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" style="height: 100%; width: 100%;">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 22%; flex-shrink: 0; height: 100%; overflow: hidden; background-color: var(--lumo-contrast-0pct);">
    <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" style="height: 100%; width: 100%;">
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1; font-size: 20px;">
   ¡Oh valiente guerrero Carlitos, defensor de los reinos y campeón de la justicia! Escucha el llamado de los tiempos épicos que claman por tu coraje indomable. En las sombras de la noche y en los campos de batalla, tu espada resplandece con la luz de la verdad y la nobleza. Por el rey, oh Carlitos, por el rey marchamos hacia la victoria. Con cada paso, con cada golpe de tu espada, recordamos nuestro juramento de lealtad y honor. Por el rey, nuestros corazones laten al unísono, tejiendo un manto de gloria y sacrificio. En las horas oscuras, cuando el enemigo acecha y el miedo amenaza con consumirnos, recuerda por quién luchamos. Por el rey, por la tierra que nos vio nacer, por el futuro que defendemos con nuestras vidas. ¡Por el rey, Carlitos, por el rey! Que el eco de nuestra valentía resuene a lo largo y ancho de los dominios, inspirando a aquellos que aún dudan. En cada batalla, en cada gesta heroica, elevamos nuestra voz en un grito unificado: ¡Por el rey! Que tu nombre, Carlitos, quede grabado en los anales de la historia como un símbolo de valor y lealtad. Que tu espada sea una luz en la oscuridad, guiando a nuestros hermanos de armas hacia la gloria eterna. ¡Por el rey, Carlitos, por el rey! ¡Avanza con firmeza, guerrero noble! La victoria aguarda a aquellos que se mantienen firmes en su deber. Por el rey, por el honor, por el destino que está escrito en las estrellas. ¡Por el rey, Carlitos, por el rey! 
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
