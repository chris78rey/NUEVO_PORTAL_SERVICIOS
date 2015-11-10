/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ASIENTO_CONTABLE")
@NamedQueries({
    @NamedQuery(name = "AsientoContable.findAll", query = "SELECT a FROM AsientoContable a")})
public class AsientoContable implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsientoContablePK asientoContablePK;
    @Column(name = "ASC_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ascFecha;
    @Column(name = "ASC_CHEQUE")
    private Long ascCheque;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ASC_VALOR")
    private BigDecimal ascValor;
    @Column(name = "ASC_PROCESADO")
    private Character ascProcesado;
    @Column(name = "ASC_MIGRADO")
    private BigInteger ascMigrado;
    @JoinColumn(name = "RPG_IDROLPAGOS", referencedColumnName = "RPG_IDROLPAGOS", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rolpagos rolpagos;

    public AsientoContable() {
    }

    public AsientoContable(AsientoContablePK asientoContablePK) {
        this.asientoContablePK = asientoContablePK;
    }

    public AsientoContable(long ascIdasiento, long rpgIdrolpagos, long prnIdpersonal) {
        this.asientoContablePK = new AsientoContablePK(ascIdasiento, rpgIdrolpagos, prnIdpersonal);
    }

    public AsientoContablePK getAsientoContablePK() {
        return asientoContablePK;
    }

    public void setAsientoContablePK(AsientoContablePK asientoContablePK) {
        this.asientoContablePK = asientoContablePK;
    }

    public Date getAscFecha() {
        return ascFecha;
    }

    public void setAscFecha(Date ascFecha) {
        this.ascFecha = ascFecha;
    }

    public Long getAscCheque() {
        return ascCheque;
    }

    public void setAscCheque(Long ascCheque) {
        this.ascCheque = ascCheque;
    }

    public BigDecimal getAscValor() {
        return ascValor;
    }

    public void setAscValor(BigDecimal ascValor) {
        this.ascValor = ascValor;
    }

    public Character getAscProcesado() {
        return ascProcesado;
    }

    public void setAscProcesado(Character ascProcesado) {
        this.ascProcesado = ascProcesado;
    }

    public BigInteger getAscMigrado() {
        return ascMigrado;
    }

    public void setAscMigrado(BigInteger ascMigrado) {
        this.ascMigrado = ascMigrado;
    }

    public Rolpagos getRolpagos() {
        return rolpagos;
    }

    public void setRolpagos(Rolpagos rolpagos) {
        this.rolpagos = rolpagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asientoContablePK != null ? asientoContablePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsientoContable)) {
            return false;
        }
        AsientoContable other = (AsientoContable) object;
        if ((this.asientoContablePK == null && other.asientoContablePK != null) || (this.asientoContablePK != null && !this.asientoContablePK.equals(other.asientoContablePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AsientoContable[ asientoContablePK=" + asientoContablePK + " ]";
    }
    
}
