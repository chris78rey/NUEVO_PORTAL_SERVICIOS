/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "SECRETARIAS_DEPARTAMENTOS")
@NamedQueries({
    @NamedQuery(name = "SecretariasDepartamentos.findAll", query = "SELECT s FROM SecretariasDepartamentos s")})
public class SecretariasDepartamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SecretariasDepartamentosPK secretariasDepartamentosPK;

    public SecretariasDepartamentos() {
    }

    public SecretariasDepartamentos(SecretariasDepartamentosPK secretariasDepartamentosPK) {
        this.secretariasDepartamentosPK = secretariasDepartamentosPK;
    }

    public SecretariasDepartamentos(String prsCodSec, String aradprCodigo) {
        this.secretariasDepartamentosPK = new SecretariasDepartamentosPK(prsCodSec, aradprCodigo);
    }

    public SecretariasDepartamentosPK getSecretariasDepartamentosPK() {
        return secretariasDepartamentosPK;
    }

    public void setSecretariasDepartamentosPK(SecretariasDepartamentosPK secretariasDepartamentosPK) {
        this.secretariasDepartamentosPK = secretariasDepartamentosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secretariasDepartamentosPK != null ? secretariasDepartamentosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecretariasDepartamentos)) {
            return false;
        }
        SecretariasDepartamentos other = (SecretariasDepartamentos) object;
        if ((this.secretariasDepartamentosPK == null && other.secretariasDepartamentosPK != null) || (this.secretariasDepartamentosPK != null && !this.secretariasDepartamentosPK.equals(other.secretariasDepartamentosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SecretariasDepartamentos[ secretariasDepartamentosPK=" + secretariasDepartamentosPK + " ]";
    }
    
}
