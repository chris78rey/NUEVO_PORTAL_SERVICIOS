/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "MODO_DE_PAGO")
@NamedQueries({
    @NamedQuery(name = "ModoDePago.findAll", query = "SELECT m FROM ModoDePago m")})
public class ModoDePago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Short numero;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "AGRUPADOR")
    private String agrupador;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "RETIENE_IVA")
    private Character retieneIva;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RETENCION")
    private BigDecimal retencion;
    @Column(name = "SUBRETENCION")
    private BigDecimal subretencion;
    @Column(name = "FORMULA_RETENCION")
    private String formulaRetencion;
    @Column(name = "NUMERO_DE_CUOTAS")
    private Short numeroDeCuotas;
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<DescargosGenerales> descargosGeneralesList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<CreacionEgresosFct> creacionEgresosFctList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<Copagos> copagosList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<CuotasACobrar> cuotasACobrarList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<CuotasACobrarAmortizadas> cuotasACobrarAmortizadasList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<FacturasAutomaticas> facturasAutomaticasList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<Notas> notasList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<PagosCm> pagosCmList;
    @OneToMany(mappedBy = "modoDePago", fetch = FetchType.LAZY)
    private List<ConveniosPorClase> conveniosPorClaseList;

    public ModoDePago() {
    }

    public ModoDePago(Short numero) {
        this.numero = numero;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(String agrupador) {
        this.agrupador = agrupador;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getRetieneIva() {
        return retieneIva;
    }

    public void setRetieneIva(Character retieneIva) {
        this.retieneIva = retieneIva;
    }

    public BigDecimal getRetencion() {
        return retencion;
    }

    public void setRetencion(BigDecimal retencion) {
        this.retencion = retencion;
    }

    public BigDecimal getSubretencion() {
        return subretencion;
    }

    public void setSubretencion(BigDecimal subretencion) {
        this.subretencion = subretencion;
    }

    public String getFormulaRetencion() {
        return formulaRetencion;
    }

    public void setFormulaRetencion(String formulaRetencion) {
        this.formulaRetencion = formulaRetencion;
    }

    public Short getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(Short numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<DescargosGenerales> getDescargosGeneralesList() {
        return descargosGeneralesList;
    }

    public void setDescargosGeneralesList(List<DescargosGenerales> descargosGeneralesList) {
        this.descargosGeneralesList = descargosGeneralesList;
    }

    public List<CreacionEgresosFct> getCreacionEgresosFctList() {
        return creacionEgresosFctList;
    }

    public void setCreacionEgresosFctList(List<CreacionEgresosFct> creacionEgresosFctList) {
        this.creacionEgresosFctList = creacionEgresosFctList;
    }

    public List<Copagos> getCopagosList() {
        return copagosList;
    }

    public void setCopagosList(List<Copagos> copagosList) {
        this.copagosList = copagosList;
    }

    public List<CuotasACobrar> getCuotasACobrarList() {
        return cuotasACobrarList;
    }

    public void setCuotasACobrarList(List<CuotasACobrar> cuotasACobrarList) {
        this.cuotasACobrarList = cuotasACobrarList;
    }

    public List<CuotasACobrarAmortizadas> getCuotasACobrarAmortizadasList() {
        return cuotasACobrarAmortizadasList;
    }

    public void setCuotasACobrarAmortizadasList(List<CuotasACobrarAmortizadas> cuotasACobrarAmortizadasList) {
        this.cuotasACobrarAmortizadasList = cuotasACobrarAmortizadasList;
    }

    public List<FacturasAutomaticas> getFacturasAutomaticasList() {
        return facturasAutomaticasList;
    }

    public void setFacturasAutomaticasList(List<FacturasAutomaticas> facturasAutomaticasList) {
        this.facturasAutomaticasList = facturasAutomaticasList;
    }

    public List<Notas> getNotasList() {
        return notasList;
    }

    public void setNotasList(List<Notas> notasList) {
        this.notasList = notasList;
    }

    public List<PagosCm> getPagosCmList() {
        return pagosCmList;
    }

    public void setPagosCmList(List<PagosCm> pagosCmList) {
        this.pagosCmList = pagosCmList;
    }

    public List<ConveniosPorClase> getConveniosPorClaseList() {
        return conveniosPorClaseList;
    }

    public void setConveniosPorClaseList(List<ConveniosPorClase> conveniosPorClaseList) {
        this.conveniosPorClaseList = conveniosPorClaseList;
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
        if (!(object instanceof ModoDePago)) {
            return false;
        }
        ModoDePago other = (ModoDePago) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ModoDePago[ numero=" + numero + " ]";
    }
    
}
