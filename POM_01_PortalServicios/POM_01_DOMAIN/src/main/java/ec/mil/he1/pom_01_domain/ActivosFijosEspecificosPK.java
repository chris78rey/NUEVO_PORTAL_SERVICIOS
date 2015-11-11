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
public class ActivosFijosEspecificosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO")
    private String sbgactfjoGrpactfjoEmpCodigo;
    @Basic(optional = false)
    @Column(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO")
    private short actfsbgactfjoGrpactfjoCodigo;
    @Basic(optional = false)
    @Column(name = "ACTFJOGNR_SBGACTFJO_CODIGO")
    private short actfjognrSbgactfjoCodigo;
    @Basic(optional = false)
    @Column(name = "ACTFJOGNR_CODIGO")
    private short actfjognrCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;

    public ActivosFijosEspecificosPK() {
    }

    public ActivosFijosEspecificosPK(String sbgactfjoGrpactfjoEmpCodigo, short actfsbgactfjoGrpactfjoCodigo, short actfjognrSbgactfjoCodigo, short actfjognrCodigo, short codigo) {
        this.sbgactfjoGrpactfjoEmpCodigo = sbgactfjoGrpactfjoEmpCodigo;
        this.actfsbgactfjoGrpactfjoCodigo = actfsbgactfjoGrpactfjoCodigo;
        this.actfjognrSbgactfjoCodigo = actfjognrSbgactfjoCodigo;
        this.actfjognrCodigo = actfjognrCodigo;
        this.codigo = codigo;
    }

    public String getSbgactfjoGrpactfjoEmpCodigo() {
        return sbgactfjoGrpactfjoEmpCodigo;
    }

    public void setSbgactfjoGrpactfjoEmpCodigo(String sbgactfjoGrpactfjoEmpCodigo) {
        this.sbgactfjoGrpactfjoEmpCodigo = sbgactfjoGrpactfjoEmpCodigo;
    }

    public short getActfsbgactfjoGrpactfjoCodigo() {
        return actfsbgactfjoGrpactfjoCodigo;
    }

    public void setActfsbgactfjoGrpactfjoCodigo(short actfsbgactfjoGrpactfjoCodigo) {
        this.actfsbgactfjoGrpactfjoCodigo = actfsbgactfjoGrpactfjoCodigo;
    }

    public short getActfjognrSbgactfjoCodigo() {
        return actfjognrSbgactfjoCodigo;
    }

    public void setActfjognrSbgactfjoCodigo(short actfjognrSbgactfjoCodigo) {
        this.actfjognrSbgactfjoCodigo = actfjognrSbgactfjoCodigo;
    }

    public short getActfjognrCodigo() {
        return actfjognrCodigo;
    }

    public void setActfjognrCodigo(short actfjognrCodigo) {
        this.actfjognrCodigo = actfjognrCodigo;
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
        hash += (int) actfsbgactfjoGrpactfjoCodigo;
        hash += (int) actfjognrSbgactfjoCodigo;
        hash += (int) actfjognrCodigo;
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivosFijosEspecificosPK)) {
            return false;
        }
        ActivosFijosEspecificosPK other = (ActivosFijosEspecificosPK) object;
        if ((this.sbgactfjoGrpactfjoEmpCodigo == null && other.sbgactfjoGrpactfjoEmpCodigo != null) || (this.sbgactfjoGrpactfjoEmpCodigo != null && !this.sbgactfjoGrpactfjoEmpCodigo.equals(other.sbgactfjoGrpactfjoEmpCodigo))) {
            return false;
        }
        if (this.actfsbgactfjoGrpactfjoCodigo != other.actfsbgactfjoGrpactfjoCodigo) {
            return false;
        }
        if (this.actfjognrSbgactfjoCodigo != other.actfjognrSbgactfjoCodigo) {
            return false;
        }
        if (this.actfjognrCodigo != other.actfjognrCodigo) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ActivosFijosEspecificosPK[ sbgactfjoGrpactfjoEmpCodigo=" + sbgactfjoGrpactfjoEmpCodigo + ", actfsbgactfjoGrpactfjoCodigo=" + actfsbgactfjoGrpactfjoCodigo + ", actfjognrSbgactfjoCodigo=" + actfjognrSbgactfjoCodigo + ", actfjognrCodigo=" + actfjognrCodigo + ", codigo=" + codigo + " ]";
    }
    
}
