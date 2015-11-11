/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "REGULACIONES_FERTILIDAD")
@NamedQueries({
    @NamedQuery(name = "RegulacionesFertilidad.findAll", query = "SELECT r FROM RegulacionesFertilidad r")})
public class RegulacionesFertilidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegulacionesFertilidadPK regulacionesFertilidadPK;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "TIEMPO")
    private Short tiempo;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public RegulacionesFertilidad() {
    }

    public RegulacionesFertilidad(RegulacionesFertilidadPK regulacionesFertilidadPK) {
        this.regulacionesFertilidadPK = regulacionesFertilidadPK;
    }

    public RegulacionesFertilidad(int pcnNumeroHc, int numero) {
        this.regulacionesFertilidadPK = new RegulacionesFertilidadPK(pcnNumeroHc, numero);
    }

    public RegulacionesFertilidadPK getRegulacionesFertilidadPK() {
        return regulacionesFertilidadPK;
    }

    public void setRegulacionesFertilidadPK(RegulacionesFertilidadPK regulacionesFertilidadPK) {
        this.regulacionesFertilidadPK = regulacionesFertilidadPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Short getTiempo() {
        return tiempo;
    }

    public void setTiempo(Short tiempo) {
        this.tiempo = tiempo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regulacionesFertilidadPK != null ? regulacionesFertilidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegulacionesFertilidad)) {
            return false;
        }
        RegulacionesFertilidad other = (RegulacionesFertilidad) object;
        if ((this.regulacionesFertilidadPK == null && other.regulacionesFertilidadPK != null) || (this.regulacionesFertilidadPK != null && !this.regulacionesFertilidadPK.equals(other.regulacionesFertilidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RegulacionesFertilidad[ regulacionesFertilidadPK=" + regulacionesFertilidadPK + " ]";
    }
    
}
