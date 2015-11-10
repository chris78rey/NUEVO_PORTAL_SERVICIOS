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
public class ProcedimientosSolicitadosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_PCN_NUMERO_HC")
    private int prtoprslcPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_NUMERO")
    private int prtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "PRCHSP_CODIGO")
    private String prchspCodigo;

    public ProcedimientosSolicitadosPK() {
    }

    public ProcedimientosSolicitadosPK(int prtoprslcPcnNumeroHc, int prtoprslcNumero, String prchspCodigo) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
        this.prtoprslcNumero = prtoprslcNumero;
        this.prchspCodigo = prchspCodigo;
    }

    public int getPrtoprslcPcnNumeroHc() {
        return prtoprslcPcnNumeroHc;
    }

    public void setPrtoprslcPcnNumeroHc(int prtoprslcPcnNumeroHc) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
    }

    public int getPrtoprslcNumero() {
        return prtoprslcNumero;
    }

    public void setPrtoprslcNumero(int prtoprslcNumero) {
        this.prtoprslcNumero = prtoprslcNumero;
    }

    public String getPrchspCodigo() {
        return prchspCodigo;
    }

    public void setPrchspCodigo(String prchspCodigo) {
        this.prchspCodigo = prchspCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prtoprslcPcnNumeroHc;
        hash += (int) prtoprslcNumero;
        hash += (prchspCodigo != null ? prchspCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosSolicitadosPK)) {
            return false;
        }
        ProcedimientosSolicitadosPK other = (ProcedimientosSolicitadosPK) object;
        if (this.prtoprslcPcnNumeroHc != other.prtoprslcPcnNumeroHc) {
            return false;
        }
        if (this.prtoprslcNumero != other.prtoprslcNumero) {
            return false;
        }
        if ((this.prchspCodigo == null && other.prchspCodigo != null) || (this.prchspCodigo != null && !this.prchspCodigo.equals(other.prchspCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ProcedimientosSolicitadosPK[ prtoprslcPcnNumeroHc=" + prtoprslcPcnNumeroHc + ", prtoprslcNumero=" + prtoprslcNumero + ", prchspCodigo=" + prchspCodigo + " ]";
    }
    
}
