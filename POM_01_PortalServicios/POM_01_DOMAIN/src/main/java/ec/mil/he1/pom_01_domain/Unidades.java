/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "UNIDADES")
@NamedQueries({
    @NamedQuery(name = "Unidades.findAll", query = "SELECT u FROM Unidades u")})
public class Unidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DNC_DNN_NUMERO")
    private Integer dncDnnNumero;
    @Column(name = "DNC_NUMERO_DONACION")
    private Integer dncNumeroDonacion;
    @Column(name = "ABO_D")
    private String aboD;
    @Column(name = "GRI_RH")
    private String griRh;
    @Column(name = "VOLUMEN_ACTUAL")
    private BigInteger volumenActual;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "OBSERVACION")
    private String observacion;

    public Unidades() {
    }

    public Unidades(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getDncDnnNumero() {
        return dncDnnNumero;
    }

    public void setDncDnnNumero(Integer dncDnnNumero) {
        this.dncDnnNumero = dncDnnNumero;
    }

    public Integer getDncNumeroDonacion() {
        return dncNumeroDonacion;
    }

    public void setDncNumeroDonacion(Integer dncNumeroDonacion) {
        this.dncNumeroDonacion = dncNumeroDonacion;
    }

    public String getAboD() {
        return aboD;
    }

    public void setAboD(String aboD) {
        this.aboD = aboD;
    }

    public String getGriRh() {
        return griRh;
    }

    public void setGriRh(String griRh) {
        this.griRh = griRh;
    }

    public BigInteger getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(BigInteger volumenActual) {
        this.volumenActual = volumenActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidades)) {
            return false;
        }
        Unidades other = (Unidades) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Unidades[ numero=" + numero + " ]";
    }
    
}
