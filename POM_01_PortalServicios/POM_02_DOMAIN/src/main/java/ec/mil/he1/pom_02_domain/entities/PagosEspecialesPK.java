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
public class PagosEspecialesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMESP_PRMROL_CODIGO")
    private String prmespPrmrolCodigo;
    @Basic(optional = false)
    @Column(name = "PRMESP_PRMROL_EMP_CODIGO")
    private String prmespPrmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public PagosEspecialesPK() {
    }

    public PagosEspecialesPK(String prmespPrmrolCodigo, String prmespPrmrolEmpCodigo, int numero) {
        this.prmespPrmrolCodigo = prmespPrmrolCodigo;
        this.prmespPrmrolEmpCodigo = prmespPrmrolEmpCodigo;
        this.numero = numero;
    }

    public String getPrmespPrmrolCodigo() {
        return prmespPrmrolCodigo;
    }

    public void setPrmespPrmrolCodigo(String prmespPrmrolCodigo) {
        this.prmespPrmrolCodigo = prmespPrmrolCodigo;
    }

    public String getPrmespPrmrolEmpCodigo() {
        return prmespPrmrolEmpCodigo;
    }

    public void setPrmespPrmrolEmpCodigo(String prmespPrmrolEmpCodigo) {
        this.prmespPrmrolEmpCodigo = prmespPrmrolEmpCodigo;
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
        hash += (prmespPrmrolCodigo != null ? prmespPrmrolCodigo.hashCode() : 0);
        hash += (prmespPrmrolEmpCodigo != null ? prmespPrmrolEmpCodigo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagosEspecialesPK)) {
            return false;
        }
        PagosEspecialesPK other = (PagosEspecialesPK) object;
        if ((this.prmespPrmrolCodigo == null && other.prmespPrmrolCodigo != null) || (this.prmespPrmrolCodigo != null && !this.prmespPrmrolCodigo.equals(other.prmespPrmrolCodigo))) {
            return false;
        }
        if ((this.prmespPrmrolEmpCodigo == null && other.prmespPrmrolEmpCodigo != null) || (this.prmespPrmrolEmpCodigo != null && !this.prmespPrmrolEmpCodigo.equals(other.prmespPrmrolEmpCodigo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PagosEspecialesPK[ prmespPrmrolCodigo=" + prmespPrmrolCodigo + ", prmespPrmrolEmpCodigo=" + prmespPrmrolEmpCodigo + ", numero=" + numero + " ]";
    }
    
}
