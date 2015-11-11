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
public class ActivosFijosGeneralesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO")
    private String sbgactfjoGrpactfjoEmpCodigo;
    @Basic(optional = false)
    @Column(name = "SBGACTFJO_GRPACTFJO_CODIGO")
    private short sbgactfjoGrpactfjoCodigo;
    @Basic(optional = false)
    @Column(name = "SBGACTFJO_CODIGO")
    private short sbgactfjoCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;

    public ActivosFijosGeneralesPK() {
    }

    public ActivosFijosGeneralesPK(String sbgactfjoGrpactfjoEmpCodigo, short sbgactfjoGrpactfjoCodigo, short sbgactfjoCodigo, short codigo) {
        this.sbgactfjoGrpactfjoEmpCodigo = sbgactfjoGrpactfjoEmpCodigo;
        this.sbgactfjoGrpactfjoCodigo = sbgactfjoGrpactfjoCodigo;
        this.sbgactfjoCodigo = sbgactfjoCodigo;
        this.codigo = codigo;
    }

    public String getSbgactfjoGrpactfjoEmpCodigo() {
        return sbgactfjoGrpactfjoEmpCodigo;
    }

    public void setSbgactfjoGrpactfjoEmpCodigo(String sbgactfjoGrpactfjoEmpCodigo) {
        this.sbgactfjoGrpactfjoEmpCodigo = sbgactfjoGrpactfjoEmpCodigo;
    }

    public short getSbgactfjoGrpactfjoCodigo() {
        return sbgactfjoGrpactfjoCodigo;
    }

    public void setSbgactfjoGrpactfjoCodigo(short sbgactfjoGrpactfjoCodigo) {
        this.sbgactfjoGrpactfjoCodigo = sbgactfjoGrpactfjoCodigo;
    }

    public short getSbgactfjoCodigo() {
        return sbgactfjoCodigo;
    }

    public void setSbgactfjoCodigo(short sbgactfjoCodigo) {
        this.sbgactfjoCodigo = sbgactfjoCodigo;
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
        hash += (sbgactfjoGrpactfjoEmpCodigo != null ? sbgactfjoGrpactfjoEmpCodigo.hashCode() : 0);
        hash += (int) sbgactfjoGrpactfjoCodigo;
        hash += (int) sbgactfjoCodigo;
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivosFijosGeneralesPK)) {
            return false;
        }
        ActivosFijosGeneralesPK other = (ActivosFijosGeneralesPK) object;
        if ((this.sbgactfjoGrpactfjoEmpCodigo == null && other.sbgactfjoGrpactfjoEmpCodigo != null) || (this.sbgactfjoGrpactfjoEmpCodigo != null && !this.sbgactfjoGrpactfjoEmpCodigo.equals(other.sbgactfjoGrpactfjoEmpCodigo))) {
            return false;
        }
        if (this.sbgactfjoGrpactfjoCodigo != other.sbgactfjoGrpactfjoCodigo) {
            return false;
        }
        if (this.sbgactfjoCodigo != other.sbgactfjoCodigo) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK[ sbgactfjoGrpactfjoEmpCodigo=" + sbgactfjoGrpactfjoEmpCodigo + ", sbgactfjoGrpactfjoCodigo=" + sbgactfjoGrpactfjoCodigo + ", sbgactfjoCodigo=" + sbgactfjoCodigo + ", codigo=" + codigo + " ]";
    }
    
}
