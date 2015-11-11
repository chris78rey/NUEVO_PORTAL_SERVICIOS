/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CERTIFICADOS")
@NamedQueries({
    @NamedQuery(name = "Certificados.findAll", query = "SELECT c FROM Certificados c")})
public class Certificados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "PRS_CODIGO_JEFE_RRHH")
    private String prsCodigoJefeRrhh;
    @Column(name = "PRS_CODIGO_COMANDANTE")
    private String prsCodigoComandante;
    @Column(name = "PRS_CODIGO_DIRECTOR_SERVICIO")
    private String prsCodigoDirectorServicio;
    @Column(name = "PRS_CODIGO_JEFE_SERVICIO")
    private String prsCodigoJefeServicio;
    @Column(name = "PRS_CODIGO_TRATANTE")
    private String prsCodigoTratante;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "ESP_CODIGO")
    private String espCodigo;
    @Column(name = "FECHA_INICIO_REPOSO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioReposo;
    @Column(name = "FECHA_FIN_REPOSO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinReposo;
    @Column(name = "FECHA_RE_EVALUACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReEvaluacion;
    @Column(name = "ANTECEDENTES_CLINICOS")
    private String antecedentesClinicos;
    @Column(name = "ANTECEDENTES_PERSONALES")
    private String antecedentesPersonales;
    @Column(name = "ANTECEDENTES_FAMILIARES")
    private String antecedentesFamiliares;
    @Column(name = "ANTECEDENTES_POSTQUIRURGICOS")
    private String antecedentesPostquirurgicos;
    @Column(name = "ENFERMEDAD_ACTUAL")
    private String enfermedadActual;
    @Column(name = "IMPRESION_DIAGNOSTICA")
    private String impresionDiagnostica;
    @Column(name = "TRATAMIENTO")
    private String tratamiento;
    @Column(name = "PRONOSTICO")
    private String pronostico;
    @Column(name = "RECOMENDACIONES")
    private String recomendaciones;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "TIPO_TRATAMIENTO")
    private String tipoTratamiento;
    @Column(name = "DIAS_PERMISO")
    private Short diasPermiso;
    @Column(name = "REPOSO_FISICO")
    private String reposoFisico;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FECHA_EGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEgreso;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "JEFE_RRHH")
    private String jefeRrhh;
    @Column(name = "CARGO_JEFE_RRHH")
    private String cargoJefeRrhh;
    @Column(name = "COMANDANTE")
    private String comandante;
    @Column(name = "CARGO_COMANDANTE")
    private String cargoComandante;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "SEQUENCIA_TIPO")
    private BigInteger sequenciaTipo;

    public Certificados() {
    }

    public Certificados(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrsCodigoJefeRrhh() {
        return prsCodigoJefeRrhh;
    }

    public void setPrsCodigoJefeRrhh(String prsCodigoJefeRrhh) {
        this.prsCodigoJefeRrhh = prsCodigoJefeRrhh;
    }

    public String getPrsCodigoComandante() {
        return prsCodigoComandante;
    }

    public void setPrsCodigoComandante(String prsCodigoComandante) {
        this.prsCodigoComandante = prsCodigoComandante;
    }

    public String getPrsCodigoDirectorServicio() {
        return prsCodigoDirectorServicio;
    }

    public void setPrsCodigoDirectorServicio(String prsCodigoDirectorServicio) {
        this.prsCodigoDirectorServicio = prsCodigoDirectorServicio;
    }

    public String getPrsCodigoJefeServicio() {
        return prsCodigoJefeServicio;
    }

    public void setPrsCodigoJefeServicio(String prsCodigoJefeServicio) {
        this.prsCodigoJefeServicio = prsCodigoJefeServicio;
    }

    public String getPrsCodigoTratante() {
        return prsCodigoTratante;
    }

    public void setPrsCodigoTratante(String prsCodigoTratante) {
        this.prsCodigoTratante = prsCodigoTratante;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public String getEspCodigo() {
        return espCodigo;
    }

    public void setEspCodigo(String espCodigo) {
        this.espCodigo = espCodigo;
    }

    public Date getFechaInicioReposo() {
        return fechaInicioReposo;
    }

    public void setFechaInicioReposo(Date fechaInicioReposo) {
        this.fechaInicioReposo = fechaInicioReposo;
    }

    public Date getFechaFinReposo() {
        return fechaFinReposo;
    }

    public void setFechaFinReposo(Date fechaFinReposo) {
        this.fechaFinReposo = fechaFinReposo;
    }

    public Date getFechaReEvaluacion() {
        return fechaReEvaluacion;
    }

    public void setFechaReEvaluacion(Date fechaReEvaluacion) {
        this.fechaReEvaluacion = fechaReEvaluacion;
    }

    public String getAntecedentesClinicos() {
        return antecedentesClinicos;
    }

    public void setAntecedentesClinicos(String antecedentesClinicos) {
        this.antecedentesClinicos = antecedentesClinicos;
    }

    public String getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    public void setAntecedentesPersonales(String antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public String getAntecedentesPostquirurgicos() {
        return antecedentesPostquirurgicos;
    }

    public void setAntecedentesPostquirurgicos(String antecedentesPostquirurgicos) {
        this.antecedentesPostquirurgicos = antecedentesPostquirurgicos;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getImpresionDiagnostica() {
        return impresionDiagnostica;
    }

    public void setImpresionDiagnostica(String impresionDiagnostica) {
        this.impresionDiagnostica = impresionDiagnostica;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public Short getDiasPermiso() {
        return diasPermiso;
    }

    public void setDiasPermiso(Short diasPermiso) {
        this.diasPermiso = diasPermiso;
    }

    public String getReposoFisico() {
        return reposoFisico;
    }

    public void setReposoFisico(String reposoFisico) {
        this.reposoFisico = reposoFisico;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getJefeRrhh() {
        return jefeRrhh;
    }

    public void setJefeRrhh(String jefeRrhh) {
        this.jefeRrhh = jefeRrhh;
    }

    public String getCargoJefeRrhh() {
        return cargoJefeRrhh;
    }

    public void setCargoJefeRrhh(String cargoJefeRrhh) {
        this.cargoJefeRrhh = cargoJefeRrhh;
    }

    public String getComandante() {
        return comandante;
    }

    public void setComandante(String comandante) {
        this.comandante = comandante;
    }

    public String getCargoComandante() {
        return cargoComandante;
    }

    public void setCargoComandante(String cargoComandante) {
        this.cargoComandante = cargoComandante;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public BigInteger getSequenciaTipo() {
        return sequenciaTipo;
    }

    public void setSequenciaTipo(BigInteger sequenciaTipo) {
        this.sequenciaTipo = sequenciaTipo;
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
        if (!(object instanceof Certificados)) {
            return false;
        }
        Certificados other = (Certificados) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Certificados[ numero=" + numero + " ]";
    }
    
}
