/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "QUIMIOTERAPIAS")
@NamedQueries({
    @NamedQuery(name = "Quimioterapias.findAll", query = "SELECT q FROM Quimioterapias q")})
public class Quimioterapias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "EDAD")
    private Short edad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "TALLA")
    private Short talla;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quimioterapias", fetch = FetchType.LAZY)
    private List<ToxicidadesQuimioterapia> toxicidadesQuimioterapiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quimioterapias", fetch = FetchType.LAZY)
    private List<PrescripcionesMedicasQuimiot> prescripcionesMedicasQuimiotList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quimioterapias", fetch = FetchType.LAZY)
    private List<TratamientosQuimioterapia> tratamientosQuimioterapiaList;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRTQMT_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProtocolosQuimioterapia protocolosQuimioterapia;

    public Quimioterapias() {
    }

    public Quimioterapias(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Short getTalla() {
        return talla;
    }

    public void setTalla(Short talla) {
        this.talla = talla;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<ToxicidadesQuimioterapia> getToxicidadesQuimioterapiaList() {
        return toxicidadesQuimioterapiaList;
    }

    public void setToxicidadesQuimioterapiaList(List<ToxicidadesQuimioterapia> toxicidadesQuimioterapiaList) {
        this.toxicidadesQuimioterapiaList = toxicidadesQuimioterapiaList;
    }

    public List<PrescripcionesMedicasQuimiot> getPrescripcionesMedicasQuimiotList() {
        return prescripcionesMedicasQuimiotList;
    }

    public void setPrescripcionesMedicasQuimiotList(List<PrescripcionesMedicasQuimiot> prescripcionesMedicasQuimiotList) {
        this.prescripcionesMedicasQuimiotList = prescripcionesMedicasQuimiotList;
    }

    public List<TratamientosQuimioterapia> getTratamientosQuimioterapiaList() {
        return tratamientosQuimioterapiaList;
    }

    public void setTratamientosQuimioterapiaList(List<TratamientosQuimioterapia> tratamientosQuimioterapiaList) {
        this.tratamientosQuimioterapiaList = tratamientosQuimioterapiaList;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
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

    public ProtocolosQuimioterapia getProtocolosQuimioterapia() {
        return protocolosQuimioterapia;
    }

    public void setProtocolosQuimioterapia(ProtocolosQuimioterapia protocolosQuimioterapia) {
        this.protocolosQuimioterapia = protocolosQuimioterapia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quimioterapias)) {
            return false;
        }
        Quimioterapias other = (Quimioterapias) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Quimioterapias[ numero=" + numero + " ]";
    }
    
}
