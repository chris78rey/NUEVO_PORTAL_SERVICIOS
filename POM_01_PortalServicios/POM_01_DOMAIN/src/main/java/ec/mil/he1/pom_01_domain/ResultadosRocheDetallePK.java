/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class ResultadosRocheDetallePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_CAB")
    private BigInteger idCab;
    @Basic(optional = false)
    @Column(name = "SLC_NUMERO")
    private BigInteger slcNumero;
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private int exmNumero;
    @Basic(optional = false)
    @Column(name = "VRB_CMP_CODIGO")
    private int vrbCmpCodigo;

    public ResultadosRocheDetallePK() {
    }

    public ResultadosRocheDetallePK(BigInteger idCab, BigInteger slcNumero, int exmNumero, int vrbCmpCodigo) {
        this.idCab = idCab;
        this.slcNumero = slcNumero;
        this.exmNumero = exmNumero;
        this.vrbCmpCodigo = vrbCmpCodigo;
    }

    public BigInteger getIdCab() {
        return idCab;
    }

    public void setIdCab(BigInteger idCab) {
        this.idCab = idCab;
    }

    public BigInteger getSlcNumero() {
        return slcNumero;
    }

    public void setSlcNumero(BigInteger slcNumero) {
        this.slcNumero = slcNumero;
    }

    public int getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(int exmNumero) {
        this.exmNumero = exmNumero;
    }

    public int getVrbCmpCodigo() {
        return vrbCmpCodigo;
    }

    public void setVrbCmpCodigo(int vrbCmpCodigo) {
        this.vrbCmpCodigo = vrbCmpCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCab != null ? idCab.hashCode() : 0);
        hash += (slcNumero != null ? slcNumero.hashCode() : 0);
        hash += (int) exmNumero;
        hash += (int) vrbCmpCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadosRocheDetallePK)) {
            return false;
        }
        ResultadosRocheDetallePK other = (ResultadosRocheDetallePK) object;
        if ((this.idCab == null && other.idCab != null) || (this.idCab != null && !this.idCab.equals(other.idCab))) {
            return false;
        }
        if ((this.slcNumero == null && other.slcNumero != null) || (this.slcNumero != null && !this.slcNumero.equals(other.slcNumero))) {
            return false;
        }
        if (this.exmNumero != other.exmNumero) {
            return false;
        }
        if (this.vrbCmpCodigo != other.vrbCmpCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ResultadosRocheDetallePK[ idCab=" + idCab + ", slcNumero=" + slcNumero + ", exmNumero=" + exmNumero + ", vrbCmpCodigo=" + vrbCmpCodigo + " ]";
    }
    
}
