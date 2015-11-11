/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DIETAS_CARGOS")
@NamedQueries({
    @NamedQuery(name = "DietasCargos.findAll", query = "SELECT d FROM DietasCargos d")})
public class DietasCargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DietasCargosPK dietasCargosPK;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;

    public DietasCargos() {
    }

    public DietasCargos(DietasCargosPK dietasCargosPK) {
        this.dietasCargosPK = dietasCargosPK;
    }

    public DietasCargos(String tipoPedido, String tipoDieta) {
        this.dietasCargosPK = new DietasCargosPK(tipoPedido, tipoDieta);
    }

    public DietasCargosPK getDietasCargosPK() {
        return dietasCargosPK;
    }

    public void setDietasCargosPK(DietasCargosPK dietasCargosPK) {
        this.dietasCargosPK = dietasCargosPK;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dietasCargosPK != null ? dietasCargosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DietasCargos)) {
            return false;
        }
        DietasCargos other = (DietasCargos) object;
        if ((this.dietasCargosPK == null && other.dietasCargosPK != null) || (this.dietasCargosPK != null && !this.dietasCargosPK.equals(other.dietasCargosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DietasCargos[ dietasCargosPK=" + dietasCargosPK + " ]";
    }
    
}
