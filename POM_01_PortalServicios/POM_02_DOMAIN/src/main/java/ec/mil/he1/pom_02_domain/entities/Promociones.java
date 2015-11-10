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
@Table(name = "PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "Promociones.findAll", query = "SELECT p FROM Promociones p")})
public class Promociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "OBSERVACION")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INGRESO_MINIMO")
    private BigDecimal ingresoMinimo;
    @Column(name = "INGRESO_MAXIMO")
    private BigDecimal ingresoMaximo;
    @Column(name = "MONTO_MAXIMO")
    private Integer montoMaximo;
    @Column(name = "EDAD_MAXIMA")
    private Short edadMaxima;
    @Column(name = "NUMERO_MAX_BENEFICIARIO")
    private Short numeroMaxBeneficiario;
    @Column(name = "NUMERO_MAX_DEPENDIENTES")
    private Short numeroMaxDependientes;
    @Column(name = "UVR")
    private BigDecimal uvr;
    @Column(name = "RESTRICCION")
    private Character restriccion;
    @Column(name = "REQUIERE_AUDITORIA")
    private String requiereAuditoria;
    @Column(name = "COLOR")
    private String color;
    @OneToMany(mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<Copagos> copagosList;
    @OneToMany(mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<PromocionesPacientes> promocionesPacientesList;
    @JoinColumn(name = "PRM_PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<DetallesRolesPromociones> detallesRolesPromocionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<DetallesPromociones> detallesPromocionesList;
    @OneToMany(mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<AtencionesPromocionesCargos> atencionesPromocionesCargosList;
    @OneToMany(mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<PromocionesPorClase> promocionesPorClaseList;
    @OneToMany(mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<TiposPromociones> tiposPromocionesList;
    @OneToMany(mappedBy = "promociones", fetch = FetchType.LAZY)
    private List<Asociados> asociadosList;

    public Promociones() {
    }

    public Promociones(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getIngresoMinimo() {
        return ingresoMinimo;
    }

    public void setIngresoMinimo(BigDecimal ingresoMinimo) {
        this.ingresoMinimo = ingresoMinimo;
    }

    public BigDecimal getIngresoMaximo() {
        return ingresoMaximo;
    }

    public void setIngresoMaximo(BigDecimal ingresoMaximo) {
        this.ingresoMaximo = ingresoMaximo;
    }

    public Integer getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(Integer montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public Short getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Short edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public Short getNumeroMaxBeneficiario() {
        return numeroMaxBeneficiario;
    }

    public void setNumeroMaxBeneficiario(Short numeroMaxBeneficiario) {
        this.numeroMaxBeneficiario = numeroMaxBeneficiario;
    }

    public Short getNumeroMaxDependientes() {
        return numeroMaxDependientes;
    }

    public void setNumeroMaxDependientes(Short numeroMaxDependientes) {
        this.numeroMaxDependientes = numeroMaxDependientes;
    }

    public BigDecimal getUvr() {
        return uvr;
    }

    public void setUvr(BigDecimal uvr) {
        this.uvr = uvr;
    }

    public Character getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(Character restriccion) {
        this.restriccion = restriccion;
    }

    public String getRequiereAuditoria() {
        return requiereAuditoria;
    }

    public void setRequiereAuditoria(String requiereAuditoria) {
        this.requiereAuditoria = requiereAuditoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Copagos> getCopagosList() {
        return copagosList;
    }

    public void setCopagosList(List<Copagos> copagosList) {
        this.copagosList = copagosList;
    }

    public List<PromocionesPacientes> getPromocionesPacientesList() {
        return promocionesPacientesList;
    }

    public void setPromocionesPacientesList(List<PromocionesPacientes> promocionesPacientesList) {
        this.promocionesPacientesList = promocionesPacientesList;
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

    public List<DetallesRolesPromociones> getDetallesRolesPromocionesList() {
        return detallesRolesPromocionesList;
    }

    public void setDetallesRolesPromocionesList(List<DetallesRolesPromociones> detallesRolesPromocionesList) {
        this.detallesRolesPromocionesList = detallesRolesPromocionesList;
    }

    public List<DetallesPromociones> getDetallesPromocionesList() {
        return detallesPromocionesList;
    }

    public void setDetallesPromocionesList(List<DetallesPromociones> detallesPromocionesList) {
        this.detallesPromocionesList = detallesPromocionesList;
    }

    public List<AtencionesPromocionesCargos> getAtencionesPromocionesCargosList() {
        return atencionesPromocionesCargosList;
    }

    public void setAtencionesPromocionesCargosList(List<AtencionesPromocionesCargos> atencionesPromocionesCargosList) {
        this.atencionesPromocionesCargosList = atencionesPromocionesCargosList;
    }

    public List<PromocionesPorClase> getPromocionesPorClaseList() {
        return promocionesPorClaseList;
    }

    public void setPromocionesPorClaseList(List<PromocionesPorClase> promocionesPorClaseList) {
        this.promocionesPorClaseList = promocionesPorClaseList;
    }

    public List<TiposPromociones> getTiposPromocionesList() {
        return tiposPromocionesList;
    }

    public void setTiposPromocionesList(List<TiposPromociones> tiposPromocionesList) {
        this.tiposPromocionesList = tiposPromocionesList;
    }

    public List<Asociados> getAsociadosList() {
        return asociadosList;
    }

    public void setAsociadosList(List<Asociados> asociadosList) {
        this.asociadosList = asociadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promociones)) {
            return false;
        }
        Promociones other = (Promociones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Promociones[ codigo=" + codigo + " ]";
    }
    
}
