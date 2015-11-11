/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "MSP_VISITAS_DOMICILIARIAS")
@NamedQueries({
    @NamedQuery(name = "MspVisitasDomiciliarias.findAll", query = "SELECT m FROM MspVisitasDomiciliarias m")})
public class MspVisitasDomiciliarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspVisitasDomiciliariasPK mspVisitasDomiciliariasPK;
    @Column(name = "CODIGO_GRUPO")
    private String codigoGrupo;
    @Column(name = "DESCRIPCION_GRUPO")
    private String descripcionGrupo;
    @Column(name = "CODIGO_SUBGRUPO")
    private String codigoSubgrupo;
    @Column(name = "DESCRIPCION_SUBGRUPO")
    private String descripcionSubgrupo;
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "PCR")
    private String pcr;
    @Column(name = "UVR")
    private BigInteger uvr;

    public MspVisitasDomiciliarias() {
    }

    public MspVisitasDomiciliarias(MspVisitasDomiciliariasPK mspVisitasDomiciliariasPK) {
        this.mspVisitasDomiciliariasPK = mspVisitasDomiciliariasPK;
    }

    public MspVisitasDomiciliarias(String codigoItem, String convenio, String tipo) {
        this.mspVisitasDomiciliariasPK = new MspVisitasDomiciliariasPK(codigoItem, convenio, tipo);
    }

    public MspVisitasDomiciliariasPK getMspVisitasDomiciliariasPK() {
        return mspVisitasDomiciliariasPK;
    }

    public void setMspVisitasDomiciliariasPK(MspVisitasDomiciliariasPK mspVisitasDomiciliariasPK) {
        this.mspVisitasDomiciliariasPK = mspVisitasDomiciliariasPK;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getDescripcionGrupo() {
        return descripcionGrupo;
    }

    public void setDescripcionGrupo(String descripcionGrupo) {
        this.descripcionGrupo = descripcionGrupo;
    }

    public String getCodigoSubgrupo() {
        return codigoSubgrupo;
    }

    public void setCodigoSubgrupo(String codigoSubgrupo) {
        this.codigoSubgrupo = codigoSubgrupo;
    }

    public String getDescripcionSubgrupo() {
        return descripcionSubgrupo;
    }

    public void setDescripcionSubgrupo(String descripcionSubgrupo) {
        this.descripcionSubgrupo = descripcionSubgrupo;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }

    public String getPcr() {
        return pcr;
    }

    public void setPcr(String pcr) {
        this.pcr = pcr;
    }

    public BigInteger getUvr() {
        return uvr;
    }

    public void setUvr(BigInteger uvr) {
        this.uvr = uvr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mspVisitasDomiciliariasPK != null ? mspVisitasDomiciliariasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspVisitasDomiciliarias)) {
            return false;
        }
        MspVisitasDomiciliarias other = (MspVisitasDomiciliarias) object;
        if ((this.mspVisitasDomiciliariasPK == null && other.mspVisitasDomiciliariasPK != null) || (this.mspVisitasDomiciliariasPK != null && !this.mspVisitasDomiciliariasPK.equals(other.mspVisitasDomiciliariasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MspVisitasDomiciliarias[ mspVisitasDomiciliariasPK=" + mspVisitasDomiciliariasPK + " ]";
    }
    
}
