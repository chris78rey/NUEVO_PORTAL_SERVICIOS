/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PROBLEMAS")
@NamedQueries({
    @NamedQuery(name = "Problemas.findAll", query = "SELECT p FROM Problemas p")})
public class Problemas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProblemasPK problemasPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_DE_APARICION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeAparicion;
    @Column(name = "FECHA_DE_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeRegistro;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_DE_RESOLUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeResolucion;

    public Problemas() {
    }

    public Problemas(ProblemasPK problemasPK) {
        this.problemasPK = problemasPK;
    }

    public Problemas(int pcnNumeroHc, BigInteger hjaevlNumero, short numero) {
        this.problemasPK = new ProblemasPK(pcnNumeroHc, hjaevlNumero, numero);
    }

    public ProblemasPK getProblemasPK() {
        return problemasPK;
    }

    public void setProblemasPK(ProblemasPK problemasPK) {
        this.problemasPK = problemasPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeAparicion() {
        return fechaDeAparicion;
    }

    public void setFechaDeAparicion(Date fechaDeAparicion) {
        this.fechaDeAparicion = fechaDeAparicion;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaDeResolucion() {
        return fechaDeResolucion;
    }

    public void setFechaDeResolucion(Date fechaDeResolucion) {
        this.fechaDeResolucion = fechaDeResolucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (problemasPK != null ? problemasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Problemas)) {
            return false;
        }
        Problemas other = (Problemas) object;
        if ((this.problemasPK == null && other.problemasPK != null) || (this.problemasPK != null && !this.problemasPK.equals(other.problemasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Problemas[ problemasPK=" + problemasPK + " ]";
    }
    
}
