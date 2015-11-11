/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class FechasDeExpiracionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_CODIGO")
    private short itmCodigo;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "TRNID")
    private BigInteger trnid;

    public FechasDeExpiracionPK() {
    }

    public FechasDeExpiracionPK(Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo, Date fecha, BigInteger trnid) {
        this.itmTipo = itmTipo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmCodigo = itmCodigo;
        this.fecha = fecha;
        this.trnid = trnid;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigInteger getTrnid() {
        return trnid;
    }

    public void setTrnid(BigInteger trnid) {
        this.trnid = trnid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (int) itmCodigo;
        hash += (fecha != null ? fecha.hashCode() : 0);
        hash += (trnid != null ? trnid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FechasDeExpiracionPK)) {
            return false;
        }
        FechasDeExpiracionPK other = (FechasDeExpiracionPK) object;
        if ((this.itmTipo == null && other.itmTipo != null) || (this.itmTipo != null && !this.itmTipo.equals(other.itmTipo))) {
            return false;
        }
        if ((this.itmSbsSccCodigo == null && other.itmSbsSccCodigo != null) || (this.itmSbsSccCodigo != null && !this.itmSbsSccCodigo.equals(other.itmSbsSccCodigo))) {
            return false;
        }
        if ((this.itmSbsCodigo == null && other.itmSbsCodigo != null) || (this.itmSbsCodigo != null && !this.itmSbsCodigo.equals(other.itmSbsCodigo))) {
            return false;
        }
        if (this.itmCodigo != other.itmCodigo) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        if ((this.trnid == null && other.trnid != null) || (this.trnid != null && !this.trnid.equals(other.trnid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FechasDeExpiracionPK[ itmTipo=" + itmTipo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + ", itmSbsCodigo=" + itmSbsCodigo + ", itmCodigo=" + itmCodigo + ", fecha=" + fecha + ", trnid=" + trnid + " ]";
    }
    
}
