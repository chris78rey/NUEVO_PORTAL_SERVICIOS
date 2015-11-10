/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
@Table(name = "MSP_EVALUACION_Y_MANEJO")
@NamedQueries({
    @NamedQuery(name = "MspEvaluacionYManejo.findAll", query = "SELECT m FROM MspEvaluacionYManejo m")})
public class MspEvaluacionYManejo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspEvaluacionYManejoPK mspEvaluacionYManejoPK;
    @Column(name = "CODIGO_GRUPO")
    private String codigoGrupo;
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
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "PCR")
    private String pcr;
    @Column(name = "UVR")
    private BigInteger uvr;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "F12")
    private String f12;

    public MspEvaluacionYManejo() {
    }

    public MspEvaluacionYManejo(MspEvaluacionYManejoPK mspEvaluacionYManejoPK) {
        this.mspEvaluacionYManejoPK = mspEvaluacionYManejoPK;
    }

    public MspEvaluacionYManejo(String codigoItem, String convenio, String tipo) {
        this.mspEvaluacionYManejoPK = new MspEvaluacionYManejoPK(codigoItem, convenio, tipo);
    }

    public MspEvaluacionYManejoPK getMspEvaluacionYManejoPK() {
        return mspEvaluacionYManejoPK;
    }

    public void setMspEvaluacionYManejoPK(MspEvaluacionYManejoPK mspEvaluacionYManejoPK) {
        this.mspEvaluacionYManejoPK = mspEvaluacionYManejoPK;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getF12() {
        return f12;
    }

    public void setF12(String f12) {
        this.f12 = f12;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mspEvaluacionYManejoPK != null ? mspEvaluacionYManejoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspEvaluacionYManejo)) {
            return false;
        }
        MspEvaluacionYManejo other = (MspEvaluacionYManejo) object;
        if ((this.mspEvaluacionYManejoPK == null && other.mspEvaluacionYManejoPK != null) || (this.mspEvaluacionYManejoPK != null && !this.mspEvaluacionYManejoPK.equals(other.mspEvaluacionYManejoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MspEvaluacionYManejo[ mspEvaluacionYManejoPK=" + mspEvaluacionYManejoPK + " ]";
    }
    
}
