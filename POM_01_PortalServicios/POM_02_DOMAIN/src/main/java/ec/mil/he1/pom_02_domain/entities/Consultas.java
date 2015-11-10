/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "CONSULTAS")
@NamedQueries({
    @NamedQuery(name = "Consultas.findAll", query = "SELECT c FROM Consultas c")})
public class Consultas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "TIPO_CONSULTA")
    private String tipoConsulta;
    @Column(name = "SERVICIO_CEX")
    private String servicioCex;
    @Column(name = "PRIMERA_CONSULTA")
    private Character primeraConsulta;
    @Column(name = "ALTA")
    private Character alta;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PROGRAMA")
    private String programa;
    @Column(name = "MORBILIDAD")
    private Character morbilidad;
    @Column(name = "INTERCONSULTA")
    private String interconsulta;
    @Column(name = "CIRUGIA_MENOR")
    private Character cirugiaMenor;
    @Column(name = "RECETAS")
    private Short recetas;
    @Column(name = "DIAS_DE_REPOSO")
    private Short diasDeReposo;
    @Column(name = "RADIOGRAFIAS")
    private Short radiografias;
    @Column(name = "AMPOLLAS_ANESTESIA")
    private Short ampollasAnestesia;
    @Column(name = "EXAMENES")
    private Short examenes;
    @Column(name = "HOSPITALIZACION")
    private Character hospitalizacion;
    @Column(name = "RESULTADO")
    private Character resultado;
    @Column(name = "ESTADO_NUTRICIONAL")
    private String estadoNutricional;
    @Column(name = "EDA")
    private Character eda;
    @Column(name = "IRA")
    private Character ira;
    @Column(name = "ANTINCONCEPTIVO")
    private String antinconceptivo;
    @Column(name = "EMBARAZADA")
    private String embarazada;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "TRN_CE_NUMERO_ID", referencedColumnName = "NUMERO_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TurnosCe turnosCe;

    public Consultas() {
    }

    public Consultas(Integer numero) {
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

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getServicioCex() {
        return servicioCex;
    }

    public void setServicioCex(String servicioCex) {
        this.servicioCex = servicioCex;
    }

    public Character getPrimeraConsulta() {
        return primeraConsulta;
    }

    public void setPrimeraConsulta(Character primeraConsulta) {
        this.primeraConsulta = primeraConsulta;
    }

    public Character getAlta() {
        return alta;
    }

    public void setAlta(Character alta) {
        this.alta = alta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Character getMorbilidad() {
        return morbilidad;
    }

    public void setMorbilidad(Character morbilidad) {
        this.morbilidad = morbilidad;
    }

    public String getInterconsulta() {
        return interconsulta;
    }

    public void setInterconsulta(String interconsulta) {
        this.interconsulta = interconsulta;
    }

    public Character getCirugiaMenor() {
        return cirugiaMenor;
    }

    public void setCirugiaMenor(Character cirugiaMenor) {
        this.cirugiaMenor = cirugiaMenor;
    }

    public Short getRecetas() {
        return recetas;
    }

    public void setRecetas(Short recetas) {
        this.recetas = recetas;
    }

    public Short getDiasDeReposo() {
        return diasDeReposo;
    }

    public void setDiasDeReposo(Short diasDeReposo) {
        this.diasDeReposo = diasDeReposo;
    }

    public Short getRadiografias() {
        return radiografias;
    }

    public void setRadiografias(Short radiografias) {
        this.radiografias = radiografias;
    }

    public Short getAmpollasAnestesia() {
        return ampollasAnestesia;
    }

    public void setAmpollasAnestesia(Short ampollasAnestesia) {
        this.ampollasAnestesia = ampollasAnestesia;
    }

    public Short getExamenes() {
        return examenes;
    }

    public void setExamenes(Short examenes) {
        this.examenes = examenes;
    }

    public Character getHospitalizacion() {
        return hospitalizacion;
    }

    public void setHospitalizacion(Character hospitalizacion) {
        this.hospitalizacion = hospitalizacion;
    }

    public Character getResultado() {
        return resultado;
    }

    public void setResultado(Character resultado) {
        this.resultado = resultado;
    }

    public String getEstadoNutricional() {
        return estadoNutricional;
    }

    public void setEstadoNutricional(String estadoNutricional) {
        this.estadoNutricional = estadoNutricional;
    }

    public Character getEda() {
        return eda;
    }

    public void setEda(Character eda) {
        this.eda = eda;
    }

    public Character getIra() {
        return ira;
    }

    public void setIra(Character ira) {
        this.ira = ira;
    }

    public String getAntinconceptivo() {
        return antinconceptivo;
    }

    public void setAntinconceptivo(String antinconceptivo) {
        this.antinconceptivo = antinconceptivo;
    }

    public String getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(String embarazada) {
        this.embarazada = embarazada;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
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

    public TurnosCe getTurnosCe() {
        return turnosCe;
    }

    public void setTurnosCe(TurnosCe turnosCe) {
        this.turnosCe = turnosCe;
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
        if (!(object instanceof Consultas)) {
            return false;
        }
        Consultas other = (Consultas) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Consultas[ numero=" + numero + " ]";
    }
    
}
