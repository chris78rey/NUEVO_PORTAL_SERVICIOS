/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "VENTAS_ESTABLECIMIENTOS")
@NamedQueries({
    @NamedQuery(name = "VentasEstablecimientos.findAll", query = "SELECT v FROM VentasEstablecimientos v")})
public class VentasEstablecimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VentasEstablecimientosPK ventasEstablecimientosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @JoinColumns({
        @JoinColumn(name = "IVA_PERIODO", referencedColumnName = "PERIODO", insertable = false, updatable = false),
        @JoinColumn(name = "IVA_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Iva iva;

    public VentasEstablecimientos() {
    }

    public VentasEstablecimientos(VentasEstablecimientosPK ventasEstablecimientosPK) {
        this.ventasEstablecimientosPK = ventasEstablecimientosPK;
    }

    public VentasEstablecimientos(String ivaEmpCodigo, String codigo, String ivaPeriodo) {
        this.ventasEstablecimientosPK = new VentasEstablecimientosPK(ivaEmpCodigo, codigo, ivaPeriodo);
    }

    public VentasEstablecimientosPK getVentasEstablecimientosPK() {
        return ventasEstablecimientosPK;
    }

    public void setVentasEstablecimientosPK(VentasEstablecimientosPK ventasEstablecimientosPK) {
        this.ventasEstablecimientosPK = ventasEstablecimientosPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Iva getIva() {
        return iva;
    }

    public void setIva(Iva iva) {
        this.iva = iva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventasEstablecimientosPK != null ? ventasEstablecimientosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentasEstablecimientos)) {
            return false;
        }
        VentasEstablecimientos other = (VentasEstablecimientos) object;
        if ((this.ventasEstablecimientosPK == null && other.ventasEstablecimientosPK != null) || (this.ventasEstablecimientosPK != null && !this.ventasEstablecimientosPK.equals(other.ventasEstablecimientosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.VentasEstablecimientos[ ventasEstablecimientosPK=" + ventasEstablecimientosPK + " ]";
    }
    
}
