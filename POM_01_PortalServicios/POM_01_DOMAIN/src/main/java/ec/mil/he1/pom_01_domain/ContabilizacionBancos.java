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
@Table(name = "CONTABILIZACION_BANCOS")
@NamedQueries({
    @NamedQuery(name = "ContabilizacionBancos.findAll", query = "SELECT c FROM ContabilizacionBancos c")})
public class ContabilizacionBancos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNTBNC_EMP_CODIGO")
    private String cntbncEmpCodigo;
    @Column(name = "CNTBNC_TIPO")
    private String cntbncTipo;
    @Column(name = "CNTBNC_NUMERO")
    private String cntbncNumero;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTMVMBNC_ID")
    private Integer cntmvmbncId;
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
    @Column(name = "TPOCMP_CODIGO")
    private String tpocmpCodigo;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;

    public ContabilizacionBancos() {
    }

    public ContabilizacionBancos(Integer cntmvmbncId) {
        this.cntmvmbncId = cntmvmbncId;
    }

    public String getCntbncEmpCodigo() {
        return cntbncEmpCodigo;
    }

    public void setCntbncEmpCodigo(String cntbncEmpCodigo) {
        this.cntbncEmpCodigo = cntbncEmpCodigo;
    }

    public String getCntbncTipo() {
        return cntbncTipo;
    }

    public void setCntbncTipo(String cntbncTipo) {
        this.cntbncTipo = cntbncTipo;
    }

    public String getCntbncNumero() {
        return cntbncNumero;
    }

    public void setCntbncNumero(String cntbncNumero) {
        this.cntbncNumero = cntbncNumero;
    }

    public Integer getCntmvmbncId() {
        return cntmvmbncId;
    }

    public void setCntmvmbncId(Integer cntmvmbncId) {
        this.cntmvmbncId = cntmvmbncId;
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

    public String getTpocmpCodigo() {
        return tpocmpCodigo;
    }

    public void setTpocmpCodigo(String tpocmpCodigo) {
        this.tpocmpCodigo = tpocmpCodigo;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntmvmbncId != null ? cntmvmbncId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionBancos)) {
            return false;
        }
        ContabilizacionBancos other = (ContabilizacionBancos) object;
        if ((this.cntmvmbncId == null && other.cntmvmbncId != null) || (this.cntmvmbncId != null && !this.cntmvmbncId.equals(other.cntmvmbncId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ContabilizacionBancos[ cntmvmbncId=" + cntmvmbncId + " ]";
    }
    
}
