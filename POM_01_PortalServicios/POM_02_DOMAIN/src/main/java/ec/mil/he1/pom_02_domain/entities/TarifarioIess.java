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
@Table(name = "TARIFARIO_IESS")
@NamedQueries({
    @NamedQuery(name = "TarifarioIess.findAll", query = "SELECT t FROM TarifarioIess t")})
public class TarifarioIess implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarifarioIessPK tarifarioIessPK;
    @Column(name = "CODIGO_GRUPO")
    private String codigoGrupo;
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "UVR")
    private BigInteger uvr;
    @Column(name = "PRC")
    private BigInteger prc;
    @Column(name = "UVR_ANES")
    private BigInteger uvrAnes;
    @Column(name = "PRC_ANES")
    private BigInteger prcAnes;

    public TarifarioIess() {
    }

    public TarifarioIess(TarifarioIessPK tarifarioIessPK) {
        this.tarifarioIessPK = tarifarioIessPK;
    }

    public TarifarioIess(String convenio, String codigoItem) {
        this.tarifarioIessPK = new TarifarioIessPK(convenio, codigoItem);
    }

    public TarifarioIessPK getTarifarioIessPK() {
        return tarifarioIessPK;
    }

    public void setTarifarioIessPK(TarifarioIessPK tarifarioIessPK) {
        this.tarifarioIessPK = tarifarioIessPK;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }

    public BigInteger getUvr() {
        return uvr;
    }

    public void setUvr(BigInteger uvr) {
        this.uvr = uvr;
    }

    public BigInteger getPrc() {
        return prc;
    }

    public void setPrc(BigInteger prc) {
        this.prc = prc;
    }

    public BigInteger getUvrAnes() {
        return uvrAnes;
    }

    public void setUvrAnes(BigInteger uvrAnes) {
        this.uvrAnes = uvrAnes;
    }

    public BigInteger getPrcAnes() {
        return prcAnes;
    }

    public void setPrcAnes(BigInteger prcAnes) {
        this.prcAnes = prcAnes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarifarioIessPK != null ? tarifarioIessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarifarioIess)) {
            return false;
        }
        TarifarioIess other = (TarifarioIess) object;
        if ((this.tarifarioIessPK == null && other.tarifarioIessPK != null) || (this.tarifarioIessPK != null && !this.tarifarioIessPK.equals(other.tarifarioIessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TarifarioIess[ tarifarioIessPK=" + tarifarioIessPK + " ]";
    }
    
}
