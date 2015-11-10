/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
public class ProtocolosPacientePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PRT_CODIGO")
    private short prtCodigo;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private int exmNumero;

    public ProtocolosPacientePK() {
    }

    public ProtocolosPacientePK(int pcnNumeroHc, short prtCodigo, Date fecha, int exmNumero) {
        this.pcnNumeroHc = pcnNumeroHc;
        this.prtCodigo = prtCodigo;
        this.fecha = fecha;
        this.exmNumero = exmNumero;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public short getPrtCodigo() {
        return prtCodigo;
    }

    public void setPrtCodigo(short prtCodigo) {
        this.prtCodigo = prtCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(int exmNumero) {
        this.exmNumero = exmNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pcnNumeroHc;
        hash += (int) prtCodigo;
        hash += (fecha != null ? fecha.hashCode() : 0);
        hash += (int) exmNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProtocolosPacientePK)) {
            return false;
        }
        ProtocolosPacientePK other = (ProtocolosPacientePK) object;
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        if (this.prtCodigo != other.prtCodigo) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        if (this.exmNumero != other.exmNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ProtocolosPacientePK[ pcnNumeroHc=" + pcnNumeroHc + ", prtCodigo=" + prtCodigo + ", fecha=" + fecha + ", exmNumero=" + exmNumero + " ]";
    }
    
}
