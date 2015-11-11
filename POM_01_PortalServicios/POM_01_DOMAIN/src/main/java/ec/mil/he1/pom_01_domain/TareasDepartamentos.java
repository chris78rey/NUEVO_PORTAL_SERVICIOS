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
@Table(name = "TAREAS_DEPARTAMENTOS")
@NamedQueries({
    @NamedQuery(name = "TareasDepartamentos.findAll", query = "SELECT t FROM TareasDepartamentos t")})
public class TareasDepartamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "TRA_CODIGO")
    private Integer traCodigo;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;

    public TareasDepartamentos() {
    }

    public TareasDepartamentos(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public Integer getTraCodigo() {
        return traCodigo;
    }

    public void setTraCodigo(Integer traCodigo) {
        this.traCodigo = traCodigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
        if (!(object instanceof TareasDepartamentos)) {
            return false;
        }
        TareasDepartamentos other = (TareasDepartamentos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TareasDepartamentos[ codigo=" + codigo + " ]";
    }
    
}
