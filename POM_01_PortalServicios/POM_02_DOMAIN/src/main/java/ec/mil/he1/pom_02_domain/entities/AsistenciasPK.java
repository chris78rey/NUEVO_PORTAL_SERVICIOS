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
public class AsistenciasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AST_IDASISTENCIA")
    private long astIdasistencia;
    @Basic(optional = false)
    @Column(name = "CTP_IDCONTROL")
    private long ctpIdcontrol;
    @Basic(optional = false)
    @Column(name = "PRN_IDPERSONAL")
    private long prnIdpersonal;

    public AsistenciasPK() {
    }

    public AsistenciasPK(long astIdasistencia, long ctpIdcontrol, long prnIdpersonal) {
        this.astIdasistencia = astIdasistencia;
        this.ctpIdcontrol = ctpIdcontrol;
        this.prnIdpersonal = prnIdpersonal;
    }

    public long getAstIdasistencia() {
        return astIdasistencia;
    }

    public void setAstIdasistencia(long astIdasistencia) {
        this.astIdasistencia = astIdasistencia;
    }

    public long getCtpIdcontrol() {
        return ctpIdcontrol;
    }

    public void setCtpIdcontrol(long ctpIdcontrol) {
        this.ctpIdcontrol = ctpIdcontrol;
    }

    public long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) astIdasistencia;
        hash += (int) ctpIdcontrol;
        hash += (int) prnIdpersonal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistenciasPK)) {
            return false;
        }
        AsistenciasPK other = (AsistenciasPK) object;
        if (this.astIdasistencia != other.astIdasistencia) {
            return false;
        }
        if (this.ctpIdcontrol != other.ctpIdcontrol) {
            return false;
        }
        if (this.prnIdpersonal != other.prnIdpersonal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AsistenciasPK[ astIdasistencia=" + astIdasistencia + ", ctpIdcontrol=" + ctpIdcontrol + ", prnIdpersonal=" + prnIdpersonal + " ]";
    }
    
}
