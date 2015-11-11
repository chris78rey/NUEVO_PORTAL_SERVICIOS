/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class SubseccionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCC_CODIGO")
    private String sccCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public SubseccionesPK() {
    }

    public SubseccionesPK(String sccCodigo, String codigo) {
        this.sccCodigo = sccCodigo;
        this.codigo = codigo;
    }

    public String getSccCodigo() {
        return sccCodigo;
    }

    public void setSccCodigo(String sccCodigo) {
        this.sccCodigo = sccCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sccCodigo != null ? sccCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubseccionesPK)) {
            return false;
        }
        SubseccionesPK other = (SubseccionesPK) object;
        if ((this.sccCodigo == null && other.sccCodigo != null) || (this.sccCodigo != null && !this.sccCodigo.equals(other.sccCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SubseccionesPK[ sccCodigo=" + sccCodigo + ", codigo=" + codigo + " ]";
    }
    
}
