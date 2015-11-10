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
@Table(name = "PARAMETROS_ESPECIALES")
@NamedQueries({
    @NamedQuery(name = "ParametrosEspeciales.findAll", query = "SELECT p FROM ParametrosEspeciales p")})
public class ParametrosEspeciales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosEspecialesPK parametrosEspecialesPK;
    @Column(name = "TIPO_PARAMETRO")
    private String tipoParametro;
    @Column(name = "MES_PAGO")
    private String mesPago;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "MES_INICIAL")
    private Short mesInicial;
    @Column(name = "MES_FINAL")
    private Short mesFinal;
    @Column(name = "PROCESO")
    private String proceso;
    @Column(name = "REPORTE_ESPECIAL")
    private String reporteEspecial;
    @Column(name = "ORDEN")
    private Short orden;
    @Column(name = "DETALLE")
    private Character detalle;
    @Column(name = "CUENTA_CONTABLE")
    private String cuentaContable;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosEspeciales", fetch = FetchType.LAZY)
    private List<DatosIntervienen> datosIntervienenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosEspeciales", fetch = FetchType.LAZY)
    private List<PagosEspeciales> pagosEspecialesList;
    @OneToMany(mappedBy = "parametrosEspeciales", fetch = FetchType.LAZY)
    private List<Liquidaciones> liquidacionesList;
    @JoinColumns({
        @JoinColumn(name = "PRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private ParametrosRoles parametrosRoles;

    public ParametrosEspeciales() {
    }

    public ParametrosEspeciales(ParametrosEspecialesPK parametrosEspecialesPK) {
        this.parametrosEspecialesPK = parametrosEspecialesPK;
    }

    public ParametrosEspeciales(String prmrolCodigo, String prmrolEmpCodigo) {
        this.parametrosEspecialesPK = new ParametrosEspecialesPK(prmrolCodigo, prmrolEmpCodigo);
    }

    public ParametrosEspecialesPK getParametrosEspecialesPK() {
        return parametrosEspecialesPK;
    }

    public void setParametrosEspecialesPK(ParametrosEspecialesPK parametrosEspecialesPK) {
        this.parametrosEspecialesPK = parametrosEspecialesPK;
    }

    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }

    public String getMesPago() {
        return mesPago;
    }

    public void setMesPago(String mesPago) {
        this.mesPago = mesPago;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Short getMesInicial() {
        return mesInicial;
    }

    public void setMesInicial(Short mesInicial) {
        this.mesInicial = mesInicial;
    }

    public Short getMesFinal() {
        return mesFinal;
    }

    public void setMesFinal(Short mesFinal) {
        this.mesFinal = mesFinal;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getReporteEspecial() {
        return reporteEspecial;
    }

    public void setReporteEspecial(String reporteEspecial) {
        this.reporteEspecial = reporteEspecial;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public Character getDetalle() {
        return detalle;
    }

    public void setDetalle(Character detalle) {
        this.detalle = detalle;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public List<DatosIntervienen> getDatosIntervienenList() {
        return datosIntervienenList;
    }

    public void setDatosIntervienenList(List<DatosIntervienen> datosIntervienenList) {
        this.datosIntervienenList = datosIntervienenList;
    }

    public List<PagosEspeciales> getPagosEspecialesList() {
        return pagosEspecialesList;
    }

    public void setPagosEspecialesList(List<PagosEspeciales> pagosEspecialesList) {
        this.pagosEspecialesList = pagosEspecialesList;
    }

    public List<Liquidaciones> getLiquidacionesList() {
        return liquidacionesList;
    }

    public void setLiquidacionesList(List<Liquidaciones> liquidacionesList) {
        this.liquidacionesList = liquidacionesList;
    }

    public ParametrosRoles getParametrosRoles() {
        return parametrosRoles;
    }

    public void setParametrosRoles(ParametrosRoles parametrosRoles) {
        this.parametrosRoles = parametrosRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosEspecialesPK != null ? parametrosEspecialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosEspeciales)) {
            return false;
        }
        ParametrosEspeciales other = (ParametrosEspeciales) object;
        if ((this.parametrosEspecialesPK == null && other.parametrosEspecialesPK != null) || (this.parametrosEspecialesPK != null && !this.parametrosEspecialesPK.equals(other.parametrosEspecialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosEspeciales[ parametrosEspecialesPK=" + parametrosEspecialesPK + " ]";
    }
    
}
