/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "AGRUPADORES_CONTABLES")
@NamedQueries({
    @NamedQuery(name = "AgrupadoresContables.findAll", query = "SELECT a FROM AgrupadoresContables a")})
public class AgrupadoresContables implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgrupadoresContablesPK agrupadoresContablesPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CUENTA_CONTABLE_MAYOR")
    private String cuentaContableMayor;
    @Column(name = "CONTRA_CUENTA_CONTABLE_MAYOR")
    private String contraCuentaContableMayor;

    public AgrupadoresContables() {
    }

    public AgrupadoresContables(AgrupadoresContablesPK agrupadoresContablesPK) {
        this.agrupadoresContablesPK = agrupadoresContablesPK;
    }

    public AgrupadoresContables(String tipo, String codigo, String empCodigo) {
        this.agrupadoresContablesPK = new AgrupadoresContablesPK(tipo, codigo, empCodigo);
    }

    public AgrupadoresContablesPK getAgrupadoresContablesPK() {
        return agrupadoresContablesPK;
    }

    public void setAgrupadoresContablesPK(AgrupadoresContablesPK agrupadoresContablesPK) {
        this.agrupadoresContablesPK = agrupadoresContablesPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCuentaContableMayor() {
        return cuentaContableMayor;
    }

    public void setCuentaContableMayor(String cuentaContableMayor) {
        this.cuentaContableMayor = cuentaContableMayor;
    }

    public String getContraCuentaContableMayor() {
        return contraCuentaContableMayor;
    }

    public void setContraCuentaContableMayor(String contraCuentaContableMayor) {
        this.contraCuentaContableMayor = contraCuentaContableMayor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agrupadoresContablesPK != null ? agrupadoresContablesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgrupadoresContables)) {
            return false;
        }
        AgrupadoresContables other = (AgrupadoresContables) object;
        if ((this.agrupadoresContablesPK == null && other.agrupadoresContablesPK != null) || (this.agrupadoresContablesPK != null && !this.agrupadoresContablesPK.equals(other.agrupadoresContablesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AgrupadoresContables[ agrupadoresContablesPK=" + agrupadoresContablesPK + " ]";
    }
    
}
