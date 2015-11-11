/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "PERMANENCIAS_Y_ATENCIONES")
@NamedQueries({
    @NamedQuery(name = "PermanenciasYAtenciones.findAll", query = "SELECT p FROM PermanenciasYAtenciones p")})
public class PermanenciasYAtenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PermanenciasYAtencionesPK permanenciasYAtencionesPK;
    @Column(name = "PRS_CODIGO_ADMITIDA_POR")
    private String prsCodigoAdmitidaPor;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "PESO")
    private Short peso;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "TOTAL_DIAS")
    private Integer totalDias;
    @Column(name = "PCNTMP_PCNTMP_ID")
    private Long pcntmpPcntmpId;
    @Column(name = "SEGURO")
    private Character seguro;
    @Column(name = "TPOPRM_CODIGO")
    private Short tpoprmCodigo;
    @Column(name = "SLCINT_NUMERO")
    private Integer slcintNumero;
    @Column(name = "HISTORIA")
    private String historia;
    @Column(name = "PRS_CODIGO_REALIZADO")
    private String prsCodigoRealizado;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    @Column(name = "FECHA_TRANSFERENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransferencia;
    @Column(name = "TIPO_TRANSFERENCIA")
    private String tipoTransferencia;
    @Column(name = "PCN_FUERZA")
    private String pcnFuerza;
    @Column(name = "PCN_GRADO")
    private String pcnGrado;
    @Column(name = "PCN_SITUACION")
    private String pcnSituacion;
    @Column(name = "PREALTA")
    private Character prealta;
    @Column(name = "PAQUETE")
    private Character paquete;

    public PermanenciasYAtenciones() {
    }

    public PermanenciasYAtenciones(PermanenciasYAtencionesPK permanenciasYAtencionesPK) {
        this.permanenciasYAtencionesPK = permanenciasYAtencionesPK;
    }

    public PermanenciasYAtenciones(int pcnNumeroHc, int numero) {
        this.permanenciasYAtencionesPK = new PermanenciasYAtencionesPK(pcnNumeroHc, numero);
    }

    public PermanenciasYAtencionesPK getPermanenciasYAtencionesPK() {
        return permanenciasYAtencionesPK;
    }

    public void setPermanenciasYAtencionesPK(PermanenciasYAtencionesPK permanenciasYAtencionesPK) {
        this.permanenciasYAtencionesPK = permanenciasYAtencionesPK;
    }

    public String getPrsCodigoAdmitidaPor() {
        return prsCodigoAdmitidaPor;
    }

    public void setPrsCodigoAdmitidaPor(String prsCodigoAdmitidaPor) {
        this.prsCodigoAdmitidaPor = prsCodigoAdmitidaPor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Short getPeso() {
        return peso;
    }

    public void setPeso(Short peso) {
        this.peso = peso;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(Integer totalDias) {
        this.totalDias = totalDias;
    }

    public Long getPcntmpPcntmpId() {
        return pcntmpPcntmpId;
    }

    public void setPcntmpPcntmpId(Long pcntmpPcntmpId) {
        this.pcntmpPcntmpId = pcntmpPcntmpId;
    }

    public Character getSeguro() {
        return seguro;
    }

    public void setSeguro(Character seguro) {
        this.seguro = seguro;
    }

    public Short getTpoprmCodigo() {
        return tpoprmCodigo;
    }

    public void setTpoprmCodigo(Short tpoprmCodigo) {
        this.tpoprmCodigo = tpoprmCodigo;
    }

    public Integer getSlcintNumero() {
        return slcintNumero;
    }

    public void setSlcintNumero(Integer slcintNumero) {
        this.slcintNumero = slcintNumero;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getPrsCodigoRealizado() {
        return prsCodigoRealizado;
    }

    public void setPrsCodigoRealizado(String prsCodigoRealizado) {
        this.prsCodigoRealizado = prsCodigoRealizado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(Date fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getPcnFuerza() {
        return pcnFuerza;
    }

    public void setPcnFuerza(String pcnFuerza) {
        this.pcnFuerza = pcnFuerza;
    }

    public String getPcnGrado() {
        return pcnGrado;
    }

    public void setPcnGrado(String pcnGrado) {
        this.pcnGrado = pcnGrado;
    }

    public String getPcnSituacion() {
        return pcnSituacion;
    }

    public void setPcnSituacion(String pcnSituacion) {
        this.pcnSituacion = pcnSituacion;
    }

    public Character getPrealta() {
        return prealta;
    }

    public void setPrealta(Character prealta) {
        this.prealta = prealta;
    }

    public Character getPaquete() {
        return paquete;
    }

    public void setPaquete(Character paquete) {
        this.paquete = paquete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permanenciasYAtencionesPK != null ? permanenciasYAtencionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermanenciasYAtenciones)) {
            return false;
        }
        PermanenciasYAtenciones other = (PermanenciasYAtenciones) object;
        if ((this.permanenciasYAtencionesPK == null && other.permanenciasYAtencionesPK != null) || (this.permanenciasYAtencionesPK != null && !this.permanenciasYAtencionesPK.equals(other.permanenciasYAtencionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PermanenciasYAtenciones[ permanenciasYAtencionesPK=" + permanenciasYAtencionesPK + " ]";
    }
    
}
