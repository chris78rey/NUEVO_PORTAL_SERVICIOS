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
@Table(name = "MSP_SERVICIOS_ODONTOLOGICOS")
@NamedQueries({
    @NamedQuery(name = "MspServiciosOdontologicos.findAll", query = "SELECT m FROM MspServiciosOdontologicos m")})
public class MspServiciosOdontologicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspServiciosOdontologicosPK mspServiciosOdontologicosPK;
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
    private BigInteger pcr;
    @Column(name = "UVR1")
    private BigInteger uvr1;
    @Column(name = "UVR2")
    private BigInteger uvr2;
    @Column(name = "UVR3")
    private BigInteger uvr3;

    public MspServiciosOdontologicos() {
    }

    public MspServiciosOdontologicos(MspServiciosOdontologicosPK mspServiciosOdontologicosPK) {
        this.mspServiciosOdontologicosPK = mspServiciosOdontologicosPK;
    }

    public MspServiciosOdontologicos(String codigoItem, String convenio, String tipo) {
        this.mspServiciosOdontologicosPK = new MspServiciosOdontologicosPK(codigoItem, convenio, tipo);
    }

    public MspServiciosOdontologicosPK getMspServiciosOdontologicosPK() {
        return mspServiciosOdontologicosPK;
    }

    public void setMspServiciosOdontologicosPK(MspServiciosOdontologicosPK mspServiciosOdontologicosPK) {
        this.mspServiciosOdontologicosPK = mspServiciosOdontologicosPK;
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

    public BigInteger getPcr() {
        return pcr;
    }

    public void setPcr(BigInteger pcr) {
        this.pcr = pcr;
    }

    public BigInteger getUvr1() {
        return uvr1;
    }

    public void setUvr1(BigInteger uvr1) {
        this.uvr1 = uvr1;
    }

    public BigInteger getUvr2() {
        return uvr2;
    }

    public void setUvr2(BigInteger uvr2) {
        this.uvr2 = uvr2;
    }

    public BigInteger getUvr3() {
        return uvr3;
    }

    public void setUvr3(BigInteger uvr3) {
        this.uvr3 = uvr3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mspServiciosOdontologicosPK != null ? mspServiciosOdontologicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspServiciosOdontologicos)) {
            return false;
        }
        MspServiciosOdontologicos other = (MspServiciosOdontologicos) object;
        if ((this.mspServiciosOdontologicosPK == null && other.mspServiciosOdontologicosPK != null) || (this.mspServiciosOdontologicosPK != null && !this.mspServiciosOdontologicosPK.equals(other.mspServiciosOdontologicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MspServiciosOdontologicos[ mspServiciosOdontologicosPK=" + mspServiciosOdontologicosPK + " ]";
    }
    
}
