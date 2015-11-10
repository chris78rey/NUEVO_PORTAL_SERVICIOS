/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CALIFICACIONES_ANUALES")
@NamedQueries({
    @NamedQuery(name = "CalificacionesAnuales.findAll", query = "SELECT c FROM CalificacionesAnuales c")})
public class CalificacionesAnuales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CFA_IDCALIFICACIONANUAL")
    private Long cfaIdcalificacionanual;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "CFA_FECHADESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfaFechadesde;
    @Column(name = "CFA_FECHAHASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfaFechahasta;
    @Column(name = "CFA_CALIFICACION")
    private BigInteger cfaCalificacion;
    @Column(name = "CFA_PORCENTAJE")
    private BigInteger cfaPorcentaje;
    @Column(name = "CFA_USER")
    private String cfaUser;
    @Column(name = "CFA_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfaFechacreacion;
    @JoinColumn(name = "PRD_IDPERIODO", referencedColumnName = "PRD_IDPERIODO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Periodo periodo;

    public CalificacionesAnuales() {
    }

    public CalificacionesAnuales(Long cfaIdcalificacionanual) {
        this.cfaIdcalificacionanual = cfaIdcalificacionanual;
    }

    public Long getCfaIdcalificacionanual() {
        return cfaIdcalificacionanual;
    }

    public void setCfaIdcalificacionanual(Long cfaIdcalificacionanual) {
        this.cfaIdcalificacionanual = cfaIdcalificacionanual;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Date getCfaFechadesde() {
        return cfaFechadesde;
    }

    public void setCfaFechadesde(Date cfaFechadesde) {
        this.cfaFechadesde = cfaFechadesde;
    }

    public Date getCfaFechahasta() {
        return cfaFechahasta;
    }

    public void setCfaFechahasta(Date cfaFechahasta) {
        this.cfaFechahasta = cfaFechahasta;
    }

    public BigInteger getCfaCalificacion() {
        return cfaCalificacion;
    }

    public void setCfaCalificacion(BigInteger cfaCalificacion) {
        this.cfaCalificacion = cfaCalificacion;
    }

    public BigInteger getCfaPorcentaje() {
        return cfaPorcentaje;
    }

    public void setCfaPorcentaje(BigInteger cfaPorcentaje) {
        this.cfaPorcentaje = cfaPorcentaje;
    }

    public String getCfaUser() {
        return cfaUser;
    }

    public void setCfaUser(String cfaUser) {
        this.cfaUser = cfaUser;
    }

    public Date getCfaFechacreacion() {
        return cfaFechacreacion;
    }

    public void setCfaFechacreacion(Date cfaFechacreacion) {
        this.cfaFechacreacion = cfaFechacreacion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfaIdcalificacionanual != null ? cfaIdcalificacionanual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalificacionesAnuales)) {
            return false;
        }
        CalificacionesAnuales other = (CalificacionesAnuales) object;
        if ((this.cfaIdcalificacionanual == null && other.cfaIdcalificacionanual != null) || (this.cfaIdcalificacionanual != null && !this.cfaIdcalificacionanual.equals(other.cfaIdcalificacionanual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CalificacionesAnuales[ cfaIdcalificacionanual=" + cfaIdcalificacionanual + " ]";
    }
    
}
