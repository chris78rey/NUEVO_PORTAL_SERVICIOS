/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_DESCUENTO")
@NamedQueries({
    @NamedQuery(name = "DetallesDescuento.findAll", query = "SELECT d FROM DetallesDescuento d")})
public class DetallesDescuento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLDSC_ID")
    private Long dtldscId;
    @Column(name = "DSCGNR_NUMERO")
    private Long dscgnrNumero;
    @Column(name = "DTLFCT_NUMERO")
    private Long dtlfctNumero;
    @Column(name = "DTLFCT_FCT_NUMERO")
    private Integer dtlfctFctNumero;
    @Column(name = "DTLFCT_DETALLE")
    private Integer dtlfctDetalle;
    @Column(name = "DTLFCT_DOCUMENTO")
    private Character dtlfctDocumento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "VALORE")
    private BigDecimal valore;

    public DetallesDescuento() {
    }

    public DetallesDescuento(Long dtldscId) {
        this.dtldscId = dtldscId;
    }

    public Long getDtldscId() {
        return dtldscId;
    }

    public void setDtldscId(Long dtldscId) {
        this.dtldscId = dtldscId;
    }

    public Long getDscgnrNumero() {
        return dscgnrNumero;
    }

    public void setDscgnrNumero(Long dscgnrNumero) {
        this.dscgnrNumero = dscgnrNumero;
    }

    public Long getDtlfctNumero() {
        return dtlfctNumero;
    }

    public void setDtlfctNumero(Long dtlfctNumero) {
        this.dtlfctNumero = dtlfctNumero;
    }

    public Integer getDtlfctFctNumero() {
        return dtlfctFctNumero;
    }

    public void setDtlfctFctNumero(Integer dtlfctFctNumero) {
        this.dtlfctFctNumero = dtlfctFctNumero;
    }

    public Integer getDtlfctDetalle() {
        return dtlfctDetalle;
    }

    public void setDtlfctDetalle(Integer dtlfctDetalle) {
        this.dtlfctDetalle = dtlfctDetalle;
    }

    public Character getDtlfctDocumento() {
        return dtlfctDocumento;
    }

    public void setDtlfctDocumento(Character dtlfctDocumento) {
        this.dtlfctDocumento = dtlfctDocumento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValore() {
        return valore;
    }

    public void setValore(BigDecimal valore) {
        this.valore = valore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtldscId != null ? dtldscId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDescuento)) {
            return false;
        }
        DetallesDescuento other = (DetallesDescuento) object;
        if ((this.dtldscId == null && other.dtldscId != null) || (this.dtldscId != null && !this.dtldscId.equals(other.dtldscId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDescuento[ dtldscId=" + dtldscId + " ]";
    }
    
}
