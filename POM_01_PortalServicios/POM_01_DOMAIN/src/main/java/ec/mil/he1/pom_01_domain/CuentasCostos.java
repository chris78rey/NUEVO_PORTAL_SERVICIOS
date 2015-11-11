/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CUENTAS_COSTOS")
@NamedQueries({
    @NamedQuery(name = "CuentasCostos.findAll", query = "SELECT c FROM CuentasCostos c")})
public class CuentasCostos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentasCostosPK cuentasCostosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "VALOR")
    private BigDecimal valor;

    public CuentasCostos() {
    }

    public CuentasCostos(CuentasCostosPK cuentasCostosPK) {
        this.cuentasCostosPK = cuentasCostosPK;
    }

    public CuentasCostos(String cstCodigo, String cuenta) {
        this.cuentasCostosPK = new CuentasCostosPK(cstCodigo, cuenta);
    }

    public CuentasCostosPK getCuentasCostosPK() {
        return cuentasCostosPK;
    }

    public void setCuentasCostosPK(CuentasCostosPK cuentasCostosPK) {
        this.cuentasCostosPK = cuentasCostosPK;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentasCostosPK != null ? cuentasCostosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasCostos)) {
            return false;
        }
        CuentasCostos other = (CuentasCostos) object;
        if ((this.cuentasCostosPK == null && other.cuentasCostosPK != null) || (this.cuentasCostosPK != null && !this.cuentasCostosPK.equals(other.cuentasCostosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CuentasCostos[ cuentasCostosPK=" + cuentasCostosPK + " ]";
    }
    
}
