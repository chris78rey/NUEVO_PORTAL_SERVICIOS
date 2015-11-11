/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
        return "ec.mil.he1.pom_01_domain.ParametrosRoles[ parametrosRolesPK=" + parametrosRolesPK + " ]";
    }
    
}
