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
@Table(name = "DETALLES_INSUMOS")
@NamedQueries({
    @NamedQuery(name = "DetallesInsumos.findAll", query = "SELECT d FROM DetallesInsumos d")})
public class DetallesInsumos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesInsumosPK detallesInsumosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "ESTADO")
    private String estado;

    public DetallesInsumos() {
    }

    public DetallesInsumos(DetallesInsumosPK detallesInsumosPK) {
        this.detallesInsumosPK = detallesInsumosPK;
    }

    public DetallesInsumos(int slcinsNumero, Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo) {
        this.detallesInsumosPK = new DetallesInsumosPK(slcinsNumero, itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo);
    }

    public DetallesInsumosPK getDetallesInsumosPK() {
        return detallesInsumosPK;
    }

    public void setDetallesInsumosPK(DetallesInsumosPK detallesInsumosPK) {
        this.detallesInsumosPK = detallesInsumosPK;
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
        hash += (detallesInsumosPK != null ? detallesInsumosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesInsumos)) {
            return false;
        }
        DetallesInsumos other = (DetallesInsumos) object;
        if ((this.detallesInsumosPK == null && other.detallesInsumosPK != null) || (this.detallesInsumosPK != null && !this.detallesInsumosPK.equals(other.detallesInsumosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesInsumos[ detallesInsumosPK=" + detallesInsumosPK + " ]";
    }
    
}
