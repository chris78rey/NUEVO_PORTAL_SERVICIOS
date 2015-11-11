/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_COMPLICACIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesComplicaciones.findAll", query = "SELECT d FROM DetallesComplicaciones d")})
public class DetallesComplicaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "EPC_PRMATN_NUMERO")
    private Integer epcPrmatnNumero;
    @Column(name = "EPC_PRMATN_PCN_NUMERO_HC")
    private Integer epcPrmatnPcnNumeroHc;
    @Column(name = "ENF_CODIGO")
    private String enfCodigo;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PRTOPR_NUMERO")
    private Integer prtoprNumero;
    @Column(name = "PRCMNR_NUMERO")
    private Integer prcmnrNumero;

    public DetallesComplicaciones() {
    }

    public DetallesComplicaciones(Integer numero) {
        this.numero = numero;
    }

    public Integer getEpcPrmatnNumero() {
        return epcPrmatnNumero;
    }

    public void setEpcPrmatnNumero(Integer epcPrmatnNumero) {
        this.epcPrmatnNumero = epcPrmatnNumero;
    }

    public Integer getEpcPrmatnPcnNumeroHc() {
        return epcPrmatnPcnNumeroHc;
    }

    public void setEpcPrmatnPcnNumeroHc(Integer epcPrmatnPcnNumeroHc) {
        this.epcPrmatnPcnNumeroHc = epcPrmatnPcnNumeroHc;
    }

    public String getEnfCodigo() {
        return enfCodigo;
    }

    public void setEnfCodigo(String enfCodigo) {
        this.enfCodigo = enfCodigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPrtoprNumero() {
        return prtoprNumero;
    }

    public void setPrtoprNumero(Integer prtoprNumero) {
        this.prtoprNumero = prtoprNumero;
    }

    public Integer getPrcmnrNumero() {
        return prcmnrNumero;
    }

    public void setPrcmnrNumero(Integer prcmnrNumero) {
        this.prcmnrNumero = prcmnrNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesComplicaciones)) {
            return false;
        }
        DetallesComplicaciones other = (DetallesComplicaciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesComplicaciones[ numero=" + numero + " ]";
    }
    
}
