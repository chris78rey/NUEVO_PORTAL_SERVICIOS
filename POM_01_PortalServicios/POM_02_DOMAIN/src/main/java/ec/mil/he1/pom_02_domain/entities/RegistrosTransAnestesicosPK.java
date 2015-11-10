/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class RegistrosTransAnestesicosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RGSOPR_PRTOPRSLC_NUMERO")
    private int rgsoprPrtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "RGSOPR_PRTOPRSLC_PCN_NUMERO_HC")
    private int rgsoprPrtoprslcPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "FILA")
    private short fila;
    @Basic(optional = false)
    @Column(name = "COLUMNA")
    private short columna;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public RegistrosTransAnestesicosPK() {
    }

    public RegistrosTransAnestesicosPK(int rgsoprPrtoprslcNumero, int rgsoprPrtoprslcPcnNumeroHc, short fila, short columna, String tipo) {
        this.rgsoprPrtoprslcNumero = rgsoprPrtoprslcNumero;
        this.rgsoprPrtoprslcPcnNumeroHc = rgsoprPrtoprslcPcnNumeroHc;
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }

    public int getRgsoprPrtoprslcNumero() {
        return rgsoprPrtoprslcNumero;
    }

    public void setRgsoprPrtoprslcNumero(int rgsoprPrtoprslcNumero) {
        this.rgsoprPrtoprslcNumero = rgsoprPrtoprslcNumero;
    }

    public int getRgsoprPrtoprslcPcnNumeroHc() {
        return rgsoprPrtoprslcPcnNumeroHc;
    }

    public void setRgsoprPrtoprslcPcnNumeroHc(int rgsoprPrtoprslcPcnNumeroHc) {
        this.rgsoprPrtoprslcPcnNumeroHc = rgsoprPrtoprslcPcnNumeroHc;
    }

    public short getFila() {
        return fila;
    }

    public void setFila(short fila) {
        this.fila = fila;
    }

    public short getColumna() {
        return columna;
    }

    public void setColumna(short columna) {
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rgsoprPrtoprslcNumero;
        hash += (int) rgsoprPrtoprslcPcnNumeroHc;
        hash += (int) fila;
        hash += (int) columna;
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosTransAnestesicosPK)) {
            return false;
        }
        RegistrosTransAnestesicosPK other = (RegistrosTransAnestesicosPK) object;
        if (this.rgsoprPrtoprslcNumero != other.rgsoprPrtoprslcNumero) {
            return false;
        }
        if (this.rgsoprPrtoprslcPcnNumeroHc != other.rgsoprPrtoprslcPcnNumeroHc) {
            return false;
        }
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RegistrosTransAnestesicosPK[ rgsoprPrtoprslcNumero=" + rgsoprPrtoprslcNumero + ", rgsoprPrtoprslcPcnNumeroHc=" + rgsoprPrtoprslcPcnNumeroHc + ", fila=" + fila + ", columna=" + columna + ", tipo=" + tipo + " ]";
    }
    
}
