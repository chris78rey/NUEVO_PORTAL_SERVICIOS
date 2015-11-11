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
@Table(name = "DETALLES_CONTABILIZA_RGLBTC")
@NamedQueries({
    @NamedQuery(name = "DetallesContabilizaRglbtc.findAll", query = "SELECT d FROM DetallesContabilizaRglbtc d")})
public class DetallesContabilizaRglbtc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNTRGLBTC_CNTRGLBTC_ID")
    private Long cntrglbtcCntrglbtcId;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCNTRGL_ID")
    private Long dtlcntrglId;
    @Column(name = "RGLBTC_NUMERO")
    private Integer rglbtcNumero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "CONTABILIZA")
    private Character contabiliza;

    public DetallesContabilizaRglbtc() {
    }

    public DetallesContabilizaRglbtc(Long dtlcntrglId) {
        this.dtlcntrglId = dtlcntrglId;
    }

    public Long getCntrglbtcCntrglbtcId() {
        return cntrglbtcCntrglbtcId;
    }

    public void setCntrglbtcCntrglbtcId(Long cntrglbtcCntrglbtcId) {
        this.cntrglbtcCntrglbtcId = cntrglbtcCntrglbtcId;
    }

    public Long getDtlcntrglId() {
        return dtlcntrglId;
    }

    public void setDtlcntrglId(Long dtlcntrglId) {
        this.dtlcntrglId = dtlcntrglId;
    }

    public Integer getRglbtcNumero() {
        return rglbtcNumero;
    }

    public void setRglbtcNumero(Integer rglbtcNumero) {
        this.rglbtcNumero = rglbtcNumero;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Character getContabiliza() {
        return contabiliza;
    }

    public void setContabiliza(Character contabiliza) {
        this.contabiliza = contabiliza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlcntrglId != null ? dtlcntrglId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesContabilizaRglbtc)) {
            return false;
        }
        DetallesContabilizaRglbtc other = (DetallesContabilizaRglbtc) object;
        if ((this.dtlcntrglId == null && other.dtlcntrglId != null) || (this.dtlcntrglId != null && !this.dtlcntrglId.equals(other.dtlcntrglId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesContabilizaRglbtc[ dtlcntrglId=" + dtlcntrglId + " ]";
    }
    
}
