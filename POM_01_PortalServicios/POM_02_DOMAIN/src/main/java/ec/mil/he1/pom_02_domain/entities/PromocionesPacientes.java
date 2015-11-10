/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PROMOCIONES_PACIENTES")
@NamedQueries({
    @NamedQuery(name = "PromocionesPacientes.findAll", query = "SELECT p FROM PromocionesPacientes p")})
public class PromocionesPacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRMPCN_ID")
    private Long prmpcnId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_CATEGORIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCategorizacion;
    @Column(name = "VALIDEZ")
    private Short validez;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Promociones promociones;
    @OneToMany(mappedBy = "promocionesPacientes", fetch = FetchType.LAZY)
    private List<PromocionesConvenios> promocionesConveniosList;

    public PromocionesPacientes() {
    }

    public PromocionesPacientes(Long prmpcnId) {
        this.prmpcnId = prmpcnId;
    }

    public Long getPrmpcnId() {
        return prmpcnId;
    }

    public void setPrmpcnId(Long prmpcnId) {
        this.prmpcnId = prmpcnId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCategorizacion() {
        return fechaCategorizacion;
    }

    public void setFechaCategorizacion(Date fechaCategorizacion) {
        this.fechaCategorizacion = fechaCategorizacion;
    }

    public Short getValidez() {
        return validez;
    }

    public void setValidez(Short validez) {
        this.validez = validez;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Promociones getPromociones() {
        return promociones;
    }

    public void setPromociones(Promociones promociones) {
        this.promociones = promociones;
    }

    public List<PromocionesConvenios> getPromocionesConveniosList() {
        return promocionesConveniosList;
    }

    public void setPromocionesConveniosList(List<PromocionesConvenios> promocionesConveniosList) {
        this.promocionesConveniosList = promocionesConveniosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmpcnId != null ? prmpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromocionesPacientes)) {
            return false;
        }
        PromocionesPacientes other = (PromocionesPacientes) object;
        if ((this.prmpcnId == null && other.prmpcnId != null) || (this.prmpcnId != null && !this.prmpcnId.equals(other.prmpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PromocionesPacientes[ prmpcnId=" + prmpcnId + " ]";
    }
    
}
