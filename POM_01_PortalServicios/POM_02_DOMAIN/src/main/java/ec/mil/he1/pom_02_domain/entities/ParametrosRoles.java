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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PARAMETROS_ROLES")
@NamedQueries({
    @NamedQuery(name = "ParametrosRoles.findAll", query = "SELECT p FROM ParametrosRoles p")})
public class ParametrosRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosRolesPK parametrosRolesPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ALIAS")
    private String alias;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "TIPO_MOVIMIENTO")
    private String tipoMovimiento;
    @Column(name = "MES_ACTIVIDAD")
    private String mesActividad;
    @Column(name = "PROPIETARIO")
    private String propietario;
    @Column(name = "PROVISION")
    private Character provision;
    @Column(name = "MODIFICABLE_EN_ROL")
    private Character modificableEnRol;
    @Column(name = "ETIQUETA")
    private String etiqueta;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "LIMITE_INFERIOR")
    private BigDecimal limiteInferior;
    @Column(name = "LIMITE_SUPERIOR")
    private BigDecimal limiteSuperior;
    @Column(name = "APLICA_IR")
    private Character aplicaIr;
    @Column(name = "NOMBRE_AGRUPADOR")
    private String nombreAgrupador;
    @Column(name = "SECUENCIA_EN_ROL")
    private Short secuenciaEnRol;
    @Column(name = "IMPRIMIR_CERO")
    private Character imprimirCero;
    @Column(name = "SECUENCIA_DESPLIEGUE")
    private Short secuenciaDespliegue;
    @Column(name = "TIPO_CONTABILIZACION")
    private String tipoContabilizacion;
    @Column(name = "APLICA_IESS")
    private Character aplicaIess;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<DetallesEspeciales> detallesEspecialesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<DetallesLiquidaciones> detallesLiquidacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<DatosIntervienen> datosIntervienenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<MovimientosRoles> movimientosRolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<ParametrosRolesEmpleado> parametrosRolesEmpleadoList;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @OneToMany(mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<DetallesFormulas> detallesFormulasList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private ParametrosFormulas parametrosFormulas;
    @OneToMany(mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<ControlesDePersonal> controlesDePersonalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<ParametrosPerfiles> parametrosPerfilesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<ParametrosNovedadesPersonal> parametrosNovedadesPersonalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private List<NovedadesRoles> novedadesRolesList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "parametrosRoles", fetch = FetchType.LAZY)
    private ParametrosEspeciales parametrosEspeciales;

    public ParametrosRoles() {
    }

    public ParametrosRoles(ParametrosRolesPK parametrosRolesPK) {
        this.parametrosRolesPK = parametrosRolesPK;
    }

    public ParametrosRoles(String empCodigo, String codigo) {
        this.parametrosRolesPK = new ParametrosRolesPK(empCodigo, codigo);
    }

    public ParametrosRolesPK getParametrosRolesPK() {
        return parametrosRolesPK;
    }

    public void setParametrosRolesPK(ParametrosRolesPK parametrosRolesPK) {
        this.parametrosRolesPK = parametrosRolesPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getMesActividad() {
        return mesActividad;
    }

    public void setMesActividad(String mesActividad) {
        this.mesActividad = mesActividad;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Character getProvision() {
        return provision;
    }

    public void setProvision(Character provision) {
        this.provision = provision;
    }

    public Character getModificableEnRol() {
        return modificableEnRol;
    }

    public void setModificableEnRol(Character modificableEnRol) {
        this.modificableEnRol = modificableEnRol;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(BigDecimal limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public BigDecimal getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(BigDecimal limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public Character getAplicaIr() {
        return aplicaIr;
    }

    public void setAplicaIr(Character aplicaIr) {
        this.aplicaIr = aplicaIr;
    }

    public String getNombreAgrupador() {
        return nombreAgrupador;
    }

    public void setNombreAgrupador(String nombreAgrupador) {
        this.nombreAgrupador = nombreAgrupador;
    }

    public Short getSecuenciaEnRol() {
        return secuenciaEnRol;
    }

    public void setSecuenciaEnRol(Short secuenciaEnRol) {
        this.secuenciaEnRol = secuenciaEnRol;
    }

    public Character getImprimirCero() {
        return imprimirCero;
    }

    public void setImprimirCero(Character imprimirCero) {
        this.imprimirCero = imprimirCero;
    }

    public Short getSecuenciaDespliegue() {
        return secuenciaDespliegue;
    }

    public void setSecuenciaDespliegue(Short secuenciaDespliegue) {
        this.secuenciaDespliegue = secuenciaDespliegue;
    }

    public String getTipoContabilizacion() {
        return tipoContabilizacion;
    }

    public void setTipoContabilizacion(String tipoContabilizacion) {
        this.tipoContabilizacion = tipoContabilizacion;
    }

    public Character getAplicaIess() {
        return aplicaIess;
    }

    public void setAplicaIess(Character aplicaIess) {
        this.aplicaIess = aplicaIess;
    }

    public List<DetallesEspeciales> getDetallesEspecialesList() {
        return detallesEspecialesList;
    }

    public void setDetallesEspecialesList(List<DetallesEspeciales> detallesEspecialesList) {
        this.detallesEspecialesList = detallesEspecialesList;
    }

    public List<DetallesLiquidaciones> getDetallesLiquidacionesList() {
        return detallesLiquidacionesList;
    }

    public void setDetallesLiquidacionesList(List<DetallesLiquidaciones> detallesLiquidacionesList) {
        this.detallesLiquidacionesList = detallesLiquidacionesList;
    }

    public List<DatosIntervienen> getDatosIntervienenList() {
        return datosIntervienenList;
    }

    public void setDatosIntervienenList(List<DatosIntervienen> datosIntervienenList) {
        this.datosIntervienenList = datosIntervienenList;
    }

    public List<MovimientosRoles> getMovimientosRolesList() {
        return movimientosRolesList;
    }

    public void setMovimientosRolesList(List<MovimientosRoles> movimientosRolesList) {
        this.movimientosRolesList = movimientosRolesList;
    }

    public List<ParametrosRolesEmpleado> getParametrosRolesEmpleadoList() {
        return parametrosRolesEmpleadoList;
    }

    public void setParametrosRolesEmpleadoList(List<ParametrosRolesEmpleado> parametrosRolesEmpleadoList) {
        this.parametrosRolesEmpleadoList = parametrosRolesEmpleadoList;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public List<DetallesFormulas> getDetallesFormulasList() {
        return detallesFormulasList;
    }

    public void setDetallesFormulasList(List<DetallesFormulas> detallesFormulasList) {
        this.detallesFormulasList = detallesFormulasList;
    }

    public ParametrosFormulas getParametrosFormulas() {
        return parametrosFormulas;
    }

    public void setParametrosFormulas(ParametrosFormulas parametrosFormulas) {
        this.parametrosFormulas = parametrosFormulas;
    }

    public List<ControlesDePersonal> getControlesDePersonalList() {
        return controlesDePersonalList;
    }

    public void setControlesDePersonalList(List<ControlesDePersonal> controlesDePersonalList) {
        this.controlesDePersonalList = controlesDePersonalList;
    }

    public List<ParametrosPerfiles> getParametrosPerfilesList() {
        return parametrosPerfilesList;
    }

    public void setParametrosPerfilesList(List<ParametrosPerfiles> parametrosPerfilesList) {
        this.parametrosPerfilesList = parametrosPerfilesList;
    }

    public List<ParametrosNovedadesPersonal> getParametrosNovedadesPersonalList() {
        return parametrosNovedadesPersonalList;
    }

    public void setParametrosNovedadesPersonalList(List<ParametrosNovedadesPersonal> parametrosNovedadesPersonalList) {
        this.parametrosNovedadesPersonalList = parametrosNovedadesPersonalList;
    }

    public List<NovedadesRoles> getNovedadesRolesList() {
        return novedadesRolesList;
    }

    public void setNovedadesRolesList(List<NovedadesRoles> novedadesRolesList) {
        this.novedadesRolesList = novedadesRolesList;
    }

    public ParametrosEspeciales getParametrosEspeciales() {
        return parametrosEspeciales;
    }

    public void setParametrosEspeciales(ParametrosEspeciales parametrosEspeciales) {
        this.parametrosEspeciales = parametrosEspeciales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosRolesPK != null ? parametrosRolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosRoles)) {
            return false;
        }
        ParametrosRoles other = (ParametrosRoles) object;
        if ((this.parametrosRolesPK == null && other.parametrosRolesPK != null) || (this.parametrosRolesPK != null && !this.parametrosRolesPK.equals(other.parametrosRolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosRoles[ parametrosRolesPK=" + parametrosRolesPK + " ]";
    }
    
}
