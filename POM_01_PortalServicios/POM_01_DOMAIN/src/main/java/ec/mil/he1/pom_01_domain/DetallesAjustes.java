/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_AJUSTES")
@NamedQueries({
    @NamedQuery(name = "DetallesAjustes.findAll", query = "SELECT d FROM DetallesAjustes d")})
public class DetallesAjustes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesAjustesPK detallesAjustesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "ESTADO")
    private String estado;

    public DetallesAjustes() {
    }

    public DetallesAjustes(DetallesAjustesPK detallesAjustesPK) {
        this.detallesAjustesPK = detallesAjustesPK;
    }

    public DetallesAjustes(long daSecuencia, String itmSbsCodigo, short itmCodigo, String itmSbsSccCodigo, Character itmTipo) {
        this.detallesAjustesPK = new DetallesAjustesPK(daSecuencia, itmSbsCodigo, itmCodigo, itmSbsSccCodigo, itmTipo);
    }

    public DetallesAjustesPK getDetallesAjustesPK() {
        return detallesAjustesPK;
    }

    public void setDetallesAjustesPK(DetallesAjustesPK detallesAjustesPK) {
        this.detallesAjustesPK = detallesAjustesPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesAjustesPK != null ? detallesAjustesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesAjustes)) {
            return false;
        }
        DetallesAjustes other = (DetallesAjustes) object;
        if ((this.detallesAjustesPK == null && other.detallesAjustesPK != null) || (this.detallesAjustesPK != null && !this.detallesAjustesPK.equals(other.detallesAjustesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesAjustes[ detallesAjustesPK=" + detallesAjustesPK + " ]";
    }
    
}
