/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "REFERENCIAS_LABORALES")
@NamedQueries({
    @NamedQuery(name = "ReferenciasLaborales.findAll", query = "SELECT r FROM ReferenciasLaborales r")})
public class ReferenciasLaborales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REL_IDREFERENCIASLABORALES")
    private Long relIdreferenciaslaborales;
    @Column(name = "PAS_IDPAIS")
    private String pasIdpais;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "REL_PUESTO")
    private String relPuesto;
    @Column(name = "REL_EMPRESA")
    private String relEmpresa;
    @Column(name = "REL_FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date relFechainicio;
    @Column(name = "REL_FECHAFINALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date relFechafinalizacion;
    @Column(name = "REL_CONTINUA")
    private Character relContinua;
    @Column(name = "REL_MOTIVOSALIDA")
    private String relMotivosalida;
    @Column(name = "REL_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date relFechacreacion;
    @Column(name = "REL_USER")
    private String relUser;
    @Column(name = "REL_ENTIDAD")
    private Character relEntidad;

    public ReferenciasLaborales() {
    }

    public ReferenciasLaborales(Long relIdreferenciaslaborales) {
        this.relIdreferenciaslaborales = relIdreferenciaslaborales;
    }

    public Long getRelIdreferenciaslaborales() {
        return relIdreferenciaslaborales;
    }

    public void setRelIdreferenciaslaborales(Long relIdreferenciaslaborales) {
        this.relIdreferenciaslaborales = relIdreferenciaslaborales;
    }

    public String getPasIdpais() {
        return pasIdpais;
    }

    public void setPasIdpais(String pasIdpais) {
        this.pasIdpais = pasIdpais;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public String getRelPuesto() {
        return relPuesto;
    }

    public void setRelPuesto(String relPuesto) {
        this.relPuesto = relPuesto;
    }

    public String getRelEmpresa() {
        return relEmpresa;
    }

    public void setRelEmpresa(String relEmpresa) {
        this.relEmpresa = relEmpresa;
    }

    public Date getRelFechainicio() {
        return relFechainicio;
    }

    public void setRelFechainicio(Date relFechainicio) {
        this.relFechainicio = relFechainicio;
    }

    public Date getRelFechafinalizacion() {
        return relFechafinalizacion;
    }

    public void setRelFechafinalizacion(Date relFechafinalizacion) {
        this.relFechafinalizacion = relFechafinalizacion;
    }

    public Character getRelContinua() {
        return relContinua;
    }

    public void setRelContinua(Character relContinua) {
        this.relContinua = relContinua;
    }

    public String getRelMotivosalida() {
        return relMotivosalida;
    }

    public void setRelMotivosalida(String relMotivosalida) {
        this.relMotivosalida = relMotivosalida;
    }

    public Date getRelFechacreacion() {
        return relFechacreacion;
    }

    public void setRelFechacreacion(Date relFechacreacion) {
        this.relFechacreacion = relFechacreacion;
    }

    public String getRelUser() {
        return relUser;
    }

    public void setRelUser(String relUser) {
        this.relUser = relUser;
    }

    public Character getRelEntidad() {
        return relEntidad;
    }

    public void setRelEntidad(Character relEntidad) {
        this.relEntidad = relEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relIdreferenciaslaborales != null ? relIdreferenciaslaborales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReferenciasLaborales)) {
            return false;
        }
        ReferenciasLaborales other = (ReferenciasLaborales) object;
        if ((this.relIdreferenciaslaborales == null && other.relIdreferenciaslaborales != null) || (this.relIdreferenciaslaborales != null && !this.relIdreferenciaslaborales.equals(other.relIdreferenciaslaborales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ReferenciasLaborales[ relIdreferenciaslaborales=" + relIdreferenciaslaborales + " ]";
    }
    
}
