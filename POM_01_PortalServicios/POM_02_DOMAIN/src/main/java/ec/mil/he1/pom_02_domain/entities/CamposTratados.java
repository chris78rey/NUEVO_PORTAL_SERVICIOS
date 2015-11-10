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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @Column(name = "CAMPO")
    private String campo;
    @Column(name = "APLICACION")
    private String aplicacion;
    @Column(name = "DOSIS")
    private Short dosis;
    @OneToMany(mappedBy = "camposTratados", fetch = FetchType.LAZY)
    private List<TratamientosCobalto> tratamientosCobaltoList;
    @JoinColumns({
        @JoinColumn(name = "TCNCBL_FCHCBL_NUMERO", referencedColumnName = "FCHCBL_NUMERO"),
        @JoinColumn(name = "TCNCBL_NUMERO", referencedColumnName = "NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private TecnicasCobalto tecnicasCobalto;

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

    public List<TratamientosCobalto> getTratamientosCobaltoList() {
        return tratamientosCobaltoList;
    }

    public void setTratamientosCobaltoList(List<TratamientosCobalto> tratamientosCobaltoList) {
        this.tratamientosCobaltoList = tratamientosCobaltoList;
    }

    public TecnicasCobalto getTecnicasCobalto() {
        return tecnicasCobalto;
    }

    public void setTecnicasCobalto(TecnicasCobalto tecnicasCobalto) {
        this.tecnicasCobalto = tecnicasCobalto;
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
        return "ec.mil.he1.pom_02_domain.entities.CamposTratados[ cmptrtId=" + cmptrtId + " ]";
    }
    
}
