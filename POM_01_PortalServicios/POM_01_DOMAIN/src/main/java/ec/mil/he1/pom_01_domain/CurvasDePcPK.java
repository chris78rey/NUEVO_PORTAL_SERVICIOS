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
public class CurvasDePcPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EDAD")
    private short edad;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private Character sexo;
    @Basic(optional = false)
    @Column(name = "CURVA")
    private String curva;

    public CurvasDePcPK() {
    }

    public CurvasDePcPK(short edad, Character sexo, String curva) {
        this.edad = edad;
        this.sexo = sexo;
        this.curva = curva;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getCurva() {
        return curva;
    }

    public void setCurva(String curva) {
        this.curva = curva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) edad;
        hash += (sexo != null ? sexo.hashCode() : 0);
        hash += (curva != null ? curva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurvasDePcPK)) {
            return false;
        }
        CurvasDePcPK other = (CurvasDePcPK) object;
        if (this.edad != other.edad) {
            return false;
        }
        if ((this.sexo == null && other.sexo != null) || (this.sexo != null && !this.sexo.equals(other.sexo))) {
            return false;
        }
        if ((this.curva == null && other.curva != null) || (this.curva != null && !this.curva.equals(other.curva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CurvasDePcPK[ edad=" + edad + ", sexo=" + sexo + ", curva=" + curva + " ]";
    }
    
}
