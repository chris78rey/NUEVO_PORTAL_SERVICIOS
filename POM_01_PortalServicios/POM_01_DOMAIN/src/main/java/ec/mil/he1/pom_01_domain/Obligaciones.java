/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "OBLIGACIONES")
@NamedQueries({
    @NamedQuery(name = "Obligaciones.findAll", query = "SELECT o FROM Obligaciones o")})
public class Obligaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OBL_ID")
    private Long oblId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "COMPROBANTE")
    private String comprobante;
    @Column(name = "FACTURA")
    private String factura;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "DEBEE")
    private BigDecimal debee;
    @Column(name = "HABERE")
    private BigDecimal habere;
    @Column(name = "ESTADO")
    private Character estado;
    @Column(name = "TIPO")
    private String tipo;

    public Obligaciones() {
    }

    public Obligaciones(Long oblId) {
        this.oblId = oblId;
    }

    public Long getOblId() {
        return oblId;
    }

    public void setOblId(Long oblId) {
        this.oblId = oblId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
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

    public BigDecimal getDebee() {
        return debee;
    }

    public void setDebee(BigDecimal debee) {
        this.debee = debee;
    }

    public BigDecimal getHabere() {
        return habere;
    }

    public void setHabere(BigDecimal habere) {
        this.habere = habere;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
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
        hash += (oblId != null ? oblId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obligaciones)) {
            return false;
        }
        Obligaciones other = (Obligaciones) object;
        if ((this.oblId == null && other.oblId != null) || (this.oblId != null && !this.oblId.equals(other.oblId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Obligaciones[ oblId=" + oblId + " ]";
    }
    
}
