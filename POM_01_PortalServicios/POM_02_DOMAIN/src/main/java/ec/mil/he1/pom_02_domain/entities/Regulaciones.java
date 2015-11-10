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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REGULACIONES")
@NamedQueries({
    @NamedQuery(name = "Regulaciones.findAll", query = "SELECT r FROM Regulaciones r")})
public class Regulaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegulacionesPK regulacionesPK;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(mappedBy = "regulaciones", fetch = FetchType.LAZY)
    private List<Transacciones> transaccionesList;
    @OneToMany(mappedBy = "regulaciones", fetch = FetchType.LAZY)
    private List<CostosRegulacion> costosRegulacionList;

    public Regulaciones() {
    }

    public Regulaciones(RegulacionesPK regulacionesPK) {
        this.regulacionesPK = regulacionesPK;
    }

    public Regulaciones(String tipo, int numero) {
        this.regulacionesPK = new RegulacionesPK(tipo, numero);
    }

    public RegulacionesPK getRegulacionesPK() {
        return regulacionesPK;
    }

    public void setRegulacionesPK(RegulacionesPK regulacionesPK) {
        this.regulacionesPK = regulacionesPK;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public List<Transacciones> getTransaccionesList() {
        return transaccionesList;
    }

    public void setTransaccionesList(List<Transacciones> transaccionesList) {
        this.transaccionesList = transaccionesList;
    }

    public List<CostosRegulacion> getCostosRegulacionList() {
        return costosRegulacionList;
    }

    public void setCostosRegulacionList(List<CostosRegulacion> costosRegulacionList) {
        this.costosRegulacionList = costosRegulacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regulacionesPK != null ? regulacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regulaciones)) {
            return false;
        }
        Regulaciones other = (Regulaciones) object;
        if ((this.regulacionesPK == null && other.regulacionesPK != null) || (this.regulacionesPK != null && !this.regulacionesPK.equals(other.regulacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Regulaciones[ regulacionesPK=" + regulacionesPK + " ]";
    }
    
}
