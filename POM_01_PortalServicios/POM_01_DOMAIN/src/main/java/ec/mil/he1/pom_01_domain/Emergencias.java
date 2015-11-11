/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EMERGENCIAS")
@NamedQueries({
    @NamedQuery(name = "Emergencias.findAll", query = "SELECT e FROM Emergencias e")})
public class Emergencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private Integer prmatnPcnNumeroHc;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "LUGAR_EVENTO")
    private String lugarEvento;
    @Column(name = "MOTIVO_ATENCION")
    private String motivoAtencion;
    @Column(name = "NOTIFICACION_POLICIA")
    private Character notificacionPolicia;
    @Column(name = "OTRO_MOTIVO")
    private String otroMotivo;
    @Column(name = "PERSONA_ENTREGA")
    private String personaEntrega;
    @Column(name = "REFERIDO")
    private Integer referido;
    @Column(name = "TELEFONO_ENTREGA")
    private Long telefonoEntrega;
    @Column(name = "HORA_ATENCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaAtencion;
    @Column(name = "FUENTE_INFORMACION")
    private String fuenteInformacion;
    @Column(name = "FORMA_LLEGADA")
    private Short formaLlegada;
    @Column(name = "FEC_HORA_EVENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecHoraEvento;
    @Column(name = "DIRECCION_EVENTO")
    private String direccionEvento;
    @Column(name = "CUSTODIA_POLICIAL")
    private Character custodiaPolicial;
    @Column(name = "ACCIDENTE_TRANSITO")
    private Character accidenteTransito;
    @Column(name = "CAIDA")
    private Character caida;
    @Column(name = "QUEMADURA")
    private Character quemadura;
    @Column(name = "MORDEDURA")
    private Character mordedura;
    @Column(name = "AHOGAMIENTO")
    private Character ahogamiento;
    @Column(name = "CUERPO_EXTRANO")
    private Character cuerpoExtrano;
    @Column(name = "APLASTAMIENTO")
    private Character aplastamiento;
    @Column(name = "OTRO_ACCIDENTE")
    private Character otroAccidente;
    @Column(name = "ARMA_FUEGO")
    private Character armaFuego;
    @Column(name = "ARMA_CPUNZANTE")
    private Character armaCpunzante;
    @Column(name = "VIOLENCIA_RINA")
    private Character violenciaRina;
    @Column(name = "VIOLENCIA_FAMILIAR")
    private Character violenciaFamiliar;
    @Column(name = "ABUSO_FISICO")
    private Character abusoFisico;
    @Column(name = "ABUSO_PSICOLOGICO")
    private Character abusoPsicologico;
    @Column(name = "ABUSO_SEXUAL")
    private Character abusoSexual;
    @Column(name = "OTRA_VIOLENCIA")
    private Character otraViolencia;
    @Column(name = "INTOXICACION_ALCOHOLICA")
    private Character intoxicacionAlcoholica;
    @Column(name = "INTOXICACION_ALIMENTARIA")
    private Character intoxicacionAlimentaria;
    @Column(name = "INTOXICACION_DROGAS")
    private Character intoxicacionDrogas;
    @Column(name = "INHALACION_GASES")
    private Character inhalacionGases;
    @Column(name = "OTRA_INTOXICACION")
    private Character otraIntoxicacion;
    @Column(name = "ENVENENAMIENTO")
    private Character envenenamiento;
    @Column(name = "PICADURA")
    private Character picadura;
    @Column(name = "ANAFILAXIA")
    private Character anafilaxia;
    @Column(name = "OBSERVACIONES_ACCIDENTE")
    private String observacionesAccidente;
    @Column(name = "ALIENTO_ETILICO")
    private Character alientoEtilico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_ALCOCHEK")
    private BigDecimal valorAlcochek;
    @Column(name = "ENFERMEDAD_ACTUAL")
    private String enfermedadActual;
    @Column(name = "INDICACIONES_TRATAMIENTO")
    private String indicacionesTratamiento;
    @Column(name = "ALTA_DOMICILIO")
    private Character altaDomicilio;
    @Column(name = "ALTA_CEX")
    private Character altaCex;
    @Column(name = "ALTA_OBSERVACION")
    private Character altaObservacion;
    @Column(name = "ALTA_INTERNACION")
    private Character altaInternacion;
    @Column(name = "ALTA_REFERENCIA")
    private Character altaReferencia;
    @Column(name = "SERVICIO_REFERENCIA")
    private String servicioReferencia;
    @Column(name = "ESTABLECIMIENTO")
    private String establecimiento;
    @Column(name = "EGRESA_VIVO")
    private Character egresaVivo;
    @Column(name = "EGRESA_CONDICION_ESTABLE")
    private Character egresaCondicionEstable;
    @Column(name = "EGRESA_CONDICION_INESTABLE")
    private Character egresaCondicionInestable;
    @Column(name = "DIAS_INCAPACIDAD")
    private Short diasIncapacidad;
    @Column(name = "MUERTO_EMERGENCIA")
    private Character muertoEmergencia;
    @Column(name = "CAUSA_MUERTE")
    private String causaMuerte;
    @Column(name = "BIOMETRIA")
    private Character biometria;
    @Column(name = "UROANALISIS")
    private Character uroanalisis;
    @Column(name = "QUIMICA_SANGUINEA")
    private Character quimicaSanguinea;
    @Column(name = "ELECTROLITOS")
    private Character electrolitos;
    @Column(name = "GASOMETRIA")
    private Character gasometria;
    @Column(name = "ELECTROCARDIOGRAMA")
    private Character electrocardiograma;
    @Column(name = "ENDOSCOPIA")
    private Character endoscopia;
    @Column(name = "RX_TORAX")
    private Character rxTorax;
    @Column(name = "RX_ABDOMEN")
    private Character rxAbdomen;
    @Column(name = "RX_OSEA")
    private Character rxOsea;
    @Column(name = "TOMOGRAFIA")
    private Character tomografia;
    @Column(name = "RESONANCIA")
    private Character resonancia;
    @Column(name = "ECOGRAFIA_PELVICA")
    private Character ecografiaPelvica;
    @Column(name = "ECOGRAFIA_ABDOMEN")
    private Character ecografiaAbdomen;
    @Column(name = "INTERCONSULTA")
    private Character interconsulta;
    @Column(name = "OTROS_EXAMENES")
    private Character otrosExamenes;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PRS_CODIGO_ALTA")
    private String prsCodigoAlta;

    public Emergencias() {
    }

    public Emergencias(String id) {
        this.id = id;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public Integer getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(Integer prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public String getMotivoAtencion() {
        return motivoAtencion;
    }

    public void setMotivoAtencion(String motivoAtencion) {
        this.motivoAtencion = motivoAtencion;
    }

    public Character getNotificacionPolicia() {
        return notificacionPolicia;
    }

    public void setNotificacionPolicia(Character notificacionPolicia) {
        this.notificacionPolicia = notificacionPolicia;
    }

    public String getOtroMotivo() {
        return otroMotivo;
    }

    public void setOtroMotivo(String otroMotivo) {
        this.otroMotivo = otroMotivo;
    }

    public String getPersonaEntrega() {
        return personaEntrega;
    }

    public void setPersonaEntrega(String personaEntrega) {
        this.personaEntrega = personaEntrega;
    }

    public Integer getReferido() {
        return referido;
    }

    public void setReferido(Integer referido) {
        this.referido = referido;
    }

    public Long getTelefonoEntrega() {
        return telefonoEntrega;
    }

    public void setTelefonoEntrega(Long telefonoEntrega) {
        this.telefonoEntrega = telefonoEntrega;
    }

    public Date getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(Date horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getFuenteInformacion() {
        return fuenteInformacion;
    }

    public void setFuenteInformacion(String fuenteInformacion) {
        this.fuenteInformacion = fuenteInformacion;
    }

    public Short getFormaLlegada() {
        return formaLlegada;
    }

    public void setFormaLlegada(Short formaLlegada) {
        this.formaLlegada = formaLlegada;
    }

    public Date getFecHoraEvento() {
        return fecHoraEvento;
    }

    public void setFecHoraEvento(Date fecHoraEvento) {
        this.fecHoraEvento = fecHoraEvento;
    }

    public String getDireccionEvento() {
        return direccionEvento;
    }

    public void setDireccionEvento(String direccionEvento) {
        this.direccionEvento = direccionEvento;
    }

    public Character getCustodiaPolicial() {
        return custodiaPolicial;
    }

    public void setCustodiaPolicial(Character custodiaPolicial) {
        this.custodiaPolicial = custodiaPolicial;
    }

    public Character getAccidenteTransito() {
        return accidenteTransito;
    }

    public void setAccidenteTransito(Character accidenteTransito) {
        this.accidenteTransito = accidenteTransito;
    }

    public Character getCaida() {
        return caida;
    }

    public void setCaida(Character caida) {
        this.caida = caida;
    }

    public Character getQuemadura() {
        return quemadura;
    }

    public void setQuemadura(Character quemadura) {
        this.quemadura = quemadura;
    }

    public Character getMordedura() {
        return mordedura;
    }

    public void setMordedura(Character mordedura) {
        this.mordedura = mordedura;
    }

    public Character getAhogamiento() {
        return ahogamiento;
    }

    public void setAhogamiento(Character ahogamiento) {
        this.ahogamiento = ahogamiento;
    }

    public Character getCuerpoExtrano() {
        return cuerpoExtrano;
    }

    public void setCuerpoExtrano(Character cuerpoExtrano) {
        this.cuerpoExtrano = cuerpoExtrano;
    }

    public Character getAplastamiento() {
        return aplastamiento;
    }

    public void setAplastamiento(Character aplastamiento) {
        this.aplastamiento = aplastamiento;
    }

    public Character getOtroAccidente() {
        return otroAccidente;
    }

    public void setOtroAccidente(Character otroAccidente) {
        this.otroAccidente = otroAccidente;
    }

    public Character getArmaFuego() {
        return armaFuego;
    }

    public void setArmaFuego(Character armaFuego) {
        this.armaFuego = armaFuego;
    }

    public Character getArmaCpunzante() {
        return armaCpunzante;
    }

    public void setArmaCpunzante(Character armaCpunzante) {
        this.armaCpunzante = armaCpunzante;
    }

    public Character getViolenciaRina() {
        return violenciaRina;
    }

    public void setViolenciaRina(Character violenciaRina) {
        this.violenciaRina = violenciaRina;
    }

    public Character getViolenciaFamiliar() {
        return violenciaFamiliar;
    }

    public void setViolenciaFamiliar(Character violenciaFamiliar) {
        this.violenciaFamiliar = violenciaFamiliar;
    }

    public Character getAbusoFisico() {
        return abusoFisico;
    }

    public void setAbusoFisico(Character abusoFisico) {
        this.abusoFisico = abusoFisico;
    }

    public Character getAbusoPsicologico() {
        return abusoPsicologico;
    }

    public void setAbusoPsicologico(Character abusoPsicologico) {
        this.abusoPsicologico = abusoPsicologico;
    }

    public Character getAbusoSexual() {
        return abusoSexual;
    }

    public void setAbusoSexual(Character abusoSexual) {
        this.abusoSexual = abusoSexual;
    }

    public Character getOtraViolencia() {
        return otraViolencia;
    }

    public void setOtraViolencia(Character otraViolencia) {
        this.otraViolencia = otraViolencia;
    }

    public Character getIntoxicacionAlcoholica() {
        return intoxicacionAlcoholica;
    }

    public void setIntoxicacionAlcoholica(Character intoxicacionAlcoholica) {
        this.intoxicacionAlcoholica = intoxicacionAlcoholica;
    }

    public Character getIntoxicacionAlimentaria() {
        return intoxicacionAlimentaria;
    }

    public void setIntoxicacionAlimentaria(Character intoxicacionAlimentaria) {
        this.intoxicacionAlimentaria = intoxicacionAlimentaria;
    }

    public Character getIntoxicacionDrogas() {
        return intoxicacionDrogas;
    }

    public void setIntoxicacionDrogas(Character intoxicacionDrogas) {
        this.intoxicacionDrogas = intoxicacionDrogas;
    }

    public Character getInhalacionGases() {
        return inhalacionGases;
    }

    public void setInhalacionGases(Character inhalacionGases) {
        this.inhalacionGases = inhalacionGases;
    }

    public Character getOtraIntoxicacion() {
        return otraIntoxicacion;
    }

    public void setOtraIntoxicacion(Character otraIntoxicacion) {
        this.otraIntoxicacion = otraIntoxicacion;
    }

    public Character getEnvenenamiento() {
        return envenenamiento;
    }

    public void setEnvenenamiento(Character envenenamiento) {
        this.envenenamiento = envenenamiento;
    }

    public Character getPicadura() {
        return picadura;
    }

    public void setPicadura(Character picadura) {
        this.picadura = picadura;
    }

    public Character getAnafilaxia() {
        return anafilaxia;
    }

    public void setAnafilaxia(Character anafilaxia) {
        this.anafilaxia = anafilaxia;
    }

    public String getObservacionesAccidente() {
        return observacionesAccidente;
    }

    public void setObservacionesAccidente(String observacionesAccidente) {
        this.observacionesAccidente = observacionesAccidente;
    }

    public Character getAlientoEtilico() {
        return alientoEtilico;
    }

    public void setAlientoEtilico(Character alientoEtilico) {
        this.alientoEtilico = alientoEtilico;
    }

    public BigDecimal getValorAlcochek() {
        return valorAlcochek;
    }

    public void setValorAlcochek(BigDecimal valorAlcochek) {
        this.valorAlcochek = valorAlcochek;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getIndicacionesTratamiento() {
        return indicacionesTratamiento;
    }

    public void setIndicacionesTratamiento(String indicacionesTratamiento) {
        this.indicacionesTratamiento = indicacionesTratamiento;
    }

    public Character getAltaDomicilio() {
        return altaDomicilio;
    }

    public void setAltaDomicilio(Character altaDomicilio) {
        this.altaDomicilio = altaDomicilio;
    }

    public Character getAltaCex() {
        return altaCex;
    }

    public void setAltaCex(Character altaCex) {
        this.altaCex = altaCex;
    }

    public Character getAltaObservacion() {
        return altaObservacion;
    }

    public void setAltaObservacion(Character altaObservacion) {
        this.altaObservacion = altaObservacion;
    }

    public Character getAltaInternacion() {
        return altaInternacion;
    }

    public void setAltaInternacion(Character altaInternacion) {
        this.altaInternacion = altaInternacion;
    }

    public Character getAltaReferencia() {
        return altaReferencia;
    }

    public void setAltaReferencia(Character altaReferencia) {
        this.altaReferencia = altaReferencia;
    }

    public String getServicioReferencia() {
        return servicioReferencia;
    }

    public void setServicioReferencia(String servicioReferencia) {
        this.servicioReferencia = servicioReferencia;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Character getEgresaVivo() {
        return egresaVivo;
    }

    public void setEgresaVivo(Character egresaVivo) {
        this.egresaVivo = egresaVivo;
    }

    public Character getEgresaCondicionEstable() {
        return egresaCondicionEstable;
    }

    public void setEgresaCondicionEstable(Character egresaCondicionEstable) {
        this.egresaCondicionEstable = egresaCondicionEstable;
    }

    public Character getEgresaCondicionInestable() {
        return egresaCondicionInestable;
    }

    public void setEgresaCondicionInestable(Character egresaCondicionInestable) {
        this.egresaCondicionInestable = egresaCondicionInestable;
    }

    public Short getDiasIncapacidad() {
        return diasIncapacidad;
    }

    public void setDiasIncapacidad(Short diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }

    public Character getMuertoEmergencia() {
        return muertoEmergencia;
    }

    public void setMuertoEmergencia(Character muertoEmergencia) {
        this.muertoEmergencia = muertoEmergencia;
    }

    public String getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(String causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    public Character getBiometria() {
        return biometria;
    }

    public void setBiometria(Character biometria) {
        this.biometria = biometria;
    }

    public Character getUroanalisis() {
        return uroanalisis;
    }

    public void setUroanalisis(Character uroanalisis) {
        this.uroanalisis = uroanalisis;
    }

    public Character getQuimicaSanguinea() {
        return quimicaSanguinea;
    }

    public void setQuimicaSanguinea(Character quimicaSanguinea) {
        this.quimicaSanguinea = quimicaSanguinea;
    }

    public Character getElectrolitos() {
        return electrolitos;
    }

    public void setElectrolitos(Character electrolitos) {
        this.electrolitos = electrolitos;
    }

    public Character getGasometria() {
        return gasometria;
    }

    public void setGasometria(Character gasometria) {
        this.gasometria = gasometria;
    }

    public Character getElectrocardiograma() {
        return electrocardiograma;
    }

    public void setElectrocardiograma(Character electrocardiograma) {
        this.electrocardiograma = electrocardiograma;
    }

    public Character getEndoscopia() {
        return endoscopia;
    }

    public void setEndoscopia(Character endoscopia) {
        this.endoscopia = endoscopia;
    }

    public Character getRxTorax() {
        return rxTorax;
    }

    public void setRxTorax(Character rxTorax) {
        this.rxTorax = rxTorax;
    }

    public Character getRxAbdomen() {
        return rxAbdomen;
    }

    public void setRxAbdomen(Character rxAbdomen) {
        this.rxAbdomen = rxAbdomen;
    }

    public Character getRxOsea() {
        return rxOsea;
    }

    public void setRxOsea(Character rxOsea) {
        this.rxOsea = rxOsea;
    }

    public Character getTomografia() {
        return tomografia;
    }

    public void setTomografia(Character tomografia) {
        this.tomografia = tomografia;
    }

    public Character getResonancia() {
        return resonancia;
    }

    public void setResonancia(Character resonancia) {
        this.resonancia = resonancia;
    }

    public Character getEcografiaPelvica() {
        return ecografiaPelvica;
    }

    public void setEcografiaPelvica(Character ecografiaPelvica) {
        this.ecografiaPelvica = ecografiaPelvica;
    }

    public Character getEcografiaAbdomen() {
        return ecografiaAbdomen;
    }

    public void setEcografiaAbdomen(Character ecografiaAbdomen) {
        this.ecografiaAbdomen = ecografiaAbdomen;
    }

    public Character getInterconsulta() {
        return interconsulta;
    }

    public void setInterconsulta(Character interconsulta) {
        this.interconsulta = interconsulta;
    }

    public Character getOtrosExamenes() {
        return otrosExamenes;
    }

    public void setOtrosExamenes(Character otrosExamenes) {
        this.otrosExamenes = otrosExamenes;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrsCodigoAlta() {
        return prsCodigoAlta;
    }

    public void setPrsCodigoAlta(String prsCodigoAlta) {
        this.prsCodigoAlta = prsCodigoAlta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emergencias)) {
            return false;
        }
        Emergencias other = (Emergencias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Emergencias[ id=" + id + " ]";
    }
    
}
