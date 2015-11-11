/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class ComportamientosGermenPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ANTBTC_CODIGO")
    private String antbtcCodigo;
    @Basic(optional = false)
    @Column(name = "GRMPRB_DTLEXM_EXM_NUMERO")
    private int grmprbDtlexmExmNumero;
    @Basic(optional = false)
    @Column(name = "GRMPRB_DTLEXM_VRBEXM_CODIGO")
    private int grmprbDtlexmVrbexmCodigo;
    @Basic(optional = false)
    @Column(name = "GRMPRB_GRM_CODIGO")
    private String grmprbGrmCodigo;

    public ComportamientosGermenPK() {
    }

    public ComportamientosGermenPK(String antbtcCodigo, int grmprbDtlexmExmNumero, int grmprbDtlexmVrbexmCodigo, String grmprbGrmCodigo) {
        this.antbtcCodigo = antbtcCodigo;
        this.grmprbDtlexmExmNumero = grmprbDtlexmExmNumero;
        this.grmprbDtlexmVrbexmCodigo = grmprbDtlexmVrbexmCodigo;
        this.grmprbGrmCodigo = grmprbGrmCodigo;
    }

    public String getAntbtcCodigo() {
        return antbtcCodigo;
    }

    public void setAntbtcCodigo(String antbtcCodigo) {
        this.antbtcCodigo = antbtcCodigo;
    }

    public int getGrmprbDtlexmExmNumero() {
        return grmprbDtlexmExmNumero;
    }

    public void setGrmprbDtlexmExmNumero(int grmprbDtlexmExmNumero) {
        this.grmprbDtlexmExmNumero = grmprbDtlexmExmNumero;
    }

    public int getGrmprbDtlexmVrbexmCodigo() {
        return grmprbDtlexmVrbexmCodigo;
    }

    public void setGrmprbDtlexmVrbexmCodigo(int grmprbDtlexmVrbexmCodigo) {
        this.grmprbDtlexmVrbexmCodigo = grmprbDtlexmVrbexmCodigo;
    }

    public String getGrmprbGrmCodigo() {
        return grmprbGrmCodigo;
    }

    public void setGrmprbGrmCodigo(String grmprbGrmCodigo) {
        this.grmprbGrmCodigo = grmprbGrmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (antbtcCodigo != null ? antbtcCodigo.hashCode() : 0);
        hash += (int) grmprbDtlexmExmNumero;
        hash += (int) grmprbDtlexmVrbexmCodigo;
        hash += (grmprbGrmCodigo != null ? grmprbGrmCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComportamientosGermenPK)) {
            return false;
        }
        ComportamientosGermenPK other = (ComportamientosGermenPK) object;
        if ((this.antbtcCodigo == null && other.antbtcCodigo != null) || (this.antbtcCodigo != null && !this.antbtcCodigo.equals(other.antbtcCodigo))) {
            return false;
        }
        if (this.grmprbDtlexmExmNumero != other.grmprbDtlexmExmNumero) {
            return false;
        }
        if (this.grmprbDtlexmVrbexmCodigo != other.grmprbDtlexmVrbexmCodigo) {
            return false;
        }
        if ((this.grmprbGrmCodigo == null && other.grmprbGrmCodigo != null) || (this.grmprbGrmCodigo != null && !this.grmprbGrmCodigo.equals(other.grmprbGrmCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComportamientosGermenPK[ antbtcCodigo=" + antbtcCodigo + ", grmprbDtlexmExmNumero=" + grmprbDtlexmExmNumero + ", grmprbDtlexmVrbexmCodigo=" + grmprbDtlexmVrbexmCodigo + ", grmprbGrmCodigo=" + grmprbGrmCodigo + " ]";
    }
    
}
