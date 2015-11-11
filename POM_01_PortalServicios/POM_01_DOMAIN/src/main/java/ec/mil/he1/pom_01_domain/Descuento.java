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
@Table(name = "DESCUENTO")
@NamedQueries({
    @NamedQuery(name = "Descuento.findAll", query = "SELECT d FROM Descuento d")})
public class Descuento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DSC_IDDESCUENTO")
    private Long dscIddescuento;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "CNV_IDNOVEDAD")
    private String cnvIdnovedad;
    @Column(name = "RPG_IDROLPAGOS")
    private Long rpgIdrolpagos;
    @Column(name = "DSC_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dscFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DSC_MONTO")
    private BigDecimal dscMonto;
    @Column(name = "DSC_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dscFechacreacion;
    @Column(name = "DSC_USER")
    private String dscUser;
    @Column(name = "DSC_DESCRIPCION")
    private String dscDescripcion;

    public Descuento() {
    }

    public Descuento(Long dscIddescuento) {
        this.dscIddescuento = dscIddescuento;
    }

    public Long getDscIddescuento() {
        return dscIddescuento;
    }

    public void setDscIddescuento(Long dscIddescuento) {
        this.dscIddescuento = dscIddescuento;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public String getCnvIdnovedad() {
        return cnvIdnovedad;
    }

    public void setCnvIdnovedad(String cnvIdnovedad) {
        this.cnvIdnovedad = cnvIdnovedad;
    }

    public Long getRpgIdrolpagos() {
        return rpgIdrolpagos;
    }

    public void setRpgIdrolpagos(Long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public Date getDscFecha() {
        return dscFecha;
    }

    public void setDscFecha(Date dscFecha) {
        this.dscFecha = dscFecha;
    }

    public BigDecimal getDscMonto() {
        return dscMonto;
    }

    public void setDscMonto(BigDecimal dscMonto) {
        this.dscMonto = dscMonto;
    }

    public Date getDscFechacreacion() {
        return dscFechacreacion;
    }

    public void setDscFechacreacion(Date dscFechacreacion) {
        this.dscFechacreacion = dscFechacreacion;
    }

    public String getDscUser() {
        return dscUser;
    }

    public void setDscUser(String dscUser) {
        this.dscUser = dscUser;
    }

    public String getDscDescripcion() {
        return dscDescripcion;
    }

    public void setDscDescripcion(String dscDescripcion) {
        this.dscDescripcion = dscDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dscIddescuento != null ? dscIddescuento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descuento)) {
            return false;
        }
        Descuento other = (Descuento) object;
        if ((this.dscIddescuento == null && other.dscIddescuento != null) || (this.dscIddescuento != null && !this.dscIddescuento.equals(other.dscIddescuento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Descuento[ dscIddescuento=" + dscIddescuento + " ]";
    }
    
}
