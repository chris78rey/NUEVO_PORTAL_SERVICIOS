/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CUENTAS_ASOCIADAS")
@NamedQueries({
    @NamedQuery(name = "CuentasAsociadas.findAll", query = "SELECT c FROM CuentasAsociadas c")})
public class CuentasAsociadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTASC_ID")
    private Long cntascId;
    @Column(name = "TIPO_DE_CUENTA")
    private String tipoDeCuenta;
    @Column(name = "TIPO_DE_ASOCIACION")
    private String tipoDeAsociacion;
    @Column(name = "CUENTA")
    private String cuenta;
    @Column(name = "CLAVE_RELACIONADA")
    private String claveRelacionada;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Column(name = "AGRCNT_CODIGO")
    private String agrcntCodigo;
    @Column(name = "AGRCNT_TIPO")
    private String agrcntTipo;

    public CuentasAsociadas() {
    }

    public CuentasAsociadas(Long cntascId) {
        this.cntascId = cntascId;
    }

    public Long getCntascId() {
        return cntascId;
    }

    public void setCntascId(Long cntascId) {
        this.cntascId = cntascId;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public String getTipoDeAsociacion() {
        return tipoDeAsociacion;
    }

    public void setTipoDeAsociacion(String tipoDeAsociacion) {
        this.tipoDeAsociacion = tipoDeAsociacion;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClaveRelacionada() {
        return claveRelacionada;
    }

    public void setClaveRelacionada(String claveRelacionada) {
        this.claveRelacionada = claveRelacionada;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getAgrcntCodigo() {
        return agrcntCodigo;
    }

    public void setAgrcntCodigo(String agrcntCodigo) {
        this.agrcntCodigo = agrcntCodigo;
    }

    public String getAgrcntTipo() {
        return agrcntTipo;
    }

    public void setAgrcntTipo(String agrcntTipo) {
        this.agrcntTipo = agrcntTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntascId != null ? cntascId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasAsociadas)) {
            return false;
        }
        CuentasAsociadas other = (CuentasAsociadas) object;
        if ((this.cntascId == null && other.cntascId != null) || (this.cntascId != null && !this.cntascId.equals(other.cntascId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CuentasAsociadas[ cntascId=" + cntascId + " ]";
    }
    
}
