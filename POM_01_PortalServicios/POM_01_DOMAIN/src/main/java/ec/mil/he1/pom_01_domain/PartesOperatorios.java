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
@Table(name = "PARTES_OPERATORIOS")
@NamedQueries({
    @NamedQuery(name = "PartesOperatorios.findAll", query = "SELECT p FROM PartesOperatorios p")})
public class PartesOperatorios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartesOperatoriosPK partesOperatoriosPK;
    @Column(name = "DGNPCN_ID_POSTQUIRURGICO")
    private Long dgnpcnIdPostquirurgico;
    @Column(name = "PRS_CODIGO_COMPLETADO_POR")
    private String prsCodigoCompletadoPor;
    @Column(name = "TECNICA_QUIRURGICA")
    private String tecnicaQuirurgica;
    @Column(name = "HALLAZGOS_QUIRURGICOS")
    private String hallazgosQuirurgicos;
    @Column(name = "COMPLICACIONES_TRANSOPERATORIA")
    private String complicacionesTransoperatoria;
    @Column(name = "CONDICION")
    private String condicion;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "AUDITADO")
    private Character auditado;
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private Integer prmatnPcnNumeroHc;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "TIPO_ANESTESIA")
    private String tipoAnestesia;
    @Column(name = "FECHA_TERMINA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTermina;
    @Column(name = "DURACION")
    private Short duracion;
    @Column(name = "REVISADO")
    private Character revisado;
    @Column(name = "CARGAR_DERECHO_QUIROFANO")
    private Character cargarDerechoQuirofano;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "PRS_CODIGO_CONFIRMADO_POR")
    private String prsCodigoConfirmadoPor;
    @Column(name = "FECHA_CONFIRMA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConfirma;
    @Column(name = "USO_MICROSCOPIO")
    private Character usoMicroscopio;

    public PartesOperatorios() {
    }

    public PartesOperatorios(PartesOperatoriosPK partesOperatoriosPK) {
        this.partesOperatoriosPK = partesOperatoriosPK;
    }

    public PartesOperatorios(int prtoprslcPcnNumeroHc, int prtoprslcNumero) {
        this.partesOperatoriosPK = new PartesOperatoriosPK(prtoprslcPcnNumeroHc, prtoprslcNumero);
    }

    public PartesOperatoriosPK getPartesOperatoriosPK() {
        return partesOperatoriosPK;
    }

    public void setPartesOperatoriosPK(PartesOperatoriosPK partesOperatoriosPK) {
        this.partesOperatoriosPK = partesOperatoriosPK;
    }

    public Long getDgnpcnIdPostquirurgico() {
        return dgnpcnIdPostquirurgico;
    }

    public void setDgnpcnIdPostquirurgico(Long dgnpcnIdPostquirurgico) {
        this.dgnpcnIdPostquirurgico = dgnpcnIdPostquirurgico;
    }

    public String getPrsCodigoCompletadoPor() {
        return prsCodigoCompletadoPor;
    }

    public void setPrsCodigoCompletadoPor(String prsCodigoCompletadoPor) {
        this.prsCodigoCompletadoPor = prsCodigoCompletadoPor;
    }

    public String getTecnicaQuirurgica() {
        return tecnicaQuirurgica;
    }

    public void setTecnicaQuirurgica(String tecnicaQuirurgica) {
        this.tecnicaQuirurgica = tecnicaQuirurgica;
    }

    public String getHallazgosQuirurgicos() {
        return hallazgosQuirurgicos;
    }

    public void setHallazgosQuirurgicos(String hallazgosQuirurgicos) {
        this.hallazgosQuirurgicos = hallazgosQuirurgicos;
    }

    public String getComplicacionesTransoperatoria() {
        return complicacionesTransoperatoria;
    }

    public void setComplicacionesTransoperatoria(String complicacionesTransoperatoria) {
        this.complicacionesTransoperatoria = complicacionesTransoperatoria;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Character getAuditado() {
        return auditado;
    }

    public void setAuditado(Character auditado) {
        this.auditado = auditado;
    }

    public Integer getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(Integer prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public String getTipoAnestesia() {
        return tipoAnestesia;
    }

    public void setTipoAnestesia(String tipoAnestesia) {
        this.tipoAnestesia = tipoAnestesia;
    }

    public Date getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(Date fechaTermina) {
        this.fechaTermina = fechaTermina;
    }

    public Short getDuracion() {
        return duracion;
    }

    public void setDuracion(Short duracion) {
        this.duracion = duracion;
    }

    public Character getRevisado() {
        return revisado;
    }

    public void setRevisado(Character revisado) {
        this.revisado = revisado;
    }

    public Character getCargarDerechoQuirofano() {
        return cargarDerechoQuirofano;
    }

    public void setCargarDerechoQuirofano(Character cargarDerechoQuirofano) {
        this.cargarDerechoQuirofano = cargarDerechoQuirofano;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getPrsCodigoConfirmadoPor() {
        return prsCodigoConfirmadoPor;
    }

    public void setPrsCodigoConfirmadoPor(String prsCodigoConfirmadoPor) {
        this.prsCodigoConfirmadoPor = prsCodigoConfirmadoPor;
    }

    public Date getFechaConfirma() {
        return fechaConfirma;
    }

    public void setFechaConfirma(Date fechaConfirma) {
        this.fechaConfirma = fechaConfirma;
    }

    public Character getUsoMicroscopio() {
        return usoMicroscopio;
    }

    public void setUsoMicroscopio(Character usoMicroscopio) {
        this.usoMicroscopio = usoMicroscopio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partesOperatoriosPK != null ? partesOperatoriosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartesOperatorios)) {
            return false;
        }
        PartesOperatorios other = (PartesOperatorios) object;
        if ((this.partesOperatoriosPK == null && other.partesOperatoriosPK != null) || (this.partesOperatoriosPK != null && !this.partesOperatoriosPK.equals(other.partesOperatoriosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PartesOperatorios[ partesOperatoriosPK=" + partesOperatoriosPK + " ]";
    }
    
}
