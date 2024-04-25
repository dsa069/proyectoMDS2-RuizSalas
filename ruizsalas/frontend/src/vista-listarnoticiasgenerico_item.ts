import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listarnoticiasgenerico_item')
export class VistaListarnoticiasgenerico_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutGenericoListarNoticiasGenerico">
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 10%; font-size: 32px; align-items: center;" id="ZonaDeAutorYVersionDeNoticia"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 57%;">
  <vaadin-horizontal-layout style="flex-shrink: 1; width: 80%; height: 100%;">
   <vaadin-vertical-layout style="flex-grow: 1; font-size: 60px; flex-shrink: 1; width: 33%; height: 100%;">
    <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; width: 100%; height: 82%; background-color: var(--lumo-contrast-0pct); overflow: hidden;" id="botonImagenListarNoticias">
     <img src="https://img.fcbayern.com/image/upload/t_cms-16x9/f_auto/w_1600,c_fill/q_auto/v1631430883/cms/public/images/fcbayern-com/homepage/saison-19-20/galerien/spiele/barcelona-fcb/34_fcbfcb_200814_ima.jpg" width="200%" height="200%" " id="imagenListarNoticias">
    </vaadin-button>
    <vaadin-button style="background-color: var(--lumo-contrast-0pct); font-size:50px; width: 100%; color: black; flex-grow: 0; flex-shrink: 0; height: 10%;" id="Titular1">
      Titular 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-grow: 1; flex-shrink: 1; width: 33%; font-size: 15px; height: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; width: 100%; align-items: center;">
     <vaadin-button style="background-color: var(--lumo-contrast-0pct); font-size: 50px; width: 100%; height: 100%; color: black; flex-grow: 1;" id="Titular2">
       Titular2 
     </vaadin-button>
     <vaadin-horizontal-layout style="font-size: 30px; align-self: center; align-items: center;" id="VerValoracion"></vaadin-horizontal-layout>
     <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; flex-grow: 1; width: 10%; height: 60%; background-color: var(--lumo-contrast-0pct);" id="QuitarNoticiaDeSeccion">
      <iron-icon src="https://cdn.icon-icons.com/icons2/1776/PNG/512/cross_114275.png"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-vertical-layout theme="spacing" id="ResumenNoticia">
     El efecto Coriolis, descrito en 1836 por el científico francés Gaspard-Gustave Coriolis, es el efecto que se observa en un sistema de referencia en rotación cuando un cuerpo se encuentra en movimiento respecto de dicho sistema de referencia. Este efecto consiste en la existencia de una aceleración relativa del cuerpo en dicho sistema en rotación. Esta aceleración es siempre perpendicular al eje de rotación del sistema y a las componentes radial y tangencial de la velocidad del cuerpo. El efecto Coriolis hace que un objeto que se mueve sobre el radio de un disco en rotación tienda a acelerarse con respecto a ese disco según si el movimiento es hacia el eje de giro o alejándose de este. . Debido a que el objeto sufre una aceleración desde el punto de vista del observador en rotación, es como si para este existiera una fuerza sobre el objeto que lo acelera. A esta fuerza se le llama fuerza de Coriolis, y no es una fuerza real en el sentido de que no hay nada que la produzca. Se trata pues de una fuerza inercial o ficticia, que se introduce para explicar, desde el punto de vista del sistema en rotación. 
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-grow: 0; flex-shrink: 1; align-self: center;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1; flex-shrink: 0; height: 12%; width: 7%; background-color: var(--lumo-contrast-0pct); align-self: center;" id="EliminarNoticiaPropia">
    <iron-icon style="width: 100%; height: 100px;" src="https://cdn-icons-png.flaticon.com/512/1345/1345823.png"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1; flex-shrink: 0; background-color: var(--lumo-contrast-0pct); width: 7%; height: 12%; align-self: center;" id="EditarNoticia">
    <iron-icon style="width: 100%; height: 90px;" src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRGYVO6IvGN6qiLudolQK5Mizx4z0CAONYfOcDlZXT0u_ajOffS"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1; flex-shrink: 0; background-color: var(--lumo-contrast-0pct); width: 7%; height: 12%; align-self: center;" id="AgregarNoticia">
    <iron-icon style="width: 100%; height: 90px;" src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQ1aasFk2CpyAtSah2dIdd6b7uLMDLhA4Zs5Jx7XqFzgQ_NFs_4"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1; flex-shrink: 0; background-color: var(--lumo-contrast-0pct); width: 7%; height: 12%; align-self: center;" id="NoAgregarNoticia">
    <iron-icon style="width: 100%; height: 100px;" src="https://cdn-icons-png.flaticon.com/512/1345/1345823.png"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
