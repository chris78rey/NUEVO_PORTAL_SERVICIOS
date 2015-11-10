/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "AUXILIARES")
@NamedQueries({
    @NamedQuery(name = "Auxiliares.findAll", query = "SELECT a FROM Auxiliares a")})
public class Auxiliares implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AuxiliaresPK auxiliaresPK;
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
    @JoinColumns({
        @JoinColumn(name = "SC_CNT_MYR_EMP_CODIGO", referencedColumnName = "CNT_MYR_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SC_CNT_MYR_CODIGO", referencedColumnName = "CNT_MYR_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SC_CNT_CODIGO", referencedColumnName = "CNT_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SC_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Subcuentas subcuentas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auxiliares", fetch = FetchType.LAZY)
    private List<Subauxiliares> subauxiliaresList;

    public Auxiliares() {
    }

    public Auxiliares(AuxiliaresPK auxiliaresPK) {
        this.auxiliaresPK = auxiliaresPK;
    }

    public Auxiliares(String scCntMyrEmpCodigo, String scCntMyrCodigo, String scCntCodigo, String scCodigo, String codigo) {
        this.auxiliaresPK = new AuxiliaresPK(scCntMyrEmpCodigo, scCntMyrCodigo, scCntCodigo, scCodigo, codigo);
    }

    public AuxiliaresPK getAuxiliaresPK() {
        return auxiliaresPK;
    }

    public void setAuxiliaresPK(AuxiliaresPK auxiliaresPK) {
        this.auxiliaresPK = auxiliaresPK;
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

    public Subcuentas getSubcuentas() {
        return subcuentas;
    }

    public void setSubcuentas(Subcuentas subcuentas) {
        this.subcuentas = subcuentas;
    }

    public List<Subauxiliares> getSubauxiliaresList() {
        return subauxiliaresList;
    }

    public void setSubauxiliaresList(List<Subauxiliares> subauxiliaresList) {
        this.subauxiliaresList = subauxiliaresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auxiliaresPK != null ? auxiliaresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auxiliares)) {
            return false;
        }
        Auxiliares other = (Auxiliares) object;
        if ((this.auxiliaresPK == null && other.auxiliaresPK != null) || (this.auxiliaresPK != null && !this.auxiliaresPK.equals(other.auxiliaresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Auxiliares[ auxiliaresPK=" + auxiliaresPK + " ]";
    }
    
}
