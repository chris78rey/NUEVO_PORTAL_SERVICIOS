/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "TIPO_NOVEDAD")
@NamedQueries({
    @NamedQuery(name = "TipoNovedad.findAll", query = "SELECT t FROM TipoNovedad t")})
public class TipoNovedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPN_IDTIPONOVEDAD")
    private Long tpnIdtiponovedad;
    @Column(name = "TPN_NOVEDAD")
    private String tpnNovedad;
    @Column(name = "TPN_DESCRIPCION")
    private String tpnDescripcion;
    @Column(name = "TPN_USER")
    private String tpnUser;

    public TipoNovedad() {
    }

    public TipoNovedad(Long tpnIdtiponovedad) {
        this.tpnIdtiponovedad = tpnIdtiponovedad;
    }

    public Long getTpnIdtiponovedad() {
        return tpnIdtiponovedad;
    }

    public void setTpnIdtiponovedad(Long tpnIdtiponovedad) {
        this.tpnIdtiponovedad = tpnIdtiponovedad;
    }

    public String getTpnNovedad() {
        return tpnNovedad;
    }

    public void setTpnNovedad(String tpnNovedad) {
        this.tpnNovedad = tpnNovedad;
    }

    public String getTpnDescripcion() {
        return tpnDescripcion;
    }

    public void setTpnDescripcion(String tpnDescripcion) {
        this.tpnDescripcion = tpnDescripcion;
    }

    public String getTpnUser() {
        return tpnUser;
    }

    public void setTpnUser(String tpnUser) {
        this.tpnUser = tpnUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpnIdtiponovedad != null ? tpnIdtiponovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoNovedad)) {
            return false;
        }
        TipoNovedad other = (TipoNovedad) object;
        if ((this.tpnIdtiponovedad == null && other.tpnIdtiponovedad != null) || (this.tpnIdtiponovedad != null && !this.tpnIdtiponovedad.equals(other.tpnIdtiponovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TipoNovedad[ tpnIdtiponovedad=" + tpnIdtiponovedad + " ]";
    }
    
}
