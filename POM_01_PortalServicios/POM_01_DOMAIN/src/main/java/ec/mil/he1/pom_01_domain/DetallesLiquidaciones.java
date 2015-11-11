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
@Table(name = "DETALLES_LIQUIDACIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesLiquidaciones.findAll", query = "SELECT d FROM DetallesLiquidaciones d")})
public class DetallesLiquidaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesLiquidacionesPK detallesLiquidacionesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;

    public DetallesLiquidaciones() {
    }

    public DetallesLiquidaciones(DetallesLiquidacionesPK detallesLiquidacionesPK) {
        this.detallesLiquidacionesPK = detallesLiquidacionesPK;
    }

    public DetallesLiquidaciones(int lqdNumero, String prmrolEmpCodigo, String prmrolCodigo) {
        this.detallesLiquidacionesPK = new DetallesLiquidacionesPK(lqdNumero, prmrolEmpCodigo, prmrolCodigo);
    }

    public DetallesLiquidacionesPK getDetallesLiquidacionesPK() {
        return detallesLiquidacionesPK;
    }

    public void setDetallesLiquidacionesPK(DetallesLiquidacionesPK detallesLiquidacionesPK) {
        this.detallesLiquidacionesPK = detallesLiquidacionesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesLiquidacionesPK != null ? detallesLiquidacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesLiquidaciones)) {
            return false;
        }
        DetallesLiquidaciones other = (DetallesLiquidaciones) object;
        if ((this.detallesLiquidacionesPK == null && other.detallesLiquidacionesPK != null) || (this.detallesLiquidacionesPK != null && !this.detallesLiquidacionesPK.equals(other.detallesLiquidacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesLiquidaciones[ detallesLiquidacionesPK=" + detallesLiquidacionesPK + " ]";
    }
    
}
