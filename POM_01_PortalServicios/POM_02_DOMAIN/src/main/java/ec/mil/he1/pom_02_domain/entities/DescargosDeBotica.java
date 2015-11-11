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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "DESCARGOS_DE_BOTICA")
@NamedQueries({
    @NamedQuery(name = "DescargosDeBotica.findAll", query = "SELECT d FROM DescargosDeBotica d")})
public class DescargosDeBotica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONFIRMADO")
    private Character confirmado;
    @Column(name = "DESPACHADO")
    private Character despachado;
    @Column(name = "EJECUTADO")
    private Character ejecutado;
    @Column(name = "IMPRESO")
    private String impreso;
    @Column(name = "OBSERVACION")
    private String observacion;
//    @JoinColumns({
//        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
//        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Departamentos departamentos;
//    @JoinColumns({
//        @JoinColumn(name = "EGRBTC_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "EGRBTC_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private EgresosDeBotica egresosDeBotica;
//    @JoinColumns({
//        @JoinColumn(name = "EGRSBB_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "EGRSBB_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private EgresosSubbodegas egresosSubbodegas;
//    @JoinColumn(name = "SLCINT_PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Pacientes pacientes;
//    @JoinColumns({
//        @JoinColumn(name = "SLCINT_NUMERO", referencedColumnName = "NUMERO"),
//        @JoinColumn(name = "SLCINT_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private PermanenciasYAtenciones permanenciasYAtenciones;
//    @JoinColumn(name = "PRS_CODIGO_SOLICITADA_POR", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal;
//    @JoinColumn(name = "PRS_CODIGO_DESPACHADO_POR", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal1;
//    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal2;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "descargosDeBotica", fetch = FetchType.LAZY)
//    private List<DetallesDescargo> detallesDescargoList;
//    @OneToMany(mappedBy = "descargosDeBotica", fetch = FetchType.LAZY)
//    private List<DetallesPrescripcion> detallesPrescripcionList;

    public DescargosDeBotica() {
    }

    public DescargosDeBotica(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Character confirmado) {
        this.confirmado = confirmado;
    }

    public Character getDespachado() {
        return despachado;
    }

    public void setDespachado(Character despachado) {
        this.despachado = despachado;
    }

    public Character getEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(Character ejecutado) {
        this.ejecutado = ejecutado;
    }

    public String getImpreso() {
        return impreso;
    }

    public void setImpreso(String impreso) {
        this.impreso = impreso;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

//    public Departamentos getDepartamentos() {
//        return departamentos;
//    }
//
//    public void setDepartamentos(Departamentos departamentos) {
//        this.departamentos = departamentos;
//    }
//
//    public EgresosDeBotica getEgresosDeBotica() {
//        return egresosDeBotica;
//    }
//
//    public void setEgresosDeBotica(EgresosDeBotica egresosDeBotica) {
//        this.egresosDeBotica = egresosDeBotica;
//    }
//
//    public EgresosSubbodegas getEgresosSubbodegas() {
//        return egresosSubbodegas;
//    }
//
//    public void setEgresosSubbodegas(EgresosSubbodegas egresosSubbodegas) {
//        this.egresosSubbodegas = egresosSubbodegas;
//    }
//
//    public Pacientes getPacientes() {
//        return pacientes;
//    }
//
//    public void setPacientes(Pacientes pacientes) {
//        this.pacientes = pacientes;
//    }
//
//    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
//        return permanenciasYAtenciones;
//    }
//
//    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
//        this.permanenciasYAtenciones = permanenciasYAtenciones;
//    }
//
//    public Personal getPersonal() {
//        return personal;
//    }
//
//    public void setPersonal(Personal personal) {
//        this.personal = personal;
//    }
//
//    public Personal getPersonal1() {
//        return personal1;
//    }
//
//    public void setPersonal1(Personal personal1) {
//        this.personal1 = personal1;
//    }
//
//    public Personal getPersonal2() {
//        return personal2;
//    }
//
//    public void setPersonal2(Personal personal2) {
//        this.personal2 = personal2;
//    }
//
//    public List<DetallesDescargo> getDetallesDescargoList() {
//        return detallesDescargoList;
//    }
//
//    public void setDetallesDescargoList(List<DetallesDescargo> detallesDescargoList) {
//        this.detallesDescargoList = detallesDescargoList;
//    }
//
//    public List<DetallesPrescripcion> getDetallesPrescripcionList() {
//        return detallesPrescripcionList;
//    }
//
//    public void setDetallesPrescripcionList(List<DetallesPrescripcion> detallesPrescripcionList) {
//        this.detallesPrescripcionList = detallesPrescripcionList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DescargosDeBotica)) {
            return false;
        }
        DescargosDeBotica other = (DescargosDeBotica) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DescargosDeBotica[ numero=" + numero + " ]";
    }
    
}
