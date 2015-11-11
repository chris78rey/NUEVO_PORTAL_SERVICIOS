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
@Table(name = "CONTABILIZACION_REGULACION_BTC")
@NamedQueries({
    @NamedQuery(name = "ContabilizacionRegulacionBtc.findAll", query = "SELECT c FROM ContabilizacionRegulacionBtc c")})
public class ContabilizacionRegulacionBtc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTRGLBTC_ID")
    private Long cntrglbtcId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO")
    private Character estado;
    @Column(name = "RGL_TPOCMP_CODIGO")
    private String rglTpocmpCodigo;
    @Column(name = "RGL_CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rglCmpFecha;
    @Column(name = "RGL_CMP_CLAVE")
    private Integer rglCmpClave;
    @Column(name = "LOCAL")
    private String local;

    public ContabilizacionRegulacionBtc() {
    }

    public ContabilizacionRegulacionBtc(Long cntrglbtcId) {
        this.cntrglbtcId = cntrglbtcId;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public Long getCntrglbtcId() {
        return cntrglbtcId;
    }

    public void setCntrglbtcId(Long cntrglbtcId) {
        this.cntrglbtcId = cntrglbtcId;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public String getRglTpocmpCodigo() {
        return rglTpocmpCodigo;
    }

    public void setRglTpocmpCodigo(String rglTpocmpCodigo) {
        this.rglTpocmpCodigo = rglTpocmpCodigo;
    }

    public Date getRglCmpFecha() {
        return rglCmpFecha;
    }

    public void setRglCmpFecha(Date rglCmpFecha) {
        this.rglCmpFecha = rglCmpFecha;
    }

    public Integer getRglCmpClave() {
        return rglCmpClave;
    }

    public void setRglCmpClave(Integer rglCmpClave) {
        this.rglCmpClave = rglCmpClave;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntrglbtcId != null ? cntrglbtcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionRegulacionBtc)) {
            return false;
        }
        ContabilizacionRegulacionBtc other = (ContabilizacionRegulacionBtc) object;
        if ((this.cntrglbtcId == null && other.cntrglbtcId != null) || (this.cntrglbtcId != null && !this.cntrglbtcId.equals(other.cntrglbtcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ContabilizacionRegulacionBtc[ cntrglbtcId=" + cntrglbtcId + " ]";
    }
    
}
