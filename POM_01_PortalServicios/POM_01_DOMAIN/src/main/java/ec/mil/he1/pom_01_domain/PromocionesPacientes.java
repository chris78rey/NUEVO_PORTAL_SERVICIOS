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
@Table(name = "PROMOCIONES_PACIENTES")
@NamedQueries({
    @NamedQuery(name = "PromocionesPacientes.findAll", query = "SELECT p FROM PromocionesPacientes p")})
public class PromocionesPacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRMPCN_ID")
    private Long prmpcnId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_CATEGORIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCategorizacion;
    @Column(name = "VALIDEZ")
    private Short validez;

    public PromocionesPacientes() {
    }

    public PromocionesPacientes(Long prmpcnId) {
        this.prmpcnId = prmpcnId;
    }

    public Long getPrmpcnId() {
        return prmpcnId;
    }

    public void setPrmpcnId(Long prmpcnId) {
        this.prmpcnId = prmpcnId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCategorizacion() {
        return fechaCategorizacion;
    }

    public void setFechaCategorizacion(Date fechaCategorizacion) {
        this.fechaCategorizacion = fechaCategorizacion;
    }

    public Short getValidez() {
        return validez;
    }

    public void setValidez(Short validez) {
        this.validez = validez;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmpcnId != null ? prmpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromocionesPacientes)) {
            return false;
        }
        PromocionesPacientes other = (PromocionesPacientes) object;
        if ((this.prmpcnId == null && other.prmpcnId != null) || (this.prmpcnId != null && !this.prmpcnId.equals(other.prmpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PromocionesPacientes[ prmpcnId=" + prmpcnId + " ]";
    }
    
}
