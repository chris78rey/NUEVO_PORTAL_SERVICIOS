/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "RESPONSABLES_DEPARTAMENTOS")
@NamedQueries({
    @NamedQuery(name = "ResponsablesDepartamentos.findAll", query = "SELECT r FROM ResponsablesDepartamentos r")})
public class ResponsablesDepartamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResponsablesDepartamentosPK responsablesDepartamentosPK;
    @Column(name = "FECHA_DE_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeSalida;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

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

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
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
        return "ec.mil.he1.pom_02_domain.entities.ResponsablesDepartamentos[ responsablesDepartamentosPK=" + responsablesDepartamentosPK + " ]";
    }
    
}
