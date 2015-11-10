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
@Table(name = "TRANSFERENCIAS")
@NamedQueries({
    @NamedQuery(name = "Transferencias.findAll", query = "SELECT t FROM Transferencias t")})
public class Transferencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransferenciasPK transferenciasPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO_INCREMENTAN", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO_INCREMENTAN", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos1;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_SE_ENTREGA", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @OneToMany(mappedBy = "transferencias", fetch = FetchType.LAZY)
    private List<Transacciones> transaccionesList;

    public Transferencias() {
    }

    public Transferencias(TransferenciasPK transferenciasPK) {
        this.transferenciasPK = transferenciasPK;
    }

    public Transferencias(String tipo, int numero) {
        this.transferenciasPK = new TransferenciasPK(tipo, numero);
    }

    public TransferenciasPK getTransferenciasPK() {
        return transferenciasPK;
    }

    public void setTransferenciasPK(TransferenciasPK transferenciasPK) {
        this.transferenciasPK = transferenciasPK;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Departamentos getDepartamentos1() {
        return departamentos1;
    }

    public void setDepartamentos1(Departamentos departamentos1) {
        this.departamentos1 = departamentos1;
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

    public List<Transacciones> getTransaccionesList() {
        return transaccionesList;
    }

    public void setTransaccionesList(List<Transacciones> transaccionesList) {
        this.transaccionesList = transaccionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transferenciasPK != null ? transferenciasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transferencias)) {
            return false;
        }
        Transferencias other = (Transferencias) object;
        if ((this.transferenciasPK == null && other.transferenciasPK != null) || (this.transferenciasPK != null && !this.transferenciasPK.equals(other.transferenciasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Transferencias[ transferenciasPK=" + transferenciasPK + " ]";
    }
    
}
