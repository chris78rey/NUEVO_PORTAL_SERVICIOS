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
@Table(name = "RESPONSABLES_DEPARTAMENTOS")
@NamedQueries({
    @NamedQuery(name = "ResponsablesDepartamentos.findAll", query = "SELECT r FROM ResponsablesDepartamentos r")})
public class ResponsablesDepartamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResponsablesDepartamentosPK responsablesDepartamentosPK;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA_DE_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeSalida;

    public ResponsablesDepartamentos() {
    }

    public ResponsablesDepartamentos(ResponsablesDepartamentosPK responsablesDepartamentosPK) {
        this.responsablesDepartamentosPK = responsablesDepartamentosPK;
    }

    public ResponsablesDepartamentos(String dprAraCodigo, String dprCodigo, Date fechaDeIngreso) {
        this.responsablesDepartamentosPK = new ResponsablesDepartamentosPK(dprAraCodigo, dprCodigo, fechaDeIngreso);
    }

    public ResponsablesDepartamentosPK getResponsablesDepartamentosPK() {
        return responsablesDepartamentosPK;
    }

    public void setResponsablesDepartamentosPK(ResponsablesDepartamentosPK responsablesDepartamentosPK) {
        this.responsablesDepartamentosPK = responsablesDepartamentosPK;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (responsablesDepartamentosPK != null ? responsablesDepartamentosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsablesDepartamentos)) {
            return false;
        }
        ResponsablesDepartamentos other = (ResponsablesDepartamentos) object;
        if ((this.responsablesDepartamentosPK == null && other.responsablesDepartamentosPK != null) || (this.responsablesDepartamentosPK != null && !this.responsablesDepartamentosPK.equals(other.responsablesDepartamentosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ResponsablesDepartamentos[ responsablesDepartamentosPK=" + responsablesDepartamentosPK + " ]";
    }
    
}
