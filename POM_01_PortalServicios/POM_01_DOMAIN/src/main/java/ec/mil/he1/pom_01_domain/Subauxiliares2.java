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
@Table(name = "SUBAUXILIARES_2")
@NamedQueries({
    @NamedQuery(name = "Subauxiliares2.findAll", query = "SELECT s FROM Subauxiliares2 s")})
public class Subauxiliares2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Subauxiliares2PK subauxiliares2PK;
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

    public Subauxiliares2() {
    }

    public Subauxiliares2(Subauxiliares2PK subauxiliares2PK) {
        this.subauxiliares2PK = subauxiliares2PK;
    }

    public Subauxiliares2(String sAScCntMyrEmpCodigo, String sAScCntMyrCodigo, String sAScCntCodigo, String sAScCodigo, String sACodigo, String sCodigo, String codigo) {
        this.subauxiliares2PK = new Subauxiliares2PK(sAScCntMyrEmpCodigo, sAScCntMyrCodigo, sAScCntCodigo, sAScCodigo, sACodigo, sCodigo, codigo);
    }

    public Subauxiliares2PK getSubauxiliares2PK() {
        return subauxiliares2PK;
    }

    public void setSubauxiliares2PK(Subauxiliares2PK subauxiliares2PK) {
        this.subauxiliares2PK = subauxiliares2PK;
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
        hash += (subauxiliares2PK != null ? subauxiliares2PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subauxiliares2)) {
            return false;
        }
        Subauxiliares2 other = (Subauxiliares2) object;
        if ((this.subauxiliares2PK == null && other.subauxiliares2PK != null) || (this.subauxiliares2PK != null && !this.subauxiliares2PK.equals(other.subauxiliares2PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Subauxiliares2[ subauxiliares2PK=" + subauxiliares2PK + " ]";
    }
    
}
