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
@Table(name = "DETALLES_PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesPromociones.findAll", query = "SELECT d FROM DetallesPromociones d")})
public class DetallesPromociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesPromocionesPK detallesPromocionesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "OBSERVACION")
    private String observacion;

    public DetallesPromociones() {
    }

    public DetallesPromociones(DetallesPromocionesPK detallesPromocionesPK) {
        this.detallesPromocionesPK = detallesPromocionesPK;
    }

    public DetallesPromociones(String prmCodigo, String dprAraCodigo, String dprCodigo) {
        this.detallesPromocionesPK = new DetallesPromocionesPK(prmCodigo, dprAraCodigo, dprCodigo);
    }

    public DetallesPromocionesPK getDetallesPromocionesPK() {
        return detallesPromocionesPK;
    }

    public void setDetallesPromocionesPK(DetallesPromocionesPK detallesPromocionesPK) {
        this.detallesPromocionesPK = detallesPromocionesPK;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesPromocionesPK != null ? detallesPromocionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPromociones)) {
            return false;
        }
        DetallesPromociones other = (DetallesPromociones) object;
        if ((this.detallesPromocionesPK == null && other.detallesPromocionesPK != null) || (this.detallesPromocionesPK != null && !this.detallesPromocionesPK.equals(other.detallesPromocionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesPromociones[ detallesPromocionesPK=" + detallesPromocionesPK + " ]";
    }
    
}
