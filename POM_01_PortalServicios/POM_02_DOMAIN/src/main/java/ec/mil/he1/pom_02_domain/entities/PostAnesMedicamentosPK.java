/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class PostAnesMedicamentosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PSTANS_RGSOPR_PRTOPRSLC_PCN_NU")
    private int pstansRgsoprPrtoprslcPcnNu;
    @Basic(optional = false)
    @Column(name = "PSTANS_RGSOPR_PRTOPRSLC_NUMERO")
    private int pstansRgsoprPrtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;

    public PostAnesMedicamentosPK() {
    }

    public PostAnesMedicamentosPK(int pstansRgsoprPrtoprslcPcnNu, int pstansRgsoprPrtoprslcNumero, Date hora) {
        this.pstansRgsoprPrtoprslcPcnNu = pstansRgsoprPrtoprslcPcnNu;
        this.pstansRgsoprPrtoprslcNumero = pstansRgsoprPrtoprslcNumero;
        this.hora = hora;
    }

    public int getPstansRgsoprPrtoprslcPcnNu() {
        return pstansRgsoprPrtoprslcPcnNu;
    }

    public void setPstansRgsoprPrtoprslcPcnNu(int pstansRgsoprPrtoprslcPcnNu) {
        this.pstansRgsoprPrtoprslcPcnNu = pstansRgsoprPrtoprslcPcnNu;
    }

    public int getPstansRgsoprPrtoprslcNumero() {
        return pstansRgsoprPrtoprslcNumero;
    }

    public void setPstansRgsoprPrtoprslcNumero(int pstansRgsoprPrtoprslcNumero) {
        this.pstansRgsoprPrtoprslcNumero = pstansRgsoprPrtoprslcNumero;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pstansRgsoprPrtoprslcPcnNu;
        hash += (int) pstansRgsoprPrtoprslcNumero;
        hash += (hora != null ? hora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostAnesMedicamentosPK)) {
            return false;
        }
        PostAnesMedicamentosPK other = (PostAnesMedicamentosPK) object;
        if (this.pstansRgsoprPrtoprslcPcnNu != other.pstansRgsoprPrtoprslcPcnNu) {
            return false;
        }
        if (this.pstansRgsoprPrtoprslcNumero != other.pstansRgsoprPrtoprslcNumero) {
            return false;
        }
        if ((this.hora == null && other.hora != null) || (this.hora != null && !this.hora.equals(other.hora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PostAnesMedicamentosPK[ pstansRgsoprPrtoprslcPcnNu=" + pstansRgsoprPrtoprslcPcnNu + ", pstansRgsoprPrtoprslcNumero=" + pstansRgsoprPrtoprslcNumero + ", hora=" + hora + " ]";
    }
    
}
