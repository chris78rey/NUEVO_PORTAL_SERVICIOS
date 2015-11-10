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
@Table(name = "MSP_SERVICIO_AMBULANCIAS")
@NamedQueries({
    @NamedQuery(name = "MspServicioAmbulancias.findAll", query = "SELECT m FROM MspServicioAmbulancias m")})
public class MspServicioAmbulancias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspServicioAmbulanciasPK mspServicioAmbulanciasPK;
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
    @Column(name = "UVR")
    private BigInteger uvr;

    public MspServicioAmbulancias() {
    }

    public MspServicioAmbulancias(MspServicioAmbulanciasPK mspServicioAmbulanciasPK) {
        this.mspServicioAmbulanciasPK = mspServicioAmbulanciasPK;
    }

    public MspServicioAmbulancias(String codigoItem, String convenio, String tipo) {
        this.mspServicioAmbulanciasPK = new MspServicioAmbulanciasPK(codigoItem, convenio, tipo);
    }

    public MspServicioAmbulanciasPK getMspServicioAmbulanciasPK() {
        return mspServicioAmbulanciasPK;
    }

    public void setMspServicioAmbulanciasPK(MspServicioAmbulanciasPK mspServicioAmbulanciasPK) {
        this.mspServicioAmbulanciasPK = mspServicioAmbulanciasPK;
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

    public BigInteger getUvr() {
        return uvr;
    }

    public void setUvr(BigInteger uvr) {
        this.uvr = uvr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mspServicioAmbulanciasPK != null ? mspServicioAmbulanciasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspServicioAmbulancias)) {
            return false;
        }
        MspServicioAmbulancias other = (MspServicioAmbulancias) object;
        if ((this.mspServicioAmbulanciasPK == null && other.mspServicioAmbulanciasPK != null) || (this.mspServicioAmbulanciasPK != null && !this.mspServicioAmbulanciasPK.equals(other.mspServicioAmbulanciasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MspServicioAmbulancias[ mspServicioAmbulanciasPK=" + mspServicioAmbulanciasPK + " ]";
    }
    
}
