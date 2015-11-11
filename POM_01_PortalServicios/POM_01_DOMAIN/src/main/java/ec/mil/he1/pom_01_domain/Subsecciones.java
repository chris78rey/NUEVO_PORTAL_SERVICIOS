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
@Table(name = "SUBSECCIONES")
@NamedQueries({
    @NamedQuery(name = "Subsecciones.findAll", query = "SELECT s FROM Subsecciones s")})
public class Subsecciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubseccionesPK subseccionesPK;
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;

    public Subsecciones() {
    }

    public Subsecciones(SubseccionesPK subseccionesPK) {
        this.subseccionesPK = subseccionesPK;
    }

    public Subsecciones(String sccCodigo, String codigo) {
        this.subseccionesPK = new SubseccionesPK(sccCodigo, codigo);
    }

    public SubseccionesPK getSubseccionesPK() {
        return subseccionesPK;
    }

    public void setSubseccionesPK(SubseccionesPK subseccionesPK) {
        this.subseccionesPK = subseccionesPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subseccionesPK != null ? subseccionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subsecciones)) {
            return false;
        }
        Subsecciones other = (Subsecciones) object;
        if ((this.subseccionesPK == null && other.subseccionesPK != null) || (this.subseccionesPK != null && !this.subseccionesPK.equals(other.subseccionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Subsecciones[ subseccionesPK=" + subseccionesPK + " ]";
    }
    
}
