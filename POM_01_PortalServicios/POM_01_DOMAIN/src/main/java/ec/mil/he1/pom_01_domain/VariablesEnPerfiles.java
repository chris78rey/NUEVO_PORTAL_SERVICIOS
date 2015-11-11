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
@Table(name = "VARIABLES_EN_PERFILES")
@NamedQueries({
    @NamedQuery(name = "VariablesEnPerfiles.findAll", query = "SELECT v FROM VariablesEnPerfiles v")})
public class VariablesEnPerfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VariablesEnPerfilesPK variablesEnPerfilesPK;

    public VariablesEnPerfiles() {
    }

    public VariablesEnPerfiles(VariablesEnPerfilesPK variablesEnPerfilesPK) {
        this.variablesEnPerfilesPK = variablesEnPerfilesPK;
    }

    public VariablesEnPerfiles(String prfCodigo, int vrbexmCodigo) {
        this.variablesEnPerfilesPK = new VariablesEnPerfilesPK(prfCodigo, vrbexmCodigo);
    }

    public VariablesEnPerfilesPK getVariablesEnPerfilesPK() {
        return variablesEnPerfilesPK;
    }

    public void setVariablesEnPerfilesPK(VariablesEnPerfilesPK variablesEnPerfilesPK) {
        this.variablesEnPerfilesPK = variablesEnPerfilesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variablesEnPerfilesPK != null ? variablesEnPerfilesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesEnPerfiles)) {
            return false;
        }
        VariablesEnPerfiles other = (VariablesEnPerfiles) object;
        if ((this.variablesEnPerfilesPK == null && other.variablesEnPerfilesPK != null) || (this.variablesEnPerfilesPK != null && !this.variablesEnPerfilesPK.equals(other.variablesEnPerfilesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VariablesEnPerfiles[ variablesEnPerfilesPK=" + variablesEnPerfilesPK + " ]";
    }
    
}
