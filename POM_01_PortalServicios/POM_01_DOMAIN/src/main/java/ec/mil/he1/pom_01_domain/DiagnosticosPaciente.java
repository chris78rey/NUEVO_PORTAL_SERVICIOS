/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DIAGNOSTICOS_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosPaciente.findAll", query = "SELECT d FROM DiagnosticosPaciente d")})
public class DiagnosticosPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DGNPCN_ID")
    private Long dgnpcnId;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "ENF_CODIGO")
    private String enfCodigo;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "DX_GENERICO")
    private String dxGenerico;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "MRF_CODIGO")
    private String mrfCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "ESTADO_VALIDEZ")
    private Character estadoValidez;
    @Column(name = "OBSERVACION")
    private String observacion;

    public DiagnosticosPaciente() {
    }

    public DiagnosticosPaciente(Long dgnpcnId) {
        this.dgnpcnId = dgnpcnId;
    }

    public Long getDgnpcnId() {
        return dgnpcnId;
    }

    public void setDgnpcnId(Long dgnpcnId) {
        this.dgnpcnId = dgnpcnId;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getEnfCodigo() {
        return enfCodigo;
    }

    public void setEnfCodigo(String enfCodigo) {
        this.enfCodigo = enfCodigo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDxGenerico() {
        return dxGenerico;
    }

    public void setDxGenerico(String dxGenerico) {
        this.dxGenerico = dxGenerico;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMrfCodigo() {
        return mrfCodigo;
    }

    public void setMrfCodigo(String mrfCodigo) {
        this.mrfCodigo = mrfCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Character getEstadoValidez() {
        return estadoValidez;
    }

    public void setEstadoValidez(Character estadoValidez) {
        this.estadoValidez = estadoValidez;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dgnpcnId != null ? dgnpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosPaciente)) {
            return false;
        }
        DiagnosticosPaciente other = (DiagnosticosPaciente) object;
        if ((this.dgnpcnId == null && other.dgnpcnId != null) || (this.dgnpcnId != null && !this.dgnpcnId.equals(other.dgnpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DiagnosticosPaciente[ dgnpcnId=" + dgnpcnId + " ]";
    }
    
}
