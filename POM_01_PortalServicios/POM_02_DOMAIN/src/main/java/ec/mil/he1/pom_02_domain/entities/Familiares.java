/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "FAMILIARES")
@NamedQueries({
    @NamedQuery(name = "Familiares.findAll", query = "SELECT f FROM Familiares f")})
public class Familiares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FML_ID")
    private Long fmlId;
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INGRESO_MENSUAL")
    private BigDecimal ingresoMensual;
    @Column(name = "NIVEL")
    private String nivel;
    @Column(name = "RELACION")
    private String relacion;
    @Column(name = "EDAD")
    private Short edad;
    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;
    @JoinColumn(name = "FCHSCL_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private FichasSociales fichasSociales;
    @JoinColumn(name = "INST_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Instrucciones instrucciones;
    @JoinColumn(name = "OCP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ocupaciones ocupaciones;

    public Familiares() {
    }

    public Familiares(Long fmlId) {
        this.fmlId = fmlId;
    }

    public Long getFmlId() {
        return fmlId;
    }

    public void setFmlId(Long fmlId) {
        this.fmlId = fmlId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(BigDecimal ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public FichasSociales getFichasSociales() {
        return fichasSociales;
    }

    public void setFichasSociales(FichasSociales fichasSociales) {
        this.fichasSociales = fichasSociales;
    }

    public Instrucciones getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(Instrucciones instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Ocupaciones getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(Ocupaciones ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fmlId != null ? fmlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Familiares)) {
            return false;
        }
        Familiares other = (Familiares) object;
        if ((this.fmlId == null && other.fmlId != null) || (this.fmlId != null && !this.fmlId.equals(other.fmlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Familiares[ fmlId=" + fmlId + " ]";
    }
    
}
