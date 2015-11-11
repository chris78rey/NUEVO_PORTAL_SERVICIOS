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
public class SolicitudesRocheDetallePK implements Serializable {
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
    @Column(name = "SECUENCIAL")
    private BigInteger secuencial;
    @Basic(optional = false)
    @Column(name = "VRBEXM_CODIGO")
    private int vrbexmCodigo;

    public SolicitudesRocheDetallePK() {
    }

    public SolicitudesRocheDetallePK(BigInteger idCab, BigInteger slcNumero, int exmNumero, BigInteger secuencial, int vrbexmCodigo) {
        this.idCab = idCab;
        this.slcNumero = slcNumero;
        this.exmNumero = exmNumero;
        this.secuencial = secuencial;
        this.vrbexmCodigo = vrbexmCodigo;
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

    public BigInteger getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(BigInteger secuencial) {
        this.secuencial = secuencial;
    }

    public int getVrbexmCodigo() {
        return vrbexmCodigo;
    }

    public void setVrbexmCodigo(int vrbexmCodigo) {
        this.vrbexmCodigo = vrbexmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCab != null ? idCab.hashCode() : 0);
        hash += (slcNumero != null ? slcNumero.hashCode() : 0);
        hash += (int) exmNumero;
        hash += (secuencial != null ? secuencial.hashCode() : 0);
        hash += (int) vrbexmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudesRocheDetallePK)) {
            return false;
        }
        SolicitudesRocheDetallePK other = (SolicitudesRocheDetallePK) object;
        if ((this.idCab == null && other.idCab != null) || (this.idCab != null && !this.idCab.equals(other.idCab))) {
            return false;
        }
        if ((this.slcNumero == null && other.slcNumero != null) || (this.slcNumero != null && !this.slcNumero.equals(other.slcNumero))) {
            return false;
        }
        if (this.exmNumero != other.exmNumero) {
            return false;
        }
        if ((this.secuencial == null && other.secuencial != null) || (this.secuencial != null && !this.secuencial.equals(other.secuencial))) {
            return false;
        }
        if (this.vrbexmCodigo != other.vrbexmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SolicitudesRocheDetallePK[ idCab=" + idCab + ", slcNumero=" + slcNumero + ", exmNumero=" + exmNumero + ", secuencial=" + secuencial + ", vrbexmCodigo=" + vrbexmCodigo + " ]";
    }
    
}
