/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PARTES_ACTIVO")
@NamedQueries({
    @NamedQuery(name = "PartesActivo.findAll", query = "SELECT p FROM PartesActivo p")})
public class PartesActivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartesActivoPK partesActivoPK;
    @Column(name = "CODIGO_PROPIO")
    private String codigoPropio;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CANTIDAD")
    private Short cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;

    public PartesActivo() {
    }

    public PartesActivo(PartesActivoPK partesActivoPK) {
        this.partesActivoPK = partesActivoPK;
    }

    public PartesActivo(String sbgactfjoGrpactfjoEmpCodigo, short actfsbgactfjoGrpactfjoCodigo, short actfactfjognrSbgactfjoCodigo, short actfjoespActfjognrCodigo, short actfjoespCodigo, short codigo) {
        this.partesActivoPK = new PartesActivoPK(sbgactfjoGrpactfjoEmpCodigo, actfsbgactfjoGrpactfjoCodigo, actfactfjognrSbgactfjoCodigo, actfjoespActfjognrCodigo, actfjoespCodigo, codigo);
    }

    public PartesActivoPK getPartesActivoPK() {
        return partesActivoPK;
    }

    public void setPartesActivoPK(PartesActivoPK partesActivoPK) {
        this.partesActivoPK = partesActivoPK;
    }

    public String getCodigoPropio() {
        return codigoPropio;
    }

    public void setCodigoPropio(String codigoPropio) {
        this.codigoPropio = codigoPropio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partesActivoPK != null ? partesActivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartesActivo)) {
            return false;
        }
        PartesActivo other = (PartesActivo) object;
        if ((this.partesActivoPK == null && other.partesActivoPK != null) || (this.partesActivoPK != null && !this.partesActivoPK.equals(other.partesActivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PartesActivo[ partesActivoPK=" + partesActivoPK + " ]";
    }
    
}
