/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class SubgruposActivosFijosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GRPACTFJO_EMP_CODIGO")
    private String grpactfjoEmpCodigo;
    @Basic(optional = false)
    @Column(name = "GRPACTFJO_CODIGO")
    private short grpactfjoCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;

    public SubgruposActivosFijosPK() {
    }

    public SubgruposActivosFijosPK(String grpactfjoEmpCodigo, short grpactfjoCodigo, short codigo) {
        this.grpactfjoEmpCodigo = grpactfjoEmpCodigo;
        this.grpactfjoCodigo = grpactfjoCodigo;
        this.codigo = codigo;
    }

    public String getGrpactfjoEmpCodigo() {
        return grpactfjoEmpCodigo;
    }

    public void setGrpactfjoEmpCodigo(String grpactfjoEmpCodigo) {
        this.grpactfjoEmpCodigo = grpactfjoEmpCodigo;
    }

    public short getGrpactfjoCodigo() {
        return grpactfjoCodigo;
    }

    public void setGrpactfjoCodigo(short grpactfjoCodigo) {
        this.grpactfjoCodigo = grpactfjoCodigo;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpactfjoEmpCodigo != null ? grpactfjoEmpCodigo.hashCode() : 0);
        hash += (int) grpactfjoCodigo;
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubgruposActivosFijosPK)) {
            return false;
        }
        SubgruposActivosFijosPK other = (SubgruposActivosFijosPK) object;
        if ((this.grpactfjoEmpCodigo == null && other.grpactfjoEmpCodigo != null) || (this.grpactfjoEmpCodigo != null && !this.grpactfjoEmpCodigo.equals(other.grpactfjoEmpCodigo))) {
            return false;
        }
        if (this.grpactfjoCodigo != other.grpactfjoCodigo) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubgruposActivosFijosPK[ grpactfjoEmpCodigo=" + grpactfjoEmpCodigo + ", grpactfjoCodigo=" + grpactfjoCodigo + ", codigo=" + codigo + " ]";
    }
    
}
