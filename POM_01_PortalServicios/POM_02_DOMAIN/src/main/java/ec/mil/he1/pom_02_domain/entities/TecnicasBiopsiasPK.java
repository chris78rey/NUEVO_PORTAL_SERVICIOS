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
public class TecnicasBiopsiasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BPSDTL_EXM_NUMERO")
    private int bpsdtlExmNumero;
    @Basic(optional = false)
    @Column(name = "BPSDTL_VRBEXM_CODIGO")
    private int bpsdtlVrbexmCodigo;
    @Basic(optional = false)
    @Column(name = "TCNPTL_CODIGO")
    private String tcnptlCodigo;

    public TecnicasBiopsiasPK() {
    }

    public TecnicasBiopsiasPK(int bpsdtlExmNumero, int bpsdtlVrbexmCodigo, String tcnptlCodigo) {
        this.bpsdtlExmNumero = bpsdtlExmNumero;
        this.bpsdtlVrbexmCodigo = bpsdtlVrbexmCodigo;
        this.tcnptlCodigo = tcnptlCodigo;
    }

    public int getBpsdtlExmNumero() {
        return bpsdtlExmNumero;
    }

    public void setBpsdtlExmNumero(int bpsdtlExmNumero) {
        this.bpsdtlExmNumero = bpsdtlExmNumero;
    }

    public int getBpsdtlVrbexmCodigo() {
        return bpsdtlVrbexmCodigo;
    }

    public void setBpsdtlVrbexmCodigo(int bpsdtlVrbexmCodigo) {
        this.bpsdtlVrbexmCodigo = bpsdtlVrbexmCodigo;
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
        hash += (int) bpsdtlExmNumero;
        hash += (int) bpsdtlVrbexmCodigo;
        hash += (tcnptlCodigo != null ? tcnptlCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicasBiopsiasPK)) {
            return false;
        }
        TecnicasBiopsiasPK other = (TecnicasBiopsiasPK) object;
        if (this.bpsdtlExmNumero != other.bpsdtlExmNumero) {
            return false;
        }
        if (this.bpsdtlVrbexmCodigo != other.bpsdtlVrbexmCodigo) {
            return false;
        }
        if ((this.tcnptlCodigo == null && other.tcnptlCodigo != null) || (this.tcnptlCodigo != null && !this.tcnptlCodigo.equals(other.tcnptlCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TecnicasBiopsiasPK[ bpsdtlExmNumero=" + bpsdtlExmNumero + ", bpsdtlVrbexmCodigo=" + bpsdtlVrbexmCodigo + ", tcnptlCodigo=" + tcnptlCodigo + " ]";
    }
    
}
