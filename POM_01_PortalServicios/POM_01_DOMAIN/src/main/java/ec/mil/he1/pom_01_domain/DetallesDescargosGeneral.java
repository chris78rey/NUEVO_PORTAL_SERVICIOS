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
@Table(name = "DETALLES_DESCARGOS_GENERAL")
@NamedQueries({
    @NamedQuery(name = "DetallesDescargosGeneral.findAll", query = "SELECT d FROM DetallesDescargosGeneral d")})
public class DetallesDescargosGeneral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DSCGNR_NUMERO")
    private Integer dscgnrNumero;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "DSG_TIPO")
    private String dsgTipo;
    @Column(name = "DSG_CODIGO")
    private String dsgCodigo;
    @Column(name = "TRN_TIPO")
    private String trnTipo;
    @Column(name = "TRN_NUMERO")
    private Integer trnNumero;
    @Column(name = "AGRCRG_CODIGO")
    private String agrcrgCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CANTIDAD_SOLICITADA")
    private BigDecimal cantidadSolicitada;

    public DetallesDescargosGeneral() {
    }

    public DetallesDescargosGeneral(Integer numero) {
        this.numero = numero;
    }

    public Integer getDscgnrNumero() {
        return dscgnrNumero;
    }

    public void setDscgnrNumero(Integer dscgnrNumero) {
        this.dscgnrNumero = dscgnrNumero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDsgTipo() {
        return dsgTipo;
    }

    public void setDsgTipo(String dsgTipo) {
        this.dsgTipo = dsgTipo;
    }

    public String getDsgCodigo() {
        return dsgCodigo;
    }

    public void setDsgCodigo(String dsgCodigo) {
        this.dsgCodigo = dsgCodigo;
    }

    public String getTrnTipo() {
        return trnTipo;
    }

    public void setTrnTipo(String trnTipo) {
        this.trnTipo = trnTipo;
    }

    public Integer getTrnNumero() {
        return trnNumero;
    }

    public void setTrnNumero(Integer trnNumero) {
        this.trnNumero = trnNumero;
    }

    public String getAgrcrgCodigo() {
        return agrcrgCodigo;
    }

    public void setAgrcrgCodigo(String agrcrgCodigo) {
        this.agrcrgCodigo = agrcrgCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(BigDecimal cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
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
        if (!(object instanceof DetallesDescargosGeneral)) {
            return false;
        }
        DetallesDescargosGeneral other = (DetallesDescargosGeneral) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDescargosGeneral[ numero=" + numero + " ]";
    }
    
}
