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
public class NotasSocialesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FCHSCL_NUMERO")
    private int fchsclNumero;
    @Basic(optional = false)
    @Column(name = "DIAGNOSTICO_SOCIAL")
    private String diagnosticoSocial;

    public NotasSocialesPK() {
    }

    public NotasSocialesPK(int fchsclNumero, String diagnosticoSocial) {
        this.fchsclNumero = fchsclNumero;
        this.diagnosticoSocial = diagnosticoSocial;
    }

    public int getFchsclNumero() {
        return fchsclNumero;
    }

    public void setFchsclNumero(int fchsclNumero) {
        this.fchsclNumero = fchsclNumero;
    }

    public String getDiagnosticoSocial() {
        return diagnosticoSocial;
    }

    public void setDiagnosticoSocial(String diagnosticoSocial) {
        this.diagnosticoSocial = diagnosticoSocial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fchsclNumero;
        hash += (diagnosticoSocial != null ? diagnosticoSocial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotasSocialesPK)) {
            return false;
        }
        NotasSocialesPK other = (NotasSocialesPK) object;
        if (this.fchsclNumero != other.fchsclNumero) {
            return false;
        }
        if ((this.diagnosticoSocial == null && other.diagnosticoSocial != null) || (this.diagnosticoSocial != null && !this.diagnosticoSocial.equals(other.diagnosticoSocial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.NotasSocialesPK[ fchsclNumero=" + fchsclNumero + ", diagnosticoSocial=" + diagnosticoSocial + " ]";
    }
    
}
