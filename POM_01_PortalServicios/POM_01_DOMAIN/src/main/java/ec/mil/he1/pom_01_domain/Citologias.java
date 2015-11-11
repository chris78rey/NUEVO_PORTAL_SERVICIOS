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
@Table(name = "CITOLOGIAS")
@NamedQueries({
    @NamedQuery(name = "Citologias.findAll", query = "SELECT c FROM Citologias c")})
public class Citologias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private Integer exmNumero;
    @Column(name = "USO_DE_ANTICONCEPTIVOS")
    private Character usoDeAnticonceptivos;
    @Column(name = "MATERIAL_ENVIADO")
    private String materialEnviado;
    @Column(name = "MALIGNIDAD")
    private String malignidad;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "TPOCRG_CODIGO")
    private String tpocrgCodigo;
    @Column(name = "PRTQMT_CODIGO")
    private String prtqmtCodigo;
    @Column(name = "FECHA_ULTIMA_MENSTRUACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaMenstruacion;
    @Column(name = "EDAD_DE_MENOPAUSIA")
    private Short edadDeMenopausia;
    @Column(name = "TRATAMIENTO_HORMONAL")
    private String tratamientoHormonal;
    @Column(name = "RADIOTERAPIA")
    private String radioterapia;
    @Column(name = "MATERIAL_RECIBIDO")
    private String materialRecibido;
    @Column(name = "CELULARIDAD")
    private String celularidad;
    @Column(name = "TECNICA_EMPLEADA")
    private String tecnicaEmpleada;
    @Column(name = "FECHA_DE_RESULTADOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeResultados;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public Citologias() {
    }

    public Citologias(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Integer getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Character getUsoDeAnticonceptivos() {
        return usoDeAnticonceptivos;
    }

    public void setUsoDeAnticonceptivos(Character usoDeAnticonceptivos) {
        this.usoDeAnticonceptivos = usoDeAnticonceptivos;
    }

    public String getMaterialEnviado() {
        return materialEnviado;
    }

    public void setMaterialEnviado(String materialEnviado) {
        this.materialEnviado = materialEnviado;
    }

    public String getMalignidad() {
        return malignidad;
    }

    public void setMalignidad(String malignidad) {
        this.malignidad = malignidad;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
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

    public Date getFechaUltimaMenstruacion() {
        return fechaUltimaMenstruacion;
    }

    public void setFechaUltimaMenstruacion(Date fechaUltimaMenstruacion) {
        this.fechaUltimaMenstruacion = fechaUltimaMenstruacion;
    }

    public Short getEdadDeMenopausia() {
        return edadDeMenopausia;
    }

    public void setEdadDeMenopausia(Short edadDeMenopausia) {
        this.edadDeMenopausia = edadDeMenopausia;
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

    public String getMaterialRecibido() {
        return materialRecibido;
    }

    public void setMaterialRecibido(String materialRecibido) {
        this.materialRecibido = materialRecibido;
    }

    public String getCelularidad() {
        return celularidad;
    }

    public void setCelularidad(String celularidad) {
        this.celularidad = celularidad;
    }

    public String getTecnicaEmpleada() {
        return tecnicaEmpleada;
    }

    public void setTecnicaEmpleada(String tecnicaEmpleada) {
        this.tecnicaEmpleada = tecnicaEmpleada;
    }

    public Date getFechaDeResultados() {
        return fechaDeResultados;
    }

    public void setFechaDeResultados(Date fechaDeResultados) {
        this.fechaDeResultados = fechaDeResultados;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        if (!(object instanceof Citologias)) {
            return false;
        }
        Citologias other = (Citologias) object;
        if ((this.exmNumero == null && other.exmNumero != null) || (this.exmNumero != null && !this.exmNumero.equals(other.exmNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Citologias[ exmNumero=" + exmNumero + " ]";
    }
    
}
