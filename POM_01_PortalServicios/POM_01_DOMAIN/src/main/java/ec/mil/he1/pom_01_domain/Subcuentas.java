/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "SUBCUENTAS")
@NamedQueries({
    @NamedQuery(name = "Subcuentas.findAll", query = "SELECT s FROM Subcuentas s")})
public class Subcuentas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubcuentasPK subcuentasPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TIPO_DE_CUENTA")
    private String tipoDeCuenta;
    @Column(name = "CUENTA_DE_DIARIO")
    private Character cuentaDeDiario;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "MONEDA_DE_TRABAJO")
    private String monedaDeTrabajo;
    @Column(name = "TITULO_DOCUMENTO_ASOCIADO")
    private String tituloDocumentoAsociado;
    @Column(name = "DOCUMENTO_ASOCIADO")
    private String documentoAsociado;

    public Subcuentas() {
    }

    public Subcuentas(SubcuentasPK subcuentasPK) {
        this.subcuentasPK = subcuentasPK;
    }

    public Subcuentas(String cntMyrEmpCodigo, String cntMyrCodigo, String cntCodigo, String codigo) {
        this.subcuentasPK = new SubcuentasPK(cntMyrEmpCodigo, cntMyrCodigo, cntCodigo, codigo);
    }

    public SubcuentasPK getSubcuentasPK() {
        return subcuentasPK;
    }

    public void setSubcuentasPK(SubcuentasPK subcuentasPK) {
        this.subcuentasPK = subcuentasPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public Character getCuentaDeDiario() {
        return cuentaDeDiario;
    }

    public void setCuentaDeDiario(Character cuentaDeDiario) {
        this.cuentaDeDiario = cuentaDeDiario;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getMonedaDeTrabajo() {
        return monedaDeTrabajo;
    }

    public void setMonedaDeTrabajo(String monedaDeTrabajo) {
        this.monedaDeTrabajo = monedaDeTrabajo;
    }

    public String getTituloDocumentoAsociado() {
        return tituloDocumentoAsociado;
    }

    public void setTituloDocumentoAsociado(String tituloDocumentoAsociado) {
        this.tituloDocumentoAsociado = tituloDocumentoAsociado;
    }

    public String getDocumentoAsociado() {
        return documentoAsociado;
    }

    public void setDocumentoAsociado(String documentoAsociado) {
        this.documentoAsociado = documentoAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subcuentasPK != null ? subcuentasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcuentas)) {
            return false;
        }
        Subcuentas other = (Subcuentas) object;
        if ((this.subcuentasPK == null && other.subcuentasPK != null) || (this.subcuentasPK != null && !this.subcuentasPK.equals(other.subcuentasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Subcuentas[ subcuentasPK=" + subcuentasPK + " ]";
    }
    
}
