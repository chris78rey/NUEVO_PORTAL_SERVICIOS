/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "MOVIMIENTOS_PAGOS_ESPECIALES")
@NamedQueries({
    @NamedQuery(name = "MovimientosPagosEspeciales.findAll", query = "SELECT m FROM MovimientosPagosEspeciales m")})
public class MovimientosPagosEspeciales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovimientosPagosEspecialesPK movimientosPagosEspecialesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "OBSERVACION")
    private String observacion;

    public MovimientosPagosEspeciales() {
    }

    public MovimientosPagosEspeciales(MovimientosPagosEspecialesPK movimientosPagosEspecialesPK) {
        this.movimientosPagosEspecialesPK = movimientosPagosEspecialesPK;
    }

    public MovimientosPagosEspeciales(String pagespprmespPrmrolEmpCodigo, String pagespPrmespPrmrolCodigo, String emprolEmpCodigo, int emprolCodigo, int pagespNumero) {
        this.movimientosPagosEspecialesPK = new MovimientosPagosEspecialesPK(pagespprmespPrmrolEmpCodigo, pagespPrmespPrmrolCodigo, emprolEmpCodigo, emprolCodigo, pagespNumero);
    }

    public MovimientosPagosEspecialesPK getMovimientosPagosEspecialesPK() {
        return movimientosPagosEspecialesPK;
    }

    public void setMovimientosPagosEspecialesPK(MovimientosPagosEspecialesPK movimientosPagosEspecialesPK) {
        this.movimientosPagosEspecialesPK = movimientosPagosEspecialesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getDebe() {
        return debe;
    }

    public void setDebe(BigDecimal debe) {
        this.debe = debe;
    }

    public BigDecimal getHaber() {
        return haber;
    }

    public void setHaber(BigDecimal haber) {
        this.haber = haber;
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
        hash += (movimientosPagosEspecialesPK != null ? movimientosPagosEspecialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosPagosEspeciales)) {
            return false;
        }
        MovimientosPagosEspeciales other = (MovimientosPagosEspeciales) object;
        if ((this.movimientosPagosEspecialesPK == null && other.movimientosPagosEspecialesPK != null) || (this.movimientosPagosEspecialesPK != null && !this.movimientosPagosEspecialesPK.equals(other.movimientosPagosEspecialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MovimientosPagosEspeciales[ movimientosPagosEspecialesPK=" + movimientosPagosEspecialesPK + " ]";
    }
    
}
