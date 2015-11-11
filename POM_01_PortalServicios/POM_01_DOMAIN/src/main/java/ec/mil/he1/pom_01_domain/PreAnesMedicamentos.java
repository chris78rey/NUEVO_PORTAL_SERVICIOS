/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
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
@Table(name = "PRE_ANES_MEDICAMENTOS")
@NamedQueries({
    @NamedQuery(name = "PreAnesMedicamentos.findAll", query = "SELECT p FROM PreAnesMedicamentos p")})
public class PreAnesMedicamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PreAnesMedicamentosPK preAnesMedicamentosPK;
    @Column(name = "MEDICACION")
    private String medicacion;

    public PreAnesMedicamentos() {
    }

    public PreAnesMedicamentos(PreAnesMedicamentosPK preAnesMedicamentosPK) {
        this.preAnesMedicamentosPK = preAnesMedicamentosPK;
    }

    public PreAnesMedicamentos(int preansRgsoprPrtoprslcPcnNu, int preansRgsoprPrtoprslcNumero, Date fecha) {
        this.preAnesMedicamentosPK = new PreAnesMedicamentosPK(preansRgsoprPrtoprslcPcnNu, preansRgsoprPrtoprslcNumero, fecha);
    }

    public PreAnesMedicamentosPK getPreAnesMedicamentosPK() {
        return preAnesMedicamentosPK;
    }

    public void setPreAnesMedicamentosPK(PreAnesMedicamentosPK preAnesMedicamentosPK) {
        this.preAnesMedicamentosPK = preAnesMedicamentosPK;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (preAnesMedicamentosPK != null ? preAnesMedicamentosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreAnesMedicamentos)) {
            return false;
        }
        PreAnesMedicamentos other = (PreAnesMedicamentos) object;
        if ((this.preAnesMedicamentosPK == null && other.preAnesMedicamentosPK != null) || (this.preAnesMedicamentosPK != null && !this.preAnesMedicamentosPK.equals(other.preAnesMedicamentosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PreAnesMedicamentos[ preAnesMedicamentosPK=" + preAnesMedicamentosPK + " ]";
    }
    
}
