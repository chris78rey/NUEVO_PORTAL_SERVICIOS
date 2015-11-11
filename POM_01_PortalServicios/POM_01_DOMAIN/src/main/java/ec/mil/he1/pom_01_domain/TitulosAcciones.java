/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "TITULOS_ACCIONES")
@NamedQueries({
    @NamedQuery(name = "TitulosAcciones.findAll", query = "SELECT t FROM TitulosAcciones t")})
public class TitulosAcciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ACCION_DESDE")
    private BigInteger accionDesde;
    @Column(name = "ACCION_HASTA")
    private BigInteger accionHasta;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ACC_CODIGO")
    private Integer accCodigo;
    @Column(name = "NTRACC_CODIGO")
    private Integer ntraccCodigo;

    public TitulosAcciones() {
    }

    public TitulosAcciones(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigInteger getAccionDesde() {
        return accionDesde;
    }

    public void setAccionDesde(BigInteger accionDesde) {
        this.accionDesde = accionDesde;
    }

    public BigInteger getAccionHasta() {
        return accionHasta;
    }

    public void setAccionHasta(BigInteger accionHasta) {
        this.accionHasta = accionHasta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getAccCodigo() {
        return accCodigo;
    }

    public void setAccCodigo(Integer accCodigo) {
        this.accCodigo = accCodigo;
    }

    public Integer getNtraccCodigo() {
        return ntraccCodigo;
    }

    public void setNtraccCodigo(Integer ntraccCodigo) {
        this.ntraccCodigo = ntraccCodigo;
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
        if (!(object instanceof TitulosAcciones)) {
            return false;
        }
        TitulosAcciones other = (TitulosAcciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TitulosAcciones[ numero=" + numero + " ]";
    }
    
}
