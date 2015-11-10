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
@Table(name = "MSP_SERVICIOS_HOTELERIA")
@NamedQueries({
    @NamedQuery(name = "MspServiciosHoteleria.findAll", query = "SELECT m FROM MspServiciosHoteleria m")})
public class MspServiciosHoteleria implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspServiciosHoteleriaPK mspServiciosHoteleriaPK;
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
    @Column(name = "DESCRIPCION_ESPECIFICA")
    private String descripcionEspecifica;
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "PCR")
    private BigInteger pcr;
    @Column(name = "UVR")
    private BigInteger uvr;
    @Column(name = "NIVEL")
    private String nivel;
    @Column(name = "OBSERVACION")
    private String observacion;

    public MspServiciosHoteleria() {
    }

    public MspServiciosHoteleria(MspServiciosHoteleriaPK mspServiciosHoteleriaPK) {
        this.mspServiciosHoteleriaPK = mspServiciosHoteleriaPK;
    }

    public MspServiciosHoteleria(String codigoItem, String convenio, String tipo) {
        this.mspServiciosHoteleriaPK = new MspServiciosHoteleriaPK(codigoItem, convenio, tipo);
    }

    public MspServiciosHoteleriaPK getMspServiciosHoteleriaPK() {
        return mspServiciosHoteleriaPK;
    }

    public void setMspServiciosHoteleriaPK(MspServiciosHoteleriaPK mspServiciosHoteleriaPK) {
        this.mspServiciosHoteleriaPK = mspServiciosHoteleriaPK;
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

    public BigInteger getUvr() {
        return uvr;
    }

    public void setUvr(BigInteger uvr) {
        this.uvr = uvr;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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
        hash += (mspServiciosHoteleriaPK != null ? mspServiciosHoteleriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspServiciosHoteleria)) {
            return false;
        }
        MspServiciosHoteleria other = (MspServiciosHoteleria) object;
        if ((this.mspServiciosHoteleriaPK == null && other.mspServiciosHoteleriaPK != null) || (this.mspServiciosHoteleriaPK != null && !this.mspServiciosHoteleriaPK.equals(other.mspServiciosHoteleriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MspServiciosHoteleria[ mspServiciosHoteleriaPK=" + mspServiciosHoteleriaPK + " ]";
    }
    
}
