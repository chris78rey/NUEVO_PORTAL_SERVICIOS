/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

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
@Table(name = "CURVAS_DE_TALLAS")
@NamedQueries({
    @NamedQuery(name = "CurvasDeTallas.findAll", query = "SELECT c FROM CurvasDeTallas c")})
public class CurvasDeTallas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CurvasDeTallasPK curvasDeTallasPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TALLA")
    private BigDecimal talla;

    public CurvasDeTallas() {
    }

    public CurvasDeTallas(CurvasDeTallasPK curvasDeTallasPK) {
        this.curvasDeTallasPK = curvasDeTallasPK;
    }

    public CurvasDeTallas(short edad, Character sexo, String curva) {
        this.curvasDeTallasPK = new CurvasDeTallasPK(edad, sexo, curva);
    }

    public CurvasDeTallasPK getCurvasDeTallasPK() {
        return curvasDeTallasPK;
    }

    public void setCurvasDeTallasPK(CurvasDeTallasPK curvasDeTallasPK) {
        this.curvasDeTallasPK = curvasDeTallasPK;
    }

    public BigDecimal getTalla() {
        return talla;
    }

    public void setTalla(BigDecimal talla) {
        this.talla = talla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (curvasDeTallasPK != null ? curvasDeTallasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurvasDeTallas)) {
            return false;
        }
        CurvasDeTallas other = (CurvasDeTallas) object;
        if ((this.curvasDeTallasPK == null && other.curvasDeTallasPK != null) || (this.curvasDeTallasPK != null && !this.curvasDeTallasPK.equals(other.curvasDeTallasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CurvasDeTallas[ curvasDeTallasPK=" + curvasDeTallasPK + " ]";
    }
    
}
