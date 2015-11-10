/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CURVAS_DE_PESOS")
@NamedQueries({
    @NamedQuery(name = "CurvasDePesos.findAll", query = "SELECT c FROM CurvasDePesos c")})
public class CurvasDePesos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CurvasDePesosPK curvasDePesosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private BigDecimal peso;

    public CurvasDePesos() {
    }

    public CurvasDePesos(CurvasDePesosPK curvasDePesosPK) {
        this.curvasDePesosPK = curvasDePesosPK;
    }

    public CurvasDePesos(short edad, String estadoNutricional, Character sexo) {
        this.curvasDePesosPK = new CurvasDePesosPK(edad, estadoNutricional, sexo);
    }

    public CurvasDePesosPK getCurvasDePesosPK() {
        return curvasDePesosPK;
    }

    public void setCurvasDePesosPK(CurvasDePesosPK curvasDePesosPK) {
        this.curvasDePesosPK = curvasDePesosPK;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (curvasDePesosPK != null ? curvasDePesosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurvasDePesos)) {
            return false;
        }
        CurvasDePesos other = (CurvasDePesos) object;
        if ((this.curvasDePesosPK == null && other.curvasDePesosPK != null) || (this.curvasDePesosPK != null && !this.curvasDePesosPK.equals(other.curvasDePesosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CurvasDePesos[ curvasDePesosPK=" + curvasDePesosPK + " ]";
    }
    
}
