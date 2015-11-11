/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "PARTES_OPERATORIOS_SOLICITUD")
@NamedQueries({
    @NamedQuery(name = "PartesOperatoriosSolicitud.findAll", query = "SELECT p FROM PartesOperatoriosSolicitud p")})
public class PartesOperatoriosSolicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartesOperatoriosSolicitudPK partesOperatoriosSolicitudPK;
    @Column(name = "DGNPCN_ID_PREQUIRURGICO")
    private Long dgnpcnIdPrequirurgico;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "MODALIDAD")
    private String modalidad;
    @Column(name = "FECHA_PROPUESTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPropuesta;
    @Column(name = "ANULADA")
    private Character anulada;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "HJAINT_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hjaintFecha;
    @Column(name = "MOTIVO_ANULACION")
    private String motivoAnulacion;
    @Column(name = "HORA_PROGRAMADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaProgramada;
    @Column(name = "QUIROFANO")
    private String quirofano;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "PENSIONADO")
    private Character pensionado;
    @Column(name = "AREA_SOLICITANTE")
    private String areaSolicitante;
    @Column(name = "TIPO_ANESTESIA_SOLICITADA")
    private String tipoAnestesiaSolicitada;

    public PartesOperatoriosSolicitud() {
    }

    public PartesOperatoriosSolicitud(PartesOperatoriosSolicitudPK partesOperatoriosSolicitudPK) {
        this.partesOperatoriosSolicitudPK = partesOperatoriosSolicitudPK;
    }

    public PartesOperatoriosSolicitud(int pcnNumeroHc, int numero) {
        this.partesOperatoriosSolicitudPK = new PartesOperatoriosSolicitudPK(pcnNumeroHc, numero);
    }

    public PartesOperatoriosSolicitudPK getPartesOperatoriosSolicitudPK() {
        return partesOperatoriosSolicitudPK;
    }

    public void setPartesOperatoriosSolicitudPK(PartesOperatoriosSolicitudPK partesOperatoriosSolicitudPK) {
        this.partesOperatoriosSolicitudPK = partesOperatoriosSolicitudPK;
    }

    public Long getDgnpcnIdPrequirurgico() {
        return dgnpcnIdPrequirurgico;
    }

    public void setDgnpcnIdPrequirurgico(Long dgnpcnIdPrequirurgico) {
        this.dgnpcnIdPrequirurgico = dgnpcnIdPrequirurgico;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Date getFechaPropuesta() {
        return fechaPropuesta;
    }

    public void setFechaPropuesta(Date fechaPropuesta) {
        this.fechaPropuesta = fechaPropuesta;
    }

    public Character getAnulada() {
        return anulada;
    }

    public void setAnulada(Character anulada) {
        this.anulada = anulada;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getHjaintFecha() {
        return hjaintFecha;
    }

    public void setHjaintFecha(Date hjaintFecha) {
        this.hjaintFecha = hjaintFecha;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public Date getHoraProgramada() {
        return horaProgramada;
    }

    public void setHoraProgramada(Date horaProgramada) {
        this.horaProgramada = horaProgramada;
    }

    public String getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(String quirofano) {
        this.quirofano = quirofano;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public Character getPensionado() {
        return pensionado;
    }

    public void setPensionado(Character pensionado) {
        this.pensionado = pensionado;
    }

    public String getAreaSolicitante() {
        return areaSolicitante;
    }

    public void setAreaSolicitante(String areaSolicitante) {
        this.areaSolicitante = areaSolicitante;
    }

    public String getTipoAnestesiaSolicitada() {
        return tipoAnestesiaSolicitada;
    }

    public void setTipoAnestesiaSolicitada(String tipoAnestesiaSolicitada) {
        this.tipoAnestesiaSolicitada = tipoAnestesiaSolicitada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partesOperatoriosSolicitudPK != null ? partesOperatoriosSolicitudPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartesOperatoriosSolicitud)) {
            return false;
        }
        PartesOperatoriosSolicitud other = (PartesOperatoriosSolicitud) object;
        if ((this.partesOperatoriosSolicitudPK == null && other.partesOperatoriosSolicitudPK != null) || (this.partesOperatoriosSolicitudPK != null && !this.partesOperatoriosSolicitudPK.equals(other.partesOperatoriosSolicitudPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PartesOperatoriosSolicitud[ partesOperatoriosSolicitudPK=" + partesOperatoriosSolicitudPK + " ]";
    }
    
}
