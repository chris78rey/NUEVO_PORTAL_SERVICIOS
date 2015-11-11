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
public class PartesActivoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO")
    private String sbgactfjoGrpactfjoEmpCodigo;
    @Basic(optional = false)
    @Column(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO")
    private short actfsbgactfjoGrpactfjoCodigo;
    @Basic(optional = false)
    @Column(name = "ACTFACTFJOGNR_SBGACTFJO_CODIGO")
    private short actfactfjognrSbgactfjoCodigo;
    @Basic(optional = false)
    @Column(name = "ACTFJOESP_ACTFJOGNR_CODIGO")
    private short actfjoespActfjognrCodigo;
    @Basic(optional = false)
    @Column(name = "ACTFJOESP_CODIGO")
    private short actfjoespCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;

    public PartesActivoPK() {
    }

    public PartesActivoPK(String sbgactfjoGrpactfjoEmpCodigo, short actfsbgactfjoGrpactfjoCodigo, short actfactfjognrSbgactfjoCodigo, short actfjoespActfjognrCodigo, short actfjoespCodigo, short codigo) {
        this.sbgactfjoGrpactfjoEmpCodigo = sbgactfjoGrpactfjoEmpCodigo;
        this.actfsbgactfjoGrpactfjoCodigo = actfsbgactfjoGrpactfjoCodigo;
        this.actfactfjognrSbgactfjoCodigo = actfactfjognrSbgactfjoCodigo;
        this.actfjoespActfjognrCodigo = actfjoespActfjognrCodigo;
        this.actfjoespCodigo = actfjoespCodigo;
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

    public short getActfactfjognrSbgactfjoCodigo() {
        return actfactfjognrSbgactfjoCodigo;
    }

    public void setActfactfjognrSbgactfjoCodigo(short actfactfjognrSbgactfjoCodigo) {
        this.actfactfjognrSbgactfjoCodigo = actfactfjognrSbgactfjoCodigo;
    }

    public short getActfjoespActfjognrCodigo() {
        return actfjoespActfjognrCodigo;
    }

    public void setActfjoespActfjognrCodigo(short actfjoespActfjognrCodigo) {
        this.actfjoespActfjognrCodigo = actfjoespActfjognrCodigo;
    }

    public short getActfjoespCodigo() {
        return actfjoespCodigo;
    }

    public void setActfjoespCodigo(short actfjoespCodigo) {
        this.actfjoespCodigo = actfjoespCodigo;
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
        hash += (int) actfactfjognrSbgactfjoCodigo;
        hash += (int) actfjoespActfjognrCodigo;
        hash += (int) actfjoespCodigo;
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartesActivoPK)) {
            return false;
        }
        PartesActivoPK other = (PartesActivoPK) object;
        if ((this.sbgactfjoGrpactfjoEmpCodigo == null && other.sbgactfjoGrpactfjoEmpCodigo != null) || (this.sbgactfjoGrpactfjoEmpCodigo != null && !this.sbgactfjoGrpactfjoEmpCodigo.equals(other.sbgactfjoGrpactfjoEmpCodigo))) {
            return false;
        }
        if (this.actfsbgactfjoGrpactfjoCodigo != other.actfsbgactfjoGrpactfjoCodigo) {
            return false;
        }
        if (this.actfactfjognrSbgactfjoCodigo != other.actfactfjognrSbgactfjoCodigo) {
            return false;
        }
        if (this.actfjoespActfjognrCodigo != other.actfjoespActfjognrCodigo) {
            return false;
        }
        if (this.actfjoespCodigo != other.actfjoespCodigo) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PartesActivoPK[ sbgactfjoGrpactfjoEmpCodigo=" + sbgactfjoGrpactfjoEmpCodigo + ", actfsbgactfjoGrpactfjoCodigo=" + actfsbgactfjoGrpactfjoCodigo + ", actfactfjognrSbgactfjoCodigo=" + actfactfjognrSbgactfjoCodigo + ", actfjoespActfjognrCodigo=" + actfjoespActfjognrCodigo + ", actfjoespCodigo=" + actfjoespCodigo + ", codigo=" + codigo + " ]";
    }
    
}
