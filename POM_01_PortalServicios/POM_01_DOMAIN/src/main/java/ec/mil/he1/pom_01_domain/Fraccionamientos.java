/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "FRACCIONAMIENTOS")
@NamedQueries({
    @NamedQuery(name = "Fraccionamientos.findAll", query = "SELECT f FROM Fraccionamientos f")})
public class Fraccionamientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FraccionamientosPK fraccionamientosPK;
    @Column(name = "FRN_CODIGO")
    private String frnCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "VOLUMEN_FRACCION")
    private BigInteger volumenFraccion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "OBSERVACION")
    private String observacion;

    public Fraccionamientos() {
    }

    public Fraccionamientos(FraccionamientosPK fraccionamientosPK) {
        this.fraccionamientosPK = fraccionamientosPK;
    }

    public Fraccionamientos(String undNumero, String numeroFraccion) {
        this.fraccionamientosPK = new FraccionamientosPK(undNumero, numeroFraccion);
    }

    public FraccionamientosPK getFraccionamientosPK() {
        return fraccionamientosPK;
    }

    public void setFraccionamientosPK(FraccionamientosPK fraccionamientosPK) {
        this.fraccionamientosPK = fraccionamientosPK;
    }

    public String getFrnCodigo() {
        return frnCodigo;
    }

    public void setFrnCodigo(String frnCodigo) {
        this.frnCodigo = frnCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigInteger getVolumenFraccion() {
        return volumenFraccion;
    }

    public void setVolumenFraccion(BigInteger volumenFraccion) {
        this.volumenFraccion = volumenFraccion;
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
        hash += (fraccionamientosPK != null ? fraccionamientosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fraccionamientos)) {
            return false;
        }
        Fraccionamientos other = (Fraccionamientos) object;
        if ((this.fraccionamientosPK == null && other.fraccionamientosPK != null) || (this.fraccionamientosPK != null && !this.fraccionamientosPK.equals(other.fraccionamientosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Fraccionamientos[ fraccionamientosPK=" + fraccionamientosPK + " ]";
    }
    
}
