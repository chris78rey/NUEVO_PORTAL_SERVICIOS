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
@Table(name = "MSP_COMPONENTE_MEDICINA")
@NamedQueries({
    @NamedQuery(name = "MspComponenteMedicina.findAll", query = "SELECT m FROM MspComponenteMedicina m")})
public class MspComponenteMedicina implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspComponenteMedicinaPK mspComponenteMedicinaPK;
    @Column(name = "CODIGO_GRUPO")
    private BigInteger codigoGrupo;
    @Column(name = "DESCRIPCION_GRUPO")
    private String descripcionGrupo;
    @Column(name = "CODIGO_SUBGRUPO")
    private String codigoSubgrupo;
    @Column(name = "DESCRIPCION_SUBGRUPO")
    private String descripcionSubgrupo;
    @Column(name = "CODIGO_SUBGRUPO_1")
    private String codigoSubgrupo1;
    @Column(name = "DESCRIPCION_SUBGRUPO_1")
    private String descripcionSubgrupo1;
    @Column(name = "DESCRIPCION_ESPECIFICA")
    private String descripcionEspecifica;
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "PCR")
    private BigInteger pcr;
    @Column(name = "UVR_H_MED")
    private BigInteger uvrHMed;
    @Column(name = "UVR_ANES")
    private BigInteger uvrAnes;
    @Column(name = "OBSERVACION")
    private String observacion;

    public MspComponenteMedicina() {
    }

    public MspComponenteMedicina(MspComponenteMedicinaPK mspComponenteMedicinaPK) {
        this.mspComponenteMedicinaPK = mspComponenteMedicinaPK;
    }

    public MspComponenteMedicina(String codigoItem, String convenio, String tipo) {
        this.mspComponenteMedicinaPK = new MspComponenteMedicinaPK(codigoItem, convenio, tipo);
    }

    public MspComponenteMedicinaPK getMspComponenteMedicinaPK() {
        return mspComponenteMedicinaPK;
    }

    public void setMspComponenteMedicinaPK(MspComponenteMedicinaPK mspComponenteMedicinaPK) {
        this.mspComponenteMedicinaPK = mspComponenteMedicinaPK;
    }

    public BigInteger getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(BigInteger codigoGrupo) {
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

    public String getCodigoSubgrupo1() {
        return codigoSubgrupo1;
    }

    public void setCodigoSubgrupo1(String codigoSubgrupo1) {
        this.codigoSubgrupo1 = codigoSubgrupo1;
    }

    public String getDescripcionSubgrupo1() {
        return descripcionSubgrupo1;
    }

    public void setDescripcionSubgrupo1(String descripcionSubgrupo1) {
        this.descripcionSubgrupo1 = descripcionSubgrupo1;
    }

    public String getDescripcionEspecifica() {
        return descripcionEspecifica;
    }

    public void setDescripcionEspecifica(String descripcionEspecifica) {
        this.descripcionEspecifica = descripcionEspecifica;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }

    public BigInteger getPcr() {
        return pcr;
    }

    public void setPcr(BigInteger pcr) {
        this.pcr = pcr;
    }

    public BigInteger getUvrHMed() {
        return uvrHMed;
    }

    public void setUvrHMed(BigInteger uvrHMed) {
        this.uvrHMed = uvrHMed;
    }

    public BigInteger getUvrAnes() {
        return uvrAnes;
    }

    public void setUvrAnes(BigInteger uvrAnes) {
        this.uvrAnes = uvrAnes;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mspComponenteMedicinaPK != null ? mspComponenteMedicinaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspComponenteMedicina)) {
            return false;
        }
        MspComponenteMedicina other = (MspComponenteMedicina) object;
        if ((this.mspComponenteMedicinaPK == null && other.mspComponenteMedicinaPK != null) || (this.mspComponenteMedicinaPK != null && !this.mspComponenteMedicinaPK.equals(other.mspComponenteMedicinaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MspComponenteMedicina[ mspComponenteMedicinaPK=" + mspComponenteMedicinaPK + " ]";
    }
    
}
