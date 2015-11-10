/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PAPANICOLAOUS")
@NamedQueries({
    @NamedQuery(name = "Papanicolaous.findAll", query = "SELECT p FROM Papanicolaous p")})
public class Papanicolaous implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private Integer exmNumero;
    @Column(name = "EMBARAZADA")
    private Character embarazada;
    @Column(name = "LACTANCIA")
    private Character lactancia;
    @Column(name = "NUMERO_DE_PLACAS")
    private Short numeroDePlacas;
    @Column(name = "ASPECTO_DE_CUELLO")
    private String aspectoDeCuello;
    @Column(name = "FECHA_ULTIMA_MENSTRUACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaMenstruacion;
    @Column(name = "EDAD_DE_INICIO_DE_RELACIONES_S")
    private Short edadDeInicioDeRelacionesS;
    @Column(name = "NUMERO_DE_PARTOS")
    private BigInteger numeroDePartos;
    @Column(name = "NUMERO_DE_ABORTOS")
    private BigInteger numeroDeAbortos;
    @Column(name = "CALIFICADOR_DE_INFLAMACION")
    private String calificadorDeInflamacion;
    @Column(name = "FROTIS_LIMPIO")
    private Character frotisLimpio;
    @Column(name = "ALTERACION_CELULAR")
    private String alteracionCelular;
    @Column(name = "MALIGNIDAD")
    private String malignidad;
    @Column(name = "RECOMENDACION")
    private String recomendacion;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "COMPA\u00d1EROS_SEXUALES")
    private Short compañerosSexuales;
    @Column(name = "VERRUGAS_PACIENTE")
    private Character verrugasPaciente;
    @Column(name = "VERRUGAS_ESPOSO")
    private Character verrugasEsposo;
    @Column(name = "SECRECION_VAGINAL")
    private String secrecionVaginal;
    @Column(name = "ANTICONCEPTIVO")
    private String anticonceptivo;
    @Column(name = "MENOPAUSIA")
    private Short menopausia;
    @Column(name = "DATOS_CLINICOS")
    private String datosClinicos;
    @Column(name = "NRO_INTERNO")
    private String nroInterno;
    @JoinColumn(name = "EXM_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Examenes examenes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "papanicolaous", fetch = FetchType.LAZY)
    private List<GermenesEnPaps> germenesEnPapsList;

    public Papanicolaous() {
    }

    public Papanicolaous(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Integer getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Character getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(Character embarazada) {
        this.embarazada = embarazada;
    }

    public Character getLactancia() {
        return lactancia;
    }

    public void setLactancia(Character lactancia) {
        this.lactancia = lactancia;
    }

    public Short getNumeroDePlacas() {
        return numeroDePlacas;
    }

    public void setNumeroDePlacas(Short numeroDePlacas) {
        this.numeroDePlacas = numeroDePlacas;
    }

    public String getAspectoDeCuello() {
        return aspectoDeCuello;
    }

    public void setAspectoDeCuello(String aspectoDeCuello) {
        this.aspectoDeCuello = aspectoDeCuello;
    }

    public Date getFechaUltimaMenstruacion() {
        return fechaUltimaMenstruacion;
    }

    public void setFechaUltimaMenstruacion(Date fechaUltimaMenstruacion) {
        this.fechaUltimaMenstruacion = fechaUltimaMenstruacion;
    }

    public Short getEdadDeInicioDeRelacionesS() {
        return edadDeInicioDeRelacionesS;
    }

    public void setEdadDeInicioDeRelacionesS(Short edadDeInicioDeRelacionesS) {
        this.edadDeInicioDeRelacionesS = edadDeInicioDeRelacionesS;
    }

    public BigInteger getNumeroDePartos() {
        return numeroDePartos;
    }

    public void setNumeroDePartos(BigInteger numeroDePartos) {
        this.numeroDePartos = numeroDePartos;
    }

    public BigInteger getNumeroDeAbortos() {
        return numeroDeAbortos;
    }

    public void setNumeroDeAbortos(BigInteger numeroDeAbortos) {
        this.numeroDeAbortos = numeroDeAbortos;
    }

    public String getCalificadorDeInflamacion() {
        return calificadorDeInflamacion;
    }

    public void setCalificadorDeInflamacion(String calificadorDeInflamacion) {
        this.calificadorDeInflamacion = calificadorDeInflamacion;
    }

    public Character getFrotisLimpio() {
        return frotisLimpio;
    }

    public void setFrotisLimpio(Character frotisLimpio) {
        this.frotisLimpio = frotisLimpio;
    }

    public String getAlteracionCelular() {
        return alteracionCelular;
    }

    public void setAlteracionCelular(String alteracionCelular) {
        this.alteracionCelular = alteracionCelular;
    }

    public String getMalignidad() {
        return malignidad;
    }

    public void setMalignidad(String malignidad) {
        this.malignidad = malignidad;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Short getCompañerosSexuales() {
        return compañerosSexuales;
    }

    public void setCompañerosSexuales(Short compañerosSexuales) {
        this.compañerosSexuales = compañerosSexuales;
    }

    public Character getVerrugasPaciente() {
        return verrugasPaciente;
    }

    public void setVerrugasPaciente(Character verrugasPaciente) {
        this.verrugasPaciente = verrugasPaciente;
    }

    public Character getVerrugasEsposo() {
        return verrugasEsposo;
    }

    public void setVerrugasEsposo(Character verrugasEsposo) {
        this.verrugasEsposo = verrugasEsposo;
    }

    public String getSecrecionVaginal() {
        return secrecionVaginal;
    }

    public void setSecrecionVaginal(String secrecionVaginal) {
        this.secrecionVaginal = secrecionVaginal;
    }

    public String getAnticonceptivo() {
        return anticonceptivo;
    }

    public void setAnticonceptivo(String anticonceptivo) {
        this.anticonceptivo = anticonceptivo;
    }

    public Short getMenopausia() {
        return menopausia;
    }

    public void setMenopausia(Short menopausia) {
        this.menopausia = menopausia;
    }

    public String getDatosClinicos() {
        return datosClinicos;
    }

    public void setDatosClinicos(String datosClinicos) {
        this.datosClinicos = datosClinicos;
    }

    public String getNroInterno() {
        return nroInterno;
    }

    public void setNroInterno(String nroInterno) {
        this.nroInterno = nroInterno;
    }

    public Examenes getExamenes() {
        return examenes;
    }

    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<GermenesEnPaps> getGermenesEnPapsList() {
        return germenesEnPapsList;
    }

    public void setGermenesEnPapsList(List<GermenesEnPaps> germenesEnPapsList) {
        this.germenesEnPapsList = germenesEnPapsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exmNumero != null ? exmNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Papanicolaous)) {
            return false;
        }
        Papanicolaous other = (Papanicolaous) object;
        if ((this.exmNumero == null && other.exmNumero != null) || (this.exmNumero != null && !this.exmNumero.equals(other.exmNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Papanicolaous[ exmNumero=" + exmNumero + " ]";
    }
    
}
