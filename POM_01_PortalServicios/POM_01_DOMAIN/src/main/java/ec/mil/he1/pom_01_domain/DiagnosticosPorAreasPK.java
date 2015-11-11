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
public class DiagnosticosPorAreasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AREA_DE_USO")
    private Character areaDeUso;
    @Basic(optional = false)
    @Column(name = "DGNLBR_CODIGO")
    private String dgnlbrCodigo;

    public DiagnosticosPorAreasPK() {
    }

    public DiagnosticosPorAreasPK(Character areaDeUso, String dgnlbrCodigo) {
        this.areaDeUso = areaDeUso;
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    public Character getAreaDeUso() {
        return areaDeUso;
    }

    public void setAreaDeUso(Character areaDeUso) {
        this.areaDeUso = areaDeUso;
    }

    public String getDgnlbrCodigo() {
        return dgnlbrCodigo;
    }

    public void setDgnlbrCodigo(String dgnlbrCodigo) {
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (areaDeUso != null ? areaDeUso.hashCode() : 0);
        hash += (dgnlbrCodigo != null ? dgnlbrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosPorAreasPK)) {
            return false;
        }
        DiagnosticosPorAreasPK other = (DiagnosticosPorAreasPK) object;
        if ((this.areaDeUso == null && other.areaDeUso != null) || (this.areaDeUso != null && !this.areaDeUso.equals(other.areaDeUso))) {
            return false;
        }
        if ((this.dgnlbrCodigo == null && other.dgnlbrCodigo != null) || (this.dgnlbrCodigo != null && !this.dgnlbrCodigo.equals(other.dgnlbrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DiagnosticosPorAreasPK[ areaDeUso=" + areaDeUso + ", dgnlbrCodigo=" + dgnlbrCodigo + " ]";
    }
    
}
