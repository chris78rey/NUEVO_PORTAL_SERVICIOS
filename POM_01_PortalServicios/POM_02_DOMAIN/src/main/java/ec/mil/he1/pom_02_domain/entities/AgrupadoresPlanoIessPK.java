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
public class AgrupadoresPlanoIessPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGRUPADOR")
    private String agrupador;
    @Basic(optional = false)
    @Column(name = "TIPO_BENEFICIARIO")
    private String tipoBeneficiario;

    public AgrupadoresPlanoIessPK() {
    }

    public AgrupadoresPlanoIessPK(String agrupador, String tipoBeneficiario) {
        this.agrupador = agrupador;
        this.tipoBeneficiario = tipoBeneficiario;
    }

    public String getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(String agrupador) {
        this.agrupador = agrupador;
    }

    public String getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    public void setTipoBeneficiario(String tipoBeneficiario) {
        this.tipoBeneficiario = tipoBeneficiario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agrupador != null ? agrupador.hashCode() : 0);
        hash += (tipoBeneficiario != null ? tipoBeneficiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgrupadoresPlanoIessPK)) {
            return false;
        }
        AgrupadoresPlanoIessPK other = (AgrupadoresPlanoIessPK) object;
        if ((this.agrupador == null && other.agrupador != null) || (this.agrupador != null && !this.agrupador.equals(other.agrupador))) {
            return false;
        }
        if ((this.tipoBeneficiario == null && other.tipoBeneficiario != null) || (this.tipoBeneficiario != null && !this.tipoBeneficiario.equals(other.tipoBeneficiario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AgrupadoresPlanoIessPK[ agrupador=" + agrupador + ", tipoBeneficiario=" + tipoBeneficiario + " ]";
    }
    
}
