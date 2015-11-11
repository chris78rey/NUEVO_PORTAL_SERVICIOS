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
public class TecnicasAplicadasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BPS_EXM_NUMERO")
    private int bpsExmNumero;
    @Basic(optional = false)
    @Column(name = "TCNPTL_CODIGO")
    private String tcnptlCodigo;

    public TecnicasAplicadasPK() {
    }

    public TecnicasAplicadasPK(int bpsExmNumero, String tcnptlCodigo) {
        this.bpsExmNumero = bpsExmNumero;
        this.tcnptlCodigo = tcnptlCodigo;
    }

    public int getBpsExmNumero() {
        return bpsExmNumero;
    }

    public void setBpsExmNumero(int bpsExmNumero) {
        this.bpsExmNumero = bpsExmNumero;
    }

    public String getTcnptlCodigo() {
        return tcnptlCodigo;
    }

    public void setTcnptlCodigo(String tcnptlCodigo) {
        this.tcnptlCodigo = tcnptlCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) bpsExmNumero;
        hash += (tcnptlCodigo != null ? tcnptlCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicasAplicadasPK)) {
            return false;
        }
        TecnicasAplicadasPK other = (TecnicasAplicadasPK) object;
        if (this.bpsExmNumero != other.bpsExmNumero) {
            return false;
        }
        if ((this.tcnptlCodigo == null && other.tcnptlCodigo != null) || (this.tcnptlCodigo != null && !this.tcnptlCodigo.equals(other.tcnptlCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TecnicasAplicadasPK[ bpsExmNumero=" + bpsExmNumero + ", tcnptlCodigo=" + tcnptlCodigo + " ]";
    }
    
}
