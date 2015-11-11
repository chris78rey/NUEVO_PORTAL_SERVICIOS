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
@Table(name = "DEPARTAMENTOS_COPAGO")
@NamedQueries({
    @NamedQuery(name = "DepartamentosCopago.findAll", query = "SELECT d FROM DepartamentosCopago d")})
public class DepartamentosCopago implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepartamentosCopagoPK departamentosCopagoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;

    public DepartamentosCopago() {
    }

    public DepartamentosCopago(DepartamentosCopagoPK departamentosCopagoPK) {
        this.departamentosCopagoPK = departamentosCopagoPK;
    }

    public DepartamentosCopago(String cpgCodigo, String dprAraCodigo, String dprCodigo) {
        this.departamentosCopagoPK = new DepartamentosCopagoPK(cpgCodigo, dprAraCodigo, dprCodigo);
    }

    public DepartamentosCopagoPK getDepartamentosCopagoPK() {
        return departamentosCopagoPK;
    }

    public void setDepartamentosCopagoPK(DepartamentosCopagoPK departamentosCopagoPK) {
        this.departamentosCopagoPK = departamentosCopagoPK;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentosCopagoPK != null ? departamentosCopagoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosCopago)) {
            return false;
        }
        DepartamentosCopago other = (DepartamentosCopago) object;
        if ((this.departamentosCopagoPK == null && other.departamentosCopagoPK != null) || (this.departamentosCopagoPK != null && !this.departamentosCopagoPK.equals(other.departamentosCopagoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DepartamentosCopago[ departamentosCopagoPK=" + departamentosCopagoPK + " ]";
    }
    
}
