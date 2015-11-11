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
@Table(name = "CUENTAS_BANCARIAS")
@NamedQueries({
    @NamedQuery(name = "CuentasBancarias.findAll", query = "SELECT c FROM CuentasBancarias c")})
public class CuentasBancarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentasBancariasPK cuentasBancariasPK;
    @Column(name = "ENTFNC_CODIGO")
    private Integer entfncCodigo;
    @Column(name = "FECHA_APERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaApertura;
    @Column(name = "PROPIETARIO")
    private String propietario;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "CUENTA_NUEVA")
    private String cuentaNueva;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDO_INICIAL")
    private BigDecimal saldoInicial;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private String estadoDeDisponibilidad;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "CLASE_TARJETA")
    private String claseTarjeta;
    @Column(name = "LIMITE_CREDITO_CORRIENTE")
    private BigDecimal limiteCreditoCorriente;
    @Column(name = "LIMITE_CREDITO_DIFERIDO")
    private BigDecimal limiteCreditoDiferido;
    @Column(name = "FECHA_TERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTermino;
    @Column(name = "DIA_DE_CIERRE")
    private Short diaDeCierre;
    @Column(name = "REPORTE")
    private String reporte;

    public CuentasBancarias() {
    }

    public CuentasBancarias(CuentasBancariasPK cuentasBancariasPK) {
        this.cuentasBancariasPK = cuentasBancariasPK;
    }

    public CuentasBancarias(String empCodigo, String tipo, String numero) {
        this.cuentasBancariasPK = new CuentasBancariasPK(empCodigo, tipo, numero);
    }

    public CuentasBancariasPK getCuentasBancariasPK() {
        return cuentasBancariasPK;
    }

    public void setCuentasBancariasPK(CuentasBancariasPK cuentasBancariasPK) {
        this.cuentasBancariasPK = cuentasBancariasPK;
    }

    public Integer getEntfncCodigo() {
        return entfncCodigo;
    }

    public void setEntfncCodigo(Integer entfncCodigo) {
        this.entfncCodigo = entfncCodigo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCuentaNueva() {
        return cuentaNueva;
    }

    public void setCuentaNueva(String cuentaNueva) {
        this.cuentaNueva = cuentaNueva;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(String estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getClaseTarjeta() {
        return claseTarjeta;
    }

    public void setClaseTarjeta(String claseTarjeta) {
        this.claseTarjeta = claseTarjeta;
    }

    public BigDecimal getLimiteCreditoCorriente() {
        return limiteCreditoCorriente;
    }

    public void setLimiteCreditoCorriente(BigDecimal limiteCreditoCorriente) {
        this.limiteCreditoCorriente = limiteCreditoCorriente;
    }

    public BigDecimal getLimiteCreditoDiferido() {
        return limiteCreditoDiferido;
    }

    public void setLimiteCreditoDiferido(BigDecimal limiteCreditoDiferido) {
        this.limiteCreditoDiferido = limiteCreditoDiferido;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public Short getDiaDeCierre() {
        return diaDeCierre;
    }

    public void setDiaDeCierre(Short diaDeCierre) {
        this.diaDeCierre = diaDeCierre;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentasBancariasPK != null ? cuentasBancariasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasBancarias)) {
            return false;
        }
        CuentasBancarias other = (CuentasBancarias) object;
        if ((this.cuentasBancariasPK == null && other.cuentasBancariasPK != null) || (this.cuentasBancariasPK != null && !this.cuentasBancariasPK.equals(other.cuentasBancariasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CuentasBancarias[ cuentasBancariasPK=" + cuentasBancariasPK + " ]";
    }
    
}
