/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

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
@Table(name = "PERSONAL_CARGO")
@NamedQueries({
    @NamedQuery(name = "PersonalCargo.findAll", query = "SELECT p FROM PersonalCargo p")})
public class PersonalCargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PNC_IDPERSONALCARGO")
    private Long pncIdpersonalcargo;
    @Column(name = "CCG_IDCATEGORIACARGO")
    private String ccgIdcategoriacargo;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "PNC_FECHADESDES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pncFechadesdes;
    @Column(name = "PNC_FECHAHASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pncFechahasta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PNC_REMUNERACION")
    private BigDecimal pncRemuneracion;
    @Column(name = "PNC_ESTADO")
    private Character pncEstado;
    @Column(name = "PNC_DESCRIPCION")
    private String pncDescripcion;
    @Column(name = "PCN_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pcnFechacreacion;
    @Column(name = "PCN_USER")
    private String pcnUser;
    @Column(name = "PNC_TIPO")
    private String pncTipo;

    public PersonalCargo() {
    }

    public PersonalCargo(Long pncIdpersonalcargo) {
        this.pncIdpersonalcargo = pncIdpersonalcargo;
    }

    public Long getPncIdpersonalcargo() {
        return pncIdpersonalcargo;
    }

    public void setPncIdpersonalcargo(Long pncIdpersonalcargo) {
        this.pncIdpersonalcargo = pncIdpersonalcargo;
    }

    public String getCcgIdcategoriacargo() {
        return ccgIdcategoriacargo;
    }

    public void setCcgIdcategoriacargo(String ccgIdcategoriacargo) {
        this.ccgIdcategoriacargo = ccgIdcategoriacargo;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Date getPncFechadesdes() {
        return pncFechadesdes;
    }

    public void setPncFechadesdes(Date pncFechadesdes) {
        this.pncFechadesdes = pncFechadesdes;
    }

    public Date getPncFechahasta() {
        return pncFechahasta;
    }

    public void setPncFechahasta(Date pncFechahasta) {
        this.pncFechahasta = pncFechahasta;
    }

    public BigDecimal getPncRemuneracion() {
        return pncRemuneracion;
    }

    public void setPncRemuneracion(BigDecimal pncRemuneracion) {
        this.pncRemuneracion = pncRemuneracion;
    }

    public Character getPncEstado() {
        return pncEstado;
    }

    public void setPncEstado(Character pncEstado) {
        this.pncEstado = pncEstado;
    }

    public String getPncDescripcion() {
        return pncDescripcion;
    }

    public void setPncDescripcion(String pncDescripcion) {
        this.pncDescripcion = pncDescripcion;
    }

    public Date getPcnFechacreacion() {
        return pcnFechacreacion;
    }

    public void setPcnFechacreacion(Date pcnFechacreacion) {
        this.pcnFechacreacion = pcnFechacreacion;
    }

    public String getPcnUser() {
        return pcnUser;
    }

    public void setPcnUser(String pcnUser) {
        this.pcnUser = pcnUser;
    }

    public String getPncTipo() {
        return pncTipo;
    }

    public void setPncTipo(String pncTipo) {
        this.pncTipo = pncTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pncIdpersonalcargo != null ? pncIdpersonalcargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalCargo)) {
            return false;
        }
        PersonalCargo other = (PersonalCargo) object;
        if ((this.pncIdpersonalcargo == null && other.pncIdpersonalcargo != null) || (this.pncIdpersonalcargo != null && !this.pncIdpersonalcargo.equals(other.pncIdpersonalcargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PersonalCargo[ pncIdpersonalcargo=" + pncIdpersonalcargo + " ]";
    }
    
}
