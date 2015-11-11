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
@Table(name = "MOTIVOS_DE_CONSULTAS")
@NamedQueries({
    @NamedQuery(name = "MotivosDeConsultas.findAll", query = "SELECT m FROM MotivosDeConsultas m")})
public class MotivosDeConsultas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MotivosDeConsultasPK motivosDeConsultasPK;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "ENFERMEDAD")
    private String enfermedad;
    @Column(name = "PLAN_TRATAMIENTO")
    private String planTratamiento;

    public MotivosDeConsultas() {
    }

    public MotivosDeConsultas(MotivosDeConsultasPK motivosDeConsultasPK) {
        this.motivosDeConsultasPK = motivosDeConsultasPK;
    }

    public MotivosDeConsultas(int pcnNumeroHc, Date fecha) {
        this.motivosDeConsultasPK = new MotivosDeConsultasPK(pcnNumeroHc, fecha);
    }

    public MotivosDeConsultasPK getMotivosDeConsultasPK() {
        return motivosDeConsultasPK;
    }

    public void setMotivosDeConsultasPK(MotivosDeConsultasPK motivosDeConsultasPK) {
        this.motivosDeConsultasPK = motivosDeConsultasPK;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getPlanTratamiento() {
        return planTratamiento;
    }

    public void setPlanTratamiento(String planTratamiento) {
        this.planTratamiento = planTratamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motivosDeConsultasPK != null ? motivosDeConsultasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivosDeConsultas)) {
            return false;
        }
        MotivosDeConsultas other = (MotivosDeConsultas) object;
        if ((this.motivosDeConsultasPK == null && other.motivosDeConsultasPK != null) || (this.motivosDeConsultasPK != null && !this.motivosDeConsultasPK.equals(other.motivosDeConsultasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MotivosDeConsultas[ motivosDeConsultasPK=" + motivosDeConsultasPK + " ]";
    }
    
}
