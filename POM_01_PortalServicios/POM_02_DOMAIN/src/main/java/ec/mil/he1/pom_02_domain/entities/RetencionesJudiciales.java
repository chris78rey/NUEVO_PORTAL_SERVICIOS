/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "RETENCIONES_JUDICIALES")
@NamedQueries({
    @NamedQuery(name = "RetencionesJudiciales.findAll", query = "SELECT r FROM RetencionesJudiciales r")})
public class RetencionesJudiciales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RTJ_IDRETENCION")
    private Long rtjIdretencion;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RTJ_VALOR")
    private BigDecimal rtjValor;
    @Column(name = "RTJ_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rtjFecha;
    @Column(name = "RTJ_ESTADO")
    private Character rtjEstado;
    @Column(name = "RTJ_OBSERVACIONES")
    private String rtjObservaciones;
    @Column(name = "RTJ_USER")
    private String rtjUser;

    public RetencionesJudiciales() {
    }

    public RetencionesJudiciales(Long rtjIdretencion) {
        this.rtjIdretencion = rtjIdretencion;
    }

    public Long getRtjIdretencion() {
        return rtjIdretencion;
    }

    public void setRtjIdretencion(Long rtjIdretencion) {
        this.rtjIdretencion = rtjIdretencion;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public BigDecimal getRtjValor() {
        return rtjValor;
    }

    public void setRtjValor(BigDecimal rtjValor) {
        this.rtjValor = rtjValor;
    }

    public Date getRtjFecha() {
        return rtjFecha;
    }

    public void setRtjFecha(Date rtjFecha) {
        this.rtjFecha = rtjFecha;
    }

    public Character getRtjEstado() {
        return rtjEstado;
    }

    public void setRtjEstado(Character rtjEstado) {
        this.rtjEstado = rtjEstado;
    }

    public String getRtjObservaciones() {
        return rtjObservaciones;
    }

    public void setRtjObservaciones(String rtjObservaciones) {
        this.rtjObservaciones = rtjObservaciones;
    }

    public String getRtjUser() {
        return rtjUser;
    }

    public void setRtjUser(String rtjUser) {
        this.rtjUser = rtjUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rtjIdretencion != null ? rtjIdretencion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesJudiciales)) {
            return false;
        }
        RetencionesJudiciales other = (RetencionesJudiciales) object;
        if ((this.rtjIdretencion == null && other.rtjIdretencion != null) || (this.rtjIdretencion != null && !this.rtjIdretencion.equals(other.rtjIdretencion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RetencionesJudiciales[ rtjIdretencion=" + rtjIdretencion + " ]";
    }
    
}
