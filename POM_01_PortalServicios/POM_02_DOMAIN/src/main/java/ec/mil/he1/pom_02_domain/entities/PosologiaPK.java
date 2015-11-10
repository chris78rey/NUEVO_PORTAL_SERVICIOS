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
public class PosologiaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "POSOLOGIA")
    private int posologia;
    @Basic(optional = false)
    @Column(name = "PGA_PRE_CODIGO")
    private int pgaPreCodigo;
    @Basic(optional = false)
    @Column(name = "PGA_GEN_CODIGO_P")
    private String pgaGenCodigoP;

    public PosologiaPK() {
    }

    public PosologiaPK(int posologia, int pgaPreCodigo, String pgaGenCodigoP) {
        this.posologia = posologia;
        this.pgaPreCodigo = pgaPreCodigo;
        this.pgaGenCodigoP = pgaGenCodigoP;
    }

    public int getPosologia() {
        return posologia;
    }

    public void setPosologia(int posologia) {
        this.posologia = posologia;
    }

    public int getPgaPreCodigo() {
        return pgaPreCodigo;
    }

    public void setPgaPreCodigo(int pgaPreCodigo) {
        this.pgaPreCodigo = pgaPreCodigo;
    }

    public String getPgaGenCodigoP() {
        return pgaGenCodigoP;
    }

    public void setPgaGenCodigoP(String pgaGenCodigoP) {
        this.pgaGenCodigoP = pgaGenCodigoP;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) posologia;
        hash += (int) pgaPreCodigo;
        hash += (pgaGenCodigoP != null ? pgaGenCodigoP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosologiaPK)) {
            return false;
        }
        PosologiaPK other = (PosologiaPK) object;
        if (this.posologia != other.posologia) {
            return false;
        }
        if (this.pgaPreCodigo != other.pgaPreCodigo) {
            return false;
        }
        if ((this.pgaGenCodigoP == null && other.pgaGenCodigoP != null) || (this.pgaGenCodigoP != null && !this.pgaGenCodigoP.equals(other.pgaGenCodigoP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PosologiaPK[ posologia=" + posologia + ", pgaPreCodigo=" + pgaPreCodigo + ", pgaGenCodigoP=" + pgaGenCodigoP + " ]";
    }
    
}
