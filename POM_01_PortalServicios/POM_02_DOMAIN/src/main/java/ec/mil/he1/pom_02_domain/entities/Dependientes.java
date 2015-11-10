/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DEPENDIENTES")
@NamedQueries({
    @NamedQuery(name = "Dependientes.findAll", query = "SELECT d FROM Dependientes d")})
public class Dependientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DependientesPK dependientesPK;
    @Column(name = "RELACION")
    private String relacion;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "FECHA_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "SEGURO")
    private Character seguro;
    @Column(name = "MOTIVO_ANULACION")
    private String motivoAnulacion;
    @JoinColumns({
        @JoinColumn(name = "BNF_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "BNF_ASC_NUMERO", referencedColumnName = "ASC_NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Beneficiarios beneficiarios;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public Dependientes() {
    }

    public Dependientes(DependientesPK dependientesPK) {
        this.dependientesPK = dependientesPK;
    }

    public Dependientes(BigInteger numero, int bnfAscNumero, int bnfPcnNumeroHc) {
        this.dependientesPK = new DependientesPK(numero, bnfAscNumero, bnfPcnNumeroHc);
    }

    public DependientesPK getDependientesPK() {
        return dependientesPK;
    }

    public void setDependientesPK(DependientesPK dependientesPK) {
        this.dependientesPK = dependientesPK;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getSeguro() {
        return seguro;
    }

    public void setSeguro(Character seguro) {
        this.seguro = seguro;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public Beneficiarios getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(Beneficiarios beneficiarios) {
        this.beneficiarios = beneficiarios;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dependientesPK != null ? dependientesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dependientes)) {
            return false;
        }
        Dependientes other = (Dependientes) object;
        if ((this.dependientesPK == null && other.dependientesPK != null) || (this.dependientesPK != null && !this.dependientesPK.equals(other.dependientesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Dependientes[ dependientesPK=" + dependientesPK + " ]";
    }
    
}
