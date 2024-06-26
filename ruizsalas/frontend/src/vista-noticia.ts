import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-noticia')
export class VistaNoticia extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; align-items: center; justify-content: flex-start; flex-grow: 1;">
  <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; width: 25%; background-color: var(--lumo-contrast-0pct); overflow: hidden; flex-shrink: 0;">
   <vaadin-vertical-layout id="layoutImagenPrincipalNoticia">
    <img src="https://img.fcbayern.com/image/upload/t_cms-16x9/f_auto/w_1600,c_fill/q_auto/v1631430883/cms/public/images/fcbayern-com/homepage/saison-19-20/galerien/spiele/barcelona-fcb/34_fcbfcb_200814_ima.jpg" style="height: 100%; width: 100%;" id="imagenPrincipalNoticia">
   </vaadin-vertical-layout>
  </vaadin-button>
  <vaadin-vertical-layout style="height: 60%; flex-shrink: 1; align-items: flex-start; align-self: flex-start; width: 25%;" id="tematicas"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; height: 60%; flex-grow: 0; align-items: flex-start; align-self: flex-start; width: 25%;" id="seleccionarTematicas"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; height: 60%; align-items: flex-start; align-self: flex-start;" id="SeleccionarSecciones"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 0; height: 60%; font-size: 30px; flex-grow: 1; align-items: stretch; width: 25%;">
   <vaadin-vertical-layout style="flex-shrink: 1;" id="FechaNoticia">
    <label style="align-self: flex-start; width: 100%; flex-shrink: 1;"> 28/03/2024 </label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="AutorNoticia">
    <label style="align-self: flex-start; width: 100%;"> Pepe Martínez </label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="LugarNoticia">
    <label style="align-self: flex-start; width: 100%;"> Lisboa </label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; font-size: 50px; align-items: center; flex-grow: 1;" theme="spacing-xl">
  <vaadin-vertical-layout id="layoutTitularVistaNoticia" style="flex-shrink: 0; flex-grow: 1;">
   <label> Humillación sin precedentes al Barcelona </label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; align-self: center; align-items: center;">
   <vaadin-horizontal-layout style="height: 60%; flex-shrink: 1; align-items: center; flex-grow: 0; align-self: center; justify-content: center;" id="verValoracionEstatico"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="height: 60%; width: 10%; flex-shrink: 1; flex-grow: 0;" id="valorarNoticia">
    <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 25%; width: 50%; background-color: var(--lumo-contrast-0pct); overflow: hidden; align-self: center;" id="BotonLikeNoticia">
     <img src="https://cdn-icons-png.flaticon.com/512/126/126473.png" style="height: 100%; width: 60%;">
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="BotonNotLikeNoticia" style="background-color: var(--lumo-contrast-0pct); overflow: hidden; height: 25%; width: 50%; flex-shrink: 0;">
     <iron-icon src="https://cdn-icons-png.flaticon.com/512/126/126504.png" style="width: 60%; height: 100%;"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 5%; width: 5%; background-color: var(--lumo-contrast-0pct); overflow: hidden;" id="eliminarNoticia">
    <img src="https://cdn-icons-png.flaticon.com/512/1345/1345823.png" style="height: 100%; width: 60%;">
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; font-size: 20px; flex-grow: 1;">
  <vaadin-vertical-layout style="flex-shrink: 1; height: 100%;" id="noticiaCortada">
   <label> Temporada en blanco del Barça y recibiendo la mayor goleada de su historia en Europa. Hora de reflexionar, mirar la cartera y ver qué se puede hacer. Una plantilla entrada en años, no acomodada pero sí con vicios, que necesita un cambio urgente. Y puede que en todos los frentes porque la gestión del último año es para analizarla. Un cambio de entrenador difícil de explicar, muchos nombres de fichajes para intentar desviar la atención, pero media plantilla en venta para poder hacer frente a alguna contratación dado que el efectivo actual parece que no llega para mucho. </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-grow: 0; flex-shrink: 1;" id="noticiaCompleta">
   <label> Temporada en blanco del Barça y recibiendo la mayor goleada de su historia en Europa. Hora de reflexionar, mirar la cartera y ver qué se puede hacer. Una plantilla entrada en años, no acomodada pero sí con vicios, que necesita un cambio urgente. Y puede que en todos los frentes porque la gestión del último año es para analizarla. Un cambio de entrenador difícil de explicar, muchos nombres de fichajes para intentar desviar la atención, pero media plantilla en venta para poder hacer frente a alguna contratación dado que el efectivo actual parece que no llega para mucho. Algo que queda en evidencia cambiando a pelo a un jugador de 24 años como Arthur por otro de 30 como Pjanic, sólo para aligerar el gasto en nóminas. Evitar la temporada en blanco se antojaba complicado, pero con Messi motivado no hay imposibles. Superado el trámite casi obligado del Nápoles, el siguiente paso era uno de los mejores Bayern de los últimos años. Y contra los alemanes acabó la apuesta del todo o nada en que se convirtió la temporada azulgrana. Ha estado mucho tiempo jugando con fuego encomendándose solo a la genialidad Messi y en Lisboa salió el todo al rojo. El rojo de un Bayern que es serio candidato para llevarse el título después de ser un rodillo ante el Barça. El inicio del encuentro fue tan intenso por ambas partes que se aventuraba partidazo y así fue, pero del Bayern. Se vio más fútbol en la primera media hora que en las otras dos eliminatorias de cuarto completas. Pese a que el Barça fue el primero en avisar obligando a Boateng a esforzarse para evitar un remate de Luis Suárez que olía a gol, fueron los alemanes quien se adelantaron en el marcador. Pase forzado de Busquets a De Jong, robo de Gnabry que abre a banda a Perisic, centro de este hacia Müller que toca hacia Lewandowski, devolución en corto del polaco y remate a placer de Müller. Golazo al más puro estilo Barça, pero del Bayern. Cuatro minutos de juego y ya pintaba mal la cosa. Sin embargo, las fuerzas se igualaron gracias a un autogol de Alaba a centro de Jordi Alba. </label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; justify-content: center; flex-grow: 1;" id="botonSuscribirse">
  <vaadin-button style="color: black; flex-shrink: 1; flex-grow: 0; align-self: center;" id="BotonSuscribirseNoticia">
    SUSCRIBIRSE 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="comentariosEstaticos"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
