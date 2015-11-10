/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class AsociacionesTipoDeComprobanPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TPOCMP_CODIGO")
    private String tpocmpCodigo;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;

    public AsociacionesTipoDeComprobanPK() {
    }

    public AsociacionesTipoDeComprobanPK(String tpocmpCodigo, String nombre) {
        this.tpocmpCodigo = tpocmpCodigo;
        this.nombre = nombre;
    }

    public String getTpocmpCodigo() {
        return tpocmpCodigo;
    }

    public void setTpocmpCodigo(String tpocmpCodigo) {
        this.tpocmpCodigo = tpocmpCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpocmpCodigo != null ? tpocmpCodigo.hashCode() : 0);
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsociacionesTipoDeComprobanPK)) {
            return false;
        }
        AsociacionesTipoDeComprobanPK other = (AsociacionesTipoDeComprobanPK) object;
        if ((this.tpocmpCodigo == null && other.tpocmpCodigo != null) || (this.tpocmpCodigo != null && !this.tpocmpCodigo.equals(other.tpocmpCodigo))) {
            return false;
        }
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AsociacionesTipoDeComprobanPK[ tpocmpCodigo=" + tpocmpCodigo + ", nombre=" + nombre + " ]";
    }
    
}
