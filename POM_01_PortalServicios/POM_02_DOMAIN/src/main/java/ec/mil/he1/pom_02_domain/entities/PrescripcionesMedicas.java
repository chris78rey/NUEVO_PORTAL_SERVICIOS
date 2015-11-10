/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "CUMPLIMIENTO")
    private String cumplimiento;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "HJAEVL_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private HojasDeEvolucion hojasDeEvolucion;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRMANT_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false)})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prescripcionesMedicas", fetch = FetchType.LAZY)
    private List<DetallesPrescripcion> detallesPrescripcionList;

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

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public HojasDeEvolucion getHojasDeEvolucion() {
        return hojasDeEvolucion;
    }

    public void setHojasDeEvolucion(HojasDeEvolucion hojasDeEvolucion) {
        this.hojasDeEvolucion = hojasDeEvolucion;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
        return permanenciasYAtenciones;
    }

    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
        this.permanenciasYAtenciones = permanenciasYAtenciones;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<DetallesPrescripcion> getDetallesPrescripcionList() {
        return detallesPrescripcionList;
    }

    public void setDetallesPrescripcionList(List<DetallesPrescripcion> detallesPrescripcionList) {
        this.detallesPrescripcionList = detallesPrescripcionList;
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
        return "ec.mil.he1.pom_02_domain.entities.PrescripcionesMedicas[ prescripcionesMedicasPK=" + prescripcionesMedicasPK + " ]";
    }
    
}
