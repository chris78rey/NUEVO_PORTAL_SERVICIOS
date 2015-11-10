/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "INMUNIZACIONES")
@NamedQueries({
    @NamedQuery(name = "Inmunizaciones.findAll", query = "SELECT i FROM Inmunizaciones i")})
public class Inmunizaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DOSIS1")
    private String dosis1;
    @Column(name = "DOSIS2")
    private String dosis2;
    @Column(name = "DOSIS3")
    private String dosis3;
    @Column(name = "REFUERZO1")
    private String refuerzo1;
    @Column(name = "REFUERZO2")
    private String refuerzo2;
    @Column(name = "REFUERZO3")
    private String refuerzo3;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;

    public Inmunizaciones() {
    }

    public Inmunizaciones(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis1() {
        return dosis1;
    }

    public void setDosis1(String dosis1) {
        this.dosis1 = dosis1;
    }

    public String getDosis2() {
        return dosis2;
    }

    public void setDosis2(String dosis2) {
        this.dosis2 = dosis2;
    }

    public String getDosis3() {
        return dosis3;
    }

    public void setDosis3(String dosis3) {
        this.dosis3 = dosis3;
    }

    public String getRefuerzo1() {
        return refuerzo1;
    }

    public void setRefuerzo1(String refuerzo1) {
        this.refuerzo1 = refuerzo1;
    }

    public String getRefuerzo2() {
        return refuerzo2;
    }

    public void setRefuerzo2(String refuerzo2) {
        this.refuerzo2 = refuerzo2;
    }

    public String getRefuerzo3() {
        return refuerzo3;
    }

    public void setRefuerzo3(String refuerzo3) {
        this.refuerzo3 = refuerzo3;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inmunizaciones)) {
            return false;
        }
        Inmunizaciones other = (Inmunizaciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Inmunizaciones[ numero=" + numero + " ]";
    }
    
}
