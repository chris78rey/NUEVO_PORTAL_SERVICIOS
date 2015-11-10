/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class CurvasDePesosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EDAD")
    private short edad;
    @Basic(optional = false)
    @Column(name = "ESTADO_NUTRICIONAL")
    private String estadoNutricional;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private Character sexo;

    public CurvasDePesosPK() {
    }

    public CurvasDePesosPK(short edad, String estadoNutricional, Character sexo) {
        this.edad = edad;
        this.estadoNutricional = estadoNutricional;
        this.sexo = sexo;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getEstadoNutricional() {
        return estadoNutricional;
    }

    public void setEstadoNutricional(String estadoNutricional) {
        this.estadoNutricional = estadoNutricional;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) edad;
        hash += (estadoNutricional != null ? estadoNutricional.hashCode() : 0);
        hash += (sexo != null ? sexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurvasDePesosPK)) {
            return false;
        }
        CurvasDePesosPK other = (CurvasDePesosPK) object;
        if (this.edad != other.edad) {
            return false;
        }
        if ((this.estadoNutricional == null && other.estadoNutricional != null) || (this.estadoNutricional != null && !this.estadoNutricional.equals(other.estadoNutricional))) {
            return false;
        }
        if ((this.sexo == null && other.sexo != null) || (this.sexo != null && !this.sexo.equals(other.sexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CurvasDePesosPK[ edad=" + edad + ", estadoNutricional=" + estadoNutricional + ", sexo=" + sexo + " ]";
    }
    
}
