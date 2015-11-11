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
@Table(name = "CAMPOS_TRATADOS")
@NamedQueries({
    @NamedQuery(name = "CamposTratados.findAll", query = "SELECT c FROM CamposTratados c")})
public class CamposTratados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CMPTRT_ID")
    private Long cmptrtId;
    @Column(name = "TCNCBL_NUMERO")
    private Short tcncblNumero;
    @Column(name = "TCNCBL_FCHCBL_NUMERO")
    private Integer tcncblFchcblNumero;
    @Column(name = "CAMPO")
    private String campo;
    @Column(name = "APLICACION")
    private String aplicacion;
    @Column(name = "DOSIS")
    private Short dosis;

    public CamposTratados() {
    }

    public CamposTratados(Long cmptrtId) {
        this.cmptrtId = cmptrtId;
    }

    public Long getCmptrtId() {
        return cmptrtId;
    }

    public void setCmptrtId(Long cmptrtId) {
        this.cmptrtId = cmptrtId;
    }

    public Short getTcncblNumero() {
        return tcncblNumero;
    }

    public void setTcncblNumero(Short tcncblNumero) {
        this.tcncblNumero = tcncblNumero;
    }

    public Integer getTcncblFchcblNumero() {
        return tcncblFchcblNumero;
    }

    public void setTcncblFchcblNumero(Integer tcncblFchcblNumero) {
        this.tcncblFchcblNumero = tcncblFchcblNumero;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public Short getDosis() {
        return dosis;
    }

    public void setDosis(Short dosis) {
        this.dosis = dosis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmptrtId != null ? cmptrtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamposTratados)) {
            return false;
        }
        CamposTratados other = (CamposTratados) object;
        if ((this.cmptrtId == null && other.cmptrtId != null) || (this.cmptrtId != null && !this.cmptrtId.equals(other.cmptrtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CamposTratados[ cmptrtId=" + cmptrtId + " ]";
    }
    
}
