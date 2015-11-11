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
@Table(name = "MSP_PRESTACIONES_INTEGRALES")
@NamedQueries({
    @NamedQuery(name = "MspPrestacionesIntegrales.findAll", query = "SELECT m FROM MspPrestacionesIntegrales m")})
public class MspPrestacionesIntegrales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspPrestacionesIntegralesPK mspPrestacionesIntegralesPK;
    @Column(name = "CODIGO_GRUPO")
    private String codigoGrupo;
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
    @Column(name = "PCR")
    private String pcr;
    @Column(name = "UVR1")
    private BigInteger uvr1;
    @Column(name = "UVR3")
    private BigInteger uvr3;
    @Column(name = "TOTAL_TARIFA_INTEGRAL")
    private BigInteger totalTarifaIntegral;
    @Column(name = "TOTAL_TARIFA_INTEGRAL_III")
    private BigInteger totalTarifaIntegralIii;
    @Column(name = "OBSERVACION")
    private String observacion;

    public MspPrestacionesIntegrales() {
    }

    public MspPrestacionesIntegrales(MspPrestacionesIntegralesPK mspPrestacionesIntegralesPK) {
        this.mspPrestacionesIntegralesPK = mspPrestacionesIntegralesPK;
    }

    public MspPrestacionesIntegrales(String codigoItem, String convenio, String tipo) {
        this.mspPrestacionesIntegralesPK = new MspPrestacionesIntegralesPK(codigoItem, convenio, tipo);
    }

    public MspPrestacionesIntegralesPK getMspPrestacionesIntegralesPK() {
        return mspPrestacionesIntegralesPK;
    }

    public void setMspPrestacionesIntegralesPK(MspPrestacionesIntegralesPK mspPrestacionesIntegralesPK) {
        this.mspPrestacionesIntegralesPK = mspPrestacionesIntegralesPK;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
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

    public String getPcr() {
        return pcr;
    }

    public void setPcr(String pcr) {
        this.pcr = pcr;
    }

    public BigInteger getUvr1() {
        return uvr1;
    }

    public void setUvr1(BigInteger uvr1) {
        this.uvr1 = uvr1;
    }

    public BigInteger getUvr3() {
        return uvr3;
    }

    public void setUvr3(BigInteger uvr3) {
        this.uvr3 = uvr3;
    }

    public BigInteger getTotalTarifaIntegral() {
        return totalTarifaIntegral;
    }

    public void setTotalTarifaIntegral(BigInteger totalTarifaIntegral) {
        this.totalTarifaIntegral = totalTarifaIntegral;
    }

    public BigInteger getTotalTarifaIntegralIii() {
        return totalTarifaIntegralIii;
    }

    public void setTotalTarifaIntegralIii(BigInteger totalTarifaIntegralIii) {
        this.totalTarifaIntegralIii = totalTarifaIntegralIii;
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
        hash += (mspPrestacionesIntegralesPK != null ? mspPrestacionesIntegralesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspPrestacionesIntegrales)) {
            return false;
        }
        MspPrestacionesIntegrales other = (MspPrestacionesIntegrales) object;
        if ((this.mspPrestacionesIntegralesPK == null && other.mspPrestacionesIntegralesPK != null) || (this.mspPrestacionesIntegralesPK != null && !this.mspPrestacionesIntegralesPK.equals(other.mspPrestacionesIntegralesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MspPrestacionesIntegrales[ mspPrestacionesIntegralesPK=" + mspPrestacionesIntegralesPK + " ]";
    }
    
}
