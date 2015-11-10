/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "PROCEDIMIENTOS_MENORES")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosMenores.findAll", query = "SELECT p FROM ProcedimientosMenores p")})
public class ProcedimientosMenores implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientosMenoresPK procedimientosMenoresPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "AUDITADO")
    private String auditado;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "POOL")
    private Integer pool;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "HJAEVL_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private HojasDeEvolucion hojasDeEvolucion;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_CODIGO_ASISTIDO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @OneToMany(mappedBy = "procedimientosMenores", fetch = FetchType.LAZY)
    private List<DetallesComplicaciones> detallesComplicacionesList;
    @OneToMany(mappedBy = "procedimientosMenores", fetch = FetchType.LAZY)
    private List<ProcedimientosRealizados> procedimientosRealizadosList;

    public ProcedimientosMenores() {
    }

    public ProcedimientosMenores(ProcedimientosMenoresPK procedimientosMenoresPK) {
        this.procedimientosMenoresPK = procedimientosMenoresPK;
    }

    public ProcedimientosMenores(int pcnNumeroHc, int numero) {
        this.procedimientosMenoresPK = new ProcedimientosMenoresPK(pcnNumeroHc, numero);
    }

    public ProcedimientosMenoresPK getProcedimientosMenoresPK() {
        return procedimientosMenoresPK;
    }

    public void setProcedimientosMenoresPK(ProcedimientosMenoresPK procedimientosMenoresPK) {
        this.procedimientosMenoresPK = procedimientosMenoresPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAuditado() {
        return auditado;
    }

    public void setAuditado(String auditado) {
        this.auditado = auditado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
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

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    public List<DetallesComplicaciones> getDetallesComplicacionesList() {
        return detallesComplicacionesList;
    }

    public void setDetallesComplicacionesList(List<DetallesComplicaciones> detallesComplicacionesList) {
        this.detallesComplicacionesList = detallesComplicacionesList;
    }

    public List<ProcedimientosRealizados> getProcedimientosRealizadosList() {
        return procedimientosRealizadosList;
    }

    public void setProcedimientosRealizadosList(List<ProcedimientosRealizados> procedimientosRealizadosList) {
        this.procedimientosRealizadosList = procedimientosRealizadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedimientosMenoresPK != null ? procedimientosMenoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosMenores)) {
            return false;
        }
        ProcedimientosMenores other = (ProcedimientosMenores) object;
        if ((this.procedimientosMenoresPK == null && other.procedimientosMenoresPK != null) || (this.procedimientosMenoresPK != null && !this.procedimientosMenoresPK.equals(other.procedimientosMenoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ProcedimientosMenores[ procedimientosMenoresPK=" + procedimientosMenoresPK + " ]";
    }
    
}
