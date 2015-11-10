/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PAIS")
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAS_IDPAIS")
    private String pasIdpais;
    @Column(name = "PAS_PAIS")
    private String pasPais;
    @Column(name = "PAS_USER")
    private String pasUser;
    @OneToMany(mappedBy = "pais", fetch = FetchType.LAZY)
    private List<ReferenciasAcademicas> referenciasAcademicasList;
    @OneToMany(mappedBy = "pais", fetch = FetchType.LAZY)
    private List<ReferenciasLaborales> referenciasLaboralesList;

    public Pais() {
    }

    public Pais(String pasIdpais) {
        this.pasIdpais = pasIdpais;
    }

    public String getPasIdpais() {
        return pasIdpais;
    }

    public void setPasIdpais(String pasIdpais) {
        this.pasIdpais = pasIdpais;
    }

    public String getPasPais() {
        return pasPais;
    }

    public void setPasPais(String pasPais) {
        this.pasPais = pasPais;
    }

    public String getPasUser() {
        return pasUser;
    }

    public void setPasUser(String pasUser) {
        this.pasUser = pasUser;
    }

    public List<ReferenciasAcademicas> getReferenciasAcademicasList() {
        return referenciasAcademicasList;
    }

    public void setReferenciasAcademicasList(List<ReferenciasAcademicas> referenciasAcademicasList) {
        this.referenciasAcademicasList = referenciasAcademicasList;
    }

    public List<ReferenciasLaborales> getReferenciasLaboralesList() {
        return referenciasLaboralesList;
    }

    public void setReferenciasLaboralesList(List<ReferenciasLaborales> referenciasLaboralesList) {
        this.referenciasLaboralesList = referenciasLaboralesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pasIdpais != null ? pasIdpais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.pasIdpais == null && other.pasIdpais != null) || (this.pasIdpais != null && !this.pasIdpais.equals(other.pasIdpais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Pais[ pasIdpais=" + pasIdpais + " ]";
    }
    
}
