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
@Table(name = "BIOPSIAS")
@NamedQueries({
    @NamedQuery(name = "Biopsias.findAll", query = "SELECT b FROM Biopsias b")})
public class Biopsias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private Integer exmNumero;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "MALIGNIDAD")
    private String malignidad;
    @Column(name = "TPOCRG_CODIGO")
    private String tpocrgCodigo;
    @Column(name = "PRTQMT_CODIGO")
    private String prtqmtCodigo;
    @Column(name = "MACROSCOPICO")
    private String macroscopico;
    @Column(name = "MICROSCOPICO")
    private String microscopico;
    @Column(name = "DIAGNOSTICO_PATOLOGICO")
    private String diagnosticoPatologico;
    @Column(name = "TRATAMIENTO_HORMONAL")
    private String tratamientoHormonal;
    @Column(name = "RADIOTERAPIA")
    private String radioterapia;
    @Column(name = "USO_DE_ANTICONCEPTIVO")
    private String usoDeAnticonceptivo;
    @Column(name = "EDAD_DE_MENOPAUSIA")
    private Short edadDeMenopausia;
    @Column(name = "MATERIAL_ENVIADO")
    private String materialEnviado;
    @Column(name = "FECHA_ULTIMA_MENSTRUACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaMenstruacion;
    @Column(name = "COMPLEMENTOS")
    private String complementos;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "NRO_INTERNO")
    private String nroInterno;

    public Biopsias() {
    }

    public Biopsias(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Integer getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getMalignidad() {
        return malignidad;
    }

    public void setMalignidad(String malignidad) {
        this.malignidad = malignidad;
    }

    public String getTpocrgCodigo() {
        return tpocrgCodigo;
    }

    public void setTpocrgCodigo(String tpocrgCodigo) {
        this.tpocrgCodigo = tpocrgCodigo;
    }

    public String getPrtqmtCodigo() {
        return prtqmtCodigo;
    }

    public void setPrtqmtCodigo(String prtqmtCodigo) {
        this.prtqmtCodigo = prtqmtCodigo;
    }

    public String getMacroscopico() {
        return macroscopico;
    }

    public void setMacroscopico(String macroscopico) {
        this.macroscopico = macroscopico;
    }

    public String getMicroscopico() {
        return microscopico;
    }

    public void setMicroscopico(String microscopico) {
        this.microscopico = microscopico;
    }

    public String getDiagnosticoPatologico() {
        return diagnosticoPatologico;
    }

    public void setDiagnosticoPatologico(String diagnosticoPatologico) {
        this.diagnosticoPatologico = diagnosticoPatologico;
    }

    public String getTratamientoHormonal() {
        return tratamientoHormonal;
    }

    public void setTratamientoHormonal(String tratamientoHormonal) {
        this.tratamientoHormonal = tratamientoHormonal;
    }

    public String getRadioterapia() {
        return radioterapia;
    }

    public void setRadioterapia(String radioterapia) {
        this.radioterapia = radioterapia;
    }

    public String getUsoDeAnticonceptivo() {
        return usoDeAnticonceptivo;
    }

    public void setUsoDeAnticonceptivo(String usoDeAnticonceptivo) {
        this.usoDeAnticonceptivo = usoDeAnticonceptivo;
    }

    public Short getEdadDeMenopausia() {
        return edadDeMenopausia;
    }

    public void setEdadDeMenopausia(Short edadDeMenopausia) {
        this.edadDeMenopausia = edadDeMenopausia;
    }

    public String getMaterialEnviado() {
        return materialEnviado;
    }

    public void setMaterialEnviado(String materialEnviado) {
        this.materialEnviado = materialEnviado;
    }

    public Date getFechaUltimaMenstruacion() {
        return fechaUltimaMenstruacion;
    }

    public void setFechaUltimaMenstruacion(Date fechaUltimaMenstruacion) {
        this.fechaUltimaMenstruacion = fechaUltimaMenstruacion;
    }

    public String getComplementos() {
        return complementos;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNroInterno() {
        return nroInterno;
    }

    public void setNroInterno(String nroInterno) {
        this.nroInterno = nroInterno;
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
        if (!(object instanceof Biopsias)) {
            return false;
        }
        Biopsias other = (Biopsias) object;
        if ((this.exmNumero == null && other.exmNumero != null) || (this.exmNumero != null && !this.exmNumero.equals(other.exmNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Biopsias[ exmNumero=" + exmNumero + " ]";
    }
    
}
