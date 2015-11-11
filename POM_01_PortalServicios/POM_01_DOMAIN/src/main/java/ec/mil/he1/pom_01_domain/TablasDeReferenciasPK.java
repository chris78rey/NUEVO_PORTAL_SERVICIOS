/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

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
public class TablasDeReferenciasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODIGO_TABLA")
    private String codigoTabla;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "FECHA_VALIDEZ_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaValidezDesde;

    public TablasDeReferenciasPK() {
    }

    public TablasDeReferenciasPK(String codigoTabla, String codigo, Date fechaValidezDesde) {
        this.codigoTabla = codigoTabla;
        this.codigo = codigo;
        this.fechaValidezDesde = fechaValidezDesde;
    }

    public String getCodigoTabla() {
        return codigoTabla;
    }

    public void setCodigoTabla(String codigoTabla) {
        this.codigoTabla = codigoTabla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaValidezDesde() {
        return fechaValidezDesde;
    }

    public void setFechaValidezDesde(Date fechaValidezDesde) {
        this.fechaValidezDesde = fechaValidezDesde;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoTabla != null ? codigoTabla.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        hash += (fechaValidezDesde != null ? fechaValidezDesde.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablasDeReferenciasPK)) {
            return false;
        }
        TablasDeReferenciasPK other = (TablasDeReferenciasPK) object;
        if ((this.codigoTabla == null && other.codigoTabla != null) || (this.codigoTabla != null && !this.codigoTabla.equals(other.codigoTabla))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        if ((this.fechaValidezDesde == null && other.fechaValidezDesde != null) || (this.fechaValidezDesde != null && !this.fechaValidezDesde.equals(other.fechaValidezDesde))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TablasDeReferenciasPK[ codigoTabla=" + codigoTabla + ", codigo=" + codigo + ", fechaValidezDesde=" + fechaValidezDesde + " ]";
    }
    
}
