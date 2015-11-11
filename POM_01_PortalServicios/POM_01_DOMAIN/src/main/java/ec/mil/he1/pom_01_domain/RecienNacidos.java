/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "RECIEN_NACIDOS")
@NamedQueries({
    @NamedQuery(name = "RecienNacidos.findAll", query = "SELECT r FROM RecienNacidos r")})
public class RecienNacidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RecienNacidosPK recienNacidosPK;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "PESO_AL_NACER")
    private Short pesoAlNacer;
    @Column(name = "MENOR_PESO")
    private Character menorPeso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TALLA")
    private BigDecimal talla;
    @Column(name = "PERIMETRO_CEFALICO")
    private BigDecimal perimetroCefalico;
    @Column(name = "EDAD")
    private Short edad;
    @Column(name = "MENOR_EDAD")
    private Character menorEdad;
    @Column(name = "APGAR")
    private String apgar;
    @Column(name = "APGAR5")
    private String apgar5;
    @Column(name = "REANIMACION")
    private Character reanimacion;
    @Column(name = "TIPO_REANIMACION")
    private String tipoReanimacion;
    @Column(name = "TIPO_SANGRE")
    private String tipoSangre;
    @Column(name = "EXAMEN_FISICO")
    private String examenFisico;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ESTADO_EGRESO")
    private String estadoEgreso;
    @Column(name = "FECHA_EGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEgreso;

    public RecienNacidos() {
    }

    public RecienNacidos(RecienNacidosPK recienNacidosPK) {
        this.recienNacidosPK = recienNacidosPK;
    }

    public RecienNacidos(int rgsobsPcnNumeroHc, int rgsobsNumero, int numero) {
        this.recienNacidosPK = new RecienNacidosPK(rgsobsPcnNumeroHc, rgsobsNumero, numero);
    }

    public RecienNacidosPK getRecienNacidosPK() {
        return recienNacidosPK;
    }

    public void setRecienNacidosPK(RecienNacidosPK recienNacidosPK) {
        this.recienNacidosPK = recienNacidosPK;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Short getPesoAlNacer() {
        return pesoAlNacer;
    }

    public void setPesoAlNacer(Short pesoAlNacer) {
        this.pesoAlNacer = pesoAlNacer;
    }

    public Character getMenorPeso() {
        return menorPeso;
    }

    public void setMenorPeso(Character menorPeso) {
        this.menorPeso = menorPeso;
    }

    public BigDecimal getTalla() {
        return talla;
    }

    public void setTalla(BigDecimal talla) {
        this.talla = talla;
    }

    public BigDecimal getPerimetroCefalico() {
        return perimetroCefalico;
    }

    public void setPerimetroCefalico(BigDecimal perimetroCefalico) {
        this.perimetroCefalico = perimetroCefalico;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public Character getMenorEdad() {
        return menorEdad;
    }

    public void setMenorEdad(Character menorEdad) {
        this.menorEdad = menorEdad;
    }

    public String getApgar() {
        return apgar;
    }

    public void setApgar(String apgar) {
        this.apgar = apgar;
    }

    public String getApgar5() {
        return apgar5;
    }

    public void setApgar5(String apgar5) {
        this.apgar5 = apgar5;
    }

    public Character getReanimacion() {
        return reanimacion;
    }

    public void setReanimacion(Character reanimacion) {
        this.reanimacion = reanimacion;
    }

    public String getTipoReanimacion() {
        return tipoReanimacion;
    }

    public void setTipoReanimacion(String tipoReanimacion) {
        this.tipoReanimacion = tipoReanimacion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recienNacidosPK != null ? recienNacidosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecienNacidos)) {
            return false;
        }
        RecienNacidos other = (RecienNacidos) object;
        if ((this.recienNacidosPK == null && other.recienNacidosPK != null) || (this.recienNacidosPK != null && !this.recienNacidosPK.equals(other.recienNacidosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RecienNacidos[ recienNacidosPK=" + recienNacidosPK + " ]";
    }
    
}
