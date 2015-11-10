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
public class TiposRetencionesSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "ANIO_VALIDEZ_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anioValidezDesde;

    public TiposRetencionesSriPK() {
    }

    public TiposRetencionesSriPK(String codigo, Date anioValidezDesde) {
        this.codigo = codigo;
        this.anioValidezDesde = anioValidezDesde;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getAnioValidezDesde() {
        return anioValidezDesde;
    }

    public void setAnioValidezDesde(Date anioValidezDesde) {
        this.anioValidezDesde = anioValidezDesde;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        hash += (anioValidezDesde != null ? anioValidezDesde.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposRetencionesSriPK)) {
            return false;
        }
        TiposRetencionesSriPK other = (TiposRetencionesSriPK) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        if ((this.anioValidezDesde == null && other.anioValidezDesde != null) || (this.anioValidezDesde != null && !this.anioValidezDesde.equals(other.anioValidezDesde))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposRetencionesSriPK[ codigo=" + codigo + ", anioValidezDesde=" + anioValidezDesde + " ]";
    }
    
}
