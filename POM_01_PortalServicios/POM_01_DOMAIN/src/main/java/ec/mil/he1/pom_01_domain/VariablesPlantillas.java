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
@Table(name = "VARIABLES_PLANTILLAS")
@NamedQueries({
    @NamedQuery(name = "VariablesPlantillas.findAll", query = "SELECT v FROM VariablesPlantillas v")})
public class VariablesPlantillas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VariablesPlantillasPK variablesPlantillasPK;

    public VariablesPlantillas() {
    }

    public VariablesPlantillas(VariablesPlantillasPK variablesPlantillasPK) {
        this.variablesPlantillasPK = variablesPlantillasPK;
    }

    public VariablesPlantillas(int plntlCodigo, int vrbexmCodigo) {
        this.variablesPlantillasPK = new VariablesPlantillasPK(plntlCodigo, vrbexmCodigo);
    }

    public VariablesPlantillasPK getVariablesPlantillasPK() {
        return variablesPlantillasPK;
    }

    public void setVariablesPlantillasPK(VariablesPlantillasPK variablesPlantillasPK) {
        this.variablesPlantillasPK = variablesPlantillasPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variablesPlantillasPK != null ? variablesPlantillasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesPlantillas)) {
            return false;
        }
        VariablesPlantillas other = (VariablesPlantillas) object;
        if ((this.variablesPlantillasPK == null && other.variablesPlantillasPK != null) || (this.variablesPlantillasPK != null && !this.variablesPlantillasPK.equals(other.variablesPlantillasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VariablesPlantillas[ variablesPlantillasPK=" + variablesPlantillasPK + " ]";
    }
    
}
