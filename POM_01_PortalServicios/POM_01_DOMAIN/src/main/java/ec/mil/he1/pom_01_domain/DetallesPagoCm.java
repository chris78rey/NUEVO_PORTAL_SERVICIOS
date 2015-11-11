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
@Table(name = "DETALLES_PAGO_CM")
@NamedQueries({
    @NamedQuery(name = "DetallesPagoCm.findAll", query = "SELECT d FROM DetallesPagoCm d")})
public class DetallesPagoCm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesPagoCmPK detallesPagoCmPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public DetallesPagoCm() {
    }

    public DetallesPagoCm(DetallesPagoCmPK detallesPagoCmPK) {
        this.detallesPagoCmPK = detallesPagoCmPK;
    }

    public DetallesPagoCm(int pgsCmNumero, int dtlhnrmdcNumero) {
        this.detallesPagoCmPK = new DetallesPagoCmPK(pgsCmNumero, dtlhnrmdcNumero);
    }

    public DetallesPagoCmPK getDetallesPagoCmPK() {
        return detallesPagoCmPK;
    }

    public void setDetallesPagoCmPK(DetallesPagoCmPK detallesPagoCmPK) {
        this.detallesPagoCmPK = detallesPagoCmPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesPagoCmPK != null ? detallesPagoCmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPagoCm)) {
            return false;
        }
        DetallesPagoCm other = (DetallesPagoCm) object;
        if ((this.detallesPagoCmPK == null && other.detallesPagoCmPK != null) || (this.detallesPagoCmPK != null && !this.detallesPagoCmPK.equals(other.detallesPagoCmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesPagoCm[ detallesPagoCmPK=" + detallesPagoCmPK + " ]";
    }
    
}
