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
public class DiagnosticosBiopsiasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BPSDTL_EXM_NUMERO")
    private int bpsdtlExmNumero;
    @Basic(optional = false)
    @Column(name = "DGNLBR_CODIGO")
    private String dgnlbrCodigo;

    public DiagnosticosBiopsiasPK() {
    }

    public DiagnosticosBiopsiasPK(int bpsdtlExmNumero, String dgnlbrCodigo) {
        this.bpsdtlExmNumero = bpsdtlExmNumero;
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    public int getBpsdtlExmNumero() {
        return bpsdtlExmNumero;
    }

    public void setBpsdtlExmNumero(int bpsdtlExmNumero) {
        this.bpsdtlExmNumero = bpsdtlExmNumero;
    }

    public String getDgnlbrCodigo() {
        return dgnlbrCodigo;
    }

    public void setDgnlbrCodigo(String dgnlbrCodigo) {
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) bpsdtlExmNumero;
        hash += (dgnlbrCodigo != null ? dgnlbrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosBiopsiasPK)) {
            return false;
        }
        DiagnosticosBiopsiasPK other = (DiagnosticosBiopsiasPK) object;
        if (this.bpsdtlExmNumero != other.bpsdtlExmNumero) {
            return false;
        }
        if ((this.dgnlbrCodigo == null && other.dgnlbrCodigo != null) || (this.dgnlbrCodigo != null && !this.dgnlbrCodigo.equals(other.dgnlbrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DiagnosticosBiopsiasPK[ bpsdtlExmNumero=" + bpsdtlExmNumero + ", dgnlbrCodigo=" + dgnlbrCodigo + " ]";
    }
    
}
