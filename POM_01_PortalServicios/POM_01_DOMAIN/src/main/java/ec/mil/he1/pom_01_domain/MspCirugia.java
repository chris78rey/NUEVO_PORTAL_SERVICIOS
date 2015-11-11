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
@Table(name = "MSP_CIRUGIA")
@NamedQueries({
    @NamedQuery(name = "MspCirugia.findAll", query = "SELECT m FROM MspCirugia m")})
public class MspCirugia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspCirugiaPK mspCirugiaPK;
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
    @Column(name = "CODIGO_SUBGRUPO_2")
    private String codigoSubgrupo2;
    @Column(name = "DESCRIPCION_SUBGRUPO_2")
    private String descripcionSubgrupo2;
    @Column(name = "DESCRIPCION_ESPECIFICA")
    private String descripcionEspecifica;
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "UVR_H_MED")
    private BigInteger uvrHMed;
    @Column(name = "ANES")
    private BigInteger anes;
    @Column(name = "UVR1")
    private BigInteger uvr1;
    @Column(name = "UVR2")
    private BigInteger uvr2;
    @Column(name = "UVR3")
    private BigInteger uvr3;
    @Column(name = "PRC")
    private BigInteger prc;
    @Column(name = "PRC1")
    private BigInteger prc1;
    @Column(name = "PRC2")
    private BigInteger prc2;
    @Column(name = "PRC3")
    private BigInteger prc3;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public MspCirugia() {
    }

    public MspCirugia(MspCirugiaPK mspCirugiaPK) {
        this.mspCirugiaPK = mspCirugiaPK;
    }

    public MspCirugia(String codigoItem, String tipo, String convenio) {
        this.mspCirugiaPK = new MspCirugiaPK(codigoItem, tipo, convenio);
    }

    public MspCirugiaPK getMspCirugiaPK() {
        return mspCirugiaPK;
    }

    public void setMspCirugiaPK(MspCirugiaPK mspCirugiaPK) {
        this.mspCirugiaPK = mspCirugiaPK;
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

    public String getCodigoSubgrupo2() {
        return codigoSubgrupo2;
    }

    public void setCodigoSubgrupo2(String codigoSubgrupo2) {
        this.codigoSubgrupo2 = codigoSubgrupo2;
    }

    public String getDescripcionSubgrupo2() {
        return descripcionSubgrupo2;
    }

    public void setDescripcionSubgrupo2(String descripcionSubgrupo2) {
        this.descripcionSubgrupo2 = descripcionSubgrupo2;
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

    public BigInteger getUvrHMed() {
        return uvrHMed;
    }

    public void setUvrHMed(BigInteger uvrHMed) {
        this.uvrHMed = uvrHMed;
    }

    public BigInteger getAnes() {
        return anes;
    }

    public void setAnes(BigInteger anes) {
        this.anes = anes;
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

    public BigInteger getPrc() {
        return prc;
    }

    public void setPrc(BigInteger prc) {
        this.prc = prc;
    }

    public BigInteger getPrc1() {
        return prc1;
    }

    public void setPrc1(BigInteger prc1) {
        this.prc1 = prc1;
    }

    public BigInteger getPrc2() {
        return prc2;
    }

    public void setPrc2(BigInteger prc2) {
        this.prc2 = prc2;
    }

    public BigInteger getPrc3() {
        return prc3;
    }

    public void setPrc3(BigInteger prc3) {
        this.prc3 = prc3;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mspCirugiaPK != null ? mspCirugiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspCirugia)) {
            return false;
        }
        MspCirugia other = (MspCirugia) object;
        if ((this.mspCirugiaPK == null && other.mspCirugiaPK != null) || (this.mspCirugiaPK != null && !this.mspCirugiaPK.equals(other.mspCirugiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MspCirugia[ mspCirugiaPK=" + mspCirugiaPK + " ]";
    }
    
}
