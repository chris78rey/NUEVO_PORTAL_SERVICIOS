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
public class CalendariosProcedimientosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNSPRC_CODIGO")
    private String cnsprcCodigo;
    @Basic(optional = false)
    @Column(name = "ESP_CODIGO")
    private String espCodigo;
    @Basic(optional = false)
    @Column(name = "COD_JORNADA")
    private short codJornada;
    @Basic(optional = false)
    @Column(name = "DIA")
    private String dia;

    public CalendariosProcedimientosPK() {
    }

    public CalendariosProcedimientosPK(String cnsprcCodigo, String espCodigo, short codJornada, String dia) {
        this.cnsprcCodigo = cnsprcCodigo;
        this.espCodigo = espCodigo;
        this.codJornada = codJornada;
        this.dia = dia;
    }

    public String getCnsprcCodigo() {
        return cnsprcCodigo;
    }

    public void setCnsprcCodigo(String cnsprcCodigo) {
        this.cnsprcCodigo = cnsprcCodigo;
    }

    public String getEspCodigo() {
        return espCodigo;
    }

    public void setEspCodigo(String espCodigo) {
        this.espCodigo = espCodigo;
    }

    public short getCodJornada() {
        return codJornada;
    }

    public void setCodJornada(short codJornada) {
        this.codJornada = codJornada;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnsprcCodigo != null ? cnsprcCodigo.hashCode() : 0);
        hash += (espCodigo != null ? espCodigo.hashCode() : 0);
        hash += (int) codJornada;
        hash += (dia != null ? dia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalendariosProcedimientosPK)) {
            return false;
        }
        CalendariosProcedimientosPK other = (CalendariosProcedimientosPK) object;
        if ((this.cnsprcCodigo == null && other.cnsprcCodigo != null) || (this.cnsprcCodigo != null && !this.cnsprcCodigo.equals(other.cnsprcCodigo))) {
            return false;
        }
        if ((this.espCodigo == null && other.espCodigo != null) || (this.espCodigo != null && !this.espCodigo.equals(other.espCodigo))) {
            return false;
        }
        if (this.codJornada != other.codJornada) {
            return false;
        }
        if ((this.dia == null && other.dia != null) || (this.dia != null && !this.dia.equals(other.dia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CalendariosProcedimientosPK[ cnsprcCodigo=" + cnsprcCodigo + ", espCodigo=" + espCodigo + ", codJornada=" + codJornada + ", dia=" + dia + " ]";
    }
    
}
