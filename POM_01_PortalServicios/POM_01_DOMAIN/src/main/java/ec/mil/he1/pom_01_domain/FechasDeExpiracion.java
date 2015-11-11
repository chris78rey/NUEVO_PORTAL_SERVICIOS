/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "FECHAS_DE_EXPIRACION")
@NamedQueries({
    @NamedQuery(name = "FechasDeExpiracion.findAll", query = "SELECT f FROM FechasDeExpiracion f")})
public class FechasDeExpiracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FechasDeExpiracionPK fechasDeExpiracionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "STOCK_ACTUAL")
    private Integer stockActual;
    @Column(name = "NUMERO_INGRESO")
    private Integer numeroIngreso;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;

    public FechasDeExpiracion() {
    }

    public FechasDeExpiracion(FechasDeExpiracionPK fechasDeExpiracionPK) {
        this.fechasDeExpiracionPK = fechasDeExpiracionPK;
    }

    public FechasDeExpiracion(Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo, Date fecha, BigInteger trnid) {
        this.fechasDeExpiracionPK = new FechasDeExpiracionPK(itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo, fecha, trnid);
    }

    public FechasDeExpiracionPK getFechasDeExpiracionPK() {
        return fechasDeExpiracionPK;
    }

    public void setFechasDeExpiracionPK(FechasDeExpiracionPK fechasDeExpiracionPK) {
        this.fechasDeExpiracionPK = fechasDeExpiracionPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getNumeroIngreso() {
        return numeroIngreso;
    }

    public void setNumeroIngreso(Integer numeroIngreso) {
        this.numeroIngreso = numeroIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fechasDeExpiracionPK != null ? fechasDeExpiracionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FechasDeExpiracion)) {
            return false;
        }
        FechasDeExpiracion other = (FechasDeExpiracion) object;
        if ((this.fechasDeExpiracionPK == null && other.fechasDeExpiracionPK != null) || (this.fechasDeExpiracionPK != null && !this.fechasDeExpiracionPK.equals(other.fechasDeExpiracionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FechasDeExpiracion[ fechasDeExpiracionPK=" + fechasDeExpiracionPK + " ]";
    }
    
}
