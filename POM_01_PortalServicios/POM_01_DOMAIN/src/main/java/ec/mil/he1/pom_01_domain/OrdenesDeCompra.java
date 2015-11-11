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
@Table(name = "ORDENES_DE_COMPRA")
@NamedQueries({
    @NamedQuery(name = "OrdenesDeCompra.findAll", query = "SELECT o FROM OrdenesDeCompra o")})
public class OrdenesDeCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "SLCCMP_CODIGO")
    private Integer slccmpCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PRD_CODIGO")
    private Short prdCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public OrdenesDeCompra() {
    }

    public OrdenesDeCompra(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getSlccmpCodigo() {
        return slccmpCodigo;
    }

    public void setSlccmpCodigo(Integer slccmpCodigo) {
        this.slccmpCodigo = slccmpCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(Short prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
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
        if (!(object instanceof OrdenesDeCompra)) {
            return false;
        }
        OrdenesDeCompra other = (OrdenesDeCompra) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.OrdenesDeCompra[ numero=" + numero + " ]";
    }
    
}
