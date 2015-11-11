/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "EXAMENES_PATOLOGIA_EXTERNOS")
@NamedQueries({
    @NamedQuery(name = "ExamenesPatologiaExternos.findAll", query = "SELECT e FROM ExamenesPatologiaExternos e")})
public class ExamenesPatologiaExternos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DGNLBR_CODIGO")
    private String dgnlbrCodigo;
    @Column(name = "DGNLBR_CODIGO2")
    private String dgnlbrCodigo2;
    @Column(name = "DGNLBR_CODIGO3")
    private String dgnlbrCodigo3;
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_EXAMEN")
    private Integer numeroExamen;
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    @Column(name = "EDAD")
    private Short edad;
    @Column(name = "PROCEDENCIA")
    private String procedencia;
    @Column(name = "FECHA_ULTIMA_MESTRUACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaMestruacion;
    @Column(name = "ANTICONCEPTIVO")
    private String anticonceptivo;
    @Column(name = "PRIMERA_VEZ")
    private Character primeraVez;
    @Column(name = "SUBSECUENTES")
    private Character subsecuentes;
    @Column(name = "MENOPAUSIA")
    private Character menopausia;
    @Column(name = "MATERIAL_ENVIADO")
    private String materialEnviado;
    @Column(name = "DATOS_CLINICOS")
    private String datosClinicos;
    @Column(name = "IMPRESION_DIAGNOSTICA")
    private String impresionDiagnostica;
    @Column(name = "FECHA_INFORME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInforme;
    @Column(name = "MEDICO_SOLICITANTE")
    private String medicoSolicitante;
    @Column(name = "MACROSCOPICO")
    private String macroscopico;

    public ExamenesPatologiaExternos() {
    }

    public ExamenesPatologiaExternos(Integer numeroExamen) {
        this.numeroExamen = numeroExamen;
    }

    public String getDgnlbrCodigo() {
        return dgnlbrCodigo;
    }

    public void setDgnlbrCodigo(String dgnlbrCodigo) {
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    public String getDgnlbrCodigo2() {
        return dgnlbrCodigo2;
    }

    public void setDgnlbrCodigo2(String dgnlbrCodigo2) {
        this.dgnlbrCodigo2 = dgnlbrCodigo2;
    }

    public String getDgnlbrCodigo3() {
        return dgnlbrCodigo3;
    }

    public void setDgnlbrCodigo3(String dgnlbrCodigo3) {
        this.dgnlbrCodigo3 = dgnlbrCodigo3;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Integer getNumeroExamen() {
        return numeroExamen;
    }

    public void setNumeroExamen(Integer numeroExamen) {
        this.numeroExamen = numeroExamen;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Date getFechaUltimaMestruacion() {
        return fechaUltimaMestruacion;
    }

    public void setFechaUltimaMestruacion(Date fechaUltimaMestruacion) {
        this.fechaUltimaMestruacion = fechaUltimaMestruacion;
    }

    public String getAnticonceptivo() {
        return anticonceptivo;
    }

    public void setAnticonceptivo(String anticonceptivo) {
        this.anticonceptivo = anticonceptivo;
    }

    public Character getPrimeraVez() {
        return primeraVez;
    }

    public void setPrimeraVez(Character primeraVez) {
        this.primeraVez = primeraVez;
    }

    public Character getSubsecuentes() {
        return subsecuentes;
    }

    public void setSubsecuentes(Character subsecuentes) {
        this.subsecuentes = subsecuentes;
    }

    public Character getMenopausia() {
        return menopausia;
    }

    public void setMenopausia(Character menopausia) {
        this.menopausia = menopausia;
    }

    public String getMaterialEnviado() {
        return materialEnviado;
    }

    public void setMaterialEnviado(String materialEnviado) {
        this.materialEnviado = materialEnviado;
    }

    public String getDatosClinicos() {
        return datosClinicos;
    }

    public void setDatosClinicos(String datosClinicos) {
        this.datosClinicos = datosClinicos;
    }

    public String getImpresionDiagnostica() {
        return impresionDiagnostica;
    }

    public void setImpresionDiagnostica(String impresionDiagnostica) {
        this.impresionDiagnostica = impresionDiagnostica;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getMedicoSolicitante() {
        return medicoSolicitante;
    }

    public void setMedicoSolicitante(String medicoSolicitante) {
        this.medicoSolicitante = medicoSolicitante;
    }

    public String getMacroscopico() {
        return macroscopico;
    }

    public void setMacroscopico(String macroscopico) {
        this.macroscopico = macroscopico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroExamen != null ? numeroExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenesPatologiaExternos)) {
            return false;
        }
        ExamenesPatologiaExternos other = (ExamenesPatologiaExternos) object;
        if ((this.numeroExamen == null && other.numeroExamen != null) || (this.numeroExamen != null && !this.numeroExamen.equals(other.numeroExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ExamenesPatologiaExternos[ numeroExamen=" + numeroExamen + " ]";
    }
    
}
