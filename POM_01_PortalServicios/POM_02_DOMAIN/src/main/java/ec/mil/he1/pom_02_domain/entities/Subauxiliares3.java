/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "SUBAUXILIARES_3")
@NamedQueries({
    @NamedQuery(name = "Subauxiliares3.findAll", query = "SELECT s FROM Subauxiliares3 s")})
public class Subauxiliares3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Subauxiliares3PK subauxiliares3PK;
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
        @JoinColumn(name = "S_S_A_SC_CNT_MYR_EMP_CODIGO", referencedColumnName = "S_A_SC_CNT_MYR_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "S_S_A_SC_CNT_MYR_CODIGO", referencedColumnName = "S_A_SC_CNT_MYR_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "S_S_A_SC_CNT_CODIGO", referencedColumnName = "S_A_SC_CNT_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "S_S_A_SC_CODIGO", referencedColumnName = "S_A_SC_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "S_S_A_CODIGO", referencedColumnName = "S_A_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "S_S_CODIGO", referencedColumnName = "S_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "S_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Subauxiliares2 subauxiliares2;
    @OneToMany(mappedBy = "subauxiliares3", fetch = FetchType.LAZY)
    private List<Movimientos> movimientosList;

    public Subauxiliares3() {
    }

    public Subauxiliares3(Subauxiliares3PK subauxiliares3PK) {
        this.subauxiliares3PK = subauxiliares3PK;
    }

    public Subauxiliares3(String sSAScCntMyrEmpCodigo, String sSAScCntMyrCodigo, String sSAScCntCodigo, String sSAScCodigo, String sSACodigo, String sSCodigo, String sCodigo, String codigo) {
        this.subauxiliares3PK = new Subauxiliares3PK(sSAScCntMyrEmpCodigo, sSAScCntMyrCodigo, sSAScCntCodigo, sSAScCodigo, sSACodigo, sSCodigo, sCodigo, codigo);
    }

    public Subauxiliares3PK getSubauxiliares3PK() {
        return subauxiliares3PK;
    }

    public void setSubauxiliares3PK(Subauxiliares3PK subauxiliares3PK) {
        this.subauxiliares3PK = subauxiliares3PK;
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

    public Subauxiliares2 getSubauxiliares2() {
        return subauxiliares2;
    }

    public void setSubauxiliares2(Subauxiliares2 subauxiliares2) {
        this.subauxiliares2 = subauxiliares2;
    }

    public List<Movimientos> getMovimientosList() {
        return movimientosList;
    }

    public void setMovimientosList(List<Movimientos> movimientosList) {
        this.movimientosList = movimientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subauxiliares3PK != null ? subauxiliares3PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subauxiliares3)) {
            return false;
        }
        Subauxiliares3 other = (Subauxiliares3) object;
        if ((this.subauxiliares3PK == null && other.subauxiliares3PK != null) || (this.subauxiliares3PK != null && !this.subauxiliares3PK.equals(other.subauxiliares3PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Subauxiliares3[ subauxiliares3PK=" + subauxiliares3PK + " ]";
    }
    
}
