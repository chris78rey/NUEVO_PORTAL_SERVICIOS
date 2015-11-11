/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class VariablesPlantillasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PLNTL_CODIGO")
    private int plntlCodigo;
    @Basic(optional = false)
    @Column(name = "VRBEXM_CODIGO")
    private int vrbexmCodigo;

    public VariablesPlantillasPK() {
    }

    public VariablesPlantillasPK(int plntlCodigo, int vrbexmCodigo) {
        this.plntlCodigo = plntlCodigo;
        this.vrbexmCodigo = vrbexmCodigo;
    }

    public int getPlntlCodigo() {
        return plntlCodigo;
    }

    public void setPlntlCodigo(int plntlCodigo) {
        this.plntlCodigo = plntlCodigo;
    }

    public int getVrbexmCodigo() {
        return vrbexmCodigo;
    }

    public void setVrbexmCodigo(int vrbexmCodigo) {
        this.vrbexmCodigo = vrbexmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) plntlCodigo;
        hash += (int) vrbexmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesPlantillasPK)) {
            return false;
        }
        VariablesPlantillasPK other = (VariablesPlantillasPK) object;
        if (this.plntlCodigo != other.plntlCodigo) {
            return false;
        }
        if (this.vrbexmCodigo != other.vrbexmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VariablesPlantillasPK[ plntlCodigo=" + plntlCodigo + ", vrbexmCodigo=" + vrbexmCodigo + " ]";
    }
    
}
