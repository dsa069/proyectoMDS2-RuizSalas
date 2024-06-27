import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
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
<vaadin-vertical-layout style="height: 100%; width: 100%; position: absolute;" id="bannergenericolayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: white var(--lumo-contrast-10pct); height: 100px; font-family: Lucida Calligraphy; font-size: 36px; align-items: flex-end; padding: var(--lumo-space-xl); justify-content: space-between;">
  <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; width: 100px; align-self: center;">
   <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1; height: 100%; background-color: var(--lumo-contrast-0pct);" id="botonpaginainicio">
    <img src="https://i.imgflip.com/6q57vm.png?a473472" width="90" height="90">
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="justify-content: space-between; flex-shrink: 0; flex-grow: 1; align-self: center; align-items: center;">
    MOMAZOS DIEGO 
   <vaadin-horizontal-layout style="flex-grow: 1; flex-shrink: 0; width: 100px; align-self: center; justify-content: flex-end;">
    <vaadin-button theme="icon" aria-label="Add new" id="botonRevisarNoticiaGenerico" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);">
     <img src="https://cdn-icons-png.flaticon.com/512/6848/6848160.png" width="63" height="63">
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="botonVerPeriodistasGenerico" style="flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct); align-self: center;">
     <img src="https://cdn-icons-png.flaticon.com/512/1995/1995463.png" width="67" height="67">
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="botonMisNoticiasGenerico" style="align-self: center; flex-grow: 0; flex-shrink: 0; height: 100%; background-color: var(--lumo-contrast-0pct);">
     <img src="https://cdn-icons-png.flaticon.com/512/9964/9964353.png" width="64" height="64">
    </vaadin-button>
    <vaadin-horizontal-layout style="flex-grow: 0; flex-shrink: 0;">
     <vaadin-button aria-label="Add new" id="botonIniciarSesionGenerico" style="flex-grow: 0; flex-shrink: 0; background-color: var(--lumo-contrast-0pct); overflow: hidden; border-radius: 50%; width: 25%; height: 25%; align-self: center;">
      <vaadin-vertical-layout id="LayoutFotoPerfilBanner" style="overflow: hidden;"></vaadin-vertical-layout>
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-button style="color: black; flex-shrink: 0; flex-grow: 0; align-self: center;" id="botonSuscribirseGenerico">
      SUSCRIBIRSE 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="justify-content: space-between; flex-shrink: 0; height: 100%; width: 100%;">
  <vaadin-vertical-layout style="height: 100%; flex-shrink: 1; flex-grow: 0; align-items: flex-start; align-self: flex-end;" id="ZonaAnunciosLayout1"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; flex-grow: 0; height: 100%; width: 100%;">
   <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;" id="noRegistradoLayout">
    <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;" id="registroLayout">
     <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; justify-content: center; font-size: 32px;">
       Registrarse 
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; align-items: stretch; justify-content: center;" id="datosRegistroEstatico"></vaadin-vertical-layout>
     <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; justify-content: center; font-size: 22px;">
       ¿Ya tienes cuenta? 
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 0; align-items: center; justify-content: space-between; padding: var(--lumo-space-m);">
      <vaadin-horizontal-layout style="justify-content: space-between; flex-shrink: 0; align-items: center; width: 47%;">
       <vaadin-horizontal-layout>
        <vaadin-button style="flex-shrink: 0; color: black; flex-grow: 1;" id="BotonCancelarRegistro">
          Cancelar 
        </vaadin-button>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout>
        <vaadin-button style="flex-shrink: 0; color: black; flex-grow: 1;" id="BotonIniciarSesion">
          Iniciar Sesión 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
      <vaadin-vertical-layout id="botonConfirmarRegistroEstaticoLayout" style="flex-shrink: 0; align-self: center; align-items: center; flex-grow: 0;"></vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;" id="iniciarSesionLayout">
     <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; font-size: 32px; justify-content: center;">
       Iniciar Sesión 
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; justify-content: center; align-items: stretch;" id="datosIniciarSesionEstaticos"></vaadin-vertical-layout>
     <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; justify-content: space-around;">
      <vaadin-button style="flex-shrink: 0; color: black;" id="BotonCancelarSesion">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-shrink: 0; color: black;" id="BotonConfirmarSesion">
        Confirmar 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; align-self: stretch; align-items: stretch; justify-content: center;" id="noticiaUsuarioNoRegistradoLayout"></vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;" id="periodistaLayout">
    <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;" id="crearEditarNoticiaLayout">
     <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; align-self: stretch; align-items: stretch; justify-content: center;" id="crearEditarNoticiaEstatico"></vaadin-vertical-layout>
     <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; justify-content: space-around;">
      <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 5%; background-color: var(--lumo-contrast-0pct);" id="BotonEliminarNoticiaPropia">
       <iron-icon style="width: 100%; height: 100%;" src="https://cdn-icons-png.flaticon.com/512/1345/1345823.png"></iron-icon>
      </vaadin-button>
      <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 5%; background-color: var(--lumo-contrast-0pct);" id="BotonConfirmarModificacionNoticia">
       <iron-icon style="width: 100%; height: 100%;" src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQ1aasFk2CpyAtSah2dIdd6b7uLMDLhA4Zs5Jx7XqFzgQ_NFs_4"></iron-icon>
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;" id="historialNoticiasLayout">
     <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; font-size:32px; align-items: center;">
       Historial de noticias 
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; align-items: stretch; justify-content: center;" id="historialNoticiasEstatico"></vaadin-vertical-layout>
     <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;">
      <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; width: 25%; background-color: var(--lumo-contrast-0pct); align-self: center; height: 50%;" id="BotonCrearNoticia">
       <iron-icon style="height: 50%; width: 50%;" src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQ1aasFk2CpyAtSah2dIdd6b7uLMDLhA4Zs5Jx7XqFzgQ_NFs_4"></iron-icon>
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;" id="editorLayout">
    <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;" id="revisarNoticiasLayout">
     <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; font-size: 32px; align-items: center;">
       Revisar Noticias 
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; align-items: stretch; align-self: stretch; justify-content: center;" id="revisarNoticiasEstatico"></vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;" id="ListarPeriodistaLayout">
     <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; align-items: stretch; align-self: stretch; justify-content: center;" id="listaPeriodistaEstatico"></vaadin-vertical-layout>
     <vaadin-vertical-layout style="align-items: center; flex-shrink: 0; width: 100%; justify-content: center; margin: var(--lumo-space-xl);">
      <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 0; height: 30%; width: 10%; background-color: var(--lumo-contrast-0pct); align-self: center;" id="BotonAnadirPeriodista">
       <img src="https://cdn.icon-icons.com/icons2/602/PNG/512/Add_User_icon-icons.com_55971.png" width="" height="" style="height: 35%; width: 35%;">
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;" id="altaPeriodistaLayout">
     <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; font-size: 32px; align-items: center;">
       Añadir Periodista 
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; align-items: stretch; justify-content: center;" id="datosPeriodistaAnadirEstatico"></vaadin-vertical-layout>
     <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; justify-content: space-around;">
      <vaadin-button style="flex-shrink: 0; color: black;" id="BotonCancelarAnadirPeriodista">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-shrink: 0; color: black;" id="BotonConfirmarAnadirPeriodista">
        Confirmar 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="LayoutGenericoVistaGenerica" style="flex-shrink: 0; flex-grow: 1; width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; flex-shrink: 1; flex-grow: 0; align-self: flex-end; align-items: flex-end;" id="ZonaAnunciosLayout2"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
