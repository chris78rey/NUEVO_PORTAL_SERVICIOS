/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
@Table(name = "PRESCRIPCIONES_MEDICAS")
@NamedQueries({
    @NamedQuery(name = "PrescripcionesMedicas.findAll", query = "SELECT p FROM PrescripcionesMedicas p")})
public class PrescripcionesMedicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrescripcionesMedicasPK prescripcionesMedicasPK;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRMANT_NUMERO")
    private Integer prmantNumero;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "CUMPLIMIENTO")
    private String cumplimiento;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;

    public PrescripcionesMedicas() {
    }

    public PrescripcionesMedicas(PrescripcionesMedicasPK prescripcionesMedicasPK) {
        this.prescripcionesMedicasPK = prescripcionesMedicasPK;
    }

    public PrescripcionesMedicas(Integer pcnNumeroHc, Date fecha, String dprAraCodigo, String dprCodigo) {
        this.prescripcionesMedicasPK = new PrescripcionesMedicasPK(pcnNumeroHc, fecha, dprAraCodigo, dprCodigo);
    }

    public PrescripcionesMedicasPK getPrescripcionesMedicasPK() {
        return prescripcionesMedicasPK;
    }

    public void setPrescripcionesMedicasPK(PrescripcionesMedicasPK prescripcionesMedicasPK) {
        this.prescripcionesMedicasPK = prescripcionesMedicasPK;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Integer getPrmantNumero() {
        return prmantNumero;
    }

    public void setPrmantNumero(Integer prmantNumero) {
        this.prmantNumero = prmantNumero;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCumplimiento() {
        return cumplimiento;
    }

    public void setCumplimiento(String cumplimiento) {
        this.cumplimiento = cumplimiento;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prescripcionesMedicasPK != null ? prescripcionesMedicasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrescripcionesMedicas)) {
            return false;
        }
        PrescripcionesMedicas other = (PrescripcionesMedicas) object;
        if ((this.prescripcionesMedicasPK == null && other.prescripcionesMedicasPK != null) || (this.prescripcionesMedicasPK != null && !this.prescripcionesMedicasPK.equals(other.prescripcionesMedicasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PrescripcionesMedicas[ prescripcionesMedicasPK=" + prescripcionesMedicasPK + " ]";
    }
    
}
