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
@Table(name = "HABITOS")
@NamedQueries({
    @NamedQuery(name = "Habitos.findAll", query = "SELECT h FROM Habitos h")})
public class Habitos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "TABACO")
    private Short tabaco;
    @Column(name = "DROGAS")
    private String drogas;
    @Column(name = "VIAJES")
    private Character viajes;
    @Column(name = "VIOLENCIA_DOMESTICA")
    private Character violenciaDomestica;
    @Column(name = "ALCOHOL")
    private Character alcohol;
    @Column(name = "TRANSFUCIONES")
    private Character transfuciones;
    @Column(name = "FACTORES_PARA_HIV")
    private Character factoresParaHiv;
    @Column(name = "SEGURIDAD_HOGAR")
    private Character seguridadHogar;

    public Habitos() {
    }

    public Habitos(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Short getTabaco() {
        return tabaco;
    }

    public void setTabaco(Short tabaco) {
        this.tabaco = tabaco;
    }

    public String getDrogas() {
        return drogas;
    }

    public void setDrogas(String drogas) {
        this.drogas = drogas;
    }

    public Character getViajes() {
        return viajes;
    }

    public void setViajes(Character viajes) {
        this.viajes = viajes;
    }

    public Character getViolenciaDomestica() {
        return violenciaDomestica;
    }

    public void setViolenciaDomestica(Character violenciaDomestica) {
        this.violenciaDomestica = violenciaDomestica;
    }

    public Character getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Character alcohol) {
        this.alcohol = alcohol;
    }

    public Character getTransfuciones() {
        return transfuciones;
    }

    public void setTransfuciones(Character transfuciones) {
        this.transfuciones = transfuciones;
    }

    public Character getFactoresParaHiv() {
        return factoresParaHiv;
    }

    public void setFactoresParaHiv(Character factoresParaHiv) {
        this.factoresParaHiv = factoresParaHiv;
    }

    public Character getSeguridadHogar() {
        return seguridadHogar;
    }

    public void setSeguridadHogar(Character seguridadHogar) {
        this.seguridadHogar = seguridadHogar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcnNumeroHc != null ? pcnNumeroHc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitos)) {
            return false;
        }
        Habitos other = (Habitos) object;
        if ((this.pcnNumeroHc == null && other.pcnNumeroHc != null) || (this.pcnNumeroHc != null && !this.pcnNumeroHc.equals(other.pcnNumeroHc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Habitos[ pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
