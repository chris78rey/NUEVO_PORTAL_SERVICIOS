/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Table(name = "ENTIDADES_BENEFICIARIAS")
@NamedQueries({
    @NamedQuery(name = "EntidadesBeneficiarias.findAll", query = "SELECT e FROM EntidadesBeneficiarias e")})
public class EntidadesBeneficiarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntidadesBeneficiariasPK entidadesBeneficiariasPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "NOMBRE_LEGAL")
    private String nombreLegal;
    @Column(name = "ID")
    private String id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RETENCION_FUENTE")
    private BigDecimal retencionFuente;
    @Column(name = "RETENCION_CLINICA")
    private BigDecimal retencionClinica;
    @OneToMany(mappedBy = "entidadesBeneficiarias", fetch = FetchType.LAZY)
    private List<DetallesHonorariosMedicos> detallesHonorariosMedicosList;
    @JoinColumn(name = "MSTBNF_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MaestrosBeneficiarios maestrosBeneficiarios;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(mappedBy = "entidadesBeneficiarias", fetch = FetchType.LAZY)
    private List<DetallesRegulacionCm> detallesRegulacionCmList;
    @OneToMany(mappedBy = "entidadesBeneficiarias", fetch = FetchType.LAZY)
    private List<MovimientosDeCuenta> movimientosDeCuentaList;
    @OneToMany(mappedBy = "entidadesBeneficiarias", fetch = FetchType.LAZY)
    private List<CancelacionesPagoHnr> cancelacionesPagoHnrList;
    @OneToMany(mappedBy = "entidadesBeneficiarias", fetch = FetchType.LAZY)
    private List<HonorariosMedicos> honorariosMedicosList;
    @OneToMany(mappedBy = "entidadesBeneficiarias1", fetch = FetchType.LAZY)
    private List<HonorariosMedicos> honorariosMedicosList1;

    public EntidadesBeneficiarias() {
    }

    public EntidadesBeneficiarias(EntidadesBeneficiariasPK entidadesBeneficiariasPK) {
        this.entidadesBeneficiariasPK = entidadesBeneficiariasPK;
    }

    public EntidadesBeneficiarias(String mstbnfCodigo, int codigo) {
        this.entidadesBeneficiariasPK = new EntidadesBeneficiariasPK(mstbnfCodigo, codigo);
    }

    public EntidadesBeneficiariasPK getEntidadesBeneficiariasPK() {
        return entidadesBeneficiariasPK;
    }

    public void setEntidadesBeneficiariasPK(EntidadesBeneficiariasPK entidadesBeneficiariasPK) {
        this.entidadesBeneficiariasPK = entidadesBeneficiariasPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getNombreLegal() {
        return nombreLegal;
    }

    public void setNombreLegal(String nombreLegal) {
        this.nombreLegal = nombreLegal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(BigDecimal retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    public BigDecimal getRetencionClinica() {
        return retencionClinica;
    }

    public void setRetencionClinica(BigDecimal retencionClinica) {
        this.retencionClinica = retencionClinica;
    }

    public List<DetallesHonorariosMedicos> getDetallesHonorariosMedicosList() {
        return detallesHonorariosMedicosList;
    }

    public void setDetallesHonorariosMedicosList(List<DetallesHonorariosMedicos> detallesHonorariosMedicosList) {
        this.detallesHonorariosMedicosList = detallesHonorariosMedicosList;
    }

    public MaestrosBeneficiarios getMaestrosBeneficiarios() {
        return maestrosBeneficiarios;
    }

    public void setMaestrosBeneficiarios(MaestrosBeneficiarios maestrosBeneficiarios) {
        this.maestrosBeneficiarios = maestrosBeneficiarios;
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

    public List<DetallesRegulacionCm> getDetallesRegulacionCmList() {
        return detallesRegulacionCmList;
    }

    public void setDetallesRegulacionCmList(List<DetallesRegulacionCm> detallesRegulacionCmList) {
        this.detallesRegulacionCmList = detallesRegulacionCmList;
    }

    public List<MovimientosDeCuenta> getMovimientosDeCuentaList() {
        return movimientosDeCuentaList;
    }

    public void setMovimientosDeCuentaList(List<MovimientosDeCuenta> movimientosDeCuentaList) {
        this.movimientosDeCuentaList = movimientosDeCuentaList;
    }

    public List<CancelacionesPagoHnr> getCancelacionesPagoHnrList() {
        return cancelacionesPagoHnrList;
    }

    public void setCancelacionesPagoHnrList(List<CancelacionesPagoHnr> cancelacionesPagoHnrList) {
        this.cancelacionesPagoHnrList = cancelacionesPagoHnrList;
    }

    public List<HonorariosMedicos> getHonorariosMedicosList() {
        return honorariosMedicosList;
    }

    public void setHonorariosMedicosList(List<HonorariosMedicos> honorariosMedicosList) {
        this.honorariosMedicosList = honorariosMedicosList;
    }

    public List<HonorariosMedicos> getHonorariosMedicosList1() {
        return honorariosMedicosList1;
    }

    public void setHonorariosMedicosList1(List<HonorariosMedicos> honorariosMedicosList1) {
        this.honorariosMedicosList1 = honorariosMedicosList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entidadesBeneficiariasPK != null ? entidadesBeneficiariasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadesBeneficiarias)) {
            return false;
        }
        EntidadesBeneficiarias other = (EntidadesBeneficiarias) object;
        if ((this.entidadesBeneficiariasPK == null && other.entidadesBeneficiariasPK != null) || (this.entidadesBeneficiariasPK != null && !this.entidadesBeneficiariasPK.equals(other.entidadesBeneficiariasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EntidadesBeneficiarias[ entidadesBeneficiariasPK=" + entidadesBeneficiariasPK + " ]";
    }
    
}
