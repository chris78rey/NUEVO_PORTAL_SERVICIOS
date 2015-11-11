/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TRANSFUSIONES")
@NamedQueries({
    @NamedQuery(name = "Transfusiones.findAll", query = "SELECT t FROM Transfusiones t")})
public class Transfusiones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "SLCTRN_NUMERO")
    private Integer slctrnNumero;
    @Column(name = "DX_OBSERVACIONES")
    private String dxObservaciones;
    @Column(name = "PRUEBA_CRUZADA")
    private String pruebaCruzada;
    @Column(name = "ESTADO")
    private String estado;

    public Transfusiones() {
    }

    public Transfusiones(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getSlctrnNumero() {
        return slctrnNumero;
    }

    public void setSlctrnNumero(Integer slctrnNumero) {
        this.slctrnNumero = slctrnNumero;
    }

    public String getDxObservaciones() {
        return dxObservaciones;
    }

    public void setDxObservaciones(String dxObservaciones) {
        this.dxObservaciones = dxObservaciones;
    }

    public String getPruebaCruzada() {
        return pruebaCruzada;
    }

    public void setPruebaCruzada(String pruebaCruzada) {
        this.pruebaCruzada = pruebaCruzada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        if (!(object instanceof Transfusiones)) {
            return false;
        }
        Transfusiones other = (Transfusiones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Transfusiones[ numero=" + numero + " ]";
    }
    
}
