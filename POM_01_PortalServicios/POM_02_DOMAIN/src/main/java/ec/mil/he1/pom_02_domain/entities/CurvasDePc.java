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
@Table(name = "CURVAS_DE_PC")
@NamedQueries({
    @NamedQuery(name = "CurvasDePc.findAll", query = "SELECT c FROM CurvasDePc c")})
public class CurvasDePc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CurvasDePcPK curvasDePcPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PC")
    private BigDecimal pc;

    public CurvasDePc() {
    }

    public CurvasDePc(CurvasDePcPK curvasDePcPK) {
        this.curvasDePcPK = curvasDePcPK;
    }

    public CurvasDePc(short edad, Character sexo, String curva) {
        this.curvasDePcPK = new CurvasDePcPK(edad, sexo, curva);
    }

    public CurvasDePcPK getCurvasDePcPK() {
        return curvasDePcPK;
    }

    public void setCurvasDePcPK(CurvasDePcPK curvasDePcPK) {
        this.curvasDePcPK = curvasDePcPK;
    }

    public BigDecimal getPc() {
        return pc;
    }

    public void setPc(BigDecimal pc) {
        this.pc = pc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (curvasDePcPK != null ? curvasDePcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurvasDePc)) {
            return false;
        }
        CurvasDePc other = (CurvasDePc) object;
        if ((this.curvasDePcPK == null && other.curvasDePcPK != null) || (this.curvasDePcPK != null && !this.curvasDePcPK.equals(other.curvasDePcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CurvasDePc[ curvasDePcPK=" + curvasDePcPK + " ]";
    }
    
}
