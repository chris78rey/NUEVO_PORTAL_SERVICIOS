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
@Table(name = "DETALLE_ANTICIPOS")
@NamedQueries({
    @NamedQuery(name = "DetalleAnticipos.findAll", query = "SELECT d FROM DetalleAnticipos d")})
public class DetalleAnticipos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTA_IDDETALLE")
    private Long dtaIddetalle;
    @Column(name = "ANT_IDANTICIPO")
    private Long antIdanticipo;
    @Column(name = "DTA_DESCONTARTIPO")
    private String dtaDescontartipo;
    @Column(name = "DTA_NUMEROCUOTAS")
    private Long dtaNumerocuotas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DTA_VALORTOTAL")
    private BigDecimal dtaValortotal;
    @Column(name = "DTA_VALORDESCONTAR")
    private BigDecimal dtaValordescontar;
    @Column(name = "DTA_SALDO")
    private BigDecimal dtaSaldo;
    @Column(name = "DTA_ESTADO")
    private Character dtaEstado;
    @Column(name = "DTA_USER")
    private String dtaUser;

    public DetalleAnticipos() {
    }

    public DetalleAnticipos(Long dtaIddetalle) {
        this.dtaIddetalle = dtaIddetalle;
    }

    public Long getDtaIddetalle() {
        return dtaIddetalle;
    }

    public void setDtaIddetalle(Long dtaIddetalle) {
        this.dtaIddetalle = dtaIddetalle;
    }

    public Long getAntIdanticipo() {
        return antIdanticipo;
    }

    public void setAntIdanticipo(Long antIdanticipo) {
        this.antIdanticipo = antIdanticipo;
    }

    public String getDtaDescontartipo() {
        return dtaDescontartipo;
    }

    public void setDtaDescontartipo(String dtaDescontartipo) {
        this.dtaDescontartipo = dtaDescontartipo;
    }

    public Long getDtaNumerocuotas() {
        return dtaNumerocuotas;
    }

    public void setDtaNumerocuotas(Long dtaNumerocuotas) {
        this.dtaNumerocuotas = dtaNumerocuotas;
    }

    public BigDecimal getDtaValortotal() {
        return dtaValortotal;
    }

    public void setDtaValortotal(BigDecimal dtaValortotal) {
        this.dtaValortotal = dtaValortotal;
    }

    public BigDecimal getDtaValordescontar() {
        return dtaValordescontar;
    }

    public void setDtaValordescontar(BigDecimal dtaValordescontar) {
        this.dtaValordescontar = dtaValordescontar;
    }

    public BigDecimal getDtaSaldo() {
        return dtaSaldo;
    }

    public void setDtaSaldo(BigDecimal dtaSaldo) {
        this.dtaSaldo = dtaSaldo;
    }

    public Character getDtaEstado() {
        return dtaEstado;
    }

    public void setDtaEstado(Character dtaEstado) {
        this.dtaEstado = dtaEstado;
    }

    public String getDtaUser() {
        return dtaUser;
    }

    public void setDtaUser(String dtaUser) {
        this.dtaUser = dtaUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtaIddetalle != null ? dtaIddetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleAnticipos)) {
            return false;
        }
        DetalleAnticipos other = (DetalleAnticipos) object;
        if ((this.dtaIddetalle == null && other.dtaIddetalle != null) || (this.dtaIddetalle != null && !this.dtaIddetalle.equals(other.dtaIddetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetalleAnticipos[ dtaIddetalle=" + dtaIddetalle + " ]";
    }
    
}
