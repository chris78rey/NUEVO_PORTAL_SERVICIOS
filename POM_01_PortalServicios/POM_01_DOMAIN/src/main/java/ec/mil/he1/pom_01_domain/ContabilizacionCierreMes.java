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
@Table(name = "CONTABILIZACION_CIERRE_MES")
@NamedQueries({
    @NamedQuery(name = "ContabilizacionCierreMes.findAll", query = "SELECT c FROM ContabilizacionCierreMes c")})
public class ContabilizacionCierreMes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTCRRMES_ID")
    private Long cntcrrmesId;
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Column(name = "ANIO")
    private Short anio;
    @Column(name = "MES")
    private Short mes;
    @Column(name = "LOCAL")
    private String local;
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
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "TPOCMP_CODIGO")
    private String tpocmpCodigo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;

    public ContabilizacionCierreMes() {
    }

    public ContabilizacionCierreMes(Long cntcrrmesId) {
        this.cntcrrmesId = cntcrrmesId;
    }

    public Long getCntcrrmesId() {
        return cntcrrmesId;
    }

    public void setCntcrrmesId(Long cntcrrmesId) {
        this.cntcrrmesId = cntcrrmesId;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public Short getMes() {
        return mes;
    }

    public void setMes(Short mes) {
        this.mes = mes;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public String getTpocmpCodigo() {
        return tpocmpCodigo;
    }

    public void setTpocmpCodigo(String tpocmpCodigo) {
        this.tpocmpCodigo = tpocmpCodigo;
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
        hash += (cntcrrmesId != null ? cntcrrmesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionCierreMes)) {
            return false;
        }
        ContabilizacionCierreMes other = (ContabilizacionCierreMes) object;
        if ((this.cntcrrmesId == null && other.cntcrrmesId != null) || (this.cntcrrmesId != null && !this.cntcrrmesId.equals(other.cntcrrmesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ContabilizacionCierreMes[ cntcrrmesId=" + cntcrrmesId + " ]";
    }
    
}
