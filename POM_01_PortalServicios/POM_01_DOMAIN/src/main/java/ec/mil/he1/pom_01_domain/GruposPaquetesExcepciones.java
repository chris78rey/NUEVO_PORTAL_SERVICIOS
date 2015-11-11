/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "GRUPOS_PAQUETES_EXCEPCIONES")
@NamedQueries({
    @NamedQuery(name = "GruposPaquetesExcepciones.findAll", query = "SELECT g FROM GruposPaquetesExcepciones g")})
public class GruposPaquetesExcepciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNV_CONVENIO")
    private String cnvConvenio;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;

    public GruposPaquetesExcepciones() {
    }

    public GruposPaquetesExcepciones(String codigo) {
        this.codigo = codigo;
    }

    public String getCnvConvenio() {
        return cnvConvenio;
    }

    public void setCnvConvenio(String cnvConvenio) {
        this.cnvConvenio = cnvConvenio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposPaquetesExcepciones)) {
            return false;
        }
        GruposPaquetesExcepciones other = (GruposPaquetesExcepciones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.GruposPaquetesExcepciones[ codigo=" + codigo + " ]";
    }
    
}
