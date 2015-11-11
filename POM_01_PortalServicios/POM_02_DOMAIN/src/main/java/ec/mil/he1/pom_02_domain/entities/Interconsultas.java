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
@Table(name = "INTERCONSULTAS")
@NamedQueries({
    @NamedQuery(name = "Interconsultas.findAll", query = "SELECT i FROM Interconsultas i")})
public class Interconsultas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InterconsultasPK interconsultasPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "RESULTADO")
    private String resultado;
    @Column(name = "FECHA_RESULTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResultado;
    @Column(name = "POOL")
    private Integer pool;
    @Column(name = "ELECTRO")
    private Character electro;
    @Column(name = "FECHA_INTERCONSULTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInterconsulta;
    @Column(name = "CONDICION_CLINICA")
    private String condicionClinica;
    @Column(name = "CIRCUNSTANCIA_CALIFICANTE")
    private String circunstanciaCalificante;
    @Column(name = "MINUTOS")
    private Short minutos;
//    @OneToMany(mappedBy = "interconsultas", fetch = FetchType.LAZY)
//    private List<HojasDeEvolucion> hojasDeEvolucionList;
//    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private DiagnosticosPaciente diagnosticosPaciente;
//    @JoinColumn(name = "ESP_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Especialidades especialidades;
//    @JoinColumn(name = "HJAEVL_NUMERO_CMPINT", referencedColumnName = "NUMERO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private HojasDeEvolucion hojasDeEvolucion;
//    @JoinColumn(name = "HJAEVL_NUMERO", referencedColumnName = "NUMERO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private HojasDeEvolucion hojasDeEvolucion1;
//    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Pacientes pacientes;
//    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal;
//    @JoinColumn(name = "PRS_CODIGO_REALIZADO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal1;
//    @JoinColumn(name = "PRCHSP_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private ProcedimientosHospitalarios procedimientosHospitalarios;

    public Interconsultas() {
    }

    public Interconsultas(InterconsultasPK interconsultasPK) {
        this.interconsultasPK = interconsultasPK;
    }

    public Interconsultas(int pcnNumeroHc, int numero) {
        this.interconsultasPK = new InterconsultasPK(pcnNumeroHc, numero);
    }

    public InterconsultasPK getInterconsultasPK() {
        return interconsultasPK;
    }

    public void setInterconsultasPK(InterconsultasPK interconsultasPK) {
        this.interconsultasPK = interconsultasPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Date getFechaResultado() {
        return fechaResultado;
    }

    public void setFechaResultado(Date fechaResultado) {
        this.fechaResultado = fechaResultado;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Character getElectro() {
        return electro;
    }

    public void setElectro(Character electro) {
        this.electro = electro;
    }

    public Date getFechaInterconsulta() {
        return fechaInterconsulta;
    }

    public void setFechaInterconsulta(Date fechaInterconsulta) {
        this.fechaInterconsulta = fechaInterconsulta;
    }

    public String getCondicionClinica() {
        return condicionClinica;
    }

    public void setCondicionClinica(String condicionClinica) {
        this.condicionClinica = condicionClinica;
    }

    public String getCircunstanciaCalificante() {
        return circunstanciaCalificante;
    }

    public void setCircunstanciaCalificante(String circunstanciaCalificante) {
        this.circunstanciaCalificante = circunstanciaCalificante;
    }

    public Short getMinutos() {
        return minutos;
    }

    public void setMinutos(Short minutos) {
        this.minutos = minutos;
    }

//    public List<HojasDeEvolucion> getHojasDeEvolucionList() {
//        return hojasDeEvolucionList;
//    }
//
//    public void setHojasDeEvolucionList(List<HojasDeEvolucion> hojasDeEvolucionList) {
//        this.hojasDeEvolucionList = hojasDeEvolucionList;
//    }
//
//    public DiagnosticosPaciente getDiagnosticosPaciente() {
//        return diagnosticosPaciente;
//    }
//
//    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
//        this.diagnosticosPaciente = diagnosticosPaciente;
//    }
//
//    public Especialidades getEspecialidades() {
//        return especialidades;
//    }
//
//    public void setEspecialidades(Especialidades especialidades) {
//        this.especialidades = especialidades;
//    }
//
//    public HojasDeEvolucion getHojasDeEvolucion() {
//        return hojasDeEvolucion;
//    }
//
//    public void setHojasDeEvolucion(HojasDeEvolucion hojasDeEvolucion) {
//        this.hojasDeEvolucion = hojasDeEvolucion;
//    }
//
//    public HojasDeEvolucion getHojasDeEvolucion1() {
//        return hojasDeEvolucion1;
//    }
//
//    public void setHojasDeEvolucion1(HojasDeEvolucion hojasDeEvolucion1) {
//        this.hojasDeEvolucion1 = hojasDeEvolucion1;
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
//    public ProcedimientosHospitalarios getProcedimientosHospitalarios() {
//        return procedimientosHospitalarios;
//    }
//
//    public void setProcedimientosHospitalarios(ProcedimientosHospitalarios procedimientosHospitalarios) {
//        this.procedimientosHospitalarios = procedimientosHospitalarios;
//    }
//
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (interconsultasPK != null ? interconsultasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interconsultas)) {
            return false;
        }
        Interconsultas other = (Interconsultas) object;
        if ((this.interconsultasPK == null && other.interconsultasPK != null) || (this.interconsultasPK != null && !this.interconsultasPK.equals(other.interconsultasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Interconsultas[ interconsultasPK=" + interconsultasPK + " ]";
    }
    
}
