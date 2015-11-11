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
@Table(name = "CREACION_EGRESOS_FCT")
@NamedQueries({
    @NamedQuery(name = "CreacionEgresosFct.findAll", query = "SELECT c FROM CreacionEgresosFct c")})
public class CreacionEgresosFct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Id
    @Basic(optional = false)
    @Column(name = "CRCEGRFCT_ID")
    private Integer crcegrfctId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "EGRCJAMDC_NUMERO")
    private Integer egrcjamdcNumero;
    @Column(name = "DSCAGR_NUMERO")
    private Integer dscagrNumero;
    @Column(name = "ESTADO")
    private Character estado;

    public CreacionEgresosFct() {
    }

    public CreacionEgresosFct(Integer crcegrfctId) {
        this.crcegrfctId = crcegrfctId;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public Integer getCrcegrfctId() {
        return crcegrfctId;
    }

    public void setCrcegrfctId(Integer crcegrfctId) {
        this.crcegrfctId = crcegrfctId;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getEgrcjamdcNumero() {
        return egrcjamdcNumero;
    }

    public void setEgrcjamdcNumero(Integer egrcjamdcNumero) {
        this.egrcjamdcNumero = egrcjamdcNumero;
    }

    public Integer getDscagrNumero() {
        return dscagrNumero;
    }

    public void setDscagrNumero(Integer dscagrNumero) {
        this.dscagrNumero = dscagrNumero;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crcegrfctId != null ? crcegrfctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreacionEgresosFct)) {
            return false;
        }
        CreacionEgresosFct other = (CreacionEgresosFct) object;
        if ((this.crcegrfctId == null && other.crcegrfctId != null) || (this.crcegrfctId != null && !this.crcegrfctId.equals(other.crcegrfctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CreacionEgresosFct[ crcegrfctId=" + crcegrfctId + " ]";
    }
    
}
