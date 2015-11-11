/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DETALLES_DESCARGO")
@NamedQueries({
    @NamedQuery(name = "DetallesDescargo.findAll", query = "SELECT d FROM DetallesDescargo d")})
public class DetallesDescargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDescargoPK detallesDescargoPK;
    @Column(name = "CANTIDAD_SOLICITADA")
    private Integer cantidadSolicitada;
    @Column(name = "CANTIDAD_ADMINISTRADA")
    private Integer cantidadAdministrada;
    @Column(name = "FECHA_HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;

    public DetallesDescargo() {
    }

    public DetallesDescargo(DetallesDescargoPK detallesDescargoPK) {
        this.detallesDescargoPK = detallesDescargoPK;
    }

    public DetallesDescargo(int dscbtcNumero, Character itmTipo, short itmCodigo, String itmSbsCodigo, String itmSbsSccCodigo) {
        this.detallesDescargoPK = new DetallesDescargoPK(dscbtcNumero, itmTipo, itmCodigo, itmSbsCodigo, itmSbsSccCodigo);
    }

    public DetallesDescargoPK getDetallesDescargoPK() {
        return detallesDescargoPK;
    }

    public void setDetallesDescargoPK(DetallesDescargoPK detallesDescargoPK) {
        this.detallesDescargoPK = detallesDescargoPK;
    }

    public Integer getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(Integer cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public Integer getCantidadAdministrada() {
        return cantidadAdministrada;
    }

    public void setCantidadAdministrada(Integer cantidadAdministrada) {
        this.cantidadAdministrada = cantidadAdministrada;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDescargoPK != null ? detallesDescargoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDescargo)) {
            return false;
        }
        DetallesDescargo other = (DetallesDescargo) object;
        if ((this.detallesDescargoPK == null && other.detallesDescargoPK != null) || (this.detallesDescargoPK != null && !this.detallesDescargoPK.equals(other.detallesDescargoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDescargo[ detallesDescargoPK=" + detallesDescargoPK + " ]";
    }
    
}
