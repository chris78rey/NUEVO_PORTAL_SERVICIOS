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
@Table(name = "REFERENCIAS_ACADEMICAS")
@NamedQueries({
    @NamedQuery(name = "ReferenciasAcademicas.findAll", query = "SELECT r FROM ReferenciasAcademicas r")})
public class ReferenciasAcademicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REA_IDREFERENCIASACADEMICAS")
    private Long reaIdreferenciasacademicas;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "NED_IDNIVELEDUCACION")
    private Long nedIdniveleducacion;
    @Column(name = "PAS_IDPAIS")
    private String pasIdpais;
    @Column(name = "REA_TITULO")
    private String reaTitulo;
    @Column(name = "REA_INSTITUCION")
    private String reaInstitucion;
    @Column(name = "REA_FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reaFechainicio;
    @Column(name = "REA_FECHAFINALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reaFechafinalizacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REA_PROMEDIO")
    private BigDecimal reaPromedio;
    @Column(name = "REA_TPFINANCIAMIENTO")
    private String reaTpfinanciamiento;
    @Column(name = "REA_DESCRIPCION")
    private String reaDescripcion;
    @Column(name = "REA_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reaFechacreacion;
    @Column(name = "REA_USERS")
    private String reaUsers;
    @Column(name = "REA_TIPO")
    private Character reaTipo;
    @Column(name = "REA_REGSENECYT")
    private String reaRegsenecyt;

    public ReferenciasAcademicas() {
    }

    public ReferenciasAcademicas(Long reaIdreferenciasacademicas) {
        this.reaIdreferenciasacademicas = reaIdreferenciasacademicas;
    }

    public Long getReaIdreferenciasacademicas() {
        return reaIdreferenciasacademicas;
    }

    public void setReaIdreferenciasacademicas(Long reaIdreferenciasacademicas) {
        this.reaIdreferenciasacademicas = reaIdreferenciasacademicas;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Long getNedIdniveleducacion() {
        return nedIdniveleducacion;
    }

    public void setNedIdniveleducacion(Long nedIdniveleducacion) {
        this.nedIdniveleducacion = nedIdniveleducacion;
    }

    public String getPasIdpais() {
        return pasIdpais;
    }

    public void setPasIdpais(String pasIdpais) {
        this.pasIdpais = pasIdpais;
    }

    public String getReaTitulo() {
        return reaTitulo;
    }

    public void setReaTitulo(String reaTitulo) {
        this.reaTitulo = reaTitulo;
    }

    public String getReaInstitucion() {
        return reaInstitucion;
    }

    public void setReaInstitucion(String reaInstitucion) {
        this.reaInstitucion = reaInstitucion;
    }

    public Date getReaFechainicio() {
        return reaFechainicio;
    }

    public void setReaFechainicio(Date reaFechainicio) {
        this.reaFechainicio = reaFechainicio;
    }

    public Date getReaFechafinalizacion() {
        return reaFechafinalizacion;
    }

    public void setReaFechafinalizacion(Date reaFechafinalizacion) {
        this.reaFechafinalizacion = reaFechafinalizacion;
    }

    public BigDecimal getReaPromedio() {
        return reaPromedio;
    }

    public void setReaPromedio(BigDecimal reaPromedio) {
        this.reaPromedio = reaPromedio;
    }

    public String getReaTpfinanciamiento() {
        return reaTpfinanciamiento;
    }

    public void setReaTpfinanciamiento(String reaTpfinanciamiento) {
        this.reaTpfinanciamiento = reaTpfinanciamiento;
    }

    public String getReaDescripcion() {
        return reaDescripcion;
    }

    public void setReaDescripcion(String reaDescripcion) {
        this.reaDescripcion = reaDescripcion;
    }

    public Date getReaFechacreacion() {
        return reaFechacreacion;
    }

    public void setReaFechacreacion(Date reaFechacreacion) {
        this.reaFechacreacion = reaFechacreacion;
    }

    public String getReaUsers() {
        return reaUsers;
    }

    public void setReaUsers(String reaUsers) {
        this.reaUsers = reaUsers;
    }

    public Character getReaTipo() {
        return reaTipo;
    }

    public void setReaTipo(Character reaTipo) {
        this.reaTipo = reaTipo;
    }

    public String getReaRegsenecyt() {
        return reaRegsenecyt;
    }

    public void setReaRegsenecyt(String reaRegsenecyt) {
        this.reaRegsenecyt = reaRegsenecyt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reaIdreferenciasacademicas != null ? reaIdreferenciasacademicas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReferenciasAcademicas)) {
            return false;
        }
        ReferenciasAcademicas other = (ReferenciasAcademicas) object;
        if ((this.reaIdreferenciasacademicas == null && other.reaIdreferenciasacademicas != null) || (this.reaIdreferenciasacademicas != null && !this.reaIdreferenciasacademicas.equals(other.reaIdreferenciasacademicas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ReferenciasAcademicas[ reaIdreferenciasacademicas=" + reaIdreferenciasacademicas + " ]";
    }
    
}
