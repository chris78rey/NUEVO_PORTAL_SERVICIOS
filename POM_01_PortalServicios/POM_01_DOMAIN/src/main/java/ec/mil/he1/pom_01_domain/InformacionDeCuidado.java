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
@Table(name = "INFORMACION_DE_CUIDADO")
@NamedQueries({
    @NamedQuery(name = "InformacionDeCuidado.findAll", query = "SELECT i FROM InformacionDeCuidado i")})
public class InformacionDeCuidado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InformacionDeCuidadoPK informacionDeCuidadoPK;
    @Column(name = "CUIDADOS_ESPECIALES")
    private String cuidadosEspeciales;
    @Column(name = "ASEO")
    private String aseo;
    @Column(name = "REPOSO")
    private String reposo;
    @Column(name = "ALIMENTACION")
    private String alimentacion;
    @Column(name = "NO_DEBE_HACER")
    private String noDebeHacer;
    @Column(name = "PRESCRIPCION")
    private String prescripcion;
    @Column(name = "FECHA_CITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCita;
    @Column(name = "REFERENTE")
    private String referente;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public InformacionDeCuidado() {
    }

    public InformacionDeCuidado(InformacionDeCuidadoPK informacionDeCuidadoPK) {
        this.informacionDeCuidadoPK = informacionDeCuidadoPK;
    }

    public InformacionDeCuidado(long prmatnNumero, int prmatnPcnNumeroHc) {
        this.informacionDeCuidadoPK = new InformacionDeCuidadoPK(prmatnNumero, prmatnPcnNumeroHc);
    }

    public InformacionDeCuidadoPK getInformacionDeCuidadoPK() {
        return informacionDeCuidadoPK;
    }

    public void setInformacionDeCuidadoPK(InformacionDeCuidadoPK informacionDeCuidadoPK) {
        this.informacionDeCuidadoPK = informacionDeCuidadoPK;
    }

    public String getCuidadosEspeciales() {
        return cuidadosEspeciales;
    }

    public void setCuidadosEspeciales(String cuidadosEspeciales) {
        this.cuidadosEspeciales = cuidadosEspeciales;
    }

    public String getAseo() {
        return aseo;
    }

    public void setAseo(String aseo) {
        this.aseo = aseo;
    }

    public String getReposo() {
        return reposo;
    }

    public void setReposo(String reposo) {
        this.reposo = reposo;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getNoDebeHacer() {
        return noDebeHacer;
    }

    public void setNoDebeHacer(String noDebeHacer) {
        this.noDebeHacer = noDebeHacer;
    }

    public String getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (informacionDeCuidadoPK != null ? informacionDeCuidadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionDeCuidado)) {
            return false;
        }
        InformacionDeCuidado other = (InformacionDeCuidado) object;
        if ((this.informacionDeCuidadoPK == null && other.informacionDeCuidadoPK != null) || (this.informacionDeCuidadoPK != null && !this.informacionDeCuidadoPK.equals(other.informacionDeCuidadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.InformacionDeCuidado[ informacionDeCuidadoPK=" + informacionDeCuidadoPK + " ]";
    }
    
}
