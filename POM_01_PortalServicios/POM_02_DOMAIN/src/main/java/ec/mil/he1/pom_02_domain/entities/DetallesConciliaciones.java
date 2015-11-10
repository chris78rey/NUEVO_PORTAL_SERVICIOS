/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DETALLES_CONCILIACIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesConciliaciones.findAll", query = "SELECT d FROM DetallesConciliaciones d")})
public class DetallesConciliaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNCBNC_NUMERO")
    private Integer cncbncNumero;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "TIPO_MOVIMIENTO")
    private String tipoMovimiento;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PERTENENCIA")
    private String pertenencia;

    public DetallesConciliaciones() {
    }

    public DetallesConciliaciones(Integer numero) {
        this.numero = numero;
    }

    public Integer getCncbncNumero() {
        return cncbncNumero;
    }

    public void setCncbncNumero(Integer cncbncNumero) {
        this.cncbncNumero = cncbncNumero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getDebe() {
        return debe;
    }

    public void setDebe(BigDecimal debe) {
        this.debe = debe;
    }

    public BigDecimal getHaber() {
        return haber;
    }

    public void setHaber(BigDecimal haber) {
        this.haber = haber;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(String pertenencia) {
        this.pertenencia = pertenencia;
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
        if (!(object instanceof DetallesConciliaciones)) {
            return false;
        }
        DetallesConciliaciones other = (DetallesConciliaciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesConciliaciones[ numero=" + numero + " ]";
    }
    
}
