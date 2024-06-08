import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout theme="spacing-xl" style="width: 100%; height: 100%; align-items: stretch;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%;  align-items: center; justify-content: space-between;">
  <vaadin-horizontal-layout style="height: 100%; width: 50%; align-items: center; font-size: 30px;">
   <vaadin-vertical-layout style="height: 100%; width: 22%; flex-shrink: 1;">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; height: 100%; flex-shrink: 0; overflow: hidden; background-color: var(--lumo-contrast-0pct); border-radius: 50%; ">
     <img src="https://ih1.redbubble.net/image.3742638888.6889/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg" width="" height="" id="imagenUsuarioComento" style="width: 75%;">
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="layoutApodoComentarista">
    <label> Victor Vallejo </label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 1; height: 100%; justify-content: flex-end; width: 50%; align-items: center; font-size: 40px;">
   <vaadin-horizontal-layout style="flex-shrink: 0; height: 100%; justify-content: center; align-items: center;">
    <vaadin-vertical-layout theme="spacing" id="layoutVerValoracionComentario">
     <label> 69 </label>
    </vaadin-vertical-layout>
    <img src="https://cdn.icon-icons.com/icons2/37/PNG/512/percentage_3155.png" style="height: 30%; width: 22%;">
    <img src="data:image/jpeg;base64,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" style="height: 75%; width: 50%;">
   </vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; width: 10%; overflow: hidden; background-color: var(--lumo-contrast-0pct); flex-shrink: 0;" id="ValorarComentarioPositivamente">
    <img src="https://cdn-icons-png.flaticon.com/512/126/126473.png" style="height: 100%; width: 100%;">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="width: 10%; flex-shrink: 0; height: 100%; overflow: hidden; background-color: var(--lumo-contrast-0pct);" id="ValorarComentarioNegativamente">
    <img src="https://cdn-icons-png.flaticon.com/512/126/126504.png" style="height: 100%; width: 100%;">
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; width: 12%; overflow: hidden; background-color: var(--lumo-contrast-0pct); font-weight: bold;" id="BorrarComentario">
    <img src="https://cdn-icons-png.flaticon.com/512/1345/1345823.png" style="height: 100%; width: 100%;">
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutZonaComentarioEscrito">
  <label> ¡Oh valiente guerrero Carlitos, defensor de los reinos y campeón de la justicia! Escucha el llamado de los tiempos épicos que claman por tu coraje indomable. En las sombras de la noche y en los campos de batalla, tu espada resplandece con la luz de la verdad y la nobleza. Por el rey, oh Carlitos, por el rey marchamos hacia la victoria. Con cada paso, con cada golpe de tu espada, recordamos nuestro juramento de lealtad y honor. Por el rey, nuestros corazones laten al unísono, tejiendo un manto de gloria y sacrificio. En las horas oscuras, cuando el enemigo acecha y el miedo amenaza con consumirnos, recuerda por quién luchamos. Por el rey, por la tierra que nos vio nacer, por el futuro que defendemos con nuestras vidas. ¡Por el rey, Carlitos, por el rey! Que el eco de nuestra valentía resuene a lo largo y ancho de los dominios, inspirando a aquellos que aún dudan. En cada batalla, en cada gesta heroica, elevamos nuestra voz en un grito unificado: ¡Por el rey! Que tu nombre, Carlitos, quede grabado en los anales de la historia como un símbolo de valor y lealtad. Que tu espada sea una luz en la oscuridad, guiando a nuestros hermanos de armas hacia la gloria eterna. ¡Por el rey, Carlitos, por el rey! ¡Avanza con firmeza, guerrero noble! La victoria aguarda a aquellos que se mantienen firmes en su deber. Por el rey, por el honor, por el destino que está escrito en las estrellas. ¡Por el rey, Carlitos, por el rey! </label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
