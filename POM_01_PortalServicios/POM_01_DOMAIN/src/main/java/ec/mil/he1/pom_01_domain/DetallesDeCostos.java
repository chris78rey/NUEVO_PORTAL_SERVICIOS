/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_DE_COSTOS")
@NamedQueries({
    @NamedQuery(name = "DetallesDeCostos.findAll", query = "SELECT d FROM DetallesDeCostos d")})
public class DetallesDeCostos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDeCostosPK detallesDeCostosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_REAL")
    private BigDecimal valorReal;
    @Column(name = "PORCENTAJE")
    private BigInteger porcentaje;
    @Column(name = "VALOR_ESTIMADO")
    private BigDecimal valorEstimado;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ULTIMA_DEPRE")
    private Character ultimaDepre;

    public DetallesDeCostos() {
    }

    public DetallesDeCostos(DetallesDeCostosPK detallesDeCostosPK) {
        this.detallesDeCostosPK = detallesDeCostosPK;
    }

    public DetallesDeCostos(int elmcstprdElmcstNumero, int elmcstprdPrdNumero, String cstCodigo, String agncstTipo, String agncstCodigo) {
        this.detallesDeCostosPK = new DetallesDeCostosPK(elmcstprdElmcstNumero, elmcstprdPrdNumero, cstCodigo, agncstTipo, agncstCodigo);
    }

    public DetallesDeCostosPK getDetallesDeCostosPK() {
        return detallesDeCostosPK;
    }

    public void setDetallesDeCostosPK(DetallesDeCostosPK detallesDeCostosPK) {
        this.detallesDeCostosPK = detallesDeCostosPK;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }

    public BigInteger getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigInteger porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(BigDecimal valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Character getUltimaDepre() {
        return ultimaDepre;
    }

    public void setUltimaDepre(Character ultimaDepre) {
        this.ultimaDepre = ultimaDepre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDeCostosPK != null ? detallesDeCostosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeCostos)) {
            return false;
        }
        DetallesDeCostos other = (DetallesDeCostos) object;
        if ((this.detallesDeCostosPK == null && other.detallesDeCostosPK != null) || (this.detallesDeCostosPK != null && !this.detallesDeCostosPK.equals(other.detallesDeCostosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDeCostos[ detallesDeCostosPK=" + detallesDeCostosPK + " ]";
    }
    
}
