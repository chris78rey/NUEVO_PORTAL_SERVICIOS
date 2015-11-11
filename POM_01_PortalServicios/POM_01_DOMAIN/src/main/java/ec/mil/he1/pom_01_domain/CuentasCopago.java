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
@Table(name = "CUENTAS_COPAGO")
@NamedQueries({
    @NamedQuery(name = "CuentasCopago.findAll", query = "SELECT c FROM CuentasCopago c")})
public class CuentasCopago implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentasCopagoPK cuentasCopagoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "PLA_PLANILLA_ANTERIOR")
    private Integer plaPlanillaAnterior;
    @Column(name = "CREADO_POR")
    private String creadoPor;

    public CuentasCopago() {
    }

    public CuentasCopago(CuentasCopagoPK cuentasCopagoPK) {
        this.cuentasCopagoPK = cuentasCopagoPK;
    }

    public CuentasCopago(String cntsDocumento, long cntsNumero, long cntsDetalle, BigInteger cpgpcnCpgpcnId) {
        this.cuentasCopagoPK = new CuentasCopagoPK(cntsDocumento, cntsNumero, cntsDetalle, cpgpcnCpgpcnId);
    }

    public CuentasCopagoPK getCuentasCopagoPK() {
        return cuentasCopagoPK;
    }

    public void setCuentasCopagoPK(CuentasCopagoPK cuentasCopagoPK) {
        this.cuentasCopagoPK = cuentasCopagoPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getPlaPlanillaAnterior() {
        return plaPlanillaAnterior;
    }

    public void setPlaPlanillaAnterior(Integer plaPlanillaAnterior) {
        this.plaPlanillaAnterior = plaPlanillaAnterior;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentasCopagoPK != null ? cuentasCopagoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasCopago)) {
            return false;
        }
        CuentasCopago other = (CuentasCopago) object;
        if ((this.cuentasCopagoPK == null && other.cuentasCopagoPK != null) || (this.cuentasCopagoPK != null && !this.cuentasCopagoPK.equals(other.cuentasCopagoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CuentasCopago[ cuentasCopagoPK=" + cuentasCopagoPK + " ]";
    }
    
}
