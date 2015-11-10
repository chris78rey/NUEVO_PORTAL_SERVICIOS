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
public class LibrosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNTBNC_EMP_CODIGO")
    private String cntbncEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CNTBNC_TIPO")
    private String cntbncTipo;
    @Basic(optional = false)
    @Column(name = "CNTBNC_NUMERO")
    private String cntbncNumero;
    @Basic(optional = false)
    @Column(name = "TPOMVM_CODIGO")
    private String tpomvmCodigo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public LibrosPK() {
    }

    public LibrosPK(String cntbncEmpCodigo, String cntbncTipo, String cntbncNumero, String tpomvmCodigo, int numero) {
        this.cntbncEmpCodigo = cntbncEmpCodigo;
        this.cntbncTipo = cntbncTipo;
        this.cntbncNumero = cntbncNumero;
        this.tpomvmCodigo = tpomvmCodigo;
        this.numero = numero;
    }

    public String getCntbncEmpCodigo() {
        return cntbncEmpCodigo;
    }

    public void setCntbncEmpCodigo(String cntbncEmpCodigo) {
        this.cntbncEmpCodigo = cntbncEmpCodigo;
    }

    public String getCntbncTipo() {
        return cntbncTipo;
    }

    public void setCntbncTipo(String cntbncTipo) {
        this.cntbncTipo = cntbncTipo;
    }

    public String getCntbncNumero() {
        return cntbncNumero;
    }

    public void setCntbncNumero(String cntbncNumero) {
        this.cntbncNumero = cntbncNumero;
    }

    public String getTpomvmCodigo() {
        return tpomvmCodigo;
    }

    public void setTpomvmCodigo(String tpomvmCodigo) {
        this.tpomvmCodigo = tpomvmCodigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntbncEmpCodigo != null ? cntbncEmpCodigo.hashCode() : 0);
        hash += (cntbncTipo != null ? cntbncTipo.hashCode() : 0);
        hash += (cntbncNumero != null ? cntbncNumero.hashCode() : 0);
        hash += (tpomvmCodigo != null ? tpomvmCodigo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibrosPK)) {
            return false;
        }
        LibrosPK other = (LibrosPK) object;
        if ((this.cntbncEmpCodigo == null && other.cntbncEmpCodigo != null) || (this.cntbncEmpCodigo != null && !this.cntbncEmpCodigo.equals(other.cntbncEmpCodigo))) {
            return false;
        }
        if ((this.cntbncTipo == null && other.cntbncTipo != null) || (this.cntbncTipo != null && !this.cntbncTipo.equals(other.cntbncTipo))) {
            return false;
        }
        if ((this.cntbncNumero == null && other.cntbncNumero != null) || (this.cntbncNumero != null && !this.cntbncNumero.equals(other.cntbncNumero))) {
            return false;
        }
        if ((this.tpomvmCodigo == null && other.tpomvmCodigo != null) || (this.tpomvmCodigo != null && !this.tpomvmCodigo.equals(other.tpomvmCodigo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.LibrosPK[ cntbncEmpCodigo=" + cntbncEmpCodigo + ", cntbncTipo=" + cntbncTipo + ", cntbncNumero=" + cntbncNumero + ", tpomvmCodigo=" + tpomvmCodigo + ", numero=" + numero + " ]";
    }
    
}
