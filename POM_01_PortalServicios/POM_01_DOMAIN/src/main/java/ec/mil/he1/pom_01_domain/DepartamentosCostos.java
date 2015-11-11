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
@Table(name = "DEPARTAMENTOS_COSTOS")
@NamedQueries({
    @NamedQuery(name = "DepartamentosCostos.findAll", query = "SELECT d FROM DepartamentosCostos d")})
public class DepartamentosCostos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepartamentosCostosPK departamentosCostosPK;

    public DepartamentosCostos() {
    }

    public DepartamentosCostos(DepartamentosCostosPK departamentosCostosPK) {
        this.departamentosCostosPK = departamentosCostosPK;
    }

    public DepartamentosCostos(String dprCodigo, String dprAraCodigo, int elmcstNumero) {
        this.departamentosCostosPK = new DepartamentosCostosPK(dprCodigo, dprAraCodigo, elmcstNumero);
    }

    public DepartamentosCostosPK getDepartamentosCostosPK() {
        return departamentosCostosPK;
    }

    public void setDepartamentosCostosPK(DepartamentosCostosPK departamentosCostosPK) {
        this.departamentosCostosPK = departamentosCostosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentosCostosPK != null ? departamentosCostosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosCostos)) {
            return false;
        }
        DepartamentosCostos other = (DepartamentosCostos) object;
        if ((this.departamentosCostosPK == null && other.departamentosCostosPK != null) || (this.departamentosCostosPK != null && !this.departamentosCostosPK.equals(other.departamentosCostosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DepartamentosCostos[ departamentosCostosPK=" + departamentosCostosPK + " ]";
    }
    
}
