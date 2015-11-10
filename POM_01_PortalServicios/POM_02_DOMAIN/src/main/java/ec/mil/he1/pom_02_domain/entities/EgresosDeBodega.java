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
@Table(name = "EGRESOS_DE_BODEGA")
@NamedQueries({
    @NamedQuery(name = "EgresosDeBodega.findAll", query = "SELECT e FROM EgresosDeBodega e")})
public class EgresosDeBodega implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosDeBodegaPK egresosDeBodegaPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Column(name = "ESTADO")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @OneToMany(mappedBy = "egresosDeBodega", fetch = FetchType.LAZY)
    private List<Transacciones> transaccionesList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PRS_CODIGO_ENTREGADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "SLCINS_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private SolicitudesDeInsumos solicitudesDeInsumos;

    public EgresosDeBodega() {
    }

    public EgresosDeBodega(EgresosDeBodegaPK egresosDeBodegaPK) {
        this.egresosDeBodegaPK = egresosDeBodegaPK;
    }

    public EgresosDeBodega(String tipo, int numero) {
        this.egresosDeBodegaPK = new EgresosDeBodegaPK(tipo, numero);
    }

    public EgresosDeBodegaPK getEgresosDeBodegaPK() {
        return egresosDeBodegaPK;
    }

    public void setEgresosDeBodegaPK(EgresosDeBodegaPK egresosDeBodegaPK) {
        this.egresosDeBodegaPK = egresosDeBodegaPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<Transacciones> getTransaccionesList() {
        return transaccionesList;
    }

    public void setTransaccionesList(List<Transacciones> transaccionesList) {
        this.transaccionesList = transaccionesList;
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

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    public SolicitudesDeInsumos getSolicitudesDeInsumos() {
        return solicitudesDeInsumos;
    }

    public void setSolicitudesDeInsumos(SolicitudesDeInsumos solicitudesDeInsumos) {
        this.solicitudesDeInsumos = solicitudesDeInsumos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (egresosDeBodegaPK != null ? egresosDeBodegaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosDeBodega)) {
            return false;
        }
        EgresosDeBodega other = (EgresosDeBodega) object;
        if ((this.egresosDeBodegaPK == null && other.egresosDeBodegaPK != null) || (this.egresosDeBodegaPK != null && !this.egresosDeBodegaPK.equals(other.egresosDeBodegaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EgresosDeBodega[ egresosDeBodegaPK=" + egresosDeBodegaPK + " ]";
    }
    
}
