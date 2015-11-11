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
@Table(name = "INFORMES_ENDOSCOPIA")
@NamedQueries({
    @NamedQuery(name = "InformesEndoscopia.findAll", query = "SELECT i FROM InformesEndoscopia i")})
public class InformesEndoscopia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private Integer exmNumero;
    @Column(name = "BIOPSIA")
    private Character biopsia;
    @Column(name = "TINCION")
    private Character tincion;
    @Column(name = "VHS")
    private Character vhs;
    @Column(name = "FOTO")
    private Character foto;
    @Column(name = "GRAFICO")
    private String grafico;

    public InformesEndoscopia() {
    }

    public InformesEndoscopia(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Integer getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Character getBiopsia() {
        return biopsia;
    }

    public void setBiopsia(Character biopsia) {
        this.biopsia = biopsia;
    }

    public Character getTincion() {
        return tincion;
    }

    public void setTincion(Character tincion) {
        this.tincion = tincion;
    }

    public Character getVhs() {
        return vhs;
    }

    public void setVhs(Character vhs) {
        this.vhs = vhs;
    }

    public Character getFoto() {
        return foto;
    }

    public void setFoto(Character foto) {
        this.foto = foto;
    }

    public String getGrafico() {
        return grafico;
    }

    public void setGrafico(String grafico) {
        this.grafico = grafico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exmNumero != null ? exmNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformesEndoscopia)) {
            return false;
        }
        InformesEndoscopia other = (InformesEndoscopia) object;
        if ((this.exmNumero == null && other.exmNumero != null) || (this.exmNumero != null && !this.exmNumero.equals(other.exmNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.InformesEndoscopia[ exmNumero=" + exmNumero + " ]";
    }
    
}
