/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CARGOS")
@NamedQueries({
    @NamedQuery(name = "Cargos.findAll", query = "SELECT c FROM Cargos c")})
public class Cargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CargosPK cargosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO")
    private BigDecimal costo;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "COSTO_MODIFICABLE")
    private Character costoModificable;
    @Column(name = "EQUIPO_ESPECIAL")
    private Character equipoEspecial;
    @Column(name = "AGRUPADOR_CONTABLE")
    private String agrupadorContable;
    @Column(name = "TIEMPO")
    private Character tiempo;
    @Column(name = "FACTOR")
    private BigDecimal factor;
    @Column(name = "RANGO_MINIMO")
    private BigDecimal rangoMinimo;
    @Column(name = "RANGO_MAXIMO")
    private BigDecimal rangoMaximo;
    @Column(name = "OPERADOR")
    private String operador;
    @Column(name = "CANTIDAD_MINIMA")
    private BigDecimal cantidadMinima;
    @Column(name = "TIPO_HONORARIO")
    private String tipoHonorario;
    @Column(name = "MAXIMO_DESCUENTO")
    private BigDecimal maximoDescuento;
    @Column(name = "NOMBRE_IESS")
    private String nombreIess;
    @Column(name = "CODIGO_IESS")
    private String codigoIess;
    @Column(name = "GOBIERNO")
    private String gobierno;
    @Column(name = "ANESTESIA_IESS")
    private String anestesiaIess;
    @Column(name = "IESS")
    private String iess;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<Copagos> copagosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<ConveniosEquivalencias> conveniosEquivalenciasList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<TiposDeExamenes> tiposDeExamenesList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<ExcepcionesPromociones> excepcionesPromocionesList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<CamasHospitalizacion> camasHospitalizacionList;
    @JoinColumns({
        @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "AGRCNT_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "AGRCNT_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrupadoresContables agrupadoresContables;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<DietasCargos> dietasCargosList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<VariablesDeExamenes> variablesDeExamenesList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<ElementosDeCosto> elementosDeCostoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<CargosTareas> cargosTareasList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<ItemsCargosCopago> itemsCargosCopagoList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<TiposPromociones> tiposPromocionesList;
    @OneToMany(mappedBy = "cargos", fetch = FetchType.LAZY)
    private List<Asociados> asociadosList;

    public Cargos() {
    }

    public Cargos(CargosPK cargosPK) {
        this.cargosPK = cargosPK;
    }

    public Cargos(Character tipo, String codigo) {
        this.cargosPK = new CargosPK(tipo, codigo);
    }

    public CargosPK getCargosPK() {
        return cargosPK;
    }

    public void setCargosPK(CargosPK cargosPK) {
        this.cargosPK = cargosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getCostoModificable() {
        return costoModificable;
    }

    public void setCostoModificable(Character costoModificable) {
        this.costoModificable = costoModificable;
    }

    public Character getEquipoEspecial() {
        return equipoEspecial;
    }

    public void setEquipoEspecial(Character equipoEspecial) {
        this.equipoEspecial = equipoEspecial;
    }

    public String getAgrupadorContable() {
        return agrupadorContable;
    }

    public void setAgrupadorContable(String agrupadorContable) {
        this.agrupadorContable = agrupadorContable;
    }

    public Character getTiempo() {
        return tiempo;
    }

    public void setTiempo(Character tiempo) {
        this.tiempo = tiempo;
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }

    public BigDecimal getRangoMinimo() {
        return rangoMinimo;
    }

    public void setRangoMinimo(BigDecimal rangoMinimo) {
        this.rangoMinimo = rangoMinimo;
    }

    public BigDecimal getRangoMaximo() {
        return rangoMaximo;
    }

    public void setRangoMaximo(BigDecimal rangoMaximo) {
        this.rangoMaximo = rangoMaximo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public BigDecimal getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(BigDecimal cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public String getTipoHonorario() {
        return tipoHonorario;
    }

    public void setTipoHonorario(String tipoHonorario) {
        this.tipoHonorario = tipoHonorario;
    }

    public BigDecimal getMaximoDescuento() {
        return maximoDescuento;
    }

    public void setMaximoDescuento(BigDecimal maximoDescuento) {
        this.maximoDescuento = maximoDescuento;
    }

    public String getNombreIess() {
        return nombreIess;
    }

    public void setNombreIess(String nombreIess) {
        this.nombreIess = nombreIess;
    }

    public String getCodigoIess() {
        return codigoIess;
    }

    public void setCodigoIess(String codigoIess) {
        this.codigoIess = codigoIess;
    }

    public String getGobierno() {
        return gobierno;
    }

    public void setGobierno(String gobierno) {
        this.gobierno = gobierno;
    }

    public String getAnestesiaIess() {
        return anestesiaIess;
    }

    public void setAnestesiaIess(String anestesiaIess) {
        this.anestesiaIess = anestesiaIess;
    }

    public String getIess() {
        return iess;
    }

    public void setIess(String iess) {
        this.iess = iess;
    }

    public List<Copagos> getCopagosList() {
        return copagosList;
    }

    public void setCopagosList(List<Copagos> copagosList) {
        this.copagosList = copagosList;
    }

    public List<ConveniosEquivalencias> getConveniosEquivalenciasList() {
        return conveniosEquivalenciasList;
    }

    public void setConveniosEquivalenciasList(List<ConveniosEquivalencias> conveniosEquivalenciasList) {
        this.conveniosEquivalenciasList = conveniosEquivalenciasList;
    }

    public List<TiposDeExamenes> getTiposDeExamenesList() {
        return tiposDeExamenesList;
    }

    public void setTiposDeExamenesList(List<TiposDeExamenes> tiposDeExamenesList) {
        this.tiposDeExamenesList = tiposDeExamenesList;
    }

    public List<ExcepcionesPromociones> getExcepcionesPromocionesList() {
        return excepcionesPromocionesList;
    }

    public void setExcepcionesPromocionesList(List<ExcepcionesPromociones> excepcionesPromocionesList) {
        this.excepcionesPromocionesList = excepcionesPromocionesList;
    }

    public List<CamasHospitalizacion> getCamasHospitalizacionList() {
        return camasHospitalizacionList;
    }

    public void setCamasHospitalizacionList(List<CamasHospitalizacion> camasHospitalizacionList) {
        this.camasHospitalizacionList = camasHospitalizacionList;
    }

    public AgrupadoresContables getAgrupadoresContables() {
        return agrupadoresContables;
    }

    public void setAgrupadoresContables(AgrupadoresContables agrupadoresContables) {
        this.agrupadoresContables = agrupadoresContables;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public List<DietasCargos> getDietasCargosList() {
        return dietasCargosList;
    }

    public void setDietasCargosList(List<DietasCargos> dietasCargosList) {
        this.dietasCargosList = dietasCargosList;
    }

    public List<VariablesDeExamenes> getVariablesDeExamenesList() {
        return variablesDeExamenesList;
    }

    public void setVariablesDeExamenesList(List<VariablesDeExamenes> variablesDeExamenesList) {
        this.variablesDeExamenesList = variablesDeExamenesList;
    }

    public List<ElementosDeCosto> getElementosDeCostoList() {
        return elementosDeCostoList;
    }

    public void setElementosDeCostoList(List<ElementosDeCosto> elementosDeCostoList) {
        this.elementosDeCostoList = elementosDeCostoList;
    }

    public List<CargosTareas> getCargosTareasList() {
        return cargosTareasList;
    }

    public void setCargosTareasList(List<CargosTareas> cargosTareasList) {
        this.cargosTareasList = cargosTareasList;
    }

    public List<ItemsCargosCopago> getItemsCargosCopagoList() {
        return itemsCargosCopagoList;
    }

    public void setItemsCargosCopagoList(List<ItemsCargosCopago> itemsCargosCopagoList) {
        this.itemsCargosCopagoList = itemsCargosCopagoList;
    }

    public List<TiposPromociones> getTiposPromocionesList() {
        return tiposPromocionesList;
    }

    public void setTiposPromocionesList(List<TiposPromociones> tiposPromocionesList) {
        this.tiposPromocionesList = tiposPromocionesList;
    }

    public List<Asociados> getAsociadosList() {
        return asociadosList;
    }

    public void setAsociadosList(List<Asociados> asociadosList) {
        this.asociadosList = asociadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargosPK != null ? cargosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargos)) {
            return false;
        }
        Cargos other = (Cargos) object;
        if ((this.cargosPK == null && other.cargosPK != null) || (this.cargosPK != null && !this.cargosPK.equals(other.cargosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Cargos[ cargosPK=" + cargosPK + " ]";
    }
    
}
