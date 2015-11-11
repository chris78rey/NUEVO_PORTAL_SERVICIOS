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
@Table(name = "ENTRADAS")
@NamedQueries({
    @NamedQuery(name = "Entradas.findAll", query = "SELECT e FROM Entradas e")})
public class Entradas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENT_IDENTRADA")
    private String entIdentrada;
    @Column(name = "CNV_IDNOVEDAD")
    private String cnvIdnovedad;
    @Column(name = "RPG_IDROLPAGOS")
    private Long rpgIdrolpagos;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "ENT_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ENT_MONTO")
    private BigDecimal entMonto;
    @Column(name = "ENT_DESCRIPCION")
    private String entDescripcion;
    @Column(name = "ENT_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entFechacreacion;
    @Column(name = "ENT_USER")
    private String entUser;

    public Entradas() {
    }

    public Entradas(String entIdentrada) {
        this.entIdentrada = entIdentrada;
    }

    public String getEntIdentrada() {
        return entIdentrada;
    }

    public void setEntIdentrada(String entIdentrada) {
        this.entIdentrada = entIdentrada;
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

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Date getEntFecha() {
        return entFecha;
    }

    public void setEntFecha(Date entFecha) {
        this.entFecha = entFecha;
    }

    public BigDecimal getEntMonto() {
        return entMonto;
    }

    public void setEntMonto(BigDecimal entMonto) {
        this.entMonto = entMonto;
    }

    public String getEntDescripcion() {
        return entDescripcion;
    }

    public void setEntDescripcion(String entDescripcion) {
        this.entDescripcion = entDescripcion;
    }

    public Date getEntFechacreacion() {
        return entFechacreacion;
    }

    public void setEntFechacreacion(Date entFechacreacion) {
        this.entFechacreacion = entFechacreacion;
    }

    public String getEntUser() {
        return entUser;
    }

    public void setEntUser(String entUser) {
        this.entUser = entUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entIdentrada != null ? entIdentrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entradas)) {
            return false;
        }
        Entradas other = (Entradas) object;
        if ((this.entIdentrada == null && other.entIdentrada != null) || (this.entIdentrada != null && !this.entIdentrada.equals(other.entIdentrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Entradas[ entIdentrada=" + entIdentrada + " ]";
    }
    
}
