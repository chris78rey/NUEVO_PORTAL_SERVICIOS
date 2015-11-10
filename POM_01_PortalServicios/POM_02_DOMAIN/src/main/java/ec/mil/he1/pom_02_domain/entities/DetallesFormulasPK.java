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
public class DetallesFormulasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GRPDTL_FRMROL_EMP_CODIGO")
    private String grpdtlFrmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "GRPDTL_FRMROL_CODIGO")
    private String grpdtlFrmrolCodigo;
    @Basic(optional = false)
    @Column(name = "GRPDTL_SECUENCIA")
    private short grpdtlSecuencia;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public DetallesFormulasPK() {
    }

    public DetallesFormulasPK(String grpdtlFrmrolEmpCodigo, String grpdtlFrmrolCodigo, short grpdtlSecuencia, int numero) {
        this.grpdtlFrmrolEmpCodigo = grpdtlFrmrolEmpCodigo;
        this.grpdtlFrmrolCodigo = grpdtlFrmrolCodigo;
        this.grpdtlSecuencia = grpdtlSecuencia;
        this.numero = numero;
    }

    public String getGrpdtlFrmrolEmpCodigo() {
        return grpdtlFrmrolEmpCodigo;
    }

    public void setGrpdtlFrmrolEmpCodigo(String grpdtlFrmrolEmpCodigo) {
        this.grpdtlFrmrolEmpCodigo = grpdtlFrmrolEmpCodigo;
    }

    public String getGrpdtlFrmrolCodigo() {
        return grpdtlFrmrolCodigo;
    }

    public void setGrpdtlFrmrolCodigo(String grpdtlFrmrolCodigo) {
        this.grpdtlFrmrolCodigo = grpdtlFrmrolCodigo;
    }

    public short getGrpdtlSecuencia() {
        return grpdtlSecuencia;
    }

    public void setGrpdtlSecuencia(short grpdtlSecuencia) {
        this.grpdtlSecuencia = grpdtlSecuencia;
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
        hash += (grpdtlFrmrolEmpCodigo != null ? grpdtlFrmrolEmpCodigo.hashCode() : 0);
        hash += (grpdtlFrmrolCodigo != null ? grpdtlFrmrolCodigo.hashCode() : 0);
        hash += (int) grpdtlSecuencia;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesFormulasPK)) {
            return false;
        }
        DetallesFormulasPK other = (DetallesFormulasPK) object;
        if ((this.grpdtlFrmrolEmpCodigo == null && other.grpdtlFrmrolEmpCodigo != null) || (this.grpdtlFrmrolEmpCodigo != null && !this.grpdtlFrmrolEmpCodigo.equals(other.grpdtlFrmrolEmpCodigo))) {
            return false;
        }
        if ((this.grpdtlFrmrolCodigo == null && other.grpdtlFrmrolCodigo != null) || (this.grpdtlFrmrolCodigo != null && !this.grpdtlFrmrolCodigo.equals(other.grpdtlFrmrolCodigo))) {
            return false;
        }
        if (this.grpdtlSecuencia != other.grpdtlSecuencia) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesFormulasPK[ grpdtlFrmrolEmpCodigo=" + grpdtlFrmrolEmpCodigo + ", grpdtlFrmrolCodigo=" + grpdtlFrmrolCodigo + ", grpdtlSecuencia=" + grpdtlSecuencia + ", numero=" + numero + " ]";
    }
    
}
