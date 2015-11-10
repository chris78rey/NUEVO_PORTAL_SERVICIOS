/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PARAMETROS_INTEGRACION")
@NamedQueries({
    @NamedQuery(name = "ParametrosIntegracion.findAll", query = "SELECT p FROM ParametrosIntegracion p")})
public class ParametrosIntegracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosIntegracionPK parametrosIntegracionPK;
    @Column(name = "CUENTA_CONTABLE")
    private String cuentaContable;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;

    public ParametrosIntegracion() {
    }

    public ParametrosIntegracion(ParametrosIntegracionPK parametrosIntegracionPK) {
        this.parametrosIntegracionPK = parametrosIntegracionPK;
    }

    public ParametrosIntegracion(String parametro, String tipo, String empCodigo) {
        this.parametrosIntegracionPK = new ParametrosIntegracionPK(parametro, tipo, empCodigo);
    }

    public ParametrosIntegracionPK getParametrosIntegracionPK() {
        return parametrosIntegracionPK;
    }

    public void setParametrosIntegracionPK(ParametrosIntegracionPK parametrosIntegracionPK) {
        this.parametrosIntegracionPK = parametrosIntegracionPK;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosIntegracionPK != null ? parametrosIntegracionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosIntegracion)) {
            return false;
        }
        ParametrosIntegracion other = (ParametrosIntegracion) object;
        if ((this.parametrosIntegracionPK == null && other.parametrosIntegracionPK != null) || (this.parametrosIntegracionPK != null && !this.parametrosIntegracionPK.equals(other.parametrosIntegracionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosIntegracion[ parametrosIntegracionPK=" + parametrosIntegracionPK + " ]";
    }
    
}
